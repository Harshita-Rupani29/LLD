package Inventory_ManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
  List<Product> allProducts;

  Inventory() {
    allProducts = new ArrayList<>();
  }

  public void addNewProduct(int Productid, int count) {

  }

  public void addProductUnit(int Productid, int id, int count) {
    Product whichCategory = allProducts.get(Productid);
    whichCategory.addProductUnit(new ProductUnit(id), count);

  }

}
