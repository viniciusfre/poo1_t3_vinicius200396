public class ContaEspecial extends ContaCorrente {
    private float limite;//limite de credito

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val,num,pwd);
        if(limite == 0){
            ContaComum contaComum = new ContaComum(val, num, pwd);
        }
        
    }

    @Override
    public boolean debitaValor(float val, int pwd) {

        if (pwd != super.getSenha())

            return (false); // senha deve ser vá lida

        if (super.getEstado(pwd) != 1)

            return (false); // conta deve ser ativa

        if (val <= 0)

            return (false); // val > 0

        if (val > super.getSaldo(pwd))

            return (false);

        super.debitaValor(val);

        if(limite == 0){
            super.setEstado(pwd, 2); // torna conta inativa
            ContaComum contaComum = new ContaComum(val, super.getNumConta(), pwd);
        }

        if (super.getSaldo(pwd) == 0)
            if(limite > 0){

            }
            else{
                super.setEstado(pwd, 2); // torna conta inativa

            }
            

        return (true);

    }

}
