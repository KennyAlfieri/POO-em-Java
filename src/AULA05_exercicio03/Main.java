package AULA05_exercicio03;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static Scanner e = new Scanner(System.in);
    static int index;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("""
                    1 - Cadastrar bilhete
                    2 - Carregar bilhete
                    3 - Consultar Saldo
                    4 - Passar na catraca
                    5 - Finalizar
                    """);
            opcao=e.nextInt();

            switch (opcao){
                case 1:
                    cadastrarBilhete();
                    break;
                case 2:
//                    carregarBilhete();
                    break;
                case 3:
                    consultarBilhete();
                    break;
                    case 4:
                        passarCatraca();
                        break;
                case 5:
                    System.out.println("Obrigado por usar nosso app!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida: ");
                    opcao=e.nextInt();
            }
        }while (opcao != 5);

    }

    private static void passarCatraca() {

    }

    private static void consultarBilhete() {
        System.out.println("Seu saldo é de: " + bilhete[index].saldo);
    }

//    private static double carregarBilhete() {
//        double valor;
//        System.out.println("Digite o valor para carregar o bilhete: ");
//        valor = e.nextDouble();
//        bilhete[index].carregar(valor);
//
//        return ;
//    }

    public static void cadastrarBilhete(){
        String nome;
        long cpf;
        String tipoTarifa;
        if (index < bilhete.length){

            System.out.println("Digite seu nome: ");
            nome = e.next();
            System.out.println("Digite seu cpf: ");
            cpf = e.nextLong();
            System.out.println("Digite seu tipo de tarifa (estudante | professor | comum): ");
            tipoTarifa=e.next();
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            index++;
        }else {
            System.out.println("ERRO, procure um posto de atendimento!");
        }
    }

    public BilheteUnico pesquisa(){
        long cpf;
        System.out.println("Qual o CPF para pesquisa? ");
        cpf = e.nextLong();
        for (int i = 0; i < index; i++) {
            if (bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }

        }
        System.out.println("CPF não encontrado");
        return null;
    }

}