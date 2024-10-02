package database;

import java.util.Random;

public abstract class Account implements IBaseRate {

    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;
    static int id = 10000;

    public Account(String name, String SSN, int deposit) {
        this.name = name;
        this.SSN = SSN;
        balance = deposit;
        id++;
        this.accountNumber = setAccountNumber();
        setRate();

    }

    public abstract void setRate();

    public void deposit(int pay) {
        balance = balance + pay;
    }

    public void withdraw(int pay) {
        balance = balance - pay;
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
