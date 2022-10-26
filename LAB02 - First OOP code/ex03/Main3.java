package lab02;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args){
        //Exercicio 3
        Figurinha3 figurinha[] = new Figurinha3[3];
        figurinha[0] = new Figurinha3("Joao",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Brazil");
        figurinha[1] = new Figurinha3("Thiago",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        figurinha[2] = new Figurinha3("Paulo",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Franca");
        
        for(int i = 0;i<3;i++){
            System.out.println(figurinha[i]);
        }
    }

}
