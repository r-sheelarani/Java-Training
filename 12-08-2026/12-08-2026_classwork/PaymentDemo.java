abstract class ShoppingPayment {
    abstract void makePayment();
}

class ShoppingUPI extends ShoppingPayment {
    @Override
    void makePayment() {
        System.out.println("Payment made using UPI.");
    }
}

class ShoppingCreditCard extends ShoppingPayment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}

class ShoppingDebitCard extends ShoppingPayment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Debit Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        ShoppingPayment p;

        p = new ShoppingUPI();
        p.makePayment();

        p = new ShoppingCreditCard();
        p.makePayment();

        p = new ShoppingDebitCard();
        p.makePayment();
    }
}