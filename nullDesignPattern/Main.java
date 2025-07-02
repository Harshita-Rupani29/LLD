package nullDesignPattern;

public class Main {
  public static void main(String[] args) {
    vechileFactory a = new vechileFactory();
    vechile obj = a.getObj("bike");
    System.out.println(obj.tankCapacity());

  }
}