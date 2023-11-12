package com.banking.system;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scan;
    private final Bank bank;

    public UserInterface() {
        scan = new Scanner(System.in);
        bank = new Bank();
    }

    public void display(){
        // Menu
        System.out.println("BigBank Bank");
        System.out.println("1) New Customer");
        System.out.println("2) New Account");
        System.out.println("3) Deposit");
        System.out.println("4) Withdraw");
        System.out.println("5) Check Balance");
        System.out.println("6) Display Customer Information");
        System.out.println("7) Exit");
        System.out.print("Select option: ");
        String option = scan.nextLine();

        switch (option){
            case "1":
                processCreateNewCustomer();
                break;
            case "2":
                processCreateNewAccount();
                break;
            case "3":
                processDepositMoney();
                break;
            case "4":
                processWithdrawMoney();
                break;
            case "5":
                processCheckBalance();
                break;
            case "6":
                processDisplayCustomerInformation();
                break;
            case "7":
                break;
            default:
                System.out.println("invalid response.");
        }
    scan.close();
    }

    public void processCreateNewCustomer(){
        System.out.println("\nCreate New Customer");
        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.print("Enter address: ");
        String address = scan.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNum = scan.nextLine();

        System.out.print("Enter email: ");
        String email = scan.nextLine();

        int userId = bank.generateNewUserId();

        bank.addCustomer(new Customer(name, address, phoneNum, email, userId));
    }

    public void processCreateNewAccount(){
        Customer customer = null;

        System.out.println("\nNew Account");
        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.println("Enter bank user id: ");
        long userId = scan.nextLong();

        boolean found = false;
        for (Customer c : bank.getCustomers()) {
            if (userId == c.getBankUserId()) {
                customer = c;
                found = true;

                System.out.print("Account type: ");
                String type = scan.nextLine();

                if (type.equalsIgnoreCase("Savings")) {
                    SavingsAccount savings = new SavingsAccount(name, LocalDate.now());
                    savings.setAccountNum(savings.generateNewAccountNumber());
                    customer.addAccount(savings);
                    break;
                } else if (type.equalsIgnoreCase("Checking")){
                    CheckingAccount checking = new CheckingAccount(name, LocalDate.now());
                    checking.setAccountNum(checking.generateNewAccountNumber());
                    customer.addAccount(checking);
                    break;
                } else {
                    System.out.println("invalid response.");
                }
            }

        }
        if (!found){
            System.out.println("id not found.");
        }
    }
    public void processDepositMoney(){}
    public void processWithdrawMoney(){}
    public void processCheckBalance(){}
    public void processDisplayCustomerInformation(){}
}
