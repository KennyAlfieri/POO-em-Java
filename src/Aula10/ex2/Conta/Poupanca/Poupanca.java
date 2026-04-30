package Aula10.ex2.Conta.Poupanca;

import Aula10.ex2.Conta.Conta;

public class Poupanca extends Conta {
    private double taxaDeRendimento;

    public Poupanca(int numero, double saldo, double taxaDeRendimento) {
        super(numero, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double aplicarRendimento(){
        return saldo += saldo * taxaDeRendimento/100;
    }
}
