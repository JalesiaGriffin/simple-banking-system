package com.banking.system;

import java.util.List;

public class Bank {
    private List<Customer> customers;
    private List<Integer> userIds;

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void openAccount(Customer customer, Account account){
        customer.addAccount(account);
    }

    public void displayCustomerInfo(){
        for(Customer customer : customers){
            // Personal
            System.out.println("************************************************");
            System.out.println(customer.getName() + "'s Personal Information");
            System.out.println("User ID: " + customer.getBankUserId());
            System.out.println("Phone: " + customer.getPhoneNum());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Address: " + customer.getAddress());

            // Banking
            System.out.println("Banking Information");
            for (Account account: customer.getAccounts()) {
                System.out.println("Account Number: " + account.getAccountNum());
                System.out.println("Balance: $" + account.getBalance());
                if (account instanceof SavingsAccount savings) {
                    System.out.println("Interest Rate: " + savings.getInterestRate());
                }
            }
            System.out.println("************************************************");
        }
    }

    public int generateNewUserId(){
        int userId = (int)(Math.random() * 90000) + 10000;
        for(int id : userIds){
            if (id == userId){
                userId = (int)(Math.random() * 90000) + 10000;
            }
        }
        userIds.add(userId);
    return userId;
    }
}
