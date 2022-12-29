import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Universidade uni = new Universidade("Ufu", LocalDate.parse("1950-12-29"));
        uni.matriculaAluno();
        uni.contaAluno();
        uni.printaNome();
        uni.infosAlunos();
        
    }
}
