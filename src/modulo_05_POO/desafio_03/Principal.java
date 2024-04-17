package modulo_05_POO.desafio_03;

public class Principal {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();


        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949, true));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, true));
        biblioteca.adicionarLivro(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, true));


        System.out.println("Livros disponíveis inicialmente:");
        biblioteca.listarLivrosDisponiveis();


        Livro livro = biblioteca.buscarLivro("1984");
        if (livro != null) {
            livro.emprestar();
        }


        if (livro != null) {
            livro.emprestar();
        }


        System.out.println("Livros disponíveis após empréstimos:");
        biblioteca.listarLivrosDisponiveis();


        if (livro != null) {
            livro.devolver();
        }


        System.out.println("Livros disponíveis após devolução:");
        biblioteca.listarLivrosDisponiveis();
    }
}
