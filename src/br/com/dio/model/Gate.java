package br.com.dio.model;

import java.util.Objects;

public class Gate {
    private String nome;
    private String cor;
    private Integer idade;

    public Gate() {
    }

    public Gate(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gate gate = (Gate) o;
        return Objects.equals(nome, gate.nome) && Objects.equals(cor, gate.cor) && Objects.equals(idade, gate.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gate{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
