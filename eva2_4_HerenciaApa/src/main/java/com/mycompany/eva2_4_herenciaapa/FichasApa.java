/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_herenciaapa;

/**
 *
 * @author Alexis
 */
public class FichasApa {
    private String autor;
    private String titulo;
    private int year;

    public FichasApa() {
        this.autor =  "Anabelle Hernandez";
        this.titulo = "ema y las novias del narco";
        this.year = 2021;
    }

    public FichasApa(String autor, String titulo, int year) {
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getYear() {
        return year;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
