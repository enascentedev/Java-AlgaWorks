package modulo_05.exercicio5_07;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        cachorro1.nome = "Amarela";
        cachorro1.raca = "vira-lata";
        cachorro1.sexo = "fêmea";
        cachorro1.idade = 5;

        cachorro2.nome = "Sushi";
        cachorro2.raca = "pincher";
        cachorro2.sexo = "fêmea";
        cachorro2.idade = 2;

        System.out.println(cachorro1.nome + " " + cachorro1.raca + " " + cachorro1.sexo + " " + cachorro1.idade);
        System.out.println(cachorro2.nome + " " + cachorro2.raca + " " + cachorro2.sexo + " " + cachorro2.idade);

    }
}
