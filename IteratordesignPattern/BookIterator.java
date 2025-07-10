package IteratordesignPattern;

import java.util.List;

public class BookIterator implements Iterator {
  List<Book> bookList;
  public int index;

  BookIterator(List<Book> b) {
    this.bookList = b;
  }

  public boolean hasNext() {
    return index < bookList.size();
  }

  public Book next() {
    if (hasNext()) {
      Book b = bookList.get(index++);
      return b;
    }
    return null;
  }
}
