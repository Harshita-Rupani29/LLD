package compositeDesignPattern;

public class File implements FileSystem {
  String Name;

  File(String Name) {
    this.Name = Name;
  }

  public void ls() {
    System.out.println("File Name : " + Name);
  }
}
