package com.instantmensseger.apps;

public class FBMenssenger extends InstantMenssegerDefault{
    public void sendMenssage(){
        validateInternetIsOn();
        System.out.println("MENSAGEM ENVIADA PELO FACEBOOK");
        saveMenssageInHistory();
    }
    public void receiveMenssage(){
        System.out.println("MENSAGEM RECEBIDA PELO FACEBOOK");
        saveMenssageInHistory();
    }

    @Override
    protected void saveMenssageInHistory(){
        System.out.println("SALVANDO MENSAGEM PELO FACEBOOK");
    }
}