package static_this_final_instanceOf;

public class BankAccount {
    //This will remain sane across all objects
    static String bankName;

    //accountCount will store accounts quantity
    static int accountCounts = 0;

    String accountHolderName;
    final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        accountCounts++;
    }

    //
    static int getTotalAccounts(){
        return accountCounts;
    }
    
    public void acchountDetail() {
        
        //Checking current object is instance of BankAccount
        if(this instanceof BankAccount){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        }

    }



    

}
