abstract class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class BankSavingsAccount extends BankAccount {
    BankSavingsAccount(int number, String name, double balance) {
        super(number, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance = balance - amount;
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Minimum balance of Rs.1000 required.");
        }
    }
}

class BankCurrentAccount extends BankAccount {
    BankCurrentAccount(int number, String name, double balance) {
        super(number, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance = balance - amount;
            System.out.println("Current account withdrawal successful.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a;

        a = new BankSavingsAccount(101, "Priya", 10000);
        a.deposit(2000);
        a.withdraw(5000);
        a.displayBalance();

        System.out.println();

        a = new BankCurrentAccount(102, "Rahul", 5000);
        a.deposit(1000);
        a.withdraw(9000);
        a.displayBalance();
    }
}