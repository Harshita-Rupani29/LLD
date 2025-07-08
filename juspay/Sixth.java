package juspay;

public class Sixth {

  public static void main(String[] args) {
    System.out.println(end("hbcdfge"));
  }

  public static String end(String name) {
    char ans = 'a';
    int index = -1;
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) > ans) {
        ans = name.charAt(i);
        index = i;
      }
    }

    StringBuilder res = new StringBuilder();
    for (int i = index; i < name.length(); i++) {
      res.append(name.charAt(i));
    }
    return res.toString();

  }
}
