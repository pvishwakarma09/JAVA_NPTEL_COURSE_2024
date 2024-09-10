// import necessary classes
public class BankAccount{
    private double balance; // Encapsulated data .Variable is privet

    // create a construtor
    public BankAccount(double initialBalance){
        balance=initialBalance;
    }
    // Method to deposite money
    public void deposit(double amount){
        balance+=amount; // balance=balance+amount
    }
    // Method to withdraw money
    public void withdraw(double amount){
        balance-=amount; // balance=balance-amount
    }
    // Method to get Current balance 
    public double getBalance(){
        return balance;
    }
    // Main method hai leikin isko isi class ke andar define kiya hai
    public static void main(String[] args) {
        // create a new BankAccount object
        BankAccount account =new BankAccount(1000.0);
    
        // Initial balance 
        // System.out.println("This is Initial Balance:");
        // Deposite money
        account.deposit(500.0);
        // after depositing balance
        // System.out.println("After depositing balance");
        // Withdraw money 
        account.withdraw(300.0);
        //after withdraw balance
        // System.out.println("After Withdrawing balance");
        // current balance 
        System.out.println("Current Balance is :"+account.getBalance());
    }
}
