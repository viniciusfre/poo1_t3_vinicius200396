package lab02;

import java.util.Arrays;

public class Seleção {
    private String nome;
    Figurinha3 jogador[] = new Figurinha3[11];
    private String tecnico;
    

    public Seleção() {
    }


    public Seleção(String nome, Figurinha3[] jogador, String tecnico) {
        this.nome = nome;
        this.jogador = jogador;
        this.tecnico = tecnico;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Figurinha3[] getJogador() {
        return jogador;
    }


    public void setJogador(Figurinha3[] jogador) {
        this.jogador = jogador;
    }


    public String getTecnico() {
        return tecnico;
    }


    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }


    @Override
    public String toString() {
        return "Seleção [nome=" + nome + ", jogador=" + Arrays.toString(jogador) + ", tecnico=" + tecnico + "]+\n";
    }

    
    
    

}
