package Aula09;

public class Main {
    public static void main(String[] args) {

        Empregado[] vetor = new Empregado[4];
        vetor[0] =new EmpregadoComissionado(1111, "Pedro", 15,6);
        vetor[1]= new EmpregadoHorista(2222,"carlos",56,200);
        vetor[2]= new EmpregadoComissionado(3333,"Ricardo",400,30);
        vetor[3]=new EmpregadoHorista(4444,"Sales",600,400);

        //for tradicional

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].nome);
            System.out.println(vetor[i].matricula);
            System.out.println();
        }

        //for generico

        for (Empregado e: vetor){
            System.out.println(e.nome);
            System.out.println(e.matricula);
            System.out.println(e.calcularSalario());
            System.out.println();
        }
    }
}
