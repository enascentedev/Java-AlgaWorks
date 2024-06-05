package modulo_12_Heranca.banco;

public class ContaInvestimento extends Conta {
    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public ContaInvestimento(){
        super();
    }
public void creditarRendimentos(double percentualJuros){
        double valorRendimentos= getSaldo()* percentualJuros/100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
}


}
