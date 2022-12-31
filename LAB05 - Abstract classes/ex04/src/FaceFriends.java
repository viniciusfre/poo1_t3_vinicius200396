import java.time.LocalDate;
import java.util.Scanner;

public class FaceFriends {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Contato ctt[] = new Contato[3];
        ctt[0] = new Familia("ze", "jose", "ze@hotmail.com", LocalDate.parse("2000-12-10"), "irmao");
        ctt[1] = new Amigos("rob", "robert", "rob@hotmail.com", LocalDate.parse("2000-12-10"), 1);
        ctt[2] = new Trabalho("clei", "cleiton", "clei@hotmail.com", LocalDate.parse("2000-12-10"), "colega");
        
        Menu menu = new Menu();
        menu.gerarMenu();
        int opcao =sc.nextInt();
        if(opcao < 1 || opcao > 7){
            System.out.println("Opcao nao existe");
        }
        switch (opcao){
            case 1:
                menu.opcao1();
                break;
            case 2:
                menu.opcao2(ctt);
                break;
            case 3:
                menu.opcao3(ctt);
                break;
            case 4:
                menu.opcao4(ctt);
                break;
            case 5:
                menu.opcao5(ctt);
                break;
            case 6:
                menu.opcao6(ctt);
                break;
            case 7:
                menu.opcao7(ctt);
                break;
        }
        sc.close();
    }
}
