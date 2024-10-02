package database;

public class BankAccount {
    public static void main(String[] args) {

        Checking account1 = new Checking("Joe Smith", "123456789", 200);
        account1.deposit(200);
        account1.withdraw(100);
        account1.transfer("Brokerage", 50);
        System.out.println(account1.showInfo());
        Savings account2 = new Savings("Joe Smith", "123456789", 400);
        System.out.println(account2.showInfo());

    }
}