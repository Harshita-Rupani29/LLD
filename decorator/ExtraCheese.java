package decorator;

public class ExtraCheese extends Toppings {

  public ExtraCheese(BasePizza basePizza) {
    super(basePizza);
  }

  @Override
  public int cost() {
    return super.cost() + 40;
  }

  @Override
  public String toString() {
    return super.toString() + ", Extra Cheese";
  }

}
