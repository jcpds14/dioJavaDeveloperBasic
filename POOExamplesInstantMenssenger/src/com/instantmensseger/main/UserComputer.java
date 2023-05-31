package com.instantmensseger.main;

import com.instantmensseger.model.FBMenssenger;
import com.instantmensseger.model.MSNMensseger;
import com.instantmensseger.model.Telegram;

public class UserComputer {
    public static void main(String[] args) {
        FBMenssenger fcb = new FBMenssenger();
        fcb.sendMenssage();
        Telegram tlg = new Telegram();
        tlg.sendMenssage();
        MSNMensseger msn = new MSNMensseger();
        msn.sendMenssage();
    }
}