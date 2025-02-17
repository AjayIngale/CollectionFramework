package com.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Banking System Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Deposit Amount: ");
                    double initialDeposit = scanner.nextDouble();
                    bank.createAccount(name, initialDeposit);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String accNumDeposit = scanner.nextLine();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.depositMoney(accNumDeposit, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String accNumWithdraw = scanner.nextLine();
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdrawMoney(accNumWithdraw, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String accNumView = scanner.nextLine();
                    bank.viewAccountDetails(accNumView);
                    break;

                case 5:
                    bank.viewAllAccounts();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting... Thank you for using the Banking System!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

        scanner.close();
    }
}
