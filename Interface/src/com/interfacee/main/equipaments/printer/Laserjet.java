package com.interfacee.main.equipaments.printer;

public class Laserjet implements Printer{
    private final String brandName = "Laserjet";
    public void print(){
        System.out.println("Printing " + brandName);
    }
}