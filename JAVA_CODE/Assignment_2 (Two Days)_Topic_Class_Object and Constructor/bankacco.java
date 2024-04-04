class BankAccount {
    String depositorName;
    long accountNumber;
    String accountType;
    double balance;

    public BankAccount(String depositorName, long accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class bankaccount_class {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1234567890, "Savings", 1000);
        BankAccount account2 = new BankAccount("Jane Doe", 9876543210, "Current", 2000);

        account1.deposit(500);
        account1.withdraw(200);

        account2.deposit(1000);
        account2.withdraw(3000);

        account1.display();
        System.out.println();
        account2.display();
    }
}
