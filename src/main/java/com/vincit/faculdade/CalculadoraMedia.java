package com.vincit.faculdade;

import java.util.List;

public class CalculadoraMedia {
    /**
     * Calcula Media de todos alunos
     * @param list
     * @return
     */
    public double calcularMedia(List<Aluno> list) {
        double soma = 0;
        int contador = 0;

        for (Aluno a : list) {
            double nota1 = a.notas().get(0);
            double nota2 = a.notas().get(1);
            double nota3 = a.notas().get(2);

            //verifica se sao notas validas
            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
                //calcula media do aluno
                var mediaAluno = (nota1 + nota2 + nota3) / 3;
                soma += mediaAluno;
                contador++;
            }
        }

        //calcula media final dos alunos
        if (contador > 0) {
            return soma / contador;
        } else {
            return 0;
        }
    }
}
