package com.digitalbank.main;

public class CheckingAccount extends Account{
    @Override
    public void printStatus() {
        System.out.println("Extrato conta corrente");
        super.printExtract();
    }
}