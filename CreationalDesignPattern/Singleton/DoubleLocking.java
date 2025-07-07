package CreationalDesignPattern.Singleton;

public class DoubleLocking {
  private static DoubleLocking i;

  private DoubleLocking() {

  }

  public static DoubleLocking getInstance() {
    if (i == null) {
      synchronized (DoubleLocking.class) { // class level lock
        if (i == null) {
          i = new DoubleLocking();
        }
      }
    }
    return i;
  }
}
