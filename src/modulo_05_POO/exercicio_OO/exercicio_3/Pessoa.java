package modulo_05_POO.exercicio_OO.exercicio_3;

public class Pessoa {

     String nome;
     Universidade universidade;


    public Pessoa(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }


    public String informaNomeEUniversidade() {
        if (this.universidade != null) {
            return "Nome: " + this.nome + ", Universidade: " + this.universidade.informaNome();
        } else {
            return "Nome: " + this.nome + ", Universidade: Não associada";
        }
    }
}
