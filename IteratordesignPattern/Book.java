package IteratordesignPattern;

public class Book {
  int price;
  String name;

  Book(int p, String name) {
    this.price = p;
    this.name = name;
  }

  public String getBookName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }
}
