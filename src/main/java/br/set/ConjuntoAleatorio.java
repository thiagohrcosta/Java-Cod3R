package br.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoAleatorio {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("X");

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");
        conjunto.add("X");

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains("teste"));
        System.out.println(conjunto.contains(1));


        Set nums = new HashSet();
        int numeros = 0;

        for (int i = 1; i <= 3; i++){
            nums.add(i);
        }

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);





    }
}
