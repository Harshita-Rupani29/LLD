
// // Main.java
// // main.java
// import observable.ConcreteSubject; // For ConcreteSubject
// import observable.Subject;
// import observable.observer.ConcreteObserver; // For ConcreteObserver
// import observable.observer.Observer;

// // ... and so on for other classes
// public class Main {
// public static void main(String[] args) {
// // 1. Create a ConcreteSubject instance
// ConcreteSubject mySubject = new ConcreteSubject();

// // 2. Create ConcreteObserver instances and register them with the subject
// ConcreteObserver observer1 = new ConcreteObserver("Observer A", mySubject);
// ConcreteObserver observer2 = new ConcreteObserver("Observer B", mySubject);
// ConcreteObserver observer3 = new ConcreteObserver("Observer C", mySubject);

// System.out.println("\n--- First State Change ---");
// mySubject.setState(5); // This will trigger notifications to all registered
// observers

// System.out.println("\n--- Second State Change ---");
// mySubject.setState(12); // This will trigger notifications again

// System.out.println("\n--- Observer B unsubscribes ---");
// observer2.unsubscribe(); // Remove Observer B

// System.out.println("\n--- Third State Change ---");
// mySubject.setState(8); // Now only Observer A and C will be notified
// }
// }