public class Aluno {
    private int numero;
    private char classe;
    private double cra;

    public Aluno() {
    }

    public Aluno(int numero, char classe, double cra) {
        this.numero = numero;
        this.classe = classe;
        this.cra = cra;
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public double getCra() {
        return cra;
    }

    public void setCra(double cra) {
        this.cra = cra;
    }

    @Override
    public String toString() {
        return "Número: " + numero + " Classe Social: " + classe + " CRA: " + String.format("%.2f",cra) ;
    }

    
    
}
