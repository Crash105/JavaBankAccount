package database;

public class Savings extends Account {

    int safetyDepositID;
    int safetyDepositKey;

    public Savings(String name, String SSN, int deposit) {
        super(name, SSN, deposit);
        System.out.println("New Savings Account");

    }

}
