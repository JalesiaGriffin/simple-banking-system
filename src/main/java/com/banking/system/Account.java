package com.banking.system;

import java.time.LocalDate;
import java.util.List;

public abstract class Account {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private LocalDate dateAccountOpened;
    private List<Transaction> transactions;

    public Account(int accountNum, String accountHolder, int balance, LocalDate dateAccountOpened, List<Transaction> transactions) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.dateAccountOpened = dateAccountOpened;
        this.transactions = transactions;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDate getDateAccountOpened() {
        return dateAccountOpened;
    }

    public void setDateAccountOpened(LocalDate dateAccountOpened) {
        this.dateAccountOpened = dateAccountOpened;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
