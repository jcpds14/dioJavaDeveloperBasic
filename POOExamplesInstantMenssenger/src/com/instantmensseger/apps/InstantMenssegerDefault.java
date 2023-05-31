package com.instantmensseger.apps;

public abstract class InstantMenssegerDefault {
    public abstract void sendMenssage();
    public abstract void receiveMenssage();
    protected abstract void saveMenssageInHistory();
    protected static void validateInternetIsOn(){
        System.out.println("Internet Is On");
    }

    }