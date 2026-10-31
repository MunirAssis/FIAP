package br.com.fiap.main;

import br.com.fiap.entities.Autor;
import br.com.fiap.entities.Livro;
import br.com.fiap.entities.Categoria;

import javax.swing.*;

public class TesteSistema {

    //String
    static String texto(String j) { return JOptionPane.showInputDialog(j);}

    //int
    static int inteiro(String j) { return Integer.parseInt(JOptionPane.showInputDialog(j) ); }

    //double
    static double real(String j) { return Double.parseDouble(JOptionPane.showInputDialog(j) ); }

    //Java 25 public psvma // java 21 psvm
    public static void main(String[] args) {

        // instanciar Objetos

        // Strings
        Livro objLivro = new Livro(
                texto("INFORMAÇÕES DO LIVRO\nTitulo"),
                texto("editora"),
                real("preco")
        );

        Autor objAutor = new Autor(
                texto("INFORMAÇÕES DO AUTOR\nNome"),
                texto("Nacionalidade"),
                texto("Email"),
                texto("Data de Nascimento")
        );

        Categoria objCategoria = new Categoria(
                inteiro("INFORMAÇÕES DA CATEGORIA DO LIVRO\ncodigo"),
                texto("nome"),
                texto("Descrição"),
                texto("prateleira"),
                inteiro("capacidade")
        );

        objLivro.setAutor(objAutor);
        objLivro.setCategoria(objCategoria);

        //saida
        System.out.println(
                objLivro + "" + objAutor + "" + objCategoria
        );
    }
}
