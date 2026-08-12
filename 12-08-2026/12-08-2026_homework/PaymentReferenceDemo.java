abstract class ReferencePayment {
    abstract void pay();
}

class ReferenceUPI extends ReferencePayment {

    @Override
    void pay() {
        System.out.println("UPI Payment");
    }

    void scanQR() {
        System.out.println("Scanning QR");
    }
}

public class PaymentReferenceDemo {
    public static void main(String[] args) {

        ReferencePayment p = new ReferenceUPI();

        p.pay();

        // p.scanQR();
        // This gives a compilation error because
        // p is a ReferencePayment reference.

        if (p instanceof ReferenceUPI) {
            ReferenceUPI u = (ReferenceUPI) p;
            u.scanQR();
        }
    }
}