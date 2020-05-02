package br.equals;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        /* ===========================
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;

            return super.equals(objeto);
        }
        return false;
    }

         ============================== */

        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        else{
            return false;
        }

        // hascode
    }

    public int hashCode(){
        return 0;
    }
}
