package Aula10.ex2.Conta.ContaCorrente;

import Aula10.ex2.Conta.Conta;

public class Corrente extends Conta {
    private double Limite;

    public Corrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        Limite = limite;
    }

    public double getLimite() {
        return Limite;
    }

    public void setLimite(double limite) {
        Limite = limite;
    }

    @Override
    public double getSaldo() {
        return saldo+Limite;
    }
}
