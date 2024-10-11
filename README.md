# Java Bank Application

This Java application simulates a basic banking system, utilizing object-oriented programming principles such as inheritance. It processes customer data from a CSV file to create and manage bank accounts.

## Features

- Parses customer data from a CSV file
- Creates Checking and Savings accounts based on the parsed data
- Utilizes inheritance with a parent `Account` class and child classes `CheckingAccount` and `SavingsAccount`
- Processes initial deposits for new accounts
- Users can deposit, withdraw, and transfer from either a checking or savings account

## Class Descriptions

### Account (Parent Class)
- Base class for all account types
- Contains common attributes such as account holder name, Social Security number, and balance

### CheckingAccount (Child Class)
- Inherits from `Account`
- Implements specific features for checking accounts

### SavingsAccount (Child Class)
- Inherits from `Account`
- Implements specific features for savings accounts

### CSV (Utility Class)
- Located in the `utilities` folder
- Responsible for parsing the CSV file containing customer information

## CSV File Structure

The application reads from a CSV file (`accounts.csv`) with the following structure:

```
Name,SSN,AccountType,InitialDeposit
John Doe,123-45-6789,Checking,1000.00
Jane Smith,987-65-4321,Savings,5000.00
```

## How It Works

1. The application starts by reading the `accounts.csv` file using the `CSV` utility class.
2. For each row in the CSV file:
   - Customer information is extracted (name, SSN, account type, initial deposit)
   - Based on the account type, either a `CheckingAccount` or `SavingsAccount` object is created
   - The initial deposit is processed for the new account
3. The created accounts are stored and can be further managed within the application

## Setup and Running the Application

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository to your local machine.
3. Navigate to the project directory.
4. Compile the Java files:
   - Account.java
   - utilities/CSV.java
   - BankAccount.java
5. Run the application:
    BankAccount.java

## Future Enhancements
- Add a user interface for interactive banking operations
- Implement data persistence (database integration)
- Add error handling and logging

