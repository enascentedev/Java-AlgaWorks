package modulo_12_Heranca.banco;

public class ContaEspecial extends ContaInvestimento {
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    public double getSaldoDisponivel() {
        return getSaldo()+ getLimiteChequeEspecial();
    }
    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
    }
}
