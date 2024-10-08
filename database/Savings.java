package database;

import java.util.Random;

public class Savings extends Account {

    private int safetyDepositID;
    private int safetyDepositKey;

    public Savings(String name, String SSN, double deposit) {
        super(name, SSN, deposit);
        accountNumber = "1" + accountNumber;
        setSafetyBox();

    }

    public String showInfo() {

        System.out.println("*************************");
        System.out.println(super.showInfo());
        return "ACCOUNT TYPE: SAVING" + "\nSavings Account Number: " + accountNumber + "\nSafety Deposit Box ID: "
                + safetyDepositID + "\nSafety Deposot Box Key: " + safetyDepositKey + "\nSaving Rate: " + rate + "%";
    }

    @Override
    public void setRate() {
        double baserate = getBaseRate();
        rate = baserate - .25;

    }

    private void setSafetyBox() {
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        this.safetyDepositID = rand_int;
        int rand_int1 = rand.nextInt(10000);
        this.safetyDepositKey = rand_int1;

    }

}
