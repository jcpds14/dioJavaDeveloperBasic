package com.iphoneconcept.main.iphone;

import com.iphoneconcept.main.apps.Internet;
import com.iphoneconcept.main.apps.IPod;
import com.iphoneconcept.main.apps.CellPhone;

public class Iphone implements CellPhone, IPod, Internet {
    public void fazerLigacao() {
        System.out.println("FAZENDO LIGACAO");
    }

    public void receberLigcacao() {
        System.out.println("RECEBENDO LIGACAO");
    }

    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA");
    }

    public void navegarNaInternet() {
        System.out.println("NAVEGANDO NA INTERNET");
    }
}