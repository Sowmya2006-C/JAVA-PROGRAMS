class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account " + accountNumber);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount(1234, "John Doe", 1000.0);
        accounts[1] = new BankAccount(5678, "Jane Smith", 500.0);
        accounts[2] = new BankAccount(9012, "Bob Johnson", 2000.0);
        accounts[3] = new BankAccount(3456, "Alice Brown", 800.0);
        accounts[4] = new BankAccount(6789, "Mike Davis", 1500.0);

        for (BankAccount account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + ":");
            account.displayAccountDetails();
            System.out.println();
        }

        accounts[0].deposit(500);
        System.out.println("Account " + accounts[0].getAccountNumber() + " after deposit:");
        accounts[0].displayAccountDetails();
        System.out.println();

        accounts[0].withdraw(200);
        System.out.println("Account " + accounts[0].getAccountNumber() + " after withdrawal:");
        accounts[0].displayAccountDetails();
    }
}


This program creates a BankAccount class with the specified attributes and methods. It then creates an array of BankAccount objects and initializes it with 5 different accounts. The program tests the deposit, withdrawal, and display account details methods by performing these operations on the first account.

The output of the program will be:


Account 1234:
Account Number: 1234
Account Holder: John Doe
Balance: $1000.0

Account 5678:
Account Number: 5678
Account Holder: Jane Smith
Balance: $500.0

Account 9012:
Account Number: 9012
Account Holder: Bob Johnson
Balance: $2000.0

Account 3456:
Account Number: 3456
Account Holder: Alice Brown
Balance: $800.0

Account 6789:
Account Number: 6789
Account Holder: Mike Davis
Balance: $1500.0

Deposited $500.0 into Account 1234
Account 1234 after deposit:
Account Number: 1234
Account Holder: John Doe
Balance: $1500.0

Withdrawn $200.0 from Account 1234
Account 1234 after withdrawal:
Account Number: 1234
Account Holder: John Doe
Balance: $1300.0
