import java.time.LocalDate;

public class Operario extends Funcionario {
    private double valorProdução;
    private int quantProduzida;

    public Operario(String nome, LocalDate dataNascimento,double valorProdução, int quantProduzida) {
        super(nome, dataNascimento);
        this.valorProdução = valorProdução;
        this.quantProduzida = quantProduzida;
    }

    public void calculaSalario(){
        super.setSalario(quantProduzida*valorProdução);
    }
    
}
