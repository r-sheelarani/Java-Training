interface OnlinePayable {
    void pay();
    void refund();
}

class OnlineUPI implements OnlinePayable {
    public void pay() {
        System.out.println("UPI payment completed.");
    }

    public void refund() {
        System.out.println("UPI refund completed.");
    }
}

class OnlineCreditCard implements OnlinePayable {
    public void pay() {
        System.out.println("Credit Card payment completed.");
    }

    public void refund() {
        System.out.println("Credit Card refund completed.");
    }
}

class OnlineNetBanking implements OnlinePayable {
    public void pay() {
        System.out.println("Net Banking payment completed.");
    }

    public void refund() {
        System.out.println("Net Banking refund completed.");
    }
}

public class OnlinePaymentDemo {
    public static void main(String[] args) {
        OnlinePayable p;

        p = new OnlineUPI();
        p.pay();
        p.refund();

        p = new OnlineCreditCard();
        p.pay();
        p.refund();

        p = new OnlineNetBanking();
        p.pay();
        p.refund();
    }
}