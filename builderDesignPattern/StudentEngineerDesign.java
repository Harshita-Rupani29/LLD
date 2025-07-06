package builderDesignPattern;

public class StudentEngineerDesign extends StudentBuilder {
  public StudentBuilder setPattern() {
    this.pattern = "Hi Engineer";
    return this;
  }

}
