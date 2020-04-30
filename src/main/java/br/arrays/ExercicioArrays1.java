package br.arrays;

public class ExercicioArrays1 {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        double totalAlunoA = 0;
        for(int i = 0; i< notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        double notaMedia = totalAlunoA / notasAlunoA.length;

        final double notaArmazenada = 5.9;

        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        double notaMediaAlunoB = totalAlunoB / notasAlunoB.length;
    }

    public static void aprovadoOuReprovado(double notaMedia){
        if(notaMedia >= 7){
            System.out.print("Aprovado");
        }
        else{
            System.out.print("Reprovado");
        }
    }


}
