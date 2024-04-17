package modulo_05_POO.exercicio_OO.exercicio_2;
/*
2) Alterar o programa do exercício 1) para substituir o método ajustaDataDeNascimento
por uma construtora
 */


public class Principal {
    public static void main(String[] args) {

        int diaAtual = 7;
        int mesAtual = 3;
        int anoAtual = 2024;

        Pessoa pessoa1 = new Pessoa("Einstein", 14, 3, 1879);

        pessoa1.ajustaDataDeNascimento(14, 3, 1879);

        pessoa1.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(pessoa1.informaNome());
        System.out.println(pessoa1.informaIdade());

        Pessoa pessoa2 = new Pessoa("Newton", 4, 1, 1643);

        pessoa2.ajustaDataDeNascimento(4, 1, 1643);

        pessoa2.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(pessoa2.informaNome());
        System.out.println(pessoa2.informaIdade());


    }
}