package SplitWiselld.Expense.Split;

import SplitWiselld.User.User;

public class Split {
  User user;
  double amountOwe;

  public Split(User u, double a) {
    this.user = u;
    this.amountOwe = a;

  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public double getAmountOwe() {
    return amountOwe;
  }

  public void setAmountOwe(double amountOwe) {
    this.amountOwe = amountOwe;
  }

}
