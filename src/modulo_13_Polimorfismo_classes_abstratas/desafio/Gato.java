package modulo_13_Polimorfismo_classes_abstratas.desafio;

public class Gato extends Animal {
    public Gato(String mimi, int i) {
        super();
    }
    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Miau!");
    }
}
