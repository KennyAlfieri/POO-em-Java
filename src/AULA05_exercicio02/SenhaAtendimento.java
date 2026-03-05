package AULA05_exercicio02;

public class SenhaAtendimento {
    static int controle = 100;
    int numeroSequencial;
    String nomePaciente;

    public SenhaAtendimento(String nomePaciente){
        this.nomePaciente = nomePaciente;
        this.numeroSequencial = controle++;
    }

    public String getDados(){
        return "Paciente:  " + nomePaciente +  " | Senha #" + numeroSequencial ;
    }



}
