package Collection.exercicio01.Exercicio3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Aluno> lista = new HashMap<>();

        lista.put(10, new Aluno("Soares",6));
        lista.put(10, new Aluno("Soares",6));
        lista.put(20, new Aluno("Carlos",7));
        lista.put(30, new Aluno("Marcos",11));

        lista.forEach((rm, aluno) -> {
            System.out.println(aluno);
        });

        for(Map.Entry<Integer, Aluno> item: lista.entrySet()) {
            System.out.println("RM: " + item.getKey()
            + "| " + item.getValue());
        }


    }
}
