import java.time.LocalDate;

public class Vendedor extends Funcionario {
    private double comissao;
    private int vendas;
   
    public Vendedor(String nome, LocalDate dataNascimento,double comissao, int vendas) {
        super(nome, dataNascimento);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public void calculaSalario(){
        super.setSalario(comissao*vendas+1212);
    }
    
}
