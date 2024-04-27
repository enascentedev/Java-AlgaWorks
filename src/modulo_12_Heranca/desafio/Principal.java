package modulo_12_Heranca.desafio;

public class Principal {
    public static void main(String[] args) {
        Carro carro1= new Carro();
        carro1.setMarca("volks");
        carro1.setModelo("2022");
        carro1.setNumeroPortas(4);
        carro1.exibirInformacoes();

        Motocicleta moto1= new Motocicleta();
        moto1.setMarca("suzuky");
        moto1.setModelo("haya");
        moto1.exibirInformacoes();
    }

}
