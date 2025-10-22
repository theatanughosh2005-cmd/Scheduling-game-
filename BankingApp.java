
class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends Account {
    private double interestRate = 0.03;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit = 100.0;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("S123", 1000);
        Account acc2 = new CheckingAccount("C456", 500);

        acc1.deposit(200);
        acc1.withdraw(100);
        System.out.println("Savings Balance: " + acc1.getBalance());

        ((SavingsAccount) acc1).applyInterest();
        System.out.println("Savings Balance after interest: " + acc1.getBalance());

        acc2.deposit(300);
        acc2.withdraw(900);  
        System.out.println("Checking Balance: " + acc2.getBalance());
    }
}
