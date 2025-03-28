/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_18_libro;

/**
 *
 * @author nancy
 */
public class MaterialBibliografico {
    private String titulo;
    private int añoPublicasion;
    private Libro libro;
    private Autor autor;

    public MaterialBibliografico() {
        this.titulo = "";
        this.añoPublicasion = 0;
        this.libro = new Libro();
        this.autor = new Autor();
    }

    public MaterialBibliografico(String titulo, int añoPublicasion) {
        this.titulo = titulo;
        this.añoPublicasion = añoPublicasion;
        this.libro = new Libro();
        this.autor = new Autor();
         
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicasion() {
        return añoPublicasion;
    }

    public void setAñoPublicasion(int añoPublicasion) {
        this.añoPublicasion = añoPublicasion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    @Override
   public String toString(){
     return "Datos del Libro:  \n" +
              "Titulo: " + titulo + "\n" +
              "Año de publicasion: " + añoPublicasion + "\n" +
              
              "Nombre: " + autor.getNombre() + "\n" +
              "Nacionalidad: " + autor.getNacionalidad() + "\n" +
             
              "Genero: " + libro.getGenero() + "\n" +
                      "Autor: " +libro.getAutor();   
}
    
}
