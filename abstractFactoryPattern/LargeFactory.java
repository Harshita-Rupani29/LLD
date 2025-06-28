package abstractFactoryPattern;

public class LargeFactory {
  vechileFactory getVechile(String type) {

    vechileFactory factory = null;

    if (type.startsWith("O")) {
      factory = new OrdinaryVechileFactory();
    } else if (type.startsWith("L")) {
      factory = new LuxuryVechileFactory();
    } else {
      System.out.println("Unknown vehicle type prefix.");
      return null;
    }
    return factory;
  }
}
