public class Produto implements Classificavel {

    private int codigo;//codigo de barras do produto

    

    public Produto(int codigo) {
        this.codigo = codigo;
    }


    @Override
    public boolean eMenorQue(Classificavel o) {
        Produto compara = ( Produto ) o;
        if ( this.codigo < compara.codigo ) {

            return true ;

        }else {

            return false ;

        }
    }


    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + "]" + "\n";
    }
    
    
}
