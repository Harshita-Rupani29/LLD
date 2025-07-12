package pubsubpattern;

public interface Subscriber {
  // subscribe and unSubscribe are better handled by the publisher
  // A subscriber usually registers *itself* with a publisher.
  // However, for this pattern, it's more common for the subscriber to
  // have a method to register interest with a *broker* or directly with a
  // publisher.
  // For now, let's keep it as is, but consider a central broker later.
  public void update(Publisher p, String message); // Update to receive specific data/message

  public boolean interestedInTopic(Topic topic); // New method
}