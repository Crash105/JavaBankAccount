package database;

public class Savings extends Account {

    private String number;
    private String code;

    public Savings(String name) {
        super(name);
        System.out.println("New Saving Account. Name: " + name);
    }

}
