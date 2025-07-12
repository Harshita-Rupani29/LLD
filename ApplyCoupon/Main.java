package ApplyCoupon;

public class Main {
  public static void main(String[] args) {
    Product i = new Item1(100000000, "aigoo", ProductType.GROCERY);
    Product q = new Item1(100, "aigoo", ProductType.ELECTRONICS);

    ShoppingCart c = new ShoppingCart();
    c.addToCart(i);
    c.addToCart(q);
    System.out.println(c.getTotalPrice());
  }
}
