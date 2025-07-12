package pubsubpattern;

import java.util.ArrayList;
import java.util.List;

// (Interfaces and classes as modified above, including getTopic(), interestedInTopic(), etc.)

public class Main {
  public static void main(String[] args) {
    // 1. Create Publishers
    PublisherFactory factory = new PublisherFactory();
    NATUREPublisher naturePublisher = (NATUREPublisher) factory.getPublisher("NATURE");
    EDUCATIONALPublisher educationalPublisher = (EDUCATIONALPublisher) factory.getPublisher("EDUCATIONAL");

    // 2. Create Subscribers
    Sub18 alice = new Sub18("Alice");
    Sub18 bob = new Sub18("Bob");
    Sub18 charlie = new Sub18("Charlie");

    // 3. Subscribers declare their interest in topics
    alice.addInterestedTopic(Topic.NATURE);
    bob.addInterestedTopic(Topic.EDUCATIONAL);
    charlie.addInterestedTopic(Topic.NATURE);
    charlie.addInterestedTopic(Topic.EDUCATIONAL);

    // 4. Publishers add interested subscribers
    // This is where a central broker would simplify things.
    // For now, publishers need to know who potentially subscribes to their topic.
    // In a real system, subscribers would register *with the publisher* or a
    // broker.
    // For this example, let's manually add them, assuming they might be interested.

    naturePublisher.addSub(alice); // Alice is interested in NATURE
    naturePublisher.addSub(charlie); // Charlie is interested in NATURE

    educationalPublisher.addSub(bob); // Bob is interested in EDUCATIONAL
    educationalPublisher.addSub(charlie); // Charlie is interested in EDUCATIONAL

    System.out.println("\n--- First Round of News ---\n");

    // 5. Publishers publish news
    naturePublisher.setNewContent("New research reveals symbiotic relationship between fungi and trees.");
    educationalPublisher.setNewContent("Government announces new funding for STEM education programs.");

    System.out.println("\n--- Second Round of News ---\n");

    // Simulate more news updates
    naturePublisher.setNewContent("Rare bird species discovered in remote rainforest.");
    educationalPublisher.setNewContent("Online learning platforms see surge in enrollments.");

    System.out.println("\n--- Subscriber changes interest ---\n");
    alice.removeInterestedTopic(Topic.NATURE);
    alice.addInterestedTopic(Topic.EDUCATIONAL);

    // You might need to re-add Alice to the EDUCATIONAL publisher's list
    // if she wasn't there already. This highlights the benefit of a broker.
    // For now, let's manually ensure she's added if her interest changes.
    educationalPublisher.addSub(alice);

    System.out.println("\n--- Third Round of News (after Alice's change) ---\n");

    naturePublisher.setNewContent("New documentary on ocean conservation released.");
    educationalPublisher.setNewContent("Debate continues over the future of higher education.");
  }
}