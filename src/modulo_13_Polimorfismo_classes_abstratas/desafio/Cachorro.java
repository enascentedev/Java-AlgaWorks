package modulo_13_Polimorfismo_classes_abstratas.desafio;

public class Cachorro extends Animal {
    public Cachorro(String rex, int i) {
        super();
    }
    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Au Au!");
    }
}
