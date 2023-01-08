public class Servico implements Classificavel{

    private double preco;//preço do serviço


    
    public Servico(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel o) {
        Servico compara = (Servico) o;
        if ( this.preco < compara.preco) {

            return true ;

        }
        else{

            return false ;

        }
    }

    @Override
    public String toString() {
        return "Servico [preco=" + preco + "]" + "\n";
    }

    
}