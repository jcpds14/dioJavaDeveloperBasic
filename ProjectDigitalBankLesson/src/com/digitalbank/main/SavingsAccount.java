package com.digitalbank.main;

public class SavingsAccount extends Account {
    @Override
    public void printStatus() {
        System.out.println("Extrato conta poupança");
        super.printExtract();
    }
}