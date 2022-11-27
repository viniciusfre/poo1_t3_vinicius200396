import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private float salario;
    private int tipo_funcionario;//0 chefe,1 vendedor,2 operario,3 horista

    

    public Funcionario() {
    }
    

    public Funcionario(String nome, LocalDate dataNascimento, int tipo_funcionario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipo_funcionario = tipo_funcionario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }


    public int getTipo_funcionario() {
        return tipo_funcionario;
    }

    public void setTipo_funcionario(int tipo_funcionario) {
        this.tipo_funcionario = tipo_funcionario;
    }

    public void calculaSalario(Funcionario func){
        //chefe
        Scanner sc = new Scanner(System.in);
        if(func.tipo_funcionario == 0){
            salario = 10000;
        }
        //vendedor
        if(func.tipo_funcionario == 1){
            int comissao = 10;
            System.out.println("Qual a quantidade de vendas feitas? ");
            int vendas = sc.nextInt();
            salario = 1200 + comissao*vendas;

        }
        //operario
        if(func.tipo_funcionario == 2){
            int valor_prod = 15;
            System.out.println("Qual a quantidade produzida? ");
            int prod = sc.nextInt();
            salario = valor_prod*prod;
        }
        //horista
        if(func.tipo_funcionario == 3){
            int valor_hora = 10;
            System.out.println("Qual a qtd de horas trabalhadas?");
            int horas = sc.nextInt();
            salario = valor_hora*horas;
        }

    }


    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario=" + salario
                + ", tipo_funcionario=" + tipo_funcionario + "]";
    }

    
}
