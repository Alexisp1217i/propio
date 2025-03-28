/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_libro;

/**
 *
 * @author nancy
 */
public class Eva2_18_Libro {

    public static void main(String[] args) {
       MaterialBibliografico mate = new MaterialBibliografico();
        System.out.println(mate);
        mate.setTitulo("IT ESO");
        mate.setAñoPublicasion(1986);
        
        Autor aut = new Autor();
        System.out.println(aut);
        aut.setNombre("Stephen King");
        aut.setNacionalidad("estadounidense");
        
        Libro book = new Libro();
        System.out.println(book);
        book.setGenero("Masculino");
        book.setAutor("Stephen King");
    }
}
