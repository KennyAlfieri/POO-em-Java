package Collection.exercicio01.Exercicio2;

public class Professor {
    private String nome;
    private Double rm;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRm() {
        return rm;
    }

    public void setRm(Double rm) {
        this.rm = rm;
    }

    public Professor(String nome, Double rm) {
        this.nome = nome;
    }
}
