package br.matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = sc.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = sc.nextInt();

        double [][] notasDaturma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;

        for(int a = 0; a < notasDaturma.length; a++){
            for(int n = 0; n < notasDaturma[a].length; n++){

                System.out.printf("Informe a %d nota do aluno %d: ", n, a);

                notasDaturma[a][n] = sc.nextDouble();
                total += notasDaturma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);

        sc.close();
    }

}
