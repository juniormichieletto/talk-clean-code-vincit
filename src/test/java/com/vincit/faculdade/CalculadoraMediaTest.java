package com.vincit.faculdade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exemplo simples de teste unitario para a classe
 * Sugestao: Pensar como conseguir cobrir mais cenarios de test
 * sem escrever muitos outros tests que seriam bem parecidos
 */
class CalculadoraMediaTest {

    private CalculadoraMedia calculadoraMedia;

    @BeforeEach
    void setUp() {
        calculadoraMedia = new CalculadoraMedia();
    }

    @Test
    void calcularMediaDeveRetornar0QuandoNaoTiverAlunos() {
        var mediaFinalEsperada = 0.0;
        List<Aluno> alunos = emptyList();

        var mediaFinalDosAlunos = calculadoraMedia.calcularMedia(alunos);

        assertThat(mediaFinalDosAlunos).isEqualTo(mediaFinalEsperada);
    }

    @Test
    void calcularMediaDeveRetornar0QuandoAlunoPossuiNotaInvalida() {
        var mediaFinalEsperada = 0.0;
        var notasInvalidas = List.of(-1, 11, 5);
        var alunos = List.of(new Aluno(notasInvalidas));

        var mediaFinalDosAlunos = calculadoraMedia.calcularMedia(alunos);

        assertThat(mediaFinalDosAlunos).isEqualTo(mediaFinalEsperada);
    }

    @Test
    void calcularMediaDeveCalcularApenasAlunosComNotasValidasQuandoPossuiAlunoComNotaInvalida() {
        var mediaFinalEsperada = 7;
        var notasInvalidas = List.of(-1, 10, 5);
        var notaAluno1 = List.of(10, 10, 10);
        var notaAluno2 = List.of(10, 0, 5);
        var notaAluno3 = List.of(4, 9, 5);
        var alunos = List.of(
                new Aluno(notasInvalidas),
                new Aluno(notaAluno1),
                new Aluno(notaAluno2),
                new Aluno(notaAluno3)
        );

        var mediaFinalDosAlunos = calculadoraMedia.calcularMedia(alunos);

        assertThat(mediaFinalDosAlunos).isEqualTo(mediaFinalEsperada);
    }
}
