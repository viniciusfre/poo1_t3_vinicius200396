public class UsaBanco {
    public static void main(String[] args){
        ContaEspecial contaEspecial1 = new ContaEspecial(1000, 1234, 4002, 400);
        ContaEspecial contaEspecial2 = new ContaEspecial(1000, 1234, 4002, 400);


        System.out.println(contaEspecial1.debitaValor(1100, 4001));//testando senha errada*
        System.out.println("***************************************************************");


        System.out.println(contaEspecial1.debitaValor(-5, 4002));//testando valor <0*
        System.out.println("***************************************************************");

        contaEspecial1.debitaValor(1100, 4002);//testando valor maior que saldo mas limite suficiente
        System.out.printf("Saldo: %f/Limite: %f \n",contaEspecial1.getSaldo(4002),contaEspecial1.getLimite());//vendo se igualou saldo a 0 e diminuiu o limite
        System.out.println("***************************************************************");

        contaEspecial2.debitaValor(1600, 4002);//testando valor maior que saldo mas limite insuficiente
        System.out.printf("Saldo: %f/Limite: %f \n",contaEspecial2.getSaldo(4002),contaEspecial2.getLimite());//vendo se nao mexeu no saldo e nem no limite
        System.out.println("***************************************************************");

        contaEspecial1.debitaValor(300, 4002);//testando limite igual a 0
        System.out.println(contaEspecial1.getEstado(4002));//verificando se alterou o estado
        System.out.println("***************************************************************");

        System.out.println(contaEspecial2.debitaValor(1000, 4002));//testando saldo igual a 0 e limite maior que 0
        System.out.printf("Saldo: %f/Limite: %f \n",contaEspecial2.getSaldo(4002),contaEspecial2.getLimite());
        System.out.println("***************************************************************");
        

        System.out.println(contaEspecial2.debitaValor(400, 4002));//testando saldo igual a 0 e limite menor que 0
        System.out.printf("Saldo: %f/Limite: %f \n",contaEspecial2.getSaldo(4002),contaEspecial2.getLimite());
        System.out.println("***************************************************************");


        System.out.println(contaEspecial2.debitaValor(800, 4002));//testando conta inativada
        System.out.printf("Saldo: %f/Limite: %f \n",contaEspecial2.getSaldo(4002),contaEspecial2.getLimite());
        System.out.println("***************************************************************");
    }
    
    
}
