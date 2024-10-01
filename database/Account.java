package database;

public abstract class Account implements IBaseRate {

    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;

    public Account(String name, String SSN, int deposit) {
        this.SSN = SSN;
        balance = deposit;
        System.out.println("New Account Added. Name: " + name);
    }

    public void deposit(int pay) {
        balance = balance + pay;
    }

    public void withdraw(int pay) {
        balance = balance - pay;
    }

}
