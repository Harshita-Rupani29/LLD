// ConcreteSubject.java
import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers; // List of registered observers
    private int state; // The state that observers are interested in

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    // --- Subject Interface Implementations ---
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer registered.");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer removed.");
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers about state change: " + state);
        for (Observer observer : observers) {
            observer.update(); // Call the update method on each registered observer
        }
    }

    // --- ConcreteSubject Specific Methods ---
    public int getState() {
        return state;
    }

    // This is the method that causes state changes and triggers notifications
    public void setState(int newState) {
        this.state = newState;
        System.out.println("Subject's state changed to: " + newState);
        notifyObservers(); // Important: notify observers when state changes
    }
}