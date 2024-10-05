package database;

import java.util.Random;

public class Checking extends Account {

    private int debitCardNumber;
    private int debitCardPIN;

    public Checking(String name, String SSN, double deposit) {
        super(name, SSN, deposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    private void setDebitCard() {
        Random rand = new Random();
        int rand_int = rand.nextInt(10000);
        this.debitCardPIN = rand_int;
        int rand_int1 = (int) (Math.random() * Math.pow(10, 17));
        this.debitCardNumber = rand_int1;
    }

    @Override
    public void setRate() {
        double baserate = getBaseRate();
        rate = baserate * .15;

    }

    public String showInfo() {

        System.out.println("*************************");
        System.out.println(super.showInfo());
        return "ACCOUNT TYPE: CHECKING" + "\nChecking Account Number: " + accountNumber + "\nDebit Card Pin: "
                + debitCardPIN + "\nDebit Card Number: " + debitCardNumber + "\nChecking Rate: " + rate + "%";

    }

}
