package com.digitalbank.main;

public abstract class Account implements IAccount {

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double amount;
    protected Client client;

    public Account() {
        this.client = client;
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
    }

    @Override
    public void toWithdraw(double value) {
        amount -= value;
    }

    @Override
    public void deposit(double value) {
        amount += value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.toWithdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    protected void printExtract() {
        System.out.println(String.format("Agência %d", this.agency));
        System.out.println(String.format("Número %d", this.number));
        System.out.println(String.format("Saldo %.2f", this.amount));
    }
}