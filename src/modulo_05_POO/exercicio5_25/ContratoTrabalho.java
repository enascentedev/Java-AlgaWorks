package modulo_05_POO.exercicio5_25;

public class ContratoTrabalho {

    Funcionario funcionario;
    double horaNormal; // Alterado para double
    double horaExtra; // Alterado para double
    int quantidadeHoraNormal;
    int quantidadeHoraExtra;

    public ContratoTrabalho(int quantidadeHoraNormal, int quantidadeHoraExtra, double horaNormal, double horaExtra) {
        this.quantidadeHoraNormal = quantidadeHoraNormal;
        this.quantidadeHoraExtra = quantidadeHoraExtra;
        this.horaNormal = horaNormal; // Correção
        this.horaExtra = horaExtra; // Correção
    }

    public boolean possuiAdicionalFilhos() {
        return funcionario != null && funcionario.quantidadeFilhos > 0;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getQuantidadeHoraNormal() {
        return quantidadeHoraNormal;
    }

    public int getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }

    public double getHoraNormal() {
        return horaNormal;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

}
