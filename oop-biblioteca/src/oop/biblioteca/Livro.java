/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.biblioteca;

/**
 *
 * @author Gabriel Zanelato
 */

public class Livro {
    private String titulo;
    private Autor autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true; // O livro está disponível inicialmente
    }

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false; // Define como não disponível
            return true; // Operação bem-sucedida
        }
        return false; // Não foi possível emprestar
    }

    public boolean devolver() {
        if (!disponivel) {
            disponivel = true; // Define como disponível
            return true; // Operação bem-sucedida
        }
        return false; // Não foi possível devolver
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Método para imprimir informações do livro
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor.getNome() + ", Ano: " + ano + ", Disponivel: " + disponivel;
    }
}
