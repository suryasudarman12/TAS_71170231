package com.uas.prakrplbo;

public class Manticore extends Monster{
    Manticore(String nama){
        getNama();
    }

    @Override
    public String bersuara() {
        System.out.println("Roarroar");
        return super.bersuara();
    }

    @Override
    public String bergerak() {
        System.out.println("Terbang");
        return null;
    }
}
