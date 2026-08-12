abstract class IntelligentVehicle {
    String brand;
    String model;
    int speed;

    IntelligentVehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    abstract void start();

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}

interface VehicleCharger {
    void charge();
}

interface VehicleNavigator {
    void navigate();
}

interface VehicleMusic {
    void playMusic();
}

class ElectricSmartCar extends IntelligentVehicle
        implements VehicleCharger, VehicleNavigator, VehicleMusic {

    ElectricSmartCar(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    @Override
    void start() {
        System.out.println("Electric car starts silently.");
    }

    public void charge() {
        System.out.println("Electric car is charging.");
    }

    public void navigate() {
        System.out.println("Navigation is active.");
    }

    public void playMusic() {
        System.out.println("Music is playing.");
    }
}

class NormalSmartCar extends IntelligentVehicle
        implements VehicleNavigator, VehicleMusic {

    NormalSmartCar(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    @Override
    void start() {
        System.out.println("Normal car starts with an engine.");
    }

    public void navigate() {
        System.out.println("Navigation is active.");
    }

    public void playMusic() {
        System.out.println("Music is playing.");
    }
}

public class SmartVehicleDemo {
    public static void main(String[] args) {

        IntelligentVehicle v;

        v = new ElectricSmartCar("Tesla", "Model 3", 200);
        v.display();
        v.start();

        System.out.println();

        VehicleCharger c = (VehicleCharger) v;
        c.charge();

        VehicleNavigator n = (VehicleNavigator) v;
        n.navigate();

        VehicleMusic m = (VehicleMusic) v;
        m.playMusic();

        System.out.println();

        v = new NormalSmartCar("Toyota", "Camry", 180);
        v.display();
        v.start();

        VehicleNavigator n2 = (VehicleNavigator) v;
        n2.navigate();
    }
}