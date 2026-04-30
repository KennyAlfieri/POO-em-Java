package Aula10.ex1;

public class Moto extends Veiculo{
    private int numCilindrada;

    public Moto(String placa, String marca, int numCilindrada) {
        super(placa, marca);
        this.numCilindrada = numCilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de cilindradas: " + numCilindrada;
    }

    public int getNumCilindrada() {
        return numCilindrada;
    }

    public void setNumCilindrada(int numCilindrada) {
        this.numCilindrada = numCilindrada;
    }
}
