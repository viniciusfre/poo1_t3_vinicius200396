public class ContaEspecial extends ContaCorrente {
    private float limite;//limite de credito
    private ContaComum contaComum;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val,num,pwd);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (pwd != super.getSenha()){
            System.out.println("Senha deve ser valida");
            return (false); // senha deve ser válida
        }
           

        if (super.getEstado(pwd) != 1){
            System.out.println("Conta deve ser ativa");
            return (false); // conta deve ser ativa
        }


        if (val <= 0){
            System.out.println("Valor deve ser maior que 0");
            return (false); // val > 0
        }     

        if (val > super.getSaldo(pwd)){
            if(limite + super.getSaldo(pwd) >=val){
                limite=limite-super.debitaValor(val);//se o saldo não for suficiente, debita do credito e define o saldo como 0
            }
            else{
                System.out.println("Saldo e limite não suficientes para sacar o valor");
                return (false);//saldo e limite não suficientes para sacar o valor
            }
        }
        super.debitaValor(val);
            
        if(limite == 0){
            System.out.println("Limite igual a 0, conta inativada e transformada em ContaComum");
            super.setEstado(pwd, 2); // torna conta inativa
            contaComum = new ContaComum(super.getSaldo(pwd), super.getNumConta(), super.getSenha(), 0);
        }

        if (super.getSaldo(pwd) == 0)
            if(limite > 0){

            }
            else{
                if(super.getEstado(pwd) != 2){
                    super.setEstado(pwd, 2); // torna conta inativa
                    System.out.println("Saldo igual a 0 e limite menor que 0 conta inativada");
                }
                else{
                    
                }
                
            }
            

        return (true);
        
        
    }
    public float getLimite() {
        return limite;
    }

}
