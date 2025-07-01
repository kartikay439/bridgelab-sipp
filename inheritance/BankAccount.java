package inheritance;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String acc, double bal, double interestRate) {
        super(acc, bal);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account with interest rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account with limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityYears;

    public FixedDepositAccount(String acc, double bal, int years) {
        super(acc, bal);
        this.maturityYears = years;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account with maturity: " + maturityYears + " years");
    }
}
