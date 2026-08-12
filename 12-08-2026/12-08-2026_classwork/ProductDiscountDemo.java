abstract class StoreProduct {
    int productId;
    String productName;
    double price;

    StoreProduct(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Abstract method
    abstract double calculateDiscount();

    // Concrete method
    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void displayDetails() {
        System.out.println("Product Id    : " + productId);
        System.out.println("Product Name  : " + productName);
        System.out.println("Price         : " + price);
        System.out.println("Discount      : " + calculateDiscount());
        System.out.println("Final Price   : " + calculateFinalPrice());
    }
}

class ElectronicItem extends StoreProduct {

    ElectronicItem(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    double calculateDiscount() {
        return price * 10 / 100;
    }
}

public class ProductDiscountDemo {
    public static void main(String[] args) {

        StoreProduct p;

        System.out.println("<------------- Electronics ------------->");

        p = new ElectronicItem(123, "Laptop", 55000);

        p.displayDetails();
    }
}