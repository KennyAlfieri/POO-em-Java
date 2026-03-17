package AULA05_exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    Usuario usuario;
    final static double tarifaBase = 5.40;

    public BilheteUnico(Usuario usuario) {
        Random random = new Random();
        this.saldo = 0;
        this.numero = random.nextInt(1000, 9999);
        this.usuario = usuario;
    }

    public void carregar(double valor) {
        if(valor <= 0) {
            return;
        }
        saldo += valor;
    }

    public double calcularTarifa(){
        double valor = tarifaBase;
        if (usuario.tipoTarifa.equalsIgnoreCase("Estudante")
                || usuario.tipoTarifa.equalsIgnoreCase("Professor") ){
            valor = tarifaBase/ 2;
        }
        return valor;
    }

    public boolean passarNaCatraca() {
        double valor = calcularTarifa();

        if (valor <= saldo){
          saldo -= valor;
            return true;
        }else {
            return false;
        }



    }

}