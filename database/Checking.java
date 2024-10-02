package database;

import java.util.Random;

public class Checking extends Account {

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String SSN, int deposit) {
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

    public String showInfo() {
        System.out.println(super.showInfo());
        System.out.println("*************************");
        return "ACCOUNT TYPE: CHECKING" + "\nChecking Account Number: " + accountNumber + "\nDebit Card Pin: "
                + debitCardPIN + "\nDebit Card Number: " + debitCardNumber;

    }

}
