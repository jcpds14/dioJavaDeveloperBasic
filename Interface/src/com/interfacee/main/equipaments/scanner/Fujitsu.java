package com.interfacee.main.equipaments.scanner;

public class Fujitsu implements Scanner{
    private final String brandName = "Fujitsu";
    public void scan(){
        System.out.println("Scanning " + brandName);
    }
}