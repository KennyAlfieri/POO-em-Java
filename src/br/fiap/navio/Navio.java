package br.fiap.navio;

import br.fiap.carga.Carga;

public class Navio {
    private double capacidade;
    private int index;
    private Carga[] carga;

    public Navio() {
        this.capacidade = 10000;
        this.index=0;
        this.carga = new Carga[20];
    }

    public double getCapacidade() {
        return capacidade;
    }

    public Carga[] getCarga() {
        return carga;
    }
}
