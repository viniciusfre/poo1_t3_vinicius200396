import java.time.LocalDate;

public class Chefe extends Funcionario {

    public Chefe(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    public Chefe() {
    }

    public void calculaSalario(){
        super.setSalario(100000);
    }
    
}
