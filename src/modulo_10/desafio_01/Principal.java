package modulo_10.desafio_01;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1= new ContaBancaria(100,200);
        contaBancaria1.depositar(100);
        contaBancaria1.sacar(50);
        contaBancaria1.getSaldo();
        contaBancaria1.getNumeroDaConta();
        contaBancaria1.imprimirSaldo();
    }


}
