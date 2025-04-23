package alura.variaveis;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Autor: ");
        String autor = scanner.nextLine();
        System.out.println("Numero de páginas: ");
        int numeroPaginas = scanner.nextInt();
        System.out.println("Preço: ");
        double precoLivro = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Categoria: ");
        String categoria = scanner.nextLine();

        String categoriaLivro;

        if (categoria.equals("F")){
            categoriaLivro = "Ficção";
            System.out.println("O livro " + titulo + ", escrito por " + autor + ", com " + numeroPaginas + " páginas, está custando R$" + precoLivro + "e faz parte da categoria " + categoriaLivro);
        } else if (categoria.equals("N")){
            categoriaLivro = "Não-ficção";
            System.out.println("O livro " + titulo + ", escrito por " + autor + ", com " + numeroPaginas + " páginas, está custando R$" + precoLivro + "e faz parte da categoria " + categoriaLivro);
        } else if (categoria.equals("T")){
            categoriaLivro = "Tecnologia";
            System.out.println("O livro " + titulo + ", escrito por " + autor + ", com " + numeroPaginas + " páginas, está custando R$" + precoLivro + "e faz parte da categoria " + categoriaLivro);
        } else if (categoria.equals("H")) {
            categoriaLivro = "História";
            System.out.println("O livro " + titulo + ", escrito por " + autor + ", com " + numeroPaginas + " páginas, está custando R$" + precoLivro + "e faz parte da categoria " + categoriaLivro);
        } else {
            categoriaLivro = "Outros";
            System.out.println("O livro " + titulo + ", escrito por " + autor + ", com " + numeroPaginas + " páginas, está custando R$" + precoLivro + "e faz parte da categoria " + categoriaLivro);
        }
        scanner.close();
    }
}
