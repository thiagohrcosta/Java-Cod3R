package br.arrays;

public class ExercicioArrays1 {

    public static double main(String[] args) {

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        double total = 0;
        for(int i = 0; i< 3; i++){
            total += notasAlunoA[i];
        }

        double notaMedia = total / 3;

        return notaMedia;

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
