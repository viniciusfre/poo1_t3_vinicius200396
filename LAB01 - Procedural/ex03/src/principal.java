import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        valores[0] = sc.nextInt();

        System.out.println("Entre com o número 2:");
        valores[1] = sc.nextInt();

        System.out.println("Entre com o número 3:");
        valores[2] = sc.nextInt();

        System.out.println("Entre com o número 4:");
        valores[3] = sc.nextInt();

        System.out.println("Entre com o número 5:");
        valores[4] = sc.nextInt();

        System.out.println("Entre com o número 6:");
        valores[5] = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", valores[0], valores[1], valores[2], valores[3], valores[4], valores[5]);
        sc.close();
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
        sc.close();
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");
        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 5; i >=0; i--){
            System.out.printf("%d ",vet[i]);
        }
        sc.close();
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int i =0;
        System.out.println("<< Listando um vetor de números pares >>");

        while(true){

            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(vet[i] %2 !=0){
                System.out.println("Erro: Valor inválido");
            }
            else{
                i++;
            }
            if(i==6){
                break;
            }

        }

        System.out.println("Os números pares digitados foram: ");
        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }
        sc.close();
    }
    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior=0,menor=0;
        float media;
        float soma=0;
        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i ==0){
                maior = vet[i];
                menor = vet[i];
            }
            if(vet[i] > maior){
                maior = vet[i];

            }
            if(vet[i] < menor){
                menor = vet[i];
            }
            soma += vet[i];

        }
        media = soma / 5;
        System.out.println("Os números digitados são: ");
        for (int i = 0; i <5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d\n",maior);
        System.out.printf("O menor valor é: %d\n",menor);
        System.out.printf("A media é: %.1f\n",media);
        sc.close();
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior=0,menor=0;
        float media;
        float soma=0;
        int posmaior=0,posmenor=0;
        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i ==0){
                maior = vet[i];
                menor = vet[i];
            }
            if(vet[i] > maior){
                maior = vet[i];
                posmaior=i;

            }
            if(vet[i] < menor){
                menor = vet[i];
                posmenor=i;
            }
            soma += vet[i];

        }
        media = soma / 5;
        System.out.println("Os números digitados são: ");
        for (int i = 0; i <5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n",maior,posmaior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n",menor,posmenor);
        System.out.printf("A media é: %.1f\n",media);
        sc.close();
    }
    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        float maior=0;
        float proporcao;
        System.out.println("<<Normalizando as notas>>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d: \n", i + 1);
            vet[i] = sc.nextInt();
            if (i == 0) {
                maior = vet[i];
            }
            if (vet[i] > maior) {
                maior = vet[i];


            }

        }
        proporcao = 100/maior;
        System.out.println("Notas normalizadas");
        for (int i = 0; i <5; i++){
            vet[i] *= proporcao;
            System.out.printf("A nota do aluno %d é %d\n",i+1,vet[i]);
        }
        sc.close();
    }
    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        double desvio=0;
        int media=0;
        System.out.println("<< Média e desvio-padrão >>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nDigite o valor %d: ", i + 1);
            vet[i] = sc.nextInt();
            media = media + vet[i];
            

        }
        media = media/5;
        for(int i=0; i<5;i++){
            desvio = desvio + (Math.pow((vet[i]-media), 2));
        }
        desvio *= 0.25;//1/n-1 * sqrt((n1-media)²+(n2-media)²+...)
        desvio = Math.sqrt(desvio);
        
        System.out.printf("A média é %d e o desvio-padrão é %f\n",media,desvio);
        sc.close();
    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        do{
            System.out.println("Entre com o número de alunos: ");
            n = sc.nextInt();
            if(n > 100){
            System.out.println("Erro! O número máximo de alunos permitido é 100.");
        }
        }while(n>100);
        
        int[] vet = new int[n];
        double media=0;
        for (int i = 0; i < n; i++) {
            System.out.printf("\nDigite a nota do aluno %d: ", i + 1);
            vet[i] = sc.nextInt();
            media = media + vet[i];
            

        }
        media = media/n;
        System.out.println("Relatório de Notas");
        for(int i=0; i<n;i++){
            System.out.printf("A nota do aluno %d é: %d\n",i+1,vet[i]);
            
        }
        System.out.printf("A média da turma é: %.2f \n",media);
        sc.close();
    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        System.out.println("<< Subtração de vetores >>");
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nDigite o valor %d de A: ", i + 1);
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nDigite o valor %d de B: ", i + 1);
            B[i] = sc.nextInt();
        }
        System.out.printf("O vetor C, definido como C = A-B é (%d, %d, %d)\n",A[0]-B[0],A[1]-B[1],A[2]-B[2]);
        sc.close();
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];//impares
        int[] v2 = new int[5];//pares
        int validador=0;//se = 1, ja foi printado um valor anteriormente, oq justificaria o uso de virgula
        System.out.println("<< Pares e Ímpares >>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nDigite o valor %d: ", i + 1);
            v[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(v[i]%2 == 0){
                v2[i] = v[i];
            }
            else{
                v1[i] = v[i];
            }
        }

        System.out.println("Ímpares: ");
        for(int i=0;i<v1.length;i++){
            if(v1[i] != 0){
                System.out.print(v1[i]);
                validador =1;
                
                
            }
            if((i+1) <v1.length && v1[i+1]!=0 && validador == 1){
                System.out.print(", ");
            }
            
            
        }
        System.out.println();
        validador = 0;
        System.out.println("Pares: ");
        for(int i=0;i<v2.length;i++){
            if(v2[i] != 0){
                System.out.print(v2[i]);
                validador = 1;
                
            }
            if((i+1) <v2.length && v2[i+1]!=0 && validador == 1){
                System.out.print(", ");
            }
            
            
            
        }
        System.out.println();
        sc.close();
    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int[] cores = new int[4];//azul,verde,amarela,vermelha
        int maior;
        System.out.println("<< Probabilidades >>");
        System.out.println("Digite a quantidade de bolinhas");
        System.out.println("Verde: ");
        cores[0] = sc.nextInt();
        maior = cores[0];
        System.out.println("Azul: ");
        cores[1] = sc.nextInt();
        System.out.println("Amarela: ");
        cores[2] = sc.nextInt();
        System.out.println("Vermelha: ");
        cores[3] = sc.nextInt();
        double total = cores[0]+cores[1]+cores[2]+cores[3];
        for(int i =0;i<4;i++){
            if(cores[i] > maior){
                maior= cores[i];
            }
        }
        System.out.println("Probabilidades");
        System.out.printf("Verde: %.1f%%", (cores[0]*100)/total);
        if(maior == cores[0]){
            System.out.println("<< Maior probabilidade");
        }
        System.out.printf("\nAzul: %.1f%%",(cores[1]*100)/total);
        if(maior == cores[1]){
            System.out.println("<< Maior probabilidade");
        }
        System.out.printf("\nAmarela: %.1f%%",(cores[2]*100)/total);
        if(maior == cores[2]){
            System.out.println("<< Maior probabilidade");
        }
        System.out.printf("\nVermelha: %.1f%%",(cores[3]*100)/total);
        if(maior == cores[3]){
            System.out.println("<< Maior probabilidade");
        }
        System.out.println();
        sc.close();
    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Zerando negativos >>");
        int[] nros = new int[5];
        for(int i=0;i<5;i++){
            System.out.printf("Entre com o número %d: ",i+1);
            nros[i] = sc.nextInt();
            if(nros[i] < 0){
                nros[i] = 0;
            }
            
        }
        System.out.print("Zerando os negativos, obtém-se: ");
        for(int i=0;i<5;i++){
            System.out.print(nros[i]+ " ");
        }
        System.out.println();
        System.out.println();

        sc.close();
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        int quant;
        int num;
        char classe;
        int cra;
        System.out.println("<< Universidade X >>");
        System.out.print("Quantos alunos serão cadastrados: ");
        quant = sc.nextInt();
        Aluno aluno[] = new Aluno[quant];
        System.out.println();
        for(int i=0;i<quant;i++){
            System.out.print("\nEntre com o número do aluno: ");
            num = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno %d: ",num);
            classe = sc.next().charAt(0);
            System.out.print("Entre com o CRA do aluno: ");
            cra = sc.nextInt();
            aluno[i] = new Aluno(num,classe,cra);

        }
        System.out.println("==== Alunos Cadastrados =====");
        for(int i =0 ;i<quant;i++){
            System.out.println(aluno[i]);
        }
        sc.close();
    }

    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int vet[] = new int[8];
        int anterior=0;//salva o valor que está sendo comparado a todo o resto do vetor
        int flag=0;//flag=1 significa que encontrou um número igual ao que está sendo comparado
        int repetidos[] = new int[8];//vetor dos valores repetidos
        int tamanho=0;//tamanho do vetor repetidos que está preenchido com valores
        for(int i=0;i<8;i++){
            System.out.printf("\nEntre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.print("Valores repetidos: ");
        for(int i =0;i<8;i++){
            anterior=vet[i];
            for(int j = i+1;j<8;j++){
                if(vet[i] == vet[j]){
                    flag=1;
                }
            }
            if(flag ==1){
                for(int k=0;k<8;k++){
                    if(repetidos[k] == anterior){
                        flag=0;//se o número ja tiver sido colocado no vetor de repetidos, a flag vira 0;
                    }
                }
                if(flag ==1){
                    repetidos[tamanho] = anterior;
                    tamanho++;
                    //senao, o numero é adicionado ao vetor de repetidos e a quantidade de campos preenchidos no vetor aumenta
                }
            }

            flag = 0;
            
        }
        for(int i =0;i<tamanho;i++){
            System.out.print(repetidos[i] + " ");
        }
        sc.close();
    }

    public static void ex16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int vet[] = new int[8];
        int anterior=0;//salva o valor que está sendo comparado a todo o resto do vetor
        int flag=0;//flag=1 significa que encontrou um número igual ao que está sendo comparado
        int repetidos[] = new int[8];//vetor dos valores repetidos
        int tamanho=0;//tamanho do vetor repetidos que está preenchido com valores
        int contador=1;//Conta as ocorrencias do número, ja começa em um pois o número já está sendo comparado a outros
        int ocorrencias[] = new int[8];//vetor que serve para armazenar as ocorrencias
        for(int i=0;i<8;i++){
            System.out.printf("\nEntre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Valores repetidos: ");
        for(int i =0;i<8;i++){
            anterior=vet[i];
            for(int j = i+1;j<8;j++){
                if(vet[i] == vet[j]){
                    flag=1;
                    contador++;
                }
            }
            if(flag ==1){
                for(int k=0;k<8;k++){
                    if(repetidos[k] == anterior){
                        flag=0;//se o número ja tiver sido colocado no vetor de repetidos, a flag vira 0;
                    }
                }
                if(flag ==1){
                    repetidos[tamanho] = anterior;
                    ocorrencias[tamanho] = contador;
                    tamanho++;
                    //senao, o numero é adicionado ao vetor de repetidos e a quantidade de campos preenchidos no vetor aumenta
                }
            }

            flag = 0;
            contador = 1;
            
        }
        for(int i =0;i<tamanho;i++){
            System.out.printf("%d aparece %d vezes\n",repetidos[i],ocorrencias[i]);
        }
        sc.close();
    }

    public static void main(String[] args) {
        ex16();

    }


}
