package pubsubpattern;

import java.util.ArrayList;
import java.util.List;

public class EDUCATIONALPublisher implements Publisher {
  private List<Subscriber> subList;
  private Topic topic;
  private String newsContent;

  public EDUCATIONALPublisher() {
    this.subList = new ArrayList<>();
    this.topic = Topic.EDUCATIONAL;
    this.newsContent = "Initial Educational News: Advances in AI Learning.";
  }

  @Override
  public void notifySubscribers() {
    for (Subscriber s : subList) {
      if (s.interestedInTopic(this.topic)) {
        s.update(this, this.getData());
      }
    }
  }

  @Override
  public String getData() {
    return this.newsContent;
  }

  public void setNewContent(String newContent) {
    this.newsContent = newContent;
    notifySubscribers();
  }

  @Override
  public void addSub(Subscriber s) {
    subList.add(s);
    System.out.println("Subscriber added to EDUCATIONAL Publisher.");
  }

  @Override
  public void removeSub(Subscriber s) {
    subList.remove(s);
    System.out.println("Subscriber removed from EDUCATIONAL Publisher.");
  }

  @Override
  public Topic getTopic() {
    return this.topic;
  }
}