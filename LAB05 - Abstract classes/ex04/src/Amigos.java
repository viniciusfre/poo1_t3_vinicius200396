import java.time.LocalDate;

public class Amigos extends Contato {
    private int grau;//(1= melhor amigo; 2 = amigo; 3 = conhecido).
    
    

    public Amigos(String apelido, String nome, String email, LocalDate aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        return super.imprimirBasico();
        
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
    
}
