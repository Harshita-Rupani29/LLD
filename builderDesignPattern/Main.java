package builderDesignPattern;

public class Main {
  public static void main(String[] args) {
    Director obj = new Director(new StudentEngineerDesign());
    Student engineerStudent = obj.createStudent();
    System.out.println(engineerStudent.toString());

  }
}
