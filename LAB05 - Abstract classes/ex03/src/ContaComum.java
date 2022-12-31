public class ContaComum extends ContaCorrente {
    private float limite;
    public ContaComum(float val, int num, int pwd,float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }
    
}
