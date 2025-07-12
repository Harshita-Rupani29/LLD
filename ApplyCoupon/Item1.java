package ApplyCoupon;

public class Item1 extends Product {
  Item1(double ogprice,
      String name,
      ProductType product) {
    super(ogprice, name, product);
  }

  public double getPrice() {
    return this.ogprice;
  }

}
