package SplitWiselld.Expense;

import java.util.List;
import SplitWiselld.User.User;
import SplitWiselld.Expense.Split.ExpenseSplit;
import SplitWiselld.Expense.Split.Split;
import SplitWiselld.BalanceSheetController;

public class ExpenseController {
  BalanceSheetController balanceSheetController;

  public ExpenseController() {
    balanceSheetController = new BalanceSheetController();
  }

  public Expense createExpense(String expenseId, double expenseAmount, String description,
      User paidByUser, SplitType splitType, List<Split> splitDetails) {
    ExpenseSplit currExpenseSplit = SplitFactory.getSplitObject(splitType);
    currExpenseSplit.validateExpense(splitDetails, expenseAmount);
    Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

    balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

    return expense;

  }
}
