// Implementor Hierarchy (Colors/Drawing Implementations)
interface Color {
    void applyColor();
}

class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color.");
    }
}

class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color.");
    }
}

// Abstraction Hierarchy (Shapes)
abstract class Shape {
    protected Color color; // Bridge to the Color hierarchy

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle. ");
        color.applyColor(); // Delegating to the implementation
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Square. ");
        color.applyColor(); // Delegating to the implementation
    }
}

// Client usage
public class BridgeDemo {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(red);
        redCircle.draw(); // Output: Drawing Circle. Applying red color.

        Shape blueSquare = new Square(blue);
        blueSquare.draw(); // Output: Drawing Square. Applying blue color.

        // Adding a new shape (e.g., Triangle) or new color (e.g., Green)
        // doesn't require modifying existing classes.
        Color green = new GreenColor(); // New Color
        Shape greenCircle = new Circle(green);
        greenCircle.draw(); // Output: Drawing Circle. Applying green color.
    }
}

// (New Color Class)
class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color.");
    }
}

// to Prevent combitorial explosion