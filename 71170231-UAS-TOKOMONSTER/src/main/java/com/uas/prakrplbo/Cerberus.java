package com.uas.prakrplbo;

public class Cerberus extends Monster{
    Cerberus(String nama){
        System.out.println(nama);
    }

    @Override
    public String bersuara() {
        System.out.println("Rawrrawr");
        return super.bersuara();
    }

    @Override
    public String bergerak() {
        System.out.println("Berlari");
        return null;
    }
}
