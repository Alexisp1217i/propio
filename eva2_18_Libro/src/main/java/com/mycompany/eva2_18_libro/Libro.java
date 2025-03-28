/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_18_libro;

/**
 *
 * @author nancy
 */
public class Libro {
     private String genero;
     private String autor;

    public Libro() {
        this.genero = "";
        this.autor = "";
        
    }

    public Libro(String genero, String autor) {
        this.genero = genero;
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
     
    
     
}
