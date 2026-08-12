abstract class BookingRide {
    int rideId;
    String driverName;
    double distance;

    BookingRide(int rideId, String driverName, double distance) {
        this.rideId = rideId;
        this.driverName = driverName;
        this.distance = distance;
    }

    abstract double calculateFare();

    void display() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs." + calculateFare());
        System.out.println();
    }
}

class BookingBike extends BookingRide {
    BookingBike(int id, String driver, double distance) {
        super(id, driver, distance);
    }

    @Override
    double calculateFare() {
        return distance * 10;
    }
}

class BookingAuto extends BookingRide {
    BookingAuto(int id, String driver, double distance) {
        super(id, driver, distance);
    }

    @Override
    double calculateFare() {
        return distance * 15;
    }
}

class BookingCar extends BookingRide {
    BookingCar(int id, String driver, double distance) {
        super(id, driver, distance);
    }

    @Override
    double calculateFare() {
        return distance * 20;
    }
}

public class RideBookingDemo {
    public static void main(String[] args) {
        BookingRide r;

        r = new BookingBike(101, "Arun", 10);
        r.display();

        r = new BookingAuto(102, "Rahul", 10);
        r.display();

        r = new BookingCar(103, "Kumar", 10);
        r.display();
    }
}