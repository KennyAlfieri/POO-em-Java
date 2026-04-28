package Aula09;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado> lista= new ArrayList<>();

        lista.add(new EmpregadoComissionado(1,"kenny",50,20));
        lista.add(new EmpregadoHorista(2,"pedro",100,10));
        lista.add(0,new EmpregadoHorista(3,"Nicholas",10,6));

        //for (int i = 0; i < lista.size(); i++) {
          //  System.out.println(lista.get(i).nome);


        System.out.println();
        for(Empregado empregado : lista){
            System.out.println(empregado);
            System.out.println(empregado.calcularSalario());
        }
    }
}
