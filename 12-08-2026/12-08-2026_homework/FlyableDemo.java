interface FlyingCapability {
    void fly();
}

class FlyingBird implements FlyingCapability {
    public void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

class FlyingAirplane implements FlyingCapability {
    public void fly() {
        System.out.println("Airplane flies in the sky.");
    }
}

class FlyingDrone implements FlyingCapability {
    public void fly() {
        System.out.println("Drone flies in the sky.");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {

        FlyingCapability f;

        f = new FlyingBird();
        f.fly();

        f = new FlyingAirplane();
        f.fly();

        f = new FlyingDrone();
        f.fly();
    }
}