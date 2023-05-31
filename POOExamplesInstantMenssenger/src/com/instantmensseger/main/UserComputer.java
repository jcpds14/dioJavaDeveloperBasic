package com.instantmensseger.main;

import com.instantmensseger.apps.FBMenssenger;
import com.instantmensseger.apps.InstantMenssegerDefault;
import com.instantmensseger.apps.MSNMensseger;
import com.instantmensseger.apps.Telegram;

public class UserComputer {
    public static void main(String[] args) {
        InstantMenssegerDefault imd = null;

        String serviceChoiced = "tlg";

        if (serviceChoiced == "msn") {
            imd = new MSNMensseger();
        } else if (serviceChoiced == "tlg") {
            imd = new Telegram();
        } else if (serviceChoiced == "fbm") {
            imd = new FBMenssenger();
        }

        imd.sendMenssage();
        imd.receiveMenssage();
    }
}