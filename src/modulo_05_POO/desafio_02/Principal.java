package modulo_05_POO.desafio_02;
//Exercício: Sistema de Gestão Escolar
//Objetivo: Criar um sistema simples de gestão escolar utilizando Java, onde você irá implementar classes para representar diferentes tipos de pessoas dentro de uma escola.
//
//Descrição:
//Pessoa: Classe base que possui os atributos comuns a todos como nome e idade.
//Classes Derivadas:
//Aluno: Deriva de Pessoa e adiciona atributos específicos como matricula e um método para exibir seu boletim.
//Professor: Deriva de Pessoa e adiciona atributos como materia que leciona e um método para exibir sua lista de turmas.

//Funcionalidades:
//A classe Aluno deve ter um método exibirBoletim() que simula a exibição de notas (pode ser estático para simplificação).
//A classe Professor deve ter um método exibirTurmas() que lista as turmas que ele leciona.

//Implementação:
//Implemente construtores para todas as classes que inicializam os atributos.
//Implemente os métodos descritos nas classes derivadas

//Tarefa:
//Implemente as classes Pessoa, Aluno e Professor com os atributos e métodos descritos.
//Crie objetos representando diferentes alunos e professores, chame os métodos correspondentes e exiba as informações.





public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("joao",32, 1010);
        Professor professor= new Professor("maria",45, "geografia");

        aluno1.exibirDados();
        aluno1.exibirBoletim();

        professor.exibirDados();
        professor.exibirTurmas();
    }
}
