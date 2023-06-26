package com.vincit.jogorpg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exemplo simples de teste unitario para a classe
 * Duvida: Será um teste Unitario ou integrado?
 */
class PersonagemJogoTest {

    @Test
    void naoDeveRealizarAtaqueQuandoPersonagemEstaMorto() {
        var personagem = new PersonagemJogo(0, 10, 10, 10);
        var vidaEsperadaDoMonstroDepoisDoAtaque = 10;
        var monstro = new Monstro();

        personagem.realizarAtaque(monstro);

        assertThat(monstro.getVida())
                .isEqualTo(vidaEsperadaDoMonstroDepoisDoAtaque);
    }

    @Test
    void naoDeveRealizarAtaqueQuandoEnergiaEhMenorQue50() {
        var personagem = new PersonagemJogo(10, 49, 10, 10);
        var vidaEsperadaDoMonstroDepoisDoAtaque = 10;
        var monstro = new Monstro();

        personagem.realizarAtaque(monstro);

        assertThat(monstro.getVida())
                .isEqualTo(vidaEsperadaDoMonstroDepoisDoAtaque);
    }

    @Test
    void naoDeveRealizarAtaqueQuandoNivelInsuficiente() {
        var personagem = new PersonagemJogo(10, 60, 0, 90);
        var vidaEsperadaDoMonstroDepoisDoAtaque = 10;
        var monstro = new Monstro();

        personagem.realizarAtaque(monstro);

        assertThat(monstro.getVida())
                .isEqualTo(vidaEsperadaDoMonstroDepoisDoAtaque);
    }

    @Test
    void naoDeveRealizarAtaqueQuandoPoderEhMenorQue80() {
        var personagem = new PersonagemJogo(10, 60, 10, 77);
        var vidaEsperadaDoMonstroDepoisDoAtaque = 10;
        var monstro = new Monstro();

        personagem.realizarAtaque(monstro);

        assertThat(monstro.getVida())
                .isEqualTo(vidaEsperadaDoMonstroDepoisDoAtaque);
    }

    @Test
    void deveRealizarAtaqueComSucesso() {
        var personagem = new PersonagemJogo(10, 60, 15, 90);
        var vidaEsperadaDoMonstroDepoisDoAtaque = 9;
        var monstro = new Monstro();

        personagem.realizarAtaque(monstro);

        assertThat(monstro.getVida())
                .isEqualTo(vidaEsperadaDoMonstroDepoisDoAtaque);
    }
}
