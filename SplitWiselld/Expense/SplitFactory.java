package SplitWiselld.Expense;

import SplitWiselld.Expense.Split.EqualExpenseSplit;
import SplitWiselld.Expense.Split.ExpenseSplit;
import SplitWiselld.Expense.Split.PercentageExpenseSplit;
import SplitWiselld.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
  public static ExpenseSplit getSplitObject(SplitType splitType) {
    switch (splitType) {
      case EQUAL:
        return new EqualExpenseSplit();
      case UNEQUAL:
        return new UnequalExpenseSplit();
      case PERCENTAGE:
        return new PercentageExpenseSplit();
      default:
        return null;
    }
  }

}
