package database;

public abstract class Account implements IBaseRate {

    private int balance;

    public Account(String name) {
        System.out.println("New Account Added. Name: " + name);
    }

    public void deposit(int pay) {
        balance = balance + pay;
    }

    public void withdraw(int pay) {
        balance = balance - pay;
    }

}
