package AULA05_exercicio03;

import java.util.Random;

public class BilheteUnico {

    int  numBilhete;
    String nome;
    double saldo;
    final static double tarifaBase = 5.40;
    String tipoTarifa;


    public BilheteUnico(String nome, String tipoTarifa){
        Random r = new Random();
        this.nome = nome;
        this.numBilhete = r.nextInt(1000,9999);
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0;
    }

    public void carregar(double valor){
        if (valor <= 0){
            return;
        }

        System.out.println("Carregado com sucesso!");

        this.saldo += valor;
    }

    public boolean passagemCatraca(){
        double valor = tarifaBase;
        if(tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        // verifica se tem saldo disponível
        if(saldo < valor) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }

    }
}
