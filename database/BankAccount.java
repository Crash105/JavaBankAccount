package database;

public class BankAccount {
    public static void main(String[] args) {

        Checking account1 = new Checking("Joe Smith", "123456789", 200);
        System.out.println(account1.showInfo());
        Savings account2 = new Savings("Joe Smith", "123456789", 200);
        System.out.println(account2.showInfo());

    }
}