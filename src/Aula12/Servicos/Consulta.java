package Aula12.Servicos;


import Aula12.Animal;
import Aula12.Servico;

public class Consulta extends Servico {
    public Consulta(String descricao, int duracao) {
        super(descricao, duracao);
    }
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + 35;
    }
}