package ChainOfResposibiltyDeisgnPattern;

public class Info extends LoggerProcessor {
  LoggerProcessor p;

  Info(LoggerProcessor p) {
    super(p);
  }

  public void log(int level, String Message) {
    if (level == INFO) {
      System.out.println("INFO" + Message);
    } else {
      super.log(level, Message);
    }
  }
}
