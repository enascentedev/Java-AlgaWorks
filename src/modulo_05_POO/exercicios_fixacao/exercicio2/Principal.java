package modulo_05_POO.exercicios_fixacao.exercicio2;
/*
Fazer uma classe Ex2:Sorteio para:
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou.
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = (int) (Math.random() * 10) + 1;
        int numero = 0;
        while (numero != numeroSorteado) {
            System.out.println("Digite um número para ser sorteado");
            numero = scanner.nextInt();
            if (numero > numeroSorteado) {
                System.out.println("o numero digitado é maior que o sorteado");
            } else if (numero < numeroSorteado) {
                System.out.println("o numero digitado é menor que o sorteado");
            } else {
                System.out.println(numero + " é igual ao numero sorteado : " + numeroSorteado);
            }
        }
    }
}
