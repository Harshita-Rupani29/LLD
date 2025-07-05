package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

import compositeDesignPattern.FileSystem;

public class Directory implements FileSystem {
  String Name;
  List<FileSystem> f;

  Directory(String Name) {
    this.Name = Name;
    f = new ArrayList<>();
  }

  public void addFile(FileSystem a) {
    f.add(a);
  }

  public void ls() {
    System.out.println("Directory Name : " + Name);
    for (FileSystem a : f) {
      a.ls();
    }
  }

}
