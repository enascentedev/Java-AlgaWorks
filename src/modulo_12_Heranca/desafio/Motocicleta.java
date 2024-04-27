package modulo_12_Heranca.desafio;

public class Motocicleta extends Veiculo {
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    int cilindradas;

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("cilindradas:"+ cilindradas);
    }
}
