abstract class TransportVehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stops.");
    }
}

class TransportCar extends TransportVehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class TransportBike extends TransportVehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

class TransportBus extends TransportVehicle {
    @Override
    void start() {
        System.out.println("Bus starts with a large engine.");
    }
}

public class VehicleManagementDemo {
    public static void main(String[] args) {
        TransportVehicle v;

        v = new TransportCar();
        v.start();
        v.stop();

        v = new TransportBike();
        v.start();
        v.stop();

        v = new TransportBus();
        v.start();
        v.stop();
    }
}