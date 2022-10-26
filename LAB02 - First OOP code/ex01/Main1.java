package lab02;

import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args){
        //Exercicio1
        Figurinha1 figurinha1 = new Figurinha1();
        figurinha1.nome = "Pelé";
        figurinha1.nascimento = LocalDate.parse("1990-10-23");
        figurinha1.altura = 1.73f;
        figurinha1.peso = 70;
        figurinha1.posicao = "atacante";
        figurinha1.pais = "Brasil";

        Figurinha1 figurinha2 = new Figurinha1();
        figurinha2.nome = "João";
        figurinha2.nascimento = LocalDate.parse("2000-10-30");
        figurinha2.altura = 1.90f;
        figurinha2.peso = 100;
        figurinha2.posicao = "zagueiro";
        figurinha2.pais = "Brasil";

        Figurinha1 figurinha3 = new Figurinha1();
        figurinha3.nome = "Harold";
        figurinha3.nascimento = LocalDate.parse("1980-07-13");
        figurinha3.altura = 1.60f;
        figurinha3.peso = 50;
        figurinha3.posicao = "goleiro";
        figurinha3.pais = "Alemanha";
        
        System.out.println(figurinha1);
        System.out.println(figurinha2);
        System.out.println(figurinha3);
    }
}
