package Collection.exercicio01;

public class Candidato {
    private String nome;
    private double notaTecnica;
    private int anosExperiencia;

    public Candidato(String nome, double notaTecnica, int anosExperiencia) {
        this.nome = nome;
        this.notaTecnica = notaTecnica;
        this.anosExperiencia = anosExperiencia;
    }
    public String toString(){
        return nome+ "\t\t" + notaTecnica + "\t\t" + anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(double notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
