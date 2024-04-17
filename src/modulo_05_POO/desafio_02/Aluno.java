package modulo_05_POO.desafio_02;

public class Aluno extends Pessoa {
    int matricula;

    public void exibirBoletim(){
        System.out.println(nome + " (" + matricula + "): Boletim está disponível.");
    }

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
