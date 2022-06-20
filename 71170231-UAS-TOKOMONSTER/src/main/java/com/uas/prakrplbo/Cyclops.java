package com.uas.prakrplbo;

public class Cyclops extends Monster{
    Cyclops(String nama){
        System.out.println(nama);

    }


    @Override
    public String bergerak() {
        System.out.println("Berjalan");
        return null;
    }

    @Override
    public String bersuara() {
        System.out.println("Hohohoho");
        return super.bersuara();
    }
}
