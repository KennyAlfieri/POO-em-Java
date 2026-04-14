package br.fiap.util;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.navio.Navio;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

    private Navio navio=new Navio();

    public void menu(){

        int opcao=0;
        do{
            String aux="Reserva de Cargas Boa Viagem\n";
            aux+= "[1] Reservar\n";
            aux+= "[2] Pesquisar\n";
            aux+= "[3] Exibir\n ";
            aux+= "[4] Capacidade reservada\n";
            aux+= "[5] cancelar\n";
            aux+= "[6] Finalizar\n";
            opcao= parseInt(showInputDialog(aux));
            if (opcao<1||opcao>6){
                showMessageDialog(null,"Opção inválida");
            }else {
                switch (opcao){
                    case 1:
                        reservar();
                        break;
                    case 3:
                        exibir();

                    case 6:
                        showMessageDialog(null, "Até breve!");
                        break;
                }
            }
    }while (opcao!=6);
    }
    private void reservar(){
        int cnpj;
        String destino,nomeCliente;
        cnpj = parseInt(showInputDialog("CNPJ"));
        destino= showInputDialog("Destino");
        nomeCliente= showInputDialog("Cleinte");
        Cliente cliente = new Cliente(cnpj,nomeCliente);
        Carga carga = new Carga(destino,cliente);
        if (navio.reservar(carga)){
            showMessageDialog(null, "Carga reservada com sucesso");
        }else {
            showMessageDialog(null,"Problemas ao reservar");
        }
    }
    private  void exibir(){
        showMessageDialog(null, navio.getDados());
    }
}
