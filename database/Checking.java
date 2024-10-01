package database;

public class Checking extends Account {

    int debitcard;
    int debitCard;

    public Checking(String name, String SSN, int deposit) {
        super(name, SSN, deposit);
        System.out.println("New Checking Account");

    }

}
