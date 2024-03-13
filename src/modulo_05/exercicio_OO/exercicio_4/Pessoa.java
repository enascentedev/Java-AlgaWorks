package modulo_05.exercicio_OO.exercicio_4;

import modulo_05.exercicio_OO.exercicio_3.Universidade;

public class Pessoa {
    String nome;
    modulo_05.exercicio_OO.exercicio_3.Universidade universidade;


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
