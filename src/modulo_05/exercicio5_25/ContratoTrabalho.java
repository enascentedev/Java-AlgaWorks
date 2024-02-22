package modulo_05.exercicio5_25;

public class ContratoTrabalho {
    private Funcionario funcionario;
    private double HoraNormal;
    private double HorasExtra;
    private double horasNormaisTrabalhadas;
    private double horasExtrasTrabalhadas;

    public double getHorasNormaisTrabalhadas() {
        return horasNormaisTrabalhadas;
    }

    public void setHorasNormaisTrabalhadas(double horasNormaisTrabalhadas) {
        this.horasNormaisTrabalhadas = horasNormaisTrabalhadas;
    }

    public double getHorasExtrasTrabalhadas() {
        return horasExtrasTrabalhadas;
    }

    public void setHorasExtrasTrabalhadas(double horasExtrasTrabalhadas) {
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getHoraNormal() {
        return HoraNormal;
    }

    public void setHoraNormal(double horaNormal) {
        HoraNormal = horaNormal;
    }

    public double getHorasExtra() {
        return HorasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        HorasExtra = horasExtra;
    }
    public boolean temAdicionalFilhos(){
        return funcionario.temDireitoAdicionalFilhos();
    }
}
