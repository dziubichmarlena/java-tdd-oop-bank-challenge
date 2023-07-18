package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {

    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;
    private String typeOfAccount;

    public Account(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    private String generateAccountNumber() {
        int max = 2147483647;
        int min = 1000000000;
        int randomNum = new Random().nextInt(max - min) + min;
        return String.valueOf(randomNum);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }
}
