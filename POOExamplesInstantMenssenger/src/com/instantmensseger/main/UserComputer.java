package com.instantmensseger.main;

import com.instantmensseger.model.FBMenssenger;
import com.instantmensseger.model.MSNMensseger;
import com.instantmensseger.model.Telegram;

public class UserComputer {
    public static void main(String[] args) {
        FBMenssenger fcb = new FBMenssenger();
        fcb.sendMenssage();
        System.out.println("Facebook");
        Telegram tlg = new Telegram();
        tlg.sendMenssage();
        System.out.println("Telegram");
        MSNMensseger msn = new MSNMensseger();
        msn.sendMenssage();
        System.out.println("MSN");
    }
}