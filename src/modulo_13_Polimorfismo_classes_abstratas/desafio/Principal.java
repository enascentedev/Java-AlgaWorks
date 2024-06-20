package modulo_13_Polimorfismo_classes_abstratas.desafio;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Mimi", 3);
        Animal passaro = new Passaro("PiuPiu", 2);

        Animal[] animais = {cachorro, gato, passaro};

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }

}
