package ChainOfResposibiltyDeisgnPattern;

public class LoggerProcessor {
  public static int INFO = 1;
  public static int ERROR = 2;
  public static int Debug = 3;
  LoggerProcessor p;

  LoggerProcessor(LoggerProcessor p) {
    this.p = p;
  }

  public void log(int level, String Message) {
    if (p != null) {
      p.log(level, Message);
    }
  }

}
