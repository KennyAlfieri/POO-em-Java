package Aula12.Animais;


import Aula12.Animal;

public class Passaro extends Animal {
    public Passaro(String nome, double peso) {
        super(nome, peso);
    }
    public double calcularPrecoBase(){
        return 30;
    }

}