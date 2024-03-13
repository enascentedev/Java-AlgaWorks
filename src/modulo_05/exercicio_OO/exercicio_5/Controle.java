package modulo_05.exercicio_OO.exercicio_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Aluno> alunos= new ArrayList<>();

        while(true){
            System.out.println("Digite o nome do aluno ou 'fim' para sair" );
            String nomeAluno= scanner.nextLine();

            if(nomeAluno.equals("fim")){
                break;
            }
            System.out.println("Digite a primeira nota parcial");
            float primeiraNotaParcial = Float.parseFloat(scanner.nextLine());

            System.out.println("Digite a segunda nota parcial");
            float segundaNotaParcial = Float.parseFloat(scanner.nextLine());

            Aluno aluno = new Aluno(nomeAluno, primeiraNotaParcial, segundaNotaParcial);
            alunos.add(aluno);

        }

        scanner.close();
        System.out.println("Alunos cadastrados:");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNomeAluno() + " - Notas: " + aluno.getPrimeiraNotaParcial() + ", " + aluno.getSegundaNotaParcial());
        }

    }

}
