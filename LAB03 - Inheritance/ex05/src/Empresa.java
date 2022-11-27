import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args){
        Funcionario funcionario[] = new Funcionario[40];
        for(int i=0;i<10;i++){
            funcionario[i] = new Funcionario("jose",LocalDate.parse("2003-04-12"),0);
        }
        for(int i=10;i<20;i++){
            funcionario[i] = new Funcionario("matheus",LocalDate.parse("1998-03-15"),1);
        }
        for(int i=20;i<30;i++){
            funcionario[i] = new Funcionario("fernanda",LocalDate.parse("1970-10-02"),2);
        }
        for(int i=30;i<40;i++){
            funcionario[i] = new Funcionario("gabriela",LocalDate.parse("1973-08-30"),3);
        }

        for(int i=0;i<40;i++){
            funcionario[i].calculaSalario(funcionario[i]);
        }

        for(int i=0;i<40;i++){

            System.out.println(funcionario[i]);
        }
    }
}
