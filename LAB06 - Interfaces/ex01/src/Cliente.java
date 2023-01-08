public class Cliente implements Classificavel {

    private String nome;//nome do cliente

    public Cliente(String nome) {
        this.nome = nome;
    }


    @Override
    public boolean eMenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        if ( this.nome.compareTo(compara.nome) < 0) {

            return true ;

        }else {

            return false ;

        }
    
        
    }


    @Override
    public String toString() {
        return "Cliente [nome=" + nome + "]" + "\n";
    }
    
    
}
