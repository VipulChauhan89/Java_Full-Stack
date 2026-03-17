class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Balance : " + this.balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited : " + amount);
            this.checkBalance();
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn : " + amount);
            this.checkBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000);
        account.deposit(500);
        account.withdraw(300);
    }
}
