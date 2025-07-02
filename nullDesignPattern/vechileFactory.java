package nullDesignPattern;

public class vechileFactory {

  public vechile getObj(String type) {
    if (type.equals("car")) {
      return new car();
    } else
      return new nullObject();
  }
}