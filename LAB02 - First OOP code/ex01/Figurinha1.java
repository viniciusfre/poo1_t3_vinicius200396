package ex01;

import java.time.LocalDate;

public class Figurinha1 {
    public String nome;
    public LocalDate nascimento;
    public float altura;
    public float peso;
    public String posicao;
    public String pais;

    

    public Figurinha1() {
    }

    public Figurinha1(String nome, LocalDate nascimento, float altura, float peso, String posicao, String pais) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]";
    }

    

    
}
