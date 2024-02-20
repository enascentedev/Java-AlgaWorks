package modulo_05.exercicio5_25;

public class Main {
    public static void main(String[] args) {
        // Cria e configura o objeto modulo_05.exercicio5_25.Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nome do Funcionário");
        funcionario.setQuantidadeFilhos(1); // Supondo que o funcionário tenha 1 filho

        // Cria e configura o objeto modulo_05.exercicio5_25.ContratoTrabalho
        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.setFuncionario(funcionario);
        contrato.setHoraNormal(20.0); // Valor fictício para o exemplo
        contrato.setHorasExtra(30.0); // Valor fictício para o exemplo
        contrato.setHorasNormaisTrabalhadas(160); // Exemplo: 160 horas de trabalho normal no mês
        contrato.setHorasExtrasTrabalhadas(20); // Exemplo: 20 horas extras no mês

        // Cria o objeto modulo_05.exercicio5_25.FolhaPagamento e calcula o salário
        FolhaPagamento folha = new FolhaPagamento();
        Holerite holerite = folha.calcularSalario(contrato);

        // Imprime os detalhes do holerite
        holerite.imprimir();
    }
}
