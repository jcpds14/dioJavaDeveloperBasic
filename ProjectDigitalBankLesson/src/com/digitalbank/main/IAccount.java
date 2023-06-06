package com.digitalbank.main;

public interface IAccount {
    void toWithdraw(double value);
    void deposit(double value);

    void transfer(double value, Account destinationAccount);

    void printStatus();
}