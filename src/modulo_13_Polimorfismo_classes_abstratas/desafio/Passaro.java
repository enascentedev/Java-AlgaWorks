package modulo_13_Polimorfismo_classes_abstratas.desafio;

public class Passaro extends Animal {
    public Passaro(String piuPiu, int i) {
        super();
    }
    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Piu Piu!");
    }
}
