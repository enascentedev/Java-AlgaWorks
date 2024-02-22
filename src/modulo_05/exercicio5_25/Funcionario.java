package modulo_05.exercicio5_25;

public class Funcionario {
    String nome;
    int quantidadeFilhos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(int quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public boolean temDireitoAdicionalFilhos(){
        return quantidadeFilhos > 0;
    }
}
