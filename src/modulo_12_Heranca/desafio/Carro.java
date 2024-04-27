package modulo_12_Heranca.desafio;

public class Carro extends Veiculo {
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    int numeroPortas;

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("numeros de portas :" + numeroPortas);
    }
}
