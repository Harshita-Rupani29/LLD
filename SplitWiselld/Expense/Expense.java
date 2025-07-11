package SplitWiselld.Expense;

import java.util.ArrayList;
import java.util.List;

import SplitWiselld.Expense.Split.Split;
import SplitWiselld.User.User;

public class Expense {
  String expenseId;
  String description;
  double expenseAmount;
  User paidByUser;
  SplitType splitType;
  List<Split> splitDetails = new ArrayList<>();

  public Expense(String expenseId, double expenseAmount, String description,
      User paidByUser, SplitType splitType, List<Split> splitDetails) {

    this.expenseId = expenseId;
    this.expenseAmount = expenseAmount;
    this.description = description;
    this.paidByUser = paidByUser;
    this.splitType = splitType;
    this.splitDetails.addAll(splitDetails);

  }

}
