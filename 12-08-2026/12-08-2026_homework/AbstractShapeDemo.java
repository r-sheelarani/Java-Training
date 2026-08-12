abstract class AbstractGraphicShape {
    abstract double calculateArea();
}

class AbstractCircle extends AbstractGraphicShape {
    double radius;

    AbstractCircle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class AbstractRectangle extends AbstractGraphicShape {
    double length;
    double width;

    AbstractRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class AbstractSquare extends AbstractGraphicShape {
    double side;

    AbstractSquare(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        AbstractGraphicShape s;

        s = new AbstractCircle(5);
        System.out.println("Circle Area: " + s.calculateArea());

        s = new AbstractRectangle(10, 5);
        System.out.println("Rectangle Area: " + s.calculateArea());

        s = new AbstractSquare(4);
        System.out.println("Square Area: " + s.calculateArea());
    }
}