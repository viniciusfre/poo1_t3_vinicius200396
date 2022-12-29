public class FolhaPagamento {
        public void folha(Funcionario[] funcionarios){
            for(int i=0;i< funcionarios.length;i++){
                funcionarios[i].calculaSalario();
                System.out.printf("A empresa deve pagar R$%.2f para o funcionario %s\n",funcionarios[i].getSalario(),funcionarios[i].getNome());
            }
            
        }
}
