package CreationalDesignPattern.Singleton;

public class Synchronised {
  private static Synchronised i;

  private Synchronised() {

  }

  synchronized public static Synchronised getInstance() {
    if (i == null) {
      i = new Synchronised();
    }
    return i;
  }
}
