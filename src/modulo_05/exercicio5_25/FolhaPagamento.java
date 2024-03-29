package modulo_05.exercicio5_25;

public class FolhaPagamento {

    double calculaSalario(ContratoTrabalho contrato){
        int quantidadeHoraExtra= contrato.getQuantidadeHoraExtra();
        int quantidadeHoraNormal=contrato.quantidadeHoraNormal;
        double valorHoraNomral=contrato.getHoraNormal();
        double valorHoraExtra=contrato.getHoraextra();
        double valorReceber;

        valorReceber= (valorHoraNomral*quantidadeHoraNormal)+ (valorHoraNomral*quantidadeHoraNormal);

        return valorReceber;
    }
}

