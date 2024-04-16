package modulo_05.desafio_02;

public class Pessoa {
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String nome;
    int idade;

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
