import java.time.LocalDate;

public class Universidade {
    private String nome;
    private LocalDate dataFundacao;
    Estudante estudante[] = new Estudante[100];
    EstudantePosGrad estudantePos[] = new EstudantePosGrad[100];

    public Universidade(String nome, LocalDate dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
    }
    public void matriculaAluno(){
        for(int i=0;i<20;i++){
            estudante[i] = new EstudanteGraduacao("nome","endereco","tcc");
        }
        for(int i=20;i<50;i++){
            estudante[i] = new EstudanteMestrado("name","endereco","formation","line","type","title");
        }
        for(int i=50;i<100;i++){
            estudante[i] = new EstudanteDoutorado("nombre","enderecho","formacion","lina","titulo");
        }
        
    }

    public String getNome() {
        return nome;
    }
    public LocalDate getDataFundacao() {
        return dataFundacao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    public void contaAluno(){
        int graduacao=0,mestrado =0,doutorado=0;
        for(int i=0,k=0;i<100;i++){
            if(estudante[i] instanceof EstudanteGraduacao){
                graduacao++;
            }
            if(estudante[i] instanceof EstudanteMestrado){
                mestrado++;
                estudantePos[k] = (EstudantePosGrad) estudante[i];
                k++;
            }
            if(estudante[i] instanceof EstudanteDoutorado){
                doutorado++;
                estudantePos[k] = (EstudantePosGrad) estudante[i];
                k++;
            }
        }
        System.out.printf("Existem %d alunos de graduacao\n",graduacao);
        System.out.printf("Existem %d alunos de mestrado\n",mestrado);
        System.out.printf("Existem %d alunos de doutorado\n",doutorado);
    }
    
    public void printaNome(){
        for(int i=0;i<100;i++){
            if(estudante[i] instanceof EstudanteDoutorado){
                System.err.printf("Nome: %s, Titulo Tese: %s, Linha de Pesquisa: %s\n",estudante[i].getNome(),((EstudanteDoutorado) estudante[i]).getTituloTese(),((EstudanteDoutorado)estudante[i]).getLinhadDePesquisa());
            }
            else{
                System.out.printf("Nome: %s\n",estudante[i].getNome());
            }
        }
    }

    public void infosAlunos(){
        for(int i=0;i<estudantePos.length;i++){
            if(estudantePos[i] == null){
                break;
            }
            estudantePos[i].print();
            
        }
    }
   
}

