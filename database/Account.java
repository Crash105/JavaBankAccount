package database;

import java.util.Random;

public abstract class Account implements IBaseRate {

    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int id = 10000;

    public Account(String name, String SSN, int deposit) {
        this.name = name;
        this.SSN = SSN;
        balance = deposit;
        id++;
        this.accountNumber = setAccountNumber();
        setRate();
        compound();

    }

    public abstract void setRate();

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: $" + amount);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw: $" + amount);
    }

    public void transfer(String name, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + name);
    }

    public void compound() {
        double accruedinterest = balance * (rate / 100);
        System.out.println("Accrued Interest: " + accruedinterest);
        balance = balance + accruedinterest;
    }

    private String setAccountNumber() {

        Random rand = new Random();
        StringBuilder sb1 = new StringBuilder("");
        String lasttwo = SSN.substring(SSN.length() - 2, SSN.length());
        sb1.append(lasttwo);
        sb1.append(id);
        for (int i = 0; i < 3; i++) {
            int rand_int = rand.nextInt(10);
            sb1.append(rand_int);
        }

        String accountNumber1 = sb1.toString();
        return accountNumber1;

    }

    public String showInfo() {
        return "New Account Added\nName: " + name + "\nSSN: " + SSN + "\nBalance: " + balance;
    }

}
