package database;

import java.util.LinkedList;
import java.util.List;

public class BankAccount {
    public static void main(String[] args) {

        String file = "C:\\Users\\Brian\\BankAccountApplication\\JavaBankAccount\\database\\NewBankAccounts.csv";

        List<String[]> newcustomers = database.utilities.CSV.read(file);

        for (String[] newcustomer : newcustomers) {
            System.out.println("New Account");
            System.out.println(newcustomer[0]);
            System.out.println(newcustomer[1]);
            System.out.println(newcustomer[2]);
            System.out.println(newcustomer[3]);

        }

        // Checking account1 = new Checking("Joe Smith", "123456789", 200);
        // account1.deposit(200);
        // account1.withdraw(100);
        // account1.transfer("Brokerage", 50);
        // System.out.println(account1.showInfo());
        // Savings account2 = new Savings("Joe Smith", "123456789", 400);
        // System.out.println(account2.showInfo());

    }
}