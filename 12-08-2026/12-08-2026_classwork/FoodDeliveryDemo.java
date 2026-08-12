abstract class FoodOrder {
    int orderId;
    String customerName;
    double amount;

    FoodOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    abstract double calculateDeliveryCharge();

    void displayBill() {
        double delivery = calculateDeliveryCharge();
        double total = amount + delivery;

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Food Amount: " + amount);
        System.out.println("Delivery Charge: " + delivery);
        System.out.println("Final Bill: " + total);
        System.out.println();
    }
}

class NormalFoodDelivery extends FoodOrder {
    NormalFoodDelivery(int id, String name, double amount) {
        super(id, name, amount);
    }

    @Override
    double calculateDeliveryCharge() {
        return 50;
    }
}

class ExpressFoodDelivery extends FoodOrder {
    ExpressFoodDelivery(int id, String name, double amount) {
        super(id, name, amount);
    }

    @Override
    double calculateDeliveryCharge() {
        return 100;
    }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodOrder o;

        o = new NormalFoodDelivery(101, "Priya", 500);
        o.displayBill();

        o = new ExpressFoodDelivery(102, "Rahul", 700);
        o.displayBill();
    }
}