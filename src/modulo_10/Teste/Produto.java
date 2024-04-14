package modulo_10.Teste;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL=100;
    String nome;
    int quantidadeEstoque;

    Produto() {
        this( "Sem nome");

    }

    Produto(String nome) {
        this(nome,QUANTIDADE_ESTOQUE_INICIAL);
    }


    Produto(String nome, int estoqueInicial) {

        if(estoqueInicial<0){
            throw new IllegalArgumentException("estoque inicial não pode ser menor que zero");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }

}
