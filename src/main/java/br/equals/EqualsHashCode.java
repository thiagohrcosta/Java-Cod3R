package br.equals;

public class EqualsHashCode {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "João da Silva";
        u1.email = "jsilva@email.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "João da Silva";
        u2.email = "jsilva@email.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.print("==========================");

        System.out.println();
    }
}