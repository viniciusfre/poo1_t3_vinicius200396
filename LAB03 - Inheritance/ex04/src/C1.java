package src;
/*
Teste de chamada de herança
 Faça um programa que contenha três classes: C1; C2; C3

- A classe C1 é base da Classe C2, que por sua vez é base da Classe C3
- Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo)
- Para cada classe, construa um construtor padrão sem parâmetros e um construtor com parâmetros
- Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor. Por exemplo, para C1:
  "Classe C1: chamada do construtor padrao, sem parametros"
  "Classe C3: chamada do construtor com parametros"
- Na classe C3 inclua um construtor que use o "super" para chamar o construtor da classe C2 com parâmetro
- Em todas as classes, inclua um método que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (não utilizar super)
    - Lembre que as classes herdam os atributos, inclusive os privados - e esses também devem ser mostrados 
- Em todas as classes, inclua um método que chama mostar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize super

*/
 public class C1{

    public int pub; 
    protected int protec;
    private int priv;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(int pub, int protec, int priv){
        this.pub = pub;
        this.protec = protec;
        this.priv = priv;
       System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public String mostrar_atributos() {
        return "C1 [pub=" + pub + ", protec=" + protec + ", priv=" + priv + "]";
    }

    

}
