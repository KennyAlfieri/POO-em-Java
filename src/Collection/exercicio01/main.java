package Collection.exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    static void main() {
        List<Candidato> lista =  new ArrayList<>();
        lista.add(new Candidato("Patricia",9,30));
        lista.add(new Candidato("SelminiDroid",7,60));
        lista.add(new Candidato ("Pedro",6,8));
        lista.add(new Candidato ("Carlos",8,7));

        //ordenação
        lista.sort(Comparator.comparingDouble(Candidato::getNotaTecnica).thenComparingInt(Candidato::getAnosExperiencia).reversed().thenComparingDouble(Candidato::getNotaTecnica));

        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}
