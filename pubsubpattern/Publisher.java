package pubsubpattern;

import java.util.List;

public interface Publisher {
  public void notifySubscribers();

  public String getData(); // Changed to return data, not print

  public void addSub(Subscriber s);

  public void removeSub(Subscriber s);

  public Topic getTopic(); // New method
}