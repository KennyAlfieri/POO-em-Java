package Aula10.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> Lista = new ArrayList<>();
        Lista.add(new Carro("a","Jaguar",4));
        Lista.add(new Moto("b","bmw",1500));
        Lista.add(new Carro("c","Audi",4));


        for (Veiculo veiculo : Lista){
            System.out.println(veiculo);
            System.out.println();
        }
    }
}
