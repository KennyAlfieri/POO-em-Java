package Aula11.Main;

import Aula11.forma.Cilindro;
import Aula11.forma.Circulo;
import Aula11.forma.Forma;
import Aula11.forma.Volume;
import Aula11.ponto.Ponto;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> lista = new LinkedList<>();
        lista.add(new Circulo(2, new Ponto(2,2)));
        lista.add(new Cilindro(3,2,new Ponto(2,3)));
        lista.add(new Cilindro(3,2,new Ponto(1,2)));
        lista.add(new Circulo(3,new Ponto(1,2)));
        imprimir(lista);
    }

    private static void imprimir(List<Forma> lista) {
            for (Forma forma : lista){
                System.out.println(forma);
                System.out.println("Área: " + forma.calcularArea());
                if (forma instanceof Volume){
                    System.out.println("Volume: " + ((Volume) forma).calcularVolume());
                }
                System.out.println();
        }
    }
}
