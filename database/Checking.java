package database;

public class Checking extends Account {

    int debitcard;
    int debitCard;

    public Checking(String name, String SSN, int deposit) {
        super(name, SSN, deposit);
        accountNumber = "2" + accountNumber;

    }

    public String showInfo() {
        System.out.println(super.showInfo());
        System.out.println("*************************");
        return "ACCOUNT TYPE: CHECKING" + "\nChecking Account Number: " + accountNumber;
    }

}
