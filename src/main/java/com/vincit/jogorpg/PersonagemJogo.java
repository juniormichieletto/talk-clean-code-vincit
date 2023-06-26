package com.vincit.jogorpg;

public class PersonagemJogo {

    private int vida;
    private int energia;
    private int nivel;
    private int poder;

    public PersonagemJogo(int vida, int energia, int nivel, int poder) {
        this.vida = vida;
        this.energia = energia;
        this.nivel = nivel;
        this.poder = poder;
    }

    public void realizarAtaque(Monstro monstro) {
        if (this.vida == 0) {
            System.out.println("Personagem está sem vida.");
            return;
        }
        if (this.energia < 50) {
            System.out.println("Energia insuficiente para realizar o ataque.");
            return;
        }
        if (this.nivel < 10) {
            System.out.println("Nivel muito baixo para atacar");
            return;
        }
        if (this.poder < 80) {
            System.out.println("Sem poder suficiente");
            return;
        }
        System.out.println("Hadouken!");
        monstro.sofreAtaque();
    }
}
