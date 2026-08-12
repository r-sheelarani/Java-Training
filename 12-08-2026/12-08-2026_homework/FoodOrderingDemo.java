abstract class FoodProviderSystem {
    String name;
    String location;

    FoodProviderSystem(String name, String location) {
        this.name = name;
        this.location = location;
    }

    abstract void prepareFood();

    abstract double calculateBill();

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Bill: Rs." + calculateBill());
    }
}

interface HomeDeliveryService {
    void deliverHome();
}

interface OnlinePaymentService {
    void makeOnlinePayment();
}

class FoodRestaurant extends FoodProviderSystem
        implements HomeDeliveryService, OnlinePaymentService {

    FoodRestaurant(String name, String location) {
        super(name, location);
    }

    @Override
    void prepareFood() {
        System.out.println("Restaurant prepares food.");
    }

    @Override
    double calculateBill() {
        return 500;
    }

    public void deliverHome() {
        System.out.println("Restaurant provides home delivery.");
    }

    public void makeOnlinePayment() {
        System.out.println("Restaurant accepts online payment.");
    }
}

class FoodCloudKitchen extends FoodProviderSystem
        implements HomeDeliveryService, OnlinePaymentService {

    FoodCloudKitchen(String name, String location) {
        super(name, location);
    }

    @Override
    void prepareFood() {
        System.out.println("Cloud kitchen prepares food.");
    }

    @Override
    double calculateBill() {
        return 400;
    }

    public void deliverHome() {
        System.out.println("Cloud kitchen provides home delivery.");
    }

    public void makeOnlinePayment() {
        System.out.println("Cloud kitchen accepts online payment.");
    }
}

class FoodTruck extends FoodProviderSystem
        implements OnlinePaymentService {

    FoodTruck(String name, String location) {
        super(name, location);
    }

    @Override
    void prepareFood() {
        System.out.println("Food truck prepares food.");
    }

    @Override
    double calculateBill() {
        return 300;
    }

    public void makeOnlinePayment() {
        System.out.println("Food truck accepts online payment.");
    }
}

public class FoodOrderingDemo {
    public static void main(String[] args) {

        FoodProviderSystem f;

        f = new FoodRestaurant("ABC Restaurant", "Chennai");
        f.display();
        f.prepareFood();

        System.out.println();

        if (f instanceof HomeDeliveryService) {
            HomeDeliveryService h = (HomeDeliveryService) f;
            h.deliverHome();
        }

        if (f instanceof OnlinePaymentService) {
            OnlinePaymentService p = (OnlinePaymentService) f;
            p.makeOnlinePayment();
        }

        System.out.println();

        f = new FoodCloudKitchen("XYZ Cloud Kitchen", "Coimbatore");
        f.display();
        f.prepareFood();

        System.out.println();

        f = new FoodTruck("Quick Food Truck", "Salem");
        f.display();
        f.prepareFood();

        if (f instanceof OnlinePaymentService) {
            OnlinePaymentService p = (OnlinePaymentService) f;
            p.makeOnlinePayment();
        }
    }
}