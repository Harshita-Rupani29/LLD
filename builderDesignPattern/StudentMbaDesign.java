package builderDesignPattern;

public class StudentMbaDesign extends StudentBuilder {
  public StudentBuilder setPattern() {
    this.pattern = "Hi MBA";
    return this;
  }
}
