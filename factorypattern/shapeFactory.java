package factorypattern;

public class shapeFactory {
  void getShape(String shapeType) {
    if (shapeType == null) {
      return;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      new circle().shape();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      new rectangle().shape();
    } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
      new triangle().shape();
    } else {
      System.out.println("Shape not recognized");
    }
  }

}
