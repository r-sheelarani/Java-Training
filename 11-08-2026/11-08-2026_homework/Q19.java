class Q19Account {
    int accountNumber;
    String holderName;
    double balance;

    Q19Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class Q19Savings extends Q19Account {
    double interestRate;

    Q19Savings(int accountNumber, String holderName,
               double balance, double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance = balance - amount;
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Minimum balance required.");
        }
    }
}

class Q19Current extends Q19Account {
    double overdraftLimit;

    Q19Current(int accountNumber, String holderName,
               double balance, double overdraftLimit) {

        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance = balance - amount;
            System.out.println("Current account withdrawal successful.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class Q19 {
    public static void main(String[] args) {

        // Upcasting
        Q19Account account;

        account = new Q19Savings(101, "Priya", 10000, 5);

        account.deposit(2000);
        account.withdraw(3000);
        account.displayBalance();

        System.out.println();

        account = new Q19Current(102, "Arun", 5000, 10000);

        account.deposit(1000);
        account.withdraw(9000);
        account.displayBalance();
    }
}