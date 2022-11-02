package ex05;

import java.util.Arrays;

public class Seleção2 {
    private String nome;
    Figurinha4 jogador[] = new Figurinha4[11];
    private String tecnico;
    

    public Seleção2() {
    }


    public Seleção2(String nome,String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        for(int i =0;i<11;i++){
            jogador[i] = new Figurinha4(nome);
        }
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Figurinha4[] getJogador() {
        return jogador;
    }


    public void setJogador(Figurinha4[] jogador) {
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
        return "Seleção [nome=" + nome + ", jogador=" + Arrays.toString(jogador) + ", tecnico=" + tecnico + "]";
    }


   

    
    
    

}
