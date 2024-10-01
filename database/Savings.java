package database;

public class Savings extends Account {

    int safetyDepositID;
    int safetyDepositKey;

    public Savings(String name, String SSN, int deposit) {
        super(name, SSN, deposit);
        accountNumber = "1" + accountNumber;

    }

    public String showInfo() {
        System.out.println(super.showInfo());
        System.out.println("*************************");
        return "ACCOUNT TYPE: SAVING" + "\nSavings Account Number: " + accountNumber;
    }

}
