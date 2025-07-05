package AdaptorDesignPattern;

public class Main {
  public static void main(String[] args) {
    Adaptor a = new Concrete(new WeightinPound(2));
    System.out.println(a.WeightinKg());
  }
}
