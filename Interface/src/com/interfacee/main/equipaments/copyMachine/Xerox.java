package com.interfacee.main.equipaments.copyMachine;

public class Xerox implements CopyMachine{
    private final String brandName = "Xerox";
    public void copy(){
        System.out.println("Copying " + brandName);
    }
}