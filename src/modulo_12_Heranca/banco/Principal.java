package modulo_12_Heranca.banco;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setTitular(new Titular("joao emanuel","12314"));
        contaBancaria1.setAgencia(1243);
        contaBancaria1.setNumero(9999);

        contaBancaria1.imprimirDemonstrativo();

        contaBancaria1.depositar(100);
        contaBancaria1.imprimirDemonstrativo();
        contaBancaria1.sacar(50);
        contaBancaria1.imprimirDemonstrativo();
    }
}
