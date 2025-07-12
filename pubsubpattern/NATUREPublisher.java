package pubsubpattern;

import java.util.ArrayList;
import java.util.List;

// Modified NATUREPublisher
public class NATUREPublisher implements Publisher {
  private List<Subscriber> subList;
  private Topic topic; // Use 'private' for encapsulation
  private String newsContent; // To hold the actual news

  public NATUREPublisher() {
    this.subList = new ArrayList<>();
    this.topic = Topic.NATURE; // Set the topic for this publisher
    this.newsContent = "Initial Nature News: Discoveries in the Amazon.";
  }

  @Override
  public void notifySubscribers() {
    // Notify only those subscribers interested in NATURE
    for (Subscriber s : subList) {
      if (s.interestedInTopic(this.topic)) {
        s.update(this, this.getData());
      }
    }
  }

  @Override
  public String getData() { // Returns data, doesn't print
    return this.newsContent;
  }

  public void setNewContent(String newContent) {
    this.newsContent = newContent;
    notifySubscribers(); // Notify when content changes
  }

  @Override
  public void addSub(Subscriber s) {
    subList.add(s);
    System.out.println("Subscriber added to NATURE Publisher.");
  }

  @Override
  public void removeSub(Subscriber s) {
    subList.remove(s);
    System.out.println("Subscriber removed from NATURE Publisher.");
  }

  @Override
  public Topic getTopic() {
    return this.topic;
  }
}
