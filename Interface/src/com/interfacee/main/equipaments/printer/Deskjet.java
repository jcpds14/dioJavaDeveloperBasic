package com.interfacee.main.equipaments.printer;

public class Deskjet implements Printer{
    private final String brandName = "Deskjet";
    public void print(){
        System.out.println("Printing " + brandName);
    }
}