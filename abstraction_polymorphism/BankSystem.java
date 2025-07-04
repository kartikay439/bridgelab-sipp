package abstraction_polymorphism;
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to " + holderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + holderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Savings Account with 4% interest
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " has applied for a loan of ₹" + amount + " [Savings Account]");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Current Account with 2% interest
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " has applied for a loan of ₹" + amount + " [Current Account]");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

public class BankSystem {

    public static void runBankingSystem() {
        BankAccount acc1 = new SavingsAccount("S123", "Alice", 20000);
        BankAccount acc2 = new CurrentAccount("C456", "Bob", 80000);

        acc1.deposit(5000);
        acc2.withdraw(10000);

        processAccount(acc1);
        processAccount(acc2);

        processLoan((Loanable) acc1);
        processLoan((Loanable) acc2);
    }

    public static void processAccount(BankAccount account) {
        double interest = account.calculateInterest();
        System.out.println(account.getHolderName() + " earns ₹" + interest + " interest.");
    }

    public static void processLoan(Loanable account) {
        account.applyForLoan(100000);
        if (account.calculateLoanEligibility()) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Denied");
        }
    }

    public static void main(String[] args) {
        runBankingSystem();
    }
}
