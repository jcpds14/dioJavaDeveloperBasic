package com.instantmensseger.apps;

public class MSNMensseger extends InstantMenssegerDefault{
    public void sendMenssage(){
        validateInternetIsOn();
        System.out.println("MENSAGEM ENVIADA PELO MSN");
        saveMenssageInHistory();
    }
    public void receiveMenssage(){
        System.out.println("MENSAGEM RECEBIDA PELO MSN");
        saveMenssageInHistory();
    }

    @Override
    protected void saveMenssageInHistory(){
        System.out.println("SALVANDO MENSAGEM PELO MSN");
    }
}