package decorator;

public class VegDelight extends BasePizza {

  @Override
  public int cost() {
    return 12;
  }

  @Override
  public String toString() {
    return "Veg Delight Pizza";
  }

}
