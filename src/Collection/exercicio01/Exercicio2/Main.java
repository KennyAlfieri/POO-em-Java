package Collection.exercicio01.Exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno("Pedro",6));
        lista.add(new Aluno("Pedro",6));
        lista.add(new Aluno("Selmini",7));
        lista.add(new Aluno("Carlos",9));

        lista.forEach(aluno->{
            System.out.println(aluno);
        });
    }
}
