import java.time.LocalDate;

public class Horista extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;

    public Horista(String nome, LocalDate dataNascimento,double valorHora, double horasTrabalhadas) {
        super(nome, dataNascimento);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calculaSalario(){
        super.setSalario(horasTrabalhadas*valorHora);
    }
}
