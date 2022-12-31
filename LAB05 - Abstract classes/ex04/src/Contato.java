import java.time.LocalDate;

public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected LocalDate aniversario;

    
    protected Contato(String apelido, String nome, String email, LocalDate aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    protected String getApelido() {
        return apelido;
    }

    protected void setApelido(String apelido) {
        this.apelido = apelido;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected LocalDate getAniversario() {
        return aniversario;
    }

    protected void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    protected String imprimirBasico() {
        return "Contato [apelido=" + getApelido() + ", nome=" + getNome() + ", email=" + getEmail() + ", aniversario=" + getAniversario()
                + "]\n";
    }

    protected abstract String imprimirContato();

}
