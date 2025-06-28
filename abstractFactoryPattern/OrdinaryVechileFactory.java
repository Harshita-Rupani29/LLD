package abstractFactoryPattern;

public class OrdinaryVechileFactory implements vechileFactory {

  @Override
  public Vechile createVechile(String type) {
    if (type.equalsIgnoreCase("OV1")) {
      return new OV1();
    } else if (type.equalsIgnoreCase("OV2")) {
      return new OV2();
    }
    return null;
  }

}
