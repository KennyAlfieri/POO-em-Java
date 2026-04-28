package Aula09;

public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDaHora;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHora) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double calcularSalario(){
        double salario;

        salario=totalDeHorasTrabalhadas*valorDaHora;
        return salario;

    }

    @Override
    public String toString() {
        return "EmpregadoHorista{" +
                "totalDeHorasTrabalhadas=" + totalDeHorasTrabalhadas +
                ", valorDaHora=" + valorDaHora +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
