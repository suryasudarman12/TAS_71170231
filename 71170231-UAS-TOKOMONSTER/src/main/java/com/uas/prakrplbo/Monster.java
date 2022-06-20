package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface {
    private String nama;

    Monster(){
        this.nama = nama;
    }

    public String bersuara(){

      return this.bersuara();
    }

    public void getInfo(){
    this.nama = nama;
    this.bersuara();
    this.bergerak();
    }

    public String getNama() {
        return this.nama;
    }

}
