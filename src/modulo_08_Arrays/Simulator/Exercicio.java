package modulo_08.Simulator;

import java.util.ArrayList;

public class Exercicio {
    public static void main(String[] args) {
        ArrayList<String> alunos= new ArrayList<>();
        alunos.add("Maria");
        alunos.add("João");

        for (String aluno: alunos){
            System.out.println(aluno);
        }
    }
}
