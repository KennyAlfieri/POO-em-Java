package AULA04_exercicio01;

import java.util.Scanner;

public class Produto {
    public Scanner e = new Scanner(System.in);

    String nome;
    double valor;
    int qtd;

    //construtor padrao
    public Produto(String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public void porcentagem(double porc){

        valor *= (1 + porc/100);
    }
}
