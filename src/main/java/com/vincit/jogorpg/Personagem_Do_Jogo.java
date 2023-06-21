package com.vincit.jogorpg;

public class Personagem_Do_Jogo {

    private int vida;
    private int energia;
    private int nivel;
    private int poder;

    public Personagem_Do_Jogo(int vida, int energia, int nivel, int poder) {
        this.vida = vida;
        this.energia = energia;
        this.nivel = nivel;
        this.poder = poder;
    }

    public void realizarAtaque(Monstro monstro) {
        if (this.vida > 0) {
            if (this.energia >= 50) {
                if (this.nivel >= 10) {
                    if (this.poder >= 80) {
                        System.out.println("Hadouken!");
                        monstro.sofreAtaque();
                    } else {
                        System.out.println("Sem poder suficiente");
                    }
                } else {
                    System.out.println("Nivel muito baixo para atacar");
                }
            } else {
                System.out.println("Energia insuficiente para realizar o ataque.");
            }
        } else {
            System.out.println("Personagem está sem vida.");
        }
    }
}
