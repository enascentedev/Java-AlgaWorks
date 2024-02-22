package modulo_05.modulo_05;

public class Principal {
    public static void main(String[] args) {
        Pessoa eu= new Pessoa();
        eu.nome="Emanuel";
        eu.cpf="111222";
        eu.anoNascimento=1991;

        Pessoa voce= new Pessoa();
        voce.nome="professor";
        voce.cpf="333444";
        voce.anoNascimento=1981;


        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao=2021;
        meuCarro.cor= "preto";
        meuCarro.fabricante= "Honda";
        meuCarro.modelo= "HR-v";
        meuCarro.proprietario=eu;


        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao= 2022;
        seuCarro.cor= "Branco";
        seuCarro.fabricante= "BMW";
        seuCarro.modelo= "X6";
        seuCarro.proprietario=voce;

        System.out.println("Meu carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n" , meuCarro.modelo);
        System.out.printf("Ano: %d%n" , meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n" , meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n" , seuCarro.modelo);
        System.out.printf("Ano: %d%n" , seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n" , seuCarro.proprietario.nome);

    }
}
