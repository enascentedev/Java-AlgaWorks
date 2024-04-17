package modulo_05_POO.desafio_02;

public class Professor extends Pessoa {

    public Professor(String nome, int idade, String materia) {
        super(nome,idade);

        this.materia = materia;
    }

    String materia;

    public void exibirTurmas(){
        System.out.println("Professor " + nome + " leciona " + materia);
    }
}
