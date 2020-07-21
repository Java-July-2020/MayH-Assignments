public class BankAccountTest {
    
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.depositMoney(2000, true);
        user.withdrawMoney(1000, true);
        System.out.println(user.totalBalance());
    }
}