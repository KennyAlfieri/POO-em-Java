package Aula10.ex2.Conta.Main;

import Aula10.ex2.Conta.Conta;
import Aula10.ex2.Conta.ContaCorrente.Corrente;
import Aula10.ex2.Conta.Poupanca.Poupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();
        lista.add(new Corrente(10,2000,6000));
        lista.add(new Poupanca(10,2000,10));
    }
}
