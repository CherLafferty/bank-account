// Create a BankAccount class
public class BankAccount {

    //MEMBER VARIABLES
    // The class should have the following attributes: (double) checking balance, (double) savings balance
    private double checkingBalance;
    private double savingsBalance;

    // Create a class member (static) that has the number of accounts created thus far
    public static int numberOfAccounts = 0;
    // Create a class member (static) that tracks the total amount of money stored in every account created
    public static double totalAmount = 0;

    //CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        // In the constructor, be sure to increment the account count
        numberOfAccounts++;
    }

    // METHODS
    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored
    public void depositMoney(String account, double deposit){
        if(account == "checking"){
            setCheckingBalance(getCheckingBalance() + deposit);
        }
        if(account == "savings"){
            setSavingsBalance(getSavingsBalance() + deposit);
        }
        totalAmount += deposit;
        System.out.println("Your account balance is " + totalAmount);
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds
    public void withdrawMoney(String account, double withdrawal){
        if(account == "checking" && withdrawal < getCheckingBalance()) {
            setCheckingBalance(getCheckingBalance() - withdrawal);
        } else {
            System.out.println("You have insufficient funds");
        }
        if(account == "savings" && withdrawal < getSavingsBalance()) {
            setSavingsBalance(getSavingsBalance() - withdrawal);
        } else {
            System.out.println("You have insufficient funds");
        }
        totalAmount -= withdrawal;
        System.out.println("Your account balance is " + totalAmount);
    }

    // Create a method to see the total money from the checking and saving
    public void getAccountSummary() {
        System.out.printf("\nYour checking balance is %s", getCheckingBalance());
        System.out.printf("\nYour savings balance is %s", getSavingsBalance());
    }

    //GETTERS
    // Create a getter method for the user's checking account balance
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    // Create a getter method for the user's saving account balance
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int numberOfAccounts(){
        return numberOfAccounts;
    }
    public static double totalAmount(){
        return totalAmount;
    }

    //SETTERS
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

}