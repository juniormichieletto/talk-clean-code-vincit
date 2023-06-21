package com.vincit.faculdade;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exemplo simples de teste unitario para a classe
 */
class VerificadorAprovacaoTest {

    private VerificadorAprovacao verificadorAprovacao = new VerificadorAprovacao();

    @Test
    void deveRetornarFalseQuandoNumeroDeFaltasEhMaiorQueOLimite() {
        var numeroDeFaltas = 20;
        var media = 6.0;

        var isApprovado = verificadorAprovacao.esseAluno_PaSsou(numeroDeFaltas, media);

        assertThat(isApprovado).isFalse();
    }

    @Test
    void deveRetornarFalseQuandoMediaAbaixoDoPermitido() {
        var numeroDeFaltas = 4;
        var media = 3.0;

        var isApprovado = verificadorAprovacao.esseAluno_PaSsou(numeroDeFaltas, media);

        assertThat(isApprovado).isFalse();
    }

    @Test
    void deveRetornarTrueQuandoMediaAProvadaENaoPassouLimiteDeFaltas() {
        var numeroDeFaltas = 4;
        var media = 7;

        var isApprovado = verificadorAprovacao.esseAluno_PaSsou(numeroDeFaltas, media);

        assertThat(isApprovado).isTrue();
    }
}
