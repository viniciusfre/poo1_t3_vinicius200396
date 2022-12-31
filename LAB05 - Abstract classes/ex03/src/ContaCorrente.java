public abstract class ContaCorrente {
    private float saldo;

    private int estado; // 1= conta ativa 2= conta inativa

    private int numConta;

    private int senha;

    public ContaCorrente(float val, int num, int pwd) {

        numConta = num;

        senha = pwd;

        this.saldo = val;

        estado = 1; // conta ativa

    }

    public boolean debitaValor(float val, int pwd) {

        if (pwd != senha)

            return (false); // senha deve ser vá lida

        if (estado != 1)

            return (false); // conta deve ser ativa

        if (val <= 0)

            return (false); // val > 0

        if (val > saldo)

            return (false);

        saldo -= val;

        if (saldo == 0)

            estado = 2; // torna conta inativa
            

        return (true);

    }

    public float debitaValor(float val) {
        if(val > saldo){
            float saldoAnterior = saldo;
            saldo = 0;
            return (val-saldoAnterior);
        }
        else{
            saldo -= val;
            return 0;
        }
        

    }

    public float getSaldo(int pwd) {
        if (senha == pwd)
            return saldo;
        else
            return -1; // indicando que houve problema na senha
    }

    public void creditaValor(int pwd, float val) {
        if (senha == pwd)
            saldo += val;
    }

    protected int getEstado(int pwd) {
        if (senha == pwd)
            return estado;
        else
            return -1;
    }

    protected int getSenha() {
        return senha;
    }

    protected int getNumConta() {
        return numConta;
    }

    protected void setEstado(int pwd, int e) {
        if (senha == pwd)
            estado = e;
    }

    protected boolean isSenha(int pwd) {
        if (senha == pwd)
            return true;
        else
            return false;
    }
}
