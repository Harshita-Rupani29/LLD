package factorypattern;

import factorypattern.shapeFactory;

public class Main {
  public static void main(String[] args) {
    // Create a shape factory
    shapeFactory shapeFactory = new shapeFactory();
    shapeFactory.getShape("triangle");
  }
}
