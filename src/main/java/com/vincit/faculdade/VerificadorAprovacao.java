package com.vincit.faculdade;

public class VerificadorAprovacao {

    /**
     * Calcula se o aluno está aprovado.
     * A media tem que ser maior que 5.0 e a quantidade de faltas nao pode ser menos que 20
     * @param faltas
     * @param media
     * @return
     */
    public boolean esseAluno_PaSsou(int faltas, double media) {
    var quantidadeFaltas = 15;
    double mediaAprovacao = 6.0;

    if(faltas > quantidadeFaltas) {
    // reprovouu
    return false;
    } else if (media >= mediaAprovacao) {
    //passou
    return true;
    } else {
    //reprovado por nota
    return false;
    }
    }
}
