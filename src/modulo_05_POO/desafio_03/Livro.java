package modulo_05_POO.desafio_03;
//Classe Livro:
//
//Atributos: título, autor, ano de publicação, e disponibilidade (booleano).

public class Livro {
    public Livro(String titulo, String autor, int anoPublicacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponibilidade;

//    Métodos: emprestar(), devolver() (altera a disponibilidade).

    public void emprestar(){
        if (disponibilidade){
            disponibilidade=false;
            System.out.println(titulo +"foi emprestado");
        } else{
            System.out.println(titulo+ "não esta disponível para emprestimo");
        }

    }

    public void devolver(){
        if (!disponibilidade){
            disponibilidade=true;
            System.out.println(titulo +"foi devolvido");
        } else{
            System.out.println(titulo+ "já está disponível");
        }
    }

}
