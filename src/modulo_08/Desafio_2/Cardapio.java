package modulo_08.Desafio_2;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[10];
    int numeroDeItens = 0;
    void adicionarItem(ItemCardapio item) {
        if (numeroDeItens < itens.length) {
            itens[numeroDeItens] = item; // Adiciona o item no próximo espaço disponível.
            numeroDeItens++; // Incrementa o contador de itens.
        } else {
            System.out.println("O cardápio está cheio. Não é possível adicionar mais itens.");
        }
    }
    }
    void removerItem(int indice) {
        if (indice >= 0 && indice < numeroDeItens) {
            // Se não for o último elemento, desloca os elementos subsequentes uma posição para trás.
            if (indice < numeroDeItens - 1) {
                System.arraycopy(itens, indice + 1, itens, indice, numeroDeItens - indice - 1);
            }
            // Configura o último elemento como null, já que ele foi deslocado.
            itens[numeroDeItens - 1] = null;
            numeroDeItens--; // Decrementa o contador de itens, já que um item foi removido.
        } else {
            System.out.println("Índice inválido. Não foi possível remover o item.");
        }
    }
    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (int i = 0; i < numeroDeItens; i++) {
            // Verifica se o item atual está dentro do intervalo de preço.
            if (itens[i] != null && itens[i].preco >= precoMinimo && itens[i].preco <= precoMaximo) {
                // Imprime os detalhes do item.
                System.out.println("Descrição: " + itens[i].descricao + ", Preço: R$" + itens[i].preco);
            }
        }
    }
}
