package ApplyCoupon;

public class Item2 extends Product {
  Item2(double ogprice,
      String name,
      ProductType product) {
    super(ogprice, name, product);
  }

  public double getPrice() {
    return this.ogprice;
  }

}
