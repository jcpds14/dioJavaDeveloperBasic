package com.instantmensseger.apps;

public class Telegram extends InstantMenssegerDefault {
    public void sendMenssage() {
        validateInternetIsOn();
        System.out.println("MENSAGEM ENVIADA PELO TELEGRAM");
        saveMenssageInHistory();
    }
    public void receiveMenssage() {
        System.out.println("MENSAGEM RECEBIDA PELO TELEGRAM");
        saveMenssageInHistory();
    }

    @Override
    protected void saveMenssageInHistory() {
        System.out.println("SALVANDO MENSAGEM PELO TELEGRAM");
    }
}