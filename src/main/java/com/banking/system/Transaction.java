package com.banking.system;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

public class Transaction {
    private String type;
    private LocalDate date;
    private LocalTime time;
    private double amount;

    public Transaction(String type, LocalDate date, LocalTime time, double amount) {
        this.type = type;
        this.date = date;
        this.time = time;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%s|%s", type, date, time, amount);
    }

    public static Comparator<Transaction> TransactionDate = new Comparator<Transaction>() {
        @Override
        public int compare(Transaction o1, Transaction o2) {
            LocalDate date1 = o1.getDate();
            LocalDate date2 = o2.getDate();
            return date2.compareTo(date1);
        }
    };
}
