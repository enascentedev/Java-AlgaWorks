package modulo_10.desafio_01;

public class ContaBancaria {

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    int numeroDaConta;
    private double saldo;

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;

    }

    int getNumeroDaConta(){
        return numeroDaConta;
   }

   public void imprimirSaldo() {
        System.out.println("sua conta é ;"+ getNumeroDaConta());
        System.out.println("seu saldo é :"+ getSaldo());
    }

}
