package modulo_05_POO.exercicio5_25;

public class FolhaPagamento {
    public ContratoTrabalho contrato;

    public FolhaPagamento(ContratoTrabalho contrato) {
        this.contrato = contrato;
    }

    double calculaSalario() {
        int quantidadeHoraExtra = contrato.getQuantidadeHoraExtra();
        int quantidadeHoraNormal = contrato.getQuantidadeHoraNormal();
        // Supondo que horaNormal e horaextra são valores monetários por hora. Se não forem, essa lógica precisa ser ajustada.
        double valorHoraNormal = contrato.getHoraNormal();
        double valorHoraExtra = contrato.getHoraExtra(); // Isso deveria ser ajustado na classe ContratoTrabalho para getHoraExtra()
        double valorReceber;

        valorReceber = (valorHoraNormal * quantidadeHoraNormal) + (valorHoraExtra * quantidadeHoraExtra);

        return valorReceber;
    }
}
