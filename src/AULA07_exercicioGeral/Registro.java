package AULA07_exercicioGeral;

import java.time.Duration;
import java.time.LocalTime;

public class Registro {
    Veiculo veiculo;
    String inicioStr;
    String fimStr;

    public Registro(Veiculo veiculo, String inicioStr) {
        this.veiculo = veiculo;
        this.inicioStr = inicioStr;


    }
    public double calcularValor(){
       long minutos;
       double valor;
        LocalTime inicio = LocalTime.parse(inicioStr);
        LocalTime fim = LocalTime.parse(fimStr);
       minutos = Duration.between(inicio, fim).toMinutes();
       valor=minutos * 0.75;
       return valor;

    }

}