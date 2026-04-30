package Aula10.ex2.Conta;

public class Conta {
    protected int numero;
    protected double saldo;


    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(){
        double valor=0;
        saldo+=valor;

    }
}
