package modulo_05.desafio_02;

public class Professor extends Pessoa {

    public Professor(String materia) {
        this.materia = materia;
    }

    String materia;

    public void exibirTurmas(){
        System.out.println("Professor " + nome + " leciona " + materia);
    }
}
