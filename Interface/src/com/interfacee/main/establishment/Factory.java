package com.interfacee.main.establishment;

import com.interfacee.main.equipaments.printer.Deskjet;
import com.interfacee.main.equipaments.printer.Printer;

public class Factory {
    public static void main(String[] args) {
        Printer printer = new Deskjet();

        printer.print();
    }
}