package main;
import java.util.Locale;
import java.util.Scanner;

import models.Produto;

public class exemplo4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Produto[] prod = new Produto[4];
        Scanner sc = new Scanner(System.in);
        String nome;
        float preco;
        int qtd_estoque;
        for(int i =0;i< 4;i++){
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n",i+1);
            nome = sc.next();
            preco = sc.nextFloat();
            qtd_estoque = sc.nextInt();
            prod[i] = new Produto(nome,preco,qtd_estoque);
        }
        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3");
        prod[0].altera_preco(prod[0].getPreco(), -110);
        System.out.println(prod[0].getPreco());
        prod[2].altera_preco(prod[2].getPreco(), 10);

        System.out.println("\nReduzindo o preco em 5%% do produto 2");
        if (prod[1].altera_preco(prod[1].getPreco(),-5)==-1) 
        System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else System.out.println("\n\n Preco alterado com sucesso");

        System.out.println("\nAlterando o preco do prod. 3");
        if (prod[3].altera_preco(prod[3].getPreco(),-110) == -1)
        System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.println(prod[i]);
        }
        sc.close();




    }
}