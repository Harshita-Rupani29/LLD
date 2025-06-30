package ChainOfResposibiltyDeisgnPattern;

public class Debug extends LoggerProcessor {
  LoggerProcessor p;

  Debug(LoggerProcessor p) {
    super(p);
  }

  public void log(int level, String Message) {
    if (level == Debug) {
      System.out.println("DEBUG" + Message);
    } else {
      super.log(level, Message);
    }
  }
}
