package abstractFactoryPattern;

import abstractFactoryPattern.vechileFactory;

public class Main {
  public static void main(String[] args) {
    vechileFactory ordinaryFactory = new OrdinaryVechileFactory();
    vechileFactory luxuryFactory = new LuxuryVechileFactory();

    Vechile ov1 = ordinaryFactory.createVechile("OV1");
    Vechile ov2 = ordinaryFactory.createVechile("OV2");
    Vechile lv1 = luxuryFactory.createVechile("LV1");
    Vechile lv2 = luxuryFactory.createVechile("LV2");

    ov1.typeOfVechile();
    ov2.typeOfVechile();
    lv1.typeOfVechile();
    lv2.typeOfVechile();
  }
}
