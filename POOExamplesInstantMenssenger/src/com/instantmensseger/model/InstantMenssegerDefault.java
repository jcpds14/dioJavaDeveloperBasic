package com.instantmensseger.model;

public class InstantMenssegerDefault {
    public static void sendMenssage(){
        validateInternetIsOn();
        System.out.println("ENVIANDO MENSSAGEM");
        saveMenssageInHistory();
    }
    public static void receiveMenssage(){
        System.out.println("Menssagem recebida");
    }

    private static void validateInternetIsOn(){
        System.out.println("Internet Is On");
    }
    private static void saveMenssageInHistory(){
        System.out.println("Menssage saved in history");
    }
}