package decorator;

public class Margherita extends BasePizza {

  @Override
  public int cost() {
    return 8; // Cost of Margherita pizza
  }

  @Override
  public String toString() {
    return "Margherita Pizza";
  }

}
