import java.time.LocalDate;

public class Trabalho extends Contato {
    private String tipo;//chefe, colega, etc


    public Trabalho(String apelido, String nome, String email, LocalDate aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return super.imprimirBasico();
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
