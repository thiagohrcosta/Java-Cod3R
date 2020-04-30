import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercicioArrays1 {

    @Test
    public void deveraRetornarMediaNota(){
        double[] notasAluno1 = new double[3];

        notasAluno1[0] = 7.9;
        notasAluno1[1] = 8;
        notasAluno1[2] = 6.7;

        double total = 0;
        for(int i = 0; i < notasAluno1.length; i++){
            total += notasAluno1[i];
        }

        double media = total / notasAluno1.length;

        assertEquals(7.53, media, 1);
    }

    @Test
    public void deveraRetornarAprovadoOuReprovado(){
        double[] notasAluno1 = new double[3];

        notasAluno1[0] = 7.9;
        notasAluno1[1] = 8;
        notasAluno1[2] = 6.7;

        double total = 0;
        for(int i = 0; i < notasAluno1.length; i++){
            total += notasAluno1[i];
        }

        double media = total / notasAluno1.length;

        String aprovado = "Aprovado";

        if(media >7){
            System.out.print("Aprovado");
        }
        else{
            System.out.print("Reprovado");
            aprovado = "Reprovado";
        }

        assertEquals("Aprovado", aprovado);
    }

}
