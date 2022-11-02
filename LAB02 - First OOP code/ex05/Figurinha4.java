package ex05;

import java.time.LocalDate;

public class Figurinha4{
    private String nome;
    private LocalDate nascimento;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;
    public Figurinha4() {
    }
    public Figurinha4(String pais) {
        this.nome = null;
        this.nascimento = null;
        this.altura = 0;
        this.peso = 0;
        this.posicao = null;
        this.pais = pais;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Figurinha [nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", peso=" + peso
                + ", posicao=" + posicao + ", pais=" + pais + "]+\n";
    }

    

    
}