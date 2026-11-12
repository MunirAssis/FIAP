package br.com.fiap.entities;

public class Livro {
    private String titulo;
    private String editora;
    private double preco;
    private Autor autor;
    private Categoria categoria;

    //constructor vazio

    public Livro() {
    }

    //constructor cheio

    public Livro(String titulo, String editora, double preco) {
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
    }

    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //to String

    @Override
    public String toString() {
        return "\n\nLivro" +
                "\ntitulo='" + titulo + '\'' +
                "\neditora='" + editora + '\'' +
                "\npreco=" + preco;
    }
}
