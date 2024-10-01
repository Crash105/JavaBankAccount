package database;

public class Checking extends Account {

    private String debitcard;
    private String pin;

    public Checking(String name) {
        super(name);
        System.out.println("New Checking Account. Name: " + name);
    }

}
