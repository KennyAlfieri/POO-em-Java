package Aula12.Servicos;

import Aula12.Animal;
import Aula12.Servico;

public class Atendimento {
    private Animal animal;
    private Servico servico;

    public Atendimento(Animal animal, Servico servico) {
        this.animal = animal;
        this.servico = servico;
    }
}
