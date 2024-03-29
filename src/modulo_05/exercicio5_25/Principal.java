package modulo_05.exercicio5_25;

public class Principal {
    public static void main(String[] args) {
        FolhaPagamento Folha = new FolhaPagamento();
        double salario = Folha.calculaSalario();
        System.out.println("o valor do salário é " + salario);
    }
}