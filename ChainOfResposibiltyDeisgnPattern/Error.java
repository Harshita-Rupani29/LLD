package ChainOfResposibiltyDeisgnPattern;

public class Error extends LoggerProcessor {
  LoggerProcessor p;

  Error(LoggerProcessor p) {
    super(p);
  }

  public void log(int level, String Message) {
    if (level == ERROR) {
      System.out.println("ERROR" + Message);
    } else {
      super.log(level, Message);
    }
  }

}
