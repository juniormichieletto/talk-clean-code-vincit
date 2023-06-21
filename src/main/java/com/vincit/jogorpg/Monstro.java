package com.vincit.jogorpg;

public class Monstro {

    private int vida = 10;

    public void sofreAtaque() {
        this.vida--;
    }

    public int getVida() {
        return vida;
    }
}
