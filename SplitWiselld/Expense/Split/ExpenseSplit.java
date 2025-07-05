package SplitWiselld.Expense.Split;

import java.util.List;

public interface ExpenseSplit {
  public void validateExpense(List<Split> splitList, double totalAmount);

}
