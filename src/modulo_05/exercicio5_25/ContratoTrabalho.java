package modulo_05.exercicio5_25;

public class ContratoTrabalho {


    Funcionario funcionario;
    int horaNormal;
    int horaextra;

    public ContratoTrabalho(int quantidadeHoraNormal, int quantidadeHoraExtra) {
        this.quantidadeHoraNormal = quantidadeHoraNormal;
        this.quantidadeHoraExtra = quantidadeHoraExtra;
    }

    int quantidadeHoraNormal;
    int quantidadeHoraExtra;

    public int getQuantidadeHoraNormal() {
        return quantidadeHoraNormal;
    }

    public int getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }

    public ContratoTrabalho(int horaNormal, int horaextra, int quantidadeHoraNormal, int quantidadeHoraExtra) {
        this.horaNormal = horaNormal;
        this.horaextra = horaextra;

    }

    public int getHoraNormal() {
        return horaNormal;
    }

    public int getHoraextra() {
        return horaextra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }


}
