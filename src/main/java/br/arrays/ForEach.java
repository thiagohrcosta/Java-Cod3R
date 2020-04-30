package br.arrays;

public class ForEach {

    public static void main(String[] args){

        double[] notas = {9.9, 8.7, 7.2, 9.4};

        /*  FOR TRADICIONAL

            for (int i = 0; i < notas.lenght; ii){}

         */

        for(double nota: notas){
            System.out.print(notas + " ");
        }
    }
}
