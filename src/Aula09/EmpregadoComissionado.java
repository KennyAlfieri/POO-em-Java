package Aula09;

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        double salario;

        salario=totalDeVendas*comissao/100;
        return salario;
    }
}
