package modulo_05.exercicio5_25;

public class FolhaPagamento {

    public Holerite calcularSalario(ContratoTrabalho contrato) {
        // Cálculo dos valores totais das horas normais e extras
        double valorTotalHorasNormais = contrato.getHoraNormal() * contrato.getHorasNormaisTrabalhadas();
        double valorTotalHorasExtras = contrato.getHorasExtra() * contrato.getHorasExtrasTrabalhadas();

        // Verificação e cálculo do adicional por filhos
        double valorAdicionalFilhos = 0;
        if (contrato.getFuncionario().getQuantidadeFilhos() > 0) {
            valorAdicionalFilhos = (valorTotalHorasNormais + valorTotalHorasExtras) * 0.10; // 10% de adicional
        }

        // Criação do objeto modulo_05.exercicio5_25.Holerite
        Holerite holerite = new Holerite(
                contrato.getFuncionario(),
                valorTotalHorasNormais,
                valorTotalHorasExtras,
                valorAdicionalFilhos
        );

        return holerite; // Retorna o objeto modulo_05.exercicio5_25.Holerite
    }
}
