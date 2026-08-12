abstract class ShopProduct {
    int productId;
    String productName;
    double price;

    ShopProduct(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    abstract double calculateDiscount();

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println();
    }
}

class ShopElectronics extends ShopProduct {
    ShopElectronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 10 / 100;
    }
}

class ShopClothing extends ShopProduct {
    ShopClothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 20 / 100;
    }
}

class ShopGrocery extends ShopProduct {
    ShopGrocery(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 5 / 100;
    }
}

public class EcommerceProductDemo {
    public static void main(String[] args) {
        ShopProduct p;

        p = new ShopElectronics(101, "Laptop", 55000);
        p.display();

        p = new ShopClothing(102, "Shirt", 2000);
        p.display();

        p = new ShopGrocery(103, "Rice", 1000);
        p.display();
    }
}