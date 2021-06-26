package com.bugunneyesem;

import java.util.ArrayList;

public class Yemek {
    private ArrayList<String> icerik;
    private String ad;

    public Yemek(String ad){
        this.ad = ad;
        icerik = new ArrayList<String>();
    }

    public void icerikEkle(String yeniIcerik){
        icerik.add(yeniIcerik);
    }

    public boolean icerikVar(String aranacakIcerik){
        return icerik.contains(aranacakIcerik);
    }

    public String getAd(){
        return this.ad;
    }

}
