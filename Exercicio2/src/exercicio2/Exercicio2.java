
package exercicio2;


public class Exercicio2 {

    public static void main(String[] args) {

         // 1. Criar um livro
        LivroBiblioteca livro = new LivroBiblioteca(
                "Dom Casmurro",
                "Machado de Assis",
                256,
                1899);

        livro.setAnoPublicacao(1900);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getNumeroPaginas());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
    }
}
