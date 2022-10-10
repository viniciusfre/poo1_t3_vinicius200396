
public class Produto {

    private String nome;
    private float preco;
    private int qtd_estoque;

    public Produto() {
    }
    public Produto(String nome, float preco, int qtd_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
    }

    public int altera_preco(float preco, float porcentagem){
        float temp;
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95 
            preco = preco*temp;  // preço modificado
            setPreco(preco);
            return 0;
        } else {
            return -1;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQtd_estoque() {
        return qtd_estoque;
    }
    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
    @Override
    public String toString() {
        return "Produto: " + nome + "\n" +
               "Preco: " + preco + "\n" +
               "Estoque: " + qtd_estoque + "\n";
    }


}
