package modulo_05_POO.Precificacao;

public class ServicoDePrecificacao {
    void definirPrecoVenda(Produto produto, double percentualMargemLucro){
        produto.precoVenda= produto.precoCusto*((percentualMargemLucro/100)+1);
    }
}
