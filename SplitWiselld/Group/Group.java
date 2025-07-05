package SplitWiselld.Group;

import java.util.ArrayList;
import java.util.List;

import SplitWiselld.Expense.Expense;
import SplitWiselld.Expense.ExpenseController;
import SplitWiselld.Expense.SplitType;
import SplitWiselld.Expense.Split.Split;
import SplitWiselld.User.User;

public class Group {
  String groupId;
  String groupName;
  List<User> groupMembers;

  List<Expense> expenseList;

  ExpenseController expenseController;

  Group() {
    groupMembers = new ArrayList<>();
    expenseList = new ArrayList<>();
    expenseController = new ExpenseController();
  }

  // add member to group
  public void addMember(User member) {
    groupMembers.add(member);
  }

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Expense createExpense(String expenseId, String description, double expenseAmount,
      List<Split> splitDetails, SplitType splitType, User paidByUser) {

    Expense expense = expenseController.createExpense(expenseId, expenseAmount, description, paidByUser, splitType,
        splitDetails);
    expenseList.add(expense);
    return expense;
  }
}
