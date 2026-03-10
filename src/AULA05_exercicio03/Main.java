package AULA05_exercicio03;

import java.util.Scanner;

public class Main {

    static Scanner e = new Scanner(System.in);

    static BilheteUnico b;

    static {
        System.out.println("Nome do usuario --> ");
        String usuario = e.nextLine();

        System.out.println("Tipo de tarifa, estudante (E), professor (P) ou normal (N)--> ");
        String tipoTarfia = e.next();

        b = new BilheteUnico(usuario, tipoTarfia);
    }

    public static void main(String[] args) {

       int opcao;

       do {
           System.out.println("-------------------------");
           System.out.println("1- Carregar bilhete");
           System.out.println("2- Consultar saldo");
           System.out.println("3- Passou na catraca");
           System.out.println("4- Finalizar");

           opcao = e.nextInt();

           switch (opcao) {
               case 1:
                   carregar();
                   break;

               case 2:
                   consultarSaldo();
                   break;
               case 3:
                   catraca();
                   break;
               case 4:
                   System.out.println("Obrigado por usar o nosso App");
                   break;
               default:
                   System.out.println("Opção inválida");
           }

       }while (opcao != 4);


    }

    private static void catraca() {
        if(b.passagemCatraca() == false){
            System.out.println("Não passou na catraca!");
            consultarSaldo();
        }else {
            System.out.println("Passou na catraca!");
        }
    }

    private static void consultarSaldo() {
        System.out.println("Saldo atual --> R$ " + b.saldo);
    }

    private static void carregar() {
        double valor;

        System.out.println("Valor da recarga --> R$ ");
        valor=e.nextDouble();

        b.carregar(valor);
    }
}
