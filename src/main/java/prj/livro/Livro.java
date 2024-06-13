/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prj.livro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraficaLivro(livro1);
             
            }
        });
    }
}

class InterfaceGraficaLivro extends JFrame {
    private JLabel labelTitulo;
    private JLabel labelAutor;
    private JLabel labelAnoPublicacao;

    public InterfaceGraficaLivro(Livro livro) {
        setTitle("Informações do Livro");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        labelTitulo = new JLabel("Título: " + livro.getTitulo());
        add(labelTitulo);

        labelAutor = new JLabel("Autor: " + livro.getAutor());
        add(labelAutor);

        labelAnoPublicacao = new JLabel("Ano de Publicação: " + livro.getAnoPublicacao());
        add(labelAnoPublicacao);

        setVisible(true);
    }
}

    