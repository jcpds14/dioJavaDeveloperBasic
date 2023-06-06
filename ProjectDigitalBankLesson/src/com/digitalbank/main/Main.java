package com.digitalbank.main;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("Jean");

        Account ca = new CheckingAccount();
        Account sa = new SavingsAccount();

        ca.deposit(100);

        ca.transfer(100, sa);
        ca.printExtract();
        sa.printExtract();

    }
}