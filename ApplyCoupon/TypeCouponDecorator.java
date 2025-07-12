package ApplyCoupon;

import java.util.HashMap;

public class TypeCouponDecorator extends CouponDecorator {
  Product p;
  int percent;
  ProductType pt;
  static HashMap<ProductType, Integer> map = new HashMap<>();
  static {
    map.put(ProductType.ELECTRONICS, 100);
    map.put(ProductType.CLOTHING, 100);
  }

  TypeCouponDecorator(Product p, int percent, ProductType pType) {
    this.p = p;
    this.percent = percent;
    this.pt = pType;
  }

  public double getPrice() {
    if (map.containsKey(pt)) {
      return p.getPrice() - map.get(pt);
    }
    return 0;

  }
}