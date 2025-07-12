package ApplyCoupon;

public class PercentageCouponDecorator extends CouponDecorator {
  Product p;
  int percent;

  PercentageCouponDecorator(Product p, int percent) {
    this.p = p;
    this.percent = percent;
  }

  public double getPrice() {
    double price = p.getPrice();
    return price - (price * percent) / 100;

  }

}
