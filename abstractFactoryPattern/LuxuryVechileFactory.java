package abstractFactoryPattern;

public class LuxuryVechileFactory implements vechileFactory {

  @Override
  public Vechile createVechile(String type) {
    if (type.equalsIgnoreCase("LV1")) {
      return new LV1();
    } else if (type.equalsIgnoreCase("LV2")) {
      return new LV2();
    }
    return null;
  }

}
