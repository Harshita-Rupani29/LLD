
// ConcreteObserver.java
import observable.ConcreteSubject;

public class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject; // Observer usually needs a reference to its Subject

    // Constructor to register with a subject
    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.registerObserver(this); // Automatically registers itself
        System.out.println(name + " created and registered.");
    }

    // --- Observer Interface Implementation ---
    @Override
    public void update() {
        // This method is called by the Subject when its state changes.
        // The observer can then pull the latest state from the subject.
        int subjectState = subject.getState();
        System.out.println(name + " received update. Subject's current state: " + subjectState);
        // Add any other observer-specific logic here based on the updated state
        if (subjectState > 10) {
            System.out.println(name + ": State is getting high, taking action!");
        }
    }

    // --- Other Observer-specific methods ---
    public void unsubscribe() {
        subject.removeObserver(this);
        System.out.println(name + " unsubscribed.");
    }
}