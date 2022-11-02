package ex02;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args){
        //Exercicio 2
        Figurinha2 figurinha1 = new Figurinha2();
        figurinha1.setNome("Pelé");
        figurinha1.setNascimento(LocalDate.parse("1990-10-23")); 
        figurinha1.setAltura(1.73f);
        figurinha1.setPeso(70);
        figurinha1.setPosicao("atacante");
        figurinha1.setPais("Brasil");

        Figurinha2 figurinha2 = new Figurinha2();
        figurinha2.setNome("João");
        figurinha2.setNascimento(LocalDate.parse("2000-10-30"));
        figurinha2.setAltura(1.90f);
        figurinha2.setPeso(100);
        figurinha2.setPosicao("zagueiro");
        figurinha2.setPais("Brasil");

        Figurinha2 figurinha3 = new Figurinha2();
        figurinha3.setNome("Harold");
        figurinha3.setNascimento(LocalDate.parse("1980-07-13"));
        figurinha3.setAltura(1.60f);
        figurinha3.setPeso(50);
        figurinha3.setPosicao("goleiro");
        figurinha3.setPais("Alemanha");
        
        System.out.println(figurinha1);
        System.out.println(figurinha2);
        System.out.println(figurinha3);
    }

}
