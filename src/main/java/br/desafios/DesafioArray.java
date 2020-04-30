package br.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exige do usuário a quantidade de notas a serem lançadas.
        System.out.print("Insira quantas notas serão cadastradas :");
        int quantidadeDeNotas = sc.nextInt();

        // Cria um array com tamanho conforme a escolha anterior do usuário.
        double[] arrayDeNotas = new double[quantidadeDeNotas];

        for (int i = 0; i < arrayDeNotas.length; i++){
            System.out.print("Digite o valor das notas " + (i + 1) + " : ");
            arrayDeNotas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota: arrayDeNotas){
            total += nota;
        }
        double media = total / arrayDeNotas.length;

        System.out.print("A média é " + media + " .");

    }
}
