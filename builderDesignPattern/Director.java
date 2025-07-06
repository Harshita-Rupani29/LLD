package builderDesignPattern;

public class Director {
  StudentBuilder studentBuilder;

  Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent() {

    if (studentBuilder instanceof StudentEngineerDesign) {
      return createEngineeringStudent();
    } else if (studentBuilder instanceof StudentMbaDesign) {
      return createMBAStudent();
    }
    return null;
  }

  private Student createEngineeringStudent() {

    return studentBuilder.setRollNo(1).setPattern().Build();
  }

  private Student createMBAStudent() {

    return studentBuilder.setRollNo(22).setPattern().Build();

  }

}
