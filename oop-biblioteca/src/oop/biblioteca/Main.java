/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.biblioteca;

/**
 *
 * @author Gabriel Zanelato
 */

public class Main {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");
        Autor autor2 = new Autor("JK Rowling", "Britanico");
  
        Livro livro1 = new Livro("Dom Casmurro", autor1, 1899);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", autor2, 1997);
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        
        System.out.println("\nLivros disponiveis:");
        biblioteca.listarLivros();

        if (livro1.emprestar()) {
            System.out.println("\nLivro emprestado: " + livro1.getTitulo());
        }

   
        if (livro2.emprestar()) { 
            System.out.println("Livro emprestado: " + livro2.getTitulo());
        }

        if (livro1.devolver()) { 
            System.out.println("Livro devolvido: " + livro1.getTitulo() + "\n");
        }

        System.out.println("Livros apos operacoes:");
        biblioteca.listarLivros();
    }
}
