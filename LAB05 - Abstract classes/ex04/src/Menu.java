import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    public Menu() {
    }
    
    public void gerarMenu(){
        System.out.println("-----------------------------------MENU-----------------------------------------------\n");
        System.out.println("1 -> Inserir um contato, especificando o subtipo e então requerendo os seus campos.");
        System.out.println("2 -> Imprimir todos os contatos");
        System.out.println("3 -> Imprimir somente os familiares");
        System.out.println("4 -> Imprimir somente os amigos");
        System.out.println("5 -> Imprimir somente os colegas de trabalho");
        System.out.println("6 -> Imprimir os melhores amigos, os irmaose os colegas de trabalho");
        System.out.println("7 -> Imprimir os dados de um unico contato\n");
        System.out.println
        ("-----------------------------------END-OF-MENU-----------------------------------------------\n");
        System.out.print("Digite a opcao escolhida: ");
    }

    public void opcao1(){
        String subtipo,apelido,nome,email;
        LocalDate aniversario;
        System.out.println("Opcao inserir contato escolhida");
        System.out.print("Digite o subtipo do contato(familia ou amigo ou trabalho): ");
        subtipo = sc.next();
        switch (subtipo){
            case "familia" :
                String parentesco;
                System.out.println("Digite em ordem o apelido, nome, email, aniversario(YYYY-MM-DD) e o parentesco(pai,irmao,tia,etc)");
                apelido = sc.next();
                nome = sc.next();
                email = sc.next();
                aniversario = LocalDate.parse(sc.next());
                parentesco = sc.next();
                Contato contato = new Familia(apelido,nome,email,aniversario,parentesco);
                break;
            case "amigo" :
                int grau;
                System.out.println("Digite em ordem o apelido, nome, email, aniversario(YYYY-MM-DD) e o grau");
                apelido = sc.next();
                nome = sc.next();
                email = sc.next();
                aniversario = LocalDate.parse(sc.next());
                grau = sc.nextInt();
                Contato contato1 = new Amigos(apelido, nome, email, aniversario, grau);
                break;
            case "trabalho" :
                String tipo;
                System.out.println("Digite em ordem o apelido, nome, email, aniversario(YYYY-MM-DD) e o tipo(chefe,colega,etc)");
                apelido = sc.next();
                nome = sc.next();
                email = sc.next();
                aniversario = LocalDate.parse(sc.next());
                tipo = sc.next();
                Contato contato2 = new Trabalho(apelido, nome, email, aniversario, tipo);
                break;
        }
    }
    public void opcao2(Contato ctt[]){
        System.out.println("Opcao imprimir todos os contatos escolhida");
        for(int i =0;i< ctt.length;i++){
            System.out.printf(ctt[i].imprimirContato());
        }

    }
    public void opcao3(Contato ctt[]){
        System.out.println("Opcao imprimir somente os familiares escolhida");
        for(int i =0;i< ctt.length;i++){
            if(ctt[i] instanceof Familia){
                System.out.printf(ctt[i].imprimirContato());
            }
            
        }
    }
    public void opcao4(Contato ctt[]){
        System.out.println("Opcao imprimir somente os amigos escolhida");
        for(int i =0;i< ctt.length;i++){
            if(ctt[i] instanceof Amigos){
                System.out.printf(ctt[i].imprimirContato());
            }
            
        }
    }
    public void opcao5(Contato ctt[]){
        System.out.println("Opcao imprimir somente os colegas de trabalho escolhida");
        for(int i =0;i< ctt.length;i++){
            if(ctt[i] instanceof Trabalho){
                System.out.printf(ctt[i].imprimirContato());
            }
            
        }
    }
    public void opcao6(Contato ctt[]){
        System.out.println("Opcao imprimir os melhores amigos, os irmaos e os colegas de trabalho escolhida");
        for(int i =0;i< ctt.length;i++){
            if(ctt[i] instanceof Amigos && ((Amigos)ctt[i]).getGrau() == 1){
                System.out.printf(ctt[i].imprimirContato());
            }
            if(ctt[i] instanceof Familia && ((Familia)ctt[i]).getParentesco().equals("irmao")){
                System.out.printf(ctt[i].imprimirContato());
            }
            if(ctt[i] instanceof Trabalho && ((Trabalho)ctt[i]).getTipo().equals("colega")){
                System.out.printf(ctt[i].imprimirContato());
            }
            
        }
    }
    public void opcao7(Contato ctt[]){
        int indice;
        try{
            System.out.println("Opcao imprimir os dados de um unico contato escolhido pelo indice escolhida");
            System.out.print("Escolha o indice do contato no vetor: ");
            indice = sc.nextInt();
            System.out.println("Tipo do contato "+ctt[indice].getClass());
            System.out.println(ctt[indice].imprimirContato());
        }
        catch(ArrayIndexOutOfBoundsException I){
            System.out.println("O contato com esse indice nao existe");
        }
       

        
    }
}
