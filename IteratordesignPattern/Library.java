package IteratordesignPattern;

import java.util.List;

public class Library implements Collection {
  private List<Book> bookList;

  Library(List<Book> bookList) {
    this.bookList = bookList;
  }

  public BookIterator createIterator() {
    return new BookIterator(bookList);
  }

}
