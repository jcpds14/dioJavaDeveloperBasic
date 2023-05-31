package com.iphoneconcept.main;

import com.iphoneconcept.main.iphone.Iphone;

public class User {
    public static void main(String[] args) {
        Iphone smartPhone = new Iphone();

        smartPhone.fazerLigacao();
        smartPhone.tocarMusica();
        smartPhone.navegarNaInternet();
    }
}