package ex06.src;

public class Vip extends Ingresso {
    private int adicional;
    public float getValor(){
        return super.escreveValor()+adicional;
    }
}
