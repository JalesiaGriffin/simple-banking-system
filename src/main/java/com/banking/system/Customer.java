package com.banking.system;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phoneNum;
    private String email;
    private int bankUserId;
    private List<Account> accounts;

    public Customer(String name, String address, String phoneNum, String email, int bankUserId) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.bankUserId = bankUserId;
        this.accounts = new ArrayList<Account>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(int bankUserId) {
        this.bankUserId = bankUserId;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
}
