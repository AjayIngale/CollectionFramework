package com.test;

import java.util.ArrayList;

class Bank {
    private ArrayList<BankAccount> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Create account
    public void createAccount(String name, double initialBalance) {
        BankAccount newAccount = new BankAccount(name, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created successfully! Account Number: " + newAccount.getAccountNumber());
    }

    // Find account by account number
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    // Deposit money
    public void depositMoney(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw money
    public void withdrawMoney(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // View specific account details
    public void viewAccountDetails(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }

    // View all accounts
    public void viewAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
        } else {
            System.out.println("\nAll Accounts:");
            for (BankAccount acc : accounts) {
                acc.displayAccountDetails();
                System.out.println("-------------------");
            }
        }
    }
}
