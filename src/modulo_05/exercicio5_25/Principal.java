package modulo_05.exercicio5_25;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setQuantidadeFilhos(2);

        // Ajuste dos valores para double onde necessário e inclusão do Funcionario
        ContratoTrabalho contrato = new ContratoTrabalho(40, 20, 15.5, 20.75);
        contrato.setFuncionario(funcionario);

        FolhaPagamento folha = new FolhaPagamento(contrato);

        double salario = folha.calculaSalario();
        System.out.println("O valor do salário é: " + salario);
    }
}
