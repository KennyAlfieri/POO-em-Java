package Aula10.ex2.Conta.Main;

import Aula10.ex2.Conta.Conta;
import Aula10.ex2.Conta.ContaCorrente.Corrente;
import Aula10.ex2.Conta.Poupanca.Poupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();
        lista.add(new Corrente(10,1000,6000));
        lista.add(new Poupanca(20,3000,10));

        for (Conta conta : lista){
            conta.depositar(2000);
            System.out.println(conta.getSaldo());
        }
    }
}
