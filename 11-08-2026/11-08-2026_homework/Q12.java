class Q12Vehicle {
    String brand;
    int speed;

    Q12Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Q12Car extends Q12Vehicle {
    int numberOfDoors;

    Q12Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Q12 {
    public static void main(String[] args) {

        Q12Vehicle v = new Q12Car("Toyota", 180, 4);
        v.display();
    }
}