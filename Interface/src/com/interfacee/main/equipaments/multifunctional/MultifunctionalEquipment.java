package com.interfacee.main.equipaments.multifunctional;

import com.interfacee.main.equipaments.copyMachine.CopyMachine;
import com.interfacee.main.equipaments.printer.Printer;
import com.interfacee.main.equipaments.scanner.Scanner;

public class MultifunctionalEquipment implements CopyMachine, Scanner, Printer {

    public void copy() {
        System.out.println("COPYING BY MULTIFUNCTIONAL");
    }

    public void print() {
        System.out.println("PRINTING BY MULTIFUNCTIONAL");
    }

    public void scan() {
        System.out.println("SCANNING BY MULTIFUNCTIONAL");
    }
}