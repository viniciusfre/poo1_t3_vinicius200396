import java.time.LocalDate;

public class Familia extends Contato {
    private String parentesco;//pai, irmão, etc.

    


    public Familia(String apelido, String nome, String email, LocalDate aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }




    @Override
    public String imprimirContato() {
      return super.imprimirBasico();
        
    }




    public String getParentesco() {
        return parentesco;
    }




    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
}
