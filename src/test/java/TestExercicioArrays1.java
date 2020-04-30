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
        for(int i = 0; i < 3; i++){
            total += notasAluno1[i];
        }

        double media = total / 3;

        assertEquals(7.53, media, 1);
    }

}
