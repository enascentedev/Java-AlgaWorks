package modulo_05.exercicios_fixacao.exercicio1;
/* 1) Fazer uma classe Ex1Primos para:
        • Receber um inteiro N do usuário
        • Testar se este inteiro é primo ou não e informar
    Um número primo é um número natural maior que 1 que tem exatamente dois divisores distintos: 1 e ele mesmo.
Ou seja, ele não pode ser dividido uniformemente por nenhum outro número além de 1 e ele próprio.
    Checagem inicial: Verifique se o número é menor que 2. Se for, ele não pode ser primo. Números primos são maiores que 1.
    Divisão por 2: Se o número for maior que 2 e par (ou seja, se ele for divisível por 2), ele não é primo.
Isso é uma checagem rápida que pode eliminar muitos números que não são primos.
    Testar divisões: Para todos os números ímpares i começando de 3 até a raiz quadrada do número em questão:
Se o número pode ser dividido por i (ou seja, se o número dividido por i deixa resto zero), então o número não é primo.
    Conclusão: Se o número passar por todas essas checagens sem ser dividido uniformemente (exceto por 1 e ele mesmo), então ele é primo.
  */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero= scanner.nextInt();

        if (numero < 2){
            System.out.println("numero não é primo");
        } else if (numero >2 && numero % 2 == 0) {
            System.out.println("numero não é primo");
        } else {
            System.out.println("numero é primo");
        }

    }
}
