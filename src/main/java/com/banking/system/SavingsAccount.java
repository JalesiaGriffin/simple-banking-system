package com.banking.system;

import java.time.LocalDate;
import java.util.List;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accountNum, String accountHolder, int balance, LocalDate dateAccountOpened, List<Transaction> transactions, double interestRate) {
        super(accountNum, accountHolder, balance, dateAccountOpened, transactions);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
