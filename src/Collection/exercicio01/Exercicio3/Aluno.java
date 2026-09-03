package Collection.exercicio01.Exercicio3;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int rm;

    public Aluno(String nome, int rm) {
        this.nome = nome;
        this.rm = rm;
    }

    @Override
    public String toString() {
        return rm + " | " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return rm == aluno.rm && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, rm);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }
}
