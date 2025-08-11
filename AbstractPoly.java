abstract class Shape {
    abstract double area(); // Abstract method
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractPoly {
    public static void main(String args[]) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,6);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}