package SplitWiselld.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
  public void validateExpense(List<Split> splitList, double totalAmount) {
    double amountShouldBePresent = totalAmount / splitList.size();
    for (Split s : splitList) {
      if (s.getAmountOwe() != amountShouldBePresent) {
        throw new IllegalArgumentException("The request for Equal Amount to be distributed cannot be Fullfilled");
      }
    }
  }
}
