abstract class SmartGadget {
    int deviceId;
    String brand;
    double price;

    SmartGadget(int deviceId, String brand, double price) {
        this.deviceId = deviceId;
        this.brand = brand;
        this.price = price;
    }

    abstract void displaySpecifications();

    void turnOn() {
        System.out.println("Device is turned ON.");
    }

    void turnOff() {
        System.out.println("Device is turned OFF.");
    }
}

interface DeviceCamera {
    void takePhoto();
}

interface DeviceInternet {
    void connectInternet();
}

interface DeviceMusic {
    void playMusic();
}

class SmartPhoneDevice extends SmartGadget
        implements DeviceCamera, DeviceInternet, DeviceMusic {

    SmartPhoneDevice(int id, String brand, double price) {
        super(id, brand, price);
    }

    void displaySpecifications() {
        System.out.println("Smartphone - " + brand + ", Rs." + price);
    }

    public void takePhoto() {
        System.out.println("Smartphone takes photo.");
    }

    public void connectInternet() {
        System.out.println("Smartphone connects to Internet.");
    }

    public void playMusic() {
        System.out.println("Smartphone plays music.");
    }
}

class SmartWatchDevice extends SmartGadget {
    SmartWatchDevice(int id, String brand, double price) {
        super(id, brand, price);
    }

    void displaySpecifications() {
        System.out.println("Smartwatch - " + brand + ", Rs." + price);
    }
}

class SmartTVDevice extends SmartGadget implements DeviceInternet, DeviceMusic {
    SmartTVDevice(int id, String brand, double price) {
        super(id, brand, price);
    }

    void displaySpecifications() {
        System.out.println("Smart TV - " + brand + ", Rs." + price);
    }

    public void connectInternet() {
        System.out.println("Smart TV connects to Internet.");
    }

    public void playMusic() {
        System.out.println("Smart TV plays music.");
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartGadget d;

        d = new SmartPhoneDevice(101, "Samsung", 50000);
        d.displaySpecifications();
        d.turnOn();
        ((DeviceCamera) d).takePhoto();
        ((DeviceInternet) d).connectInternet();
        ((DeviceMusic) d).playMusic();
        d.turnOff();

        System.out.println();

        d = new SmartWatchDevice(102, "Apple", 30000);
        d.displaySpecifications();
        d.turnOn();
        d.turnOff();

        System.out.println();

        d = new SmartTVDevice(103, "Sony", 70000);
        d.displaySpecifications();
        d.turnOn();
        ((DeviceInternet) d).connectInternet();
        ((DeviceMusic) d).playMusic();
        d.turnOff();
    }
}