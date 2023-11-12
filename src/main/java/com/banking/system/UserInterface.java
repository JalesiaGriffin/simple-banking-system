package com.banking.system;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scan;
    private Bank bank;

    public UserInterface() {
        scan = new Scanner(System.in);
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
        System.out.println("Create New Customer");
        System.out.println("Enter name: ");
        String name = scan.nextLine();

        System.out.println("Enter address: ");
        String address = scan.nextLine();

        System.out.println("Enter phone number: ");
        String phoneNum = scan.nextLine();

        System.out.println("Enter email: ");
        String email = scan.nextLine();

        int userId = bank.generateNewUserId();

        bank.addCustomer(new Customer(name, address, phoneNum, email, userId));
    }

    public void processCreateNewAccount(){}
    public void processDepositMoney(){}
    public void processWithdrawMoney(){}
    public void processCheckBalance(){}
    public void processDisplayCustomerInformation(){}
}
