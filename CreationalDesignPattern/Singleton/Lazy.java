package CreationalDesignPattern.Singleton;

public class Lazy {
  private static Lazy i;

  private Lazy() {

  }

  public static Lazy getInstance() {
    if (i == null) {
      i = new Lazy();
    }
    return i;
  }
}

// problem with synchronisation
