interface Shape2D {
    double getArea();
}

abstract class Shape {
    abstract void display();
}

class Circle extends Shape implements Shape2D {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    @Override
    void display() {
        System.out.println("This is a circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class javapract6 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.display();
        System.out.println("Area of Circle: " + c.getArea());
    }
}
