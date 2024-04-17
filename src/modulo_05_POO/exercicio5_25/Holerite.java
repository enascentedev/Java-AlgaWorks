package modulo_05_POO.exercicio5_25;

public class Holerite {
    Funcionario funcionario;
    int quantidadeHoraNormal;
    int quantidadeHoraExtra;
    boolean valorAdicionalFilhos;
    double valorHoraNormal;
    double valorHoraExtra;
    double adicionalPorFilho;

    // Supondo que valores como valorHoraNormal, valorHoraExtra e adicionalPorFilho sejam definidos em outro lugar

    double calcularValorTotal(){
        double totalHorasNormais = this.quantidadeHoraNormal * this.valorHoraNormal;
        double totalHorasExtras = this.quantidadeHoraExtra * this.valorHoraExtra;
        double resultado = totalHorasNormais + totalHorasExtras;

        if (this.valorAdicionalFilhos){
            resultado *= 1.1; // Aumenta o resultado em 10%
        }

        return resultado;
    }

    void imprimir(){
        double resultado = calcularValorTotal();
        System.out.println("Total Horas Normais: " + (this.quantidadeHoraNormal * this.valorHoraNormal));
        System.out.println("Total Horas Extras: " + (this.quantidadeHoraExtra * this.valorHoraExtra));
        if (this.valorAdicionalFilhos) {
            System.out.println("Adicional por Filhos: " + this.adicionalPorFilho);
        }
        System.out.println("Valor Total: " + resultado);
    }
}
