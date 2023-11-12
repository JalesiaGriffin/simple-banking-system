package com.banking.system;

import java.time.LocalDate;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accountNum, String accountHolder, int balance, LocalDate dateAccountOpened) {
        super(accountNum, accountHolder, balance, dateAccountOpened);
        this.interestRate = 0.043;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
