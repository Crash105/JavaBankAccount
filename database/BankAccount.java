package database;

import java.util.LinkedList;
import java.util.List;

public class BankAccount {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        String file = "C:\\Users\\Brian\\BankAccountApplication\\JavaBankAccount\\database\\NewBankAccounts.csv";

        List<String[]> newcustomers = database.utilities.CSV.read(file);

        for (String[] newcustomer : newcustomers) {

            String name = newcustomer[0];
            String SSN = newcustomer[1];
            String accountType = newcustomer[2];
            String deposit1 = newcustomer[3];
            double deposit = Double.valueOf(deposit1);
            if (accountType.equals("Savings")) {

                accounts.add(new Savings(name, SSN, deposit));
            } else if (accountType.equals("Checking")) {

                accounts.add(new Checking(name, SSN, deposit));

            } else {
                System.out.println("Error Creating an Account");
            }

        }
        for (Account acc : accounts) {
            System.out.println(acc.showInfo());
        }

        System.out.println("*******************");
        System.out.println("Get Account 5");
        System.out.println(accounts.get(5).showInfo());

    }
}