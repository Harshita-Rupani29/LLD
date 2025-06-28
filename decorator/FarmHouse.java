package decorator;

public class FarmHouse extends BasePizza {

  @Override
  public int cost() {
    return 10; // Cost of FarmHouse pizza
  }

  @Override
  public String toString() {
    return "FarmHouse Pizza";
  }

}
