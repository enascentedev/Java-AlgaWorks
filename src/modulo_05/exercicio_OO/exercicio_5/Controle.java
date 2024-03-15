package modulo_05.exercicio_OO.exercicio_5;
/*
Fazer uma classe Controle que:
• pergunte ao usuário o nome e as duas notas parciais de um aluno. Caso o
nome entrado seja “fim” isso significa que o usuário não quer inserir mais
nenhum aluno, do contrário deve ser instanciado um objeto da classe Aluno e
armazenados os dados digitados.
Dicas: usar um objeto da classe ArrayList de Java para armazenar as
referências para os objetos instanciados). Usar o método equals da classe
String para verificar se o valor do nome entrado é igual a “fim”.
 Para encontrar a documentação destas classes:
http://java.sun.com/j2se/1.5.0/docs/api/
• Calcular, ao final da inserção de todos os alunos, a média da turma, quantos
alunos foram aprovados e quantos foram
reprovados.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Aluno> alunos= new ArrayList<>();

        float alunoMedia = 0;
        float mediaGeral = 0;
        int alunoAprovado = 0;
        int alunoReprovado = 0;

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
            alunoMedia=(aluno.getPrimeiraNotaParcial() + aluno.getSegundaNotaParcial()) /2;
            mediaGeral+=alunoMedia;
            if (alunoMedia >= 7 ){
                alunoAprovado++ ;
            } else {
                alunoReprovado++;
            }
        }
        mediaGeral=mediaGeral/alunos.size();
        System.out.println( "a média geral da turma é " + mediaGeral);
        System.out.println( "A quantidade de alunos aprovados é " + alunoAprovado);
        System.out.println( "A quantidade de alunos reprovados é " + alunoReprovado);
    }


}
