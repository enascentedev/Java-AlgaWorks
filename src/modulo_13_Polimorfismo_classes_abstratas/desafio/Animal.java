package modulo_13_Polimorfismo_classes_abstratas.desafio;

// Classe Abstrata Animal
abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Animal() {

    }

    public abstract void fazerSom();
}


