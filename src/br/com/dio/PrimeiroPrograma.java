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

        Livro livro = new Livro("O problema dos tres corpos", "300");

        System.out.println(livro);

    }

    static class Livro{
        private String nome;
        private String numPaginas;

        public Livro(String nome, String numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(String numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas='" + numPaginas + '\'' +
                    '}';
        }
    }
}
