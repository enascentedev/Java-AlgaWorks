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
public class Pessoa {
    int idade;
    int diaDeNascimento;
    int mesDeNascimento;
    int anoDeNascimento;
    String nome;

    public Pessoa(String nome) {
        this.nome= nome;
    }

    void calculaIdade(int diaAtual, int mesAtual, int anoAtual){
        idade= anoAtual - anoDeNascimento;
        if (mesAtual < this.mesDeNascimento || (mesAtual == this.mesDeNascimento && diaAtual < this.diaDeNascimento)) {
            idade--;
        }

    }

    public int informaIdade(){
        return this.idade;
    }

    public String informaNome() {
        return this.nome;
    }

    void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.diaDeNascimento=dia;
        this.mesDeNascimento=mes;
        this.anoDeNascimento=ano;

    }

}
