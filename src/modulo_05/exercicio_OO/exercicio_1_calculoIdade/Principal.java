package modulo_05.exercicio_OO.exercicio_1_calculoIdade;
/*
1) Criar a classe Pessoa com as seguintes características:
• atributos: idade e dia, mês e ano de nascimento, nome da pessoa
• métodos:
o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e
armazena no atributo idade a idade atual da pessoa
o informaIdade(), que retorna o valor da idade
o informaNome(), que retorna o nome da pessoa
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento
como parâmetros e preenche nos atributos correspondentes do objeto.
• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido
em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais
seriam as idades de Einstein e Newton caso estivessem vivos
 */
public class Principal {
    public static void main(String[] args) {

        int diaAtual= 7;
        int mesAtual= 3;
        int anoAtual=2024;

        Pessoa pessoa1 = new Pessoa("Einstein");

        pessoa1.ajustaDataDeNascimento(14,3,1879);

        pessoa1.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(pessoa1.informaNome());
        System.out.println(pessoa1.informaIdade());

        Pessoa pessoa2 = new Pessoa("Newton");

        pessoa2.ajustaDataDeNascimento(4,1,1643);

        pessoa2.calculaIdade(diaAtual,mesAtual,anoAtual);

        System.out.println(pessoa2.informaNome());
        System.out.println(pessoa2.informaIdade());


    }
}
