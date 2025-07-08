package Inventory_ManagementSystem;

import java.sql.Date;

public class ProductUnit {
  int id;
  String Name;
  Date Expiry;
  String Description;

  ProductUnit(int id) {
    this.id = id;
  }
}