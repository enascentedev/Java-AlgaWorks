package modulo_12_Heranca.banco;

public class Principal1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("joao emanuel","12314"));
        conta1.setAgencia(1243);
        conta1.setNumero(9999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();
        conta1.sacar(50);
        conta1.imprimirDemonstrativo();
    }
}
