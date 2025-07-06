package builderDesignPattern;

public class Student {
  int rollNo;
  String pattern;

  Student(StudentBuilder s) {
    this.rollNo = s.rollNo;
    this.pattern = s.pattern;
  }

  public String toString() {
    return "" + " roll number: " + this.rollNo + " Pattern: " + this.pattern;
  }

}
