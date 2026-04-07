package AULA07_exercicioGeral;


import java.util.Scanner;

public class Main {
    static Veiculo[] veiculos = new Veiculo[5];
    static Scanner sc = new Scanner(System.in);
    static int indexVeiculos;
    static Registro[] registro = new Registro[20];
    static int indexRegistro;

    public static void main(String[] args) {
        int opcao;
        do {

            System.out.println("""
                #### Estacionamento ParkEasy ####
                [1] Entrada de veículo
                [2] Saída de veículo
                [3] Imprimir veículos estacionados
                [4] Imprimir a receita
                [5] Finalizar""");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> entrada();
                case 2 -> saida();
                case 3 -> estacionados();
                case 4 -> receita();
                case 5 -> System.out.println("Até logo!");
                default -> System.out.println("Valor invalido!");
            }
            System.out.println();
        } while (opcao != 5);
    }

    private static void receita() {
        double valor = 0;

        for (int i = 0; i < indexRegistro; i++) {
            if (registro[i].horaSaida != null){
                valor += registro[i].calcularValor();
            }
        }
        System.out.println("Receita total --> R$" + valor);

    }

    private static void saida() {

        Registro registroEncontrado = pesquisarRegistro();

        String horaSaida;
        double valor;

        if (registroEncontrado != null){
            System.out.println("Digite a hora de saida (hh:mm) -->");
            horaSaida = sc.next();
            registroEncontrado.horaSaida = horaSaida;
            valor = registroEncontrado.calcularValor();
            System.out.println("Valor a pagar é de --> R$ " + valor);
        }

    }

    private static Registro pesquisarRegistro(){
        String placa;
        System.out.print("Qual placa da buscar? -> ");
        placa = sc.next().toUpperCase();
        for (int i = 0; i < indexRegistro; i++) {
            if (registro[i].veiculo.placa.equalsIgnoreCase(placa)){
                return registro[i];
            }
        }
        System.out.println("Placa não encontrada");
        return null;

    }

    private static void estacionados() {

        for (int i = 0; i < indexRegistro; i++) {
            if (registro[i].horaSaida == null){
                System.out.println(registro[i].veiculo.placa);
            }

        }
    }



    private static void entrada() {
        String nome;
        String marca, modelo, placa;
        long cpf;
        String horaEntrada;

        Veiculo veiculoEncontrado = pesquisar();

        if (veiculoEncontrado == null){
            System.out.println("Nome do proprietario: ");
            nome =sc.next();
            System.out.println("CPF do proprietario: ");
            cpf = sc.nextLong();
            System.out.println("Placa -->");
            placa = sc.next().toUpperCase();
            System.out.println("Marca -->");
            marca = sc.next();
            System.out.println("Modelo --> ");
            modelo = sc.next();
            Proprietario proprietario = new Proprietario(nome, cpf);
            veiculoEncontrado = new Veiculo(marca, modelo, placa, proprietario);
            veiculos[indexVeiculos] = veiculoEncontrado;
            indexVeiculos++;
        }
        System.out.println("Hora de entrada (hh:mm) -->");
        horaEntrada = sc.next();
        registro[indexRegistro] = new Registro(veiculoEncontrado, horaEntrada);
        indexRegistro++;

    }

    private static Veiculo pesquisar(){
        String placa;
        System.out.print("Qual placa da buscar? -> ");
        placa = sc.next().toUpperCase();
        for (int i = 0; i < indexVeiculos; i++) {
            if (veiculos[i].placa.equalsIgnoreCase(placa)){
                return veiculos[i];
            }
        }
        System.out.println("Placa não encontrada");
        return null;

    }

}