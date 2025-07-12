package pubsubpattern;

public class PublisherFactory {
  public Publisher getPublisher(String type) {
    if (type.equals("EDUCATIONAL")) {
      return new EDUCATIONALPublisher();
    } else {
      return new NATUREPublisher();
    }
  }
}
