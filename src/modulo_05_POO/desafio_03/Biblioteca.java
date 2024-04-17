package modulo_05_POO.desafio_03;

import java.util.ArrayList;


//Classe Biblioteca:
//
//Atributos: lista de livros.
//Métodos: adicionarLivro(Livro livro), buscarLivro(String titulo), listarLivrosDisponiveis().

public class Biblioteca {
   public ArrayList<Livro> listaLivros;

   public Biblioteca() {
      listaLivros = new ArrayList<>();
   }

   public void adicionarLivro(Livro livro){
      listaLivros.add(livro);
      System.out.println("livro adicionado:"+livro.titulo);

   }

   public Livro buscarLivro(String titulo){
      for (Livro livro : listaLivros) {
         if(livro.titulo.equals(titulo)){
            return livro;
         }

      }
      return null;
   }

   public void listarLivrosDisponiveis(){
      System.out.println("Livros disponíveis para empréstimo:");
      for (Livro livro : listaLivros) {
         if (livro.disponibilidade) {
            System.out.println(livro.titulo + " por " + livro.autor);
         }
      }
   }

}

