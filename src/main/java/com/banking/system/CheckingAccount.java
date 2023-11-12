package com.banking.system;

import java.time.LocalDate;
import java.util.List;

public class CheckingAccount extends Account{
    public CheckingAccount(int accountNum, String accountHolder, int balance, LocalDate dateAccountOpened, List<Transaction> transactions) {
        super(accountNum, accountHolder, balance, dateAccountOpened, transactions);
    }
}
