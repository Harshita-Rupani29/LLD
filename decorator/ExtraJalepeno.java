package decorator;

public class ExtraJalepeno extends Toppings {

  public ExtraJalepeno(BasePizza basePizza) {
    super(basePizza);
  }

  @Override
  public int cost() {
    return super.cost() + 9; // Adding cost of Extra Jalepeno
  }

  @Override
  public String toString() {
    return super.toString() + ", Extra Jalepeno"; // Adding description of Extra Jalepeno
  }

}
