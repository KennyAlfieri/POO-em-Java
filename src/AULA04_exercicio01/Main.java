package AULA04_exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nome;
        double valor;
        int qtd;
        double porcentagem;

        System.out.println("Digite o nome do produto -->");
        nome=e.next();
        System.out.println("Digite o valor do produto --> R$");
        valor=e.nextDouble();
        System.out.println("Digite a quantidade do produto -->");
        qtd=e.nextInt();

        Produto p =new Produto(nome, valor, qtd);

        System.out.println("Digite o valor de porcentagem -->");
        porcentagem = e.nextDouble();

        p.porcentagem(porcentagem);
        System.out.println(("Valor final -->") + p.valor) ;


    }
}
