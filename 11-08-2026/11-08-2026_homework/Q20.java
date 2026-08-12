class Q20Product {
    int productId;
    String productName;
    double price;

    Q20Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

class Q20Electronics extends Q20Product {
    String warranty;

    Q20Electronics(int productId, String productName,
                   double price, String warranty) {

        super(productId, productName, price);
        this.warranty = warranty;
    }

    @Override
    void displayProduct() {
        super.displayProduct();
        System.out.println("Warranty: " + warranty);
    }

    void displayWarranty() {
        System.out.println("Warranty: " + warranty);
    }
}

class Q20Laptop extends Q20Electronics {
    int ram;
    String processor;

    Q20Laptop(int productId, String productName, double price,
              String warranty, int ram, String processor) {

        super(productId, productName, price, warranty);
        this.ram = ram;
        this.processor = processor;
    }

    void displayLaptopDetails() {
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor: " + processor);
    }
}

class Q20Clothing extends Q20Product {
    String size;
    String material;

    Q20Clothing(int productId, String productName,
                double price, String size, String material) {

        super(productId, productName, price);
        this.size = size;
        this.material = material;
    }

    @Override
    void displayProduct() {
        super.displayProduct();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }

    void displayClothingDetails() {
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

public class Q20 {
    public static void main(String[] args) {

        // Product reference
        Q20Product p;

        // Upcasting Laptop to Product
        p = new Q20Laptop(
                101,
                "Gaming Laptop",
                75000,
                "2 Years",
                16,
                "Intel i7"
        );

        // Runtime polymorphism
        p.displayProduct();

        System.out.println();

        // Safe downcasting
        if (p instanceof Q20Laptop) {
            Q20Laptop laptop = (Q20Laptop) p;

            laptop.displayWarranty();
            laptop.displayLaptopDetails();
        }

        System.out.println();

        // Hierarchical inheritance
        p = new Q20Clothing(
                102,
                "Cotton Shirt",
                1500,
                "L",
                "Cotton"
        );

        // Runtime polymorphism
        p.displayProduct();

        System.out.println();

        // Safe downcasting
        if (p instanceof Q20Clothing) {
            Q20Clothing clothing = (Q20Clothing) p;
            clothing.displayClothingDetails();
        }
    }
}