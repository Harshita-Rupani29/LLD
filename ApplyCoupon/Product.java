package ApplyCoupon;

public abstract class Product {
  double ogprice;
  String name;
  ProductType product;

  Product() {

  }

  Product(double ogprice,
      String name,
      ProductType product) {
    this.ogprice = ogprice;
    this.name = name;
    this.product = product;
  }

  public abstract double getPrice();

  public ProductType getProductType() {
    return product;
  }

}
