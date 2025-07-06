package builderDesignPattern;

public abstract class StudentBuilder {
  int rollNo;
  String pattern;

  public StudentBuilder setRollNo(int r) {
    this.rollNo = r;
    return this;
  }

  public abstract StudentBuilder setPattern();

  public Student Build() {
    return new Student(this);
  }
}
