package SplitWiselld;

import java.util.List;
import java.util.Map;

import SplitWiselld.Expense.Split.Split;
import SplitWiselld.User.User;

public class BalanceSheetController {
  public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {

    UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidBy.getUserExpenseBalanceSheet();
    paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount);

    for (Split split : splits) {
      User userOwe = split.getUser();
      UserExpenseBalanceSheet oweUserExpenseSheet = userOwe.getUserExpenseBalanceSheet();
      double oweAmount = split.getAmountOwe();
      if (expensePaidBy.getUserId().equals(userOwe.getUserId())) {
        paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + oweAmount);
      } else {
        paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack() + oweAmount);
        Balance userOweBalance;
        if (paidByUserExpenseSheet.getUserVsBalance().containsKey(userOwe.getUserId())) {

          userOweBalance = paidByUserExpenseSheet.getUserVsBalance().get(userOwe.getUserId());
        } else {
          userOweBalance = new Balance();
          paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getUserId(), userOweBalance);
        }

        userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);
        oweUserExpenseSheet.setTotalYouOwe(oweUserExpenseSheet.getTotalYouOwe() + oweAmount);
        oweUserExpenseSheet.setTotalYourExpense(oweUserExpenseSheet.getTotalYourExpense() + oweAmount);

        Balance userPaidBalance;
        if (oweUserExpenseSheet.getUserVsBalance().containsKey(expensePaidBy.getUserId())) {
          userPaidBalance = oweUserExpenseSheet.getUserVsBalance().get(expensePaidBy.getUserId());
        } else {
          userPaidBalance = new Balance();
          oweUserExpenseSheet.getUserVsBalance().put(expensePaidBy.getUserId(), userPaidBalance);
        }
        userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);

      }
    }
  }

  public void showBalanceSheetOfUser(User user) {

    System.out.println("---------------------------------------");

    System.out.println("Balance sheet of user : " + user.getUserId());

    UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();

    System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
    System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
    System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
    System.out.println("TotalPaymnetMade: " + userExpenseBalanceSheet.getTotalPayment());
    for (Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()) {

      String userID = entry.getKey();
      Balance balance = entry.getValue();

      System.out.println(
          "userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
    }

    System.out.println("---------------------------------------");

  }

}
