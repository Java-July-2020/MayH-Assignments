import java.util.Random;

public class BankAccount {
    private static final Random rnd = new Random();
    
    // Create a class member (static) that has the number of accounts created thus far.
    private static int numberOfAccounts;

    // Create a class member (static) that tracks the total amount of money stored in every account created.

    private static double totalBalance;

    // Users should not be able to set any of the attributes from the class.
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    // Constructor 
        // In the constructor, call the private method from above so that each user has a random ten digit account.
        // In the constructor, be sure to increment the account count.

    public BankAccount() {
        numberOfAccounts++;
        this.accountNumber = accountNumberGenerator(); 
    }
    
    public static int accountsCount() {
        return numberOfAccounts;
    }



    // Create a method to see the total money from the checking and saving.

    public static double totalBalance() {
        return totalBalance;
    }

    // Create a private method that returns a random ten digit account number

    private static String accountNumberGenerator() {
        char[] chars = new char[10];
        for (int i = 0; i < 10; i++) {
            chars[i] = Character.forDigit(rnd.nextInt(10), 10);
        }
        return new String(chars);
    }

    // Create a getter method for the user's checking account balance.

    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Create a getter method for the user's saving account balance.

    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.

    public void depositMoney(double amount, boolean checkingAccount) {
        if (checkingAccount) {
            checkingBalance += amount;
            totalBalance += amount;
        } else {
            savingsBalance += amount;
            totalBalance += amount;
        }
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

    public void withdrawMoney(double amount, boolean checkingAccount) {
        if (checkingAccount && amount <= checkingBalance) {
            checkingBalance -= amount;
            totalBalance -= amount;
        } else if (!checkingAccount && amount <= savingsBalance) {
            savingsBalance -= amount;
            totalBalance -= amount;
        } else {
            System.out.println("Insufficient Funds.");
        }
    }
}