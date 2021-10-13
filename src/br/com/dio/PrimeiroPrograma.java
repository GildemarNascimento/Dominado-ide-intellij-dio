package br.com.dio;

import br.com.dio.model.Gate;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /* System.out.println("Hello word!");*/
        Gate gato = new Gate();
        gato.setNome("Bilu");
        gato.setCor("Preto");
        gato.setIdade(2);
            System.out.println(gato);
    }
}
