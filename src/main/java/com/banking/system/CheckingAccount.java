package com.banking.system;

import java.time.LocalDate;

public class CheckingAccount extends Account{
    public CheckingAccount(int accountNum, String accountHolder, int balance, LocalDate dateAccountOpened) {
        super(accountNum, accountHolder, balance, dateAccountOpened);
    }
}
