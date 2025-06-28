package decorator;

public class Main {
  public static void main(String[] args) {
    // Create a Veg Delight pizza with extra cheese
    BasePizza vegDelight = new VegDelight();
    vegDelight = new ExtraCheese(vegDelight);

    System.out.println(vegDelight.toString() + " costs: " + vegDelight.cost());

    // Create a FarmHouse pizza with extra cheese
    BasePizza farmHouse = new FarmHouse();
    farmHouse = new ExtraCheese(farmHouse);

    System.out.println(farmHouse.toString() + " costs: " + farmHouse.cost());
  }
}