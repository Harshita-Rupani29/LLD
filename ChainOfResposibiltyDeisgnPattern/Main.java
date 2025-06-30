package ChainOfResposibiltyDeisgnPattern;

public class Main {
  public static void main(String[] args) {
    LoggerProcessor p = new Info(new Error(new Debug(null)));
    p.log(2, "Ocuurs");
    p.log(3, "Debugging");
    p.log(1, "Just Info");
  }
}
