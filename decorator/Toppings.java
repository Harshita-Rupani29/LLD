package decorator;

public abstract class Toppings extends BasePizza {

  protected BasePizza basePizza;

  public Toppings(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  @Override
  public int cost() {
    return basePizza.cost();
  }

  @Override
  public String toString() {
    return basePizza.toString();
  }

}
