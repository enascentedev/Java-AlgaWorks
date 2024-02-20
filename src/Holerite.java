public class Holerite {
    private Funcionario funcionario;
    private double valorTotalHorasNormais;
    private double valorTotalHorasExtras;
    private double valorAdicionalFilhos;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorTotalHorasNormais() {
        return valorTotalHorasNormais;
    }

    public void setValorTotalHorasNormais(double valorTotalHorasNormais) {
        this.valorTotalHorasNormais = valorTotalHorasNormais;
    }

    public double getValorTotalHorasExtras() {
        return valorTotalHorasExtras;
    }

    public void setValorTotalHorasExtras(double valorTotalHorasExtras) {
        this.valorTotalHorasExtras = valorTotalHorasExtras;
    }

    public double getValorAdicionalFilhos() {
        return valorAdicionalFilhos;
    }

    public void setValorAdicionalFilhos(double valorAdicionalFilhos) {
        this.valorAdicionalFilhos = valorAdicionalFilhos;
    }

    // Construtor da classe Holerite
    public Holerite(Funcionario funcionario, double valorTotalHorasNormais, double valorTotalHorasExtras, double valorAdicionalFilhos) {
        this.funcionario = funcionario;
        this.valorTotalHorasNormais = valorTotalHorasNormais;
        this.valorTotalHorasExtras = valorTotalHorasExtras;
        this.valorAdicionalFilhos = valorAdicionalFilhos;
    }

    // Método para calcular o valor total
    public double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    // Método para imprimir os detalhes do holerite
    public void imprimir() {
        System.out.println("Holerite: ");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Valor Total Horas Normais: " + valorTotalHorasNormais);
        System.out.println("Valor Total Horas Extras: " + valorTotalHorasExtras);
        System.out.println("Valor Adicional por Filhos: " + valorAdicionalFilhos);
        System.out.println("Valor Total a Receber: " + calcularValorTotal());
    }

    // Getters e setters para todas as propriedades
    // ...
}
