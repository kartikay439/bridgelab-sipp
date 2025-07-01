class Customer {
    String name;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (BankAccount acc : accounts)
            System.out.println("Balance in " + acc.bank.name + ": " + acc.balance);
    }
}

class Bank {
    String name;

    public Bank(String name) {
        this.name = name;
    }

    public BankAccount openAccount(Customer customer, double balance) {
        BankAccount acc = new BankAccount(this, balance);
        customer.addAccount(acc);
        return acc;
    }
}

class BankAccount {
    Bank bank;
    double balance;

    public BankAccount(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }
}
