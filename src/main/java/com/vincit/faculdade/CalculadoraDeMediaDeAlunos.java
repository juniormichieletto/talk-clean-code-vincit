package com.vincit.faculdade;

import java.util.List;

public class CalculadoraDeMediaDeAlunos {

    public double calcularMedia(List<Aluno> list) {
        double somaDeNotas = 0;
        int quantidadeDeNotas = 0;
        for (Aluno aluno : list) {
            for (int i = 0; i < aluno.notas().size(); i++) {
                double nota = aluno.notas().get(i);

                if (isNotaInvalida(nota)) {
                    System.out.println("Aluno " + aluno + " com Nota inválida");
                    break;

                }
                somaDeNotas += nota;
                quantidadeDeNotas++;
            }

        }
        return Math.round(calculaMediaFinal(somaDeNotas, quantidadeDeNotas));
    }

    private boolean isNotaInvalida(double nota) {
        if (nota < 0 || nota > 10) {
            return true;
        }
        return false;
    }

    private double calculaMediaFinal(double somaDasNotas, double quantidadeDeNotas) {
        if (quantidadeDeNotas > 0) {
            return somaDasNotas / quantidadeDeNotas;
        }
        return 0;
    }

}
