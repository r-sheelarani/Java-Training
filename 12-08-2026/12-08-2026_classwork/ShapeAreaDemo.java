abstract class GraphicShape {
    abstract double calculateArea();
}

class GraphicCircle extends GraphicShape {
    double radius;

    GraphicCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class GraphicRectangle extends GraphicShape {
    double length;
    double width;

    GraphicRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class GraphicTriangle extends GraphicShape {
    double base;
    double height;

    GraphicTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        GraphicShape s;

        s = new GraphicCircle(5);
        System.out.println("Circle Area: " + s.calculateArea());

        s = new GraphicRectangle(10, 5);
        System.out.println("Rectangle Area: " + s.calculateArea());

        s = new GraphicTriangle(8, 4);
        System.out.println("Triangle Area: " + s.calculateArea());
    }
}