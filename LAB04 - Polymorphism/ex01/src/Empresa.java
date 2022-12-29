import java.time.LocalDate;

public class Empresa {
    public static void main(String args[]){
        Funcionario funcionario[] = new Funcionario[4];
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        funcionario[0] = new Chefe("mary",LocalDate.parse("2000-09-12"));
        funcionario[1] = new Horista("Joao",LocalDate.parse("1990-12-15"),10,160);
        funcionario[2] = new Operario("Cleiton",LocalDate.parse("1980-06-21"),15,120);
        funcionario[3] = new Vendedor("Rosana",LocalDate.parse("1995-03-28"),5,150);
        folhaPagamento.folha(funcionario);

    }
}
