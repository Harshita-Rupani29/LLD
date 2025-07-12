package pubsubpattern;

import java.util.ArrayList;
import java.util.List;

// Modified Sub18
public class Sub18 implements Subscriber {
  private List<Topic> interestedTopics; // New: list of topics this subscriber cares about
  private String name; // For better identification in print statements

  public Sub18(String name) {
    this.interestedTopics = new ArrayList<>();
    this.name = name;
  }

  // A subscriber directly registers with a publisher in your current model
  // However, it's more common for a subscriber to "subscribe" to a *topic*
  // via a broker, or for the publisher to manage its own list.
  // For now, let's remove the subscribe/unsubscribe from the Subscriber interface
  // as it's better handled by the Publisher adding/removing.

  @Override
  public void update(Publisher p, String message) {
    System.out.println(this.name + " received update from " + p.getTopic() + " Publisher: " + message);
  }

  @Override
  public boolean interestedInTopic(Topic topic) {
    return interestedTopics.contains(topic);
  }

  // Method to allow subscriber to express interest in topics
  public void addInterestedTopic(Topic topic) {
    if (!interestedTopics.contains(topic)) {
      interestedTopics.add(topic);
      System.out.println(this.name + " is now interested in " + topic);
    }
  }

  public void removeInterestedTopic(Topic topic) {
    interestedTopics.remove(topic);
    System.out.println(this.name + " is no longer interested in " + topic);
  }
}