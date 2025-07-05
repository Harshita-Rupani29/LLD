package AdaptorDesignPattern;

public class Concrete implements Adaptor {
  WeightinPound w;

  Concrete(WeightinPound w) {
    this.w = w;
  }

  public double WeightinKg() {
    return w.w * 0.45;
  }
}
