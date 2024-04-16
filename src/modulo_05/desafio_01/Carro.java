package modulo_05.desafio_01;

//Objetivo: Criar uma classe Carro que represente algumas funcionalidades básicas de um carro.
//Atributos:
//marca (String): a marca do carro.
//modelo (String): o modelo do carro.
//ano (int): o ano de fabricação do carro.
//velocidade (int): a velocidade atual do carro (inicialmente 0).
//Construtor:
//Crie um construtor que inicialize a marca, o modelo e o ano do carro.
//Métodos:
//acelerar(): aumenta a velocidade do carro em 10 unidades.
//frear(): diminui a velocidade do carro em 10 unidades. A velocidade não pode ser negativa.
//exibirInformacoes(): exibe uma mensagem com todas as informações do carro, incluindo sua velocidade atual.
//Tarefa:
//
//Implemente a classe Carro com os atributos, construtor e métodos descritos.
//Crie um objeto da classe Carro e teste todos os seus métodos.

public class Carro {
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    String marca;
    String modelo;
    int ano;
    int velocidade=0;

    public void acelerar(){
        velocidade+=10;
    }

    public void frear(){
       if(velocidade>=10){
           velocidade-=10;
       }
    }

    public void exibirInformacoes(){
        System.out.println("marca do carro é " +marca);
        System.out.println("modelo do carro é " +modelo);
        System.out.println("ano do carro é " +ano);
        System.out.println("velocidade atual do carro é " +velocidade);

    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("toyota", "corolla",2020);
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.exibirInformacoes();
    }
}
