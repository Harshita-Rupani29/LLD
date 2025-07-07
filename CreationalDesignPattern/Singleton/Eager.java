package CreationalDesignPattern.Singleton;

public class Eager {
  private static Eager instance = new Eager();

  private Eager() {

  }

  public static Eager getInstance() {
    return instance;
  }
}
// here only one time static is intilaised