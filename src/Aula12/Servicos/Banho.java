package Aula12.Servicos;


import Aula12.Animal;
import Aula12.Servico;

public class Banho extends Servico {
    public Banho(String descricao, int duracao) {
        super(descricao, duracao);
    }
    public double calcularCusto(Animal a){
        return a.calcularPrecoBase()+(duracao * 0.5);
    }

}