package lab02;

import java.time.LocalDate;

public class Main4 {
    public static void main(String[]args){
        Figurinha3 jogadores1[] = new Figurinha3[11];
        jogadores1[0] = new Figurinha3("Joao",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Alemanha");
        jogadores1[1] = new Figurinha3("Thiago",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        jogadores1[2] = new Figurinha3("Paulo",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
        jogadores1[3] = new Figurinha3("Luisao",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Alemanha");
        jogadores1[4] = new Figurinha3("Gabriel",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        jogadores1[5] = new Figurinha3("Arthur",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
        jogadores1[6] = new Figurinha3("Miguel",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Alemanha");
        jogadores1[7] = new Figurinha3("Augusto",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Alemanha");
        jogadores1[8] = new Figurinha3("Cesar",LocalDate.parse("1980-05-18"),1.90f,90f,"Goleiro","Alemanha");
        jogadores1[9] = new Figurinha3("Matheus",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Alemanha");
        jogadores1[10] = new Figurinha3("Vinicius",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Alemanha");
        Seleção seleção1 = new Seleção("Alemanha",jogadores1,"Ruben");
        Figurinha3 jogadores2[] = new Figurinha3[11];
        jogadores2[0] = new Figurinha3("Bernardo",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Espanha");
        jogadores2[1] = new Figurinha3("Salomão",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Espanha");
        jogadores2[2] = new Figurinha3("Arnaldo",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Espanha");
        jogadores2[3] = new Figurinha3("Gilberto",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Espanha");
        jogadores2[4] = new Figurinha3("Antônio",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Espanha");
        jogadores2[5] = new Figurinha3("Joelson",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Espanha");
        jogadores2[6] = new Figurinha3("Pedro",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Espanha");
        jogadores2[7] = new Figurinha3("Eduardo",LocalDate.parse("2002-03-15"),1.85f,65f,"zagueiro","Espanha");
        jogadores2[8] = new Figurinha3("Cleiton",LocalDate.parse("1985-12-27"),1.85f,65f,"zagueiro","Espanha");
        jogadores2[9] = new Figurinha3("Douglas",LocalDate.parse("1980-10-09"),1.90f,90f,"Goleiro","Espanha");
        jogadores2[10] = new Figurinha3("Josimar",LocalDate.parse("2003-04-12"),1.73f,70.0f,"centro-avante","Espanha");
        Seleção seleção2 = new Seleção("Espanha",jogadores2,"Julio");
        System.out.println(seleção1);
        System.out.println(seleção2);
    }
   
}
