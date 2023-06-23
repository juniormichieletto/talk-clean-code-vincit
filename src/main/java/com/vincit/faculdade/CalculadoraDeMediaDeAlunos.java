package com.vincit.faculdade;

import java.util.List;

public class CalculadoraDeMediaDeAlunos {

    public double calcularMedia(List<Aluno> list) {
        double somaDeNotas = 0;
        int contador = 0;

        for (Aluno aluno : list) {
            double nota = aluno.notas().get(contador);

            if(isNotaValida(nota)) {
                somaDeNotas += nota;
                contador++;
            } else {
                System.out.println("Nota inválida");
            }

        }
        return calculaMediaFinal(somaDeNotas, contador);
    }

    private boolean isNotaValida(double nota) {
        if(nota >= 0 && nota <= 10){
            return true;
        }
        return false;
    }
    private double calculaMediaFinal(double SomaDasNotas, double quantidadeDeNotas ) {
        if(quantidadeDeNotas > 0) {
            return SomaDasNotas / quantidadeDeNotas;
        }
        return 0;
    }

}
