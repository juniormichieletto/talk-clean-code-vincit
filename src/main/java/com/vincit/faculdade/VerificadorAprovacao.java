package com.vincit.faculdade;

public class VerificadorAprovacao {

    public boolean isAlunoAprovado(int numeroFaltas, double mediaAluno) {
        var quantidadeLimiteFaltas = 15;
        double mediaAprovacao = 6.0;

        if (numeroFaltas > quantidadeLimiteFaltas) {
            return false;
        }
        if (mediaAluno >= mediaAprovacao) {
            return true;
        }
        return false;
    }
}
