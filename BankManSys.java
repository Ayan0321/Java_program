 
package com.mycompany.pro25;

interface Interest {
    
    double calculateInterest( );
}

abstract class BankAccount implements Interest
{


    
    String accountNo;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    abstract  void displayAccountType();
    
    public void show(){
        
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Account Number : "+accountNo);
        System.out.println("Balance : "+balance);
        
    }
    
    
}

class SavingAccount extends BankAccount  
{

    public SavingAccount(String accountNo, String accountHolderName, double balance) {
        super(accountNo, accountHolderName, balance);
    }
    
    @Override
    void displayAccountType(){
        
        System.out.println("AccountType : SavingAccount");
    }
    
    @Override
     public double calculateInterest( ){
        
        return balance*0.04; 
    }
}
class CurrentAccount extends BankAccount  
{

    public CurrentAccount(String accountNo, String accountHolderName, double balance) {
        super(accountNo, accountHolderName, balance);
    }

        void displayAccountType(){
            
            System.out.println("AccountType : CurrentAccount");
        }
        @Override
         public double calculateInterest( ){
        
        return balance*0.02;
    }
}

 
public class BankManSys {

     
    public static void main(String[] args) {
        
        
        BankAccount [] accounts = new BankAccount [4];
        
        accounts[0] = new SavingAccount("SB1001", "Anshul", 50000);
        accounts[1] = new CurrentAccount("CA1001", "Amit", 80000);
        accounts[2] = new SavingAccount("SB1002", "Neha", 60000);
        accounts[3] = new CurrentAccount("CA1002", "Ravi", 75000);

        // Loop to process accounts
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayAccountType();
            accounts[i].show();
            double interest = accounts[i].calculateInterest();
            System.out.println("Interest: " + interest);
            System.out.println();
        }
    }
    
}
