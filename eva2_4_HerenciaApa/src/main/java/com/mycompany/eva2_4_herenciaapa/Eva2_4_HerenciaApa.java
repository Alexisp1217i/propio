/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_herenciaapa;

/**
 *
 * @author Alexis
 */
public class Eva2_4_HerenciaApa {

    public static void main(String[] args) {
    FichasApa fichi = new FichasApa();
      fichi.setAutor("Anabelle Hernandez");
          System.out.println("Nombre del autor: " + fichi.getAutor());
        
              fichi.setTitulo("Ema y las novias del narco");
                 System.out.println("Titulo del libro: " +  fichi.getTitulo());
                 
  //Libro
    Libro book = new Libro();
        System.out.println("Libro: ");
      book.setCiudad("Mexico");
        System.out.println("Nombre de la ciudad de Origen: " + book.getCiudad());
            book.setEditorial("México");
            
       book.setEditorial("Penguin Random House");
        System.out.println("Nombre de la editorial del libro: " + book.getEditorial());
           
        System.out.println("--------------------------------------------------------------");
         
  //Grabacion de sonido
    GrabacionDeSonido song = new   GrabacionDeSonido();
        System.out.println("Grabacion de sonido: ");
          song.setAutor(" Edgar Barrera");
             System.out.println("Nombre de los autor: " + song.getAutor());
       
         song.setDirector("Raymond Acosta and Lucas Barbosa.");
              System.out.println("Nombre del autor: " + song.getDirector());
       
       song.setInterprete("Grupo Frontera.");
          System.out.println("Nombre del interprete: " + song.getInterprete());
     
           song.setTitulo( "Hecha Pa' Mi");
             System.out.println("Titulo de la cancion: " + song.getTitulo());
       
       song.setYear(2022);
        System.out.println("Year de salida: " + song.getYear());
      
        song.setCiudad("Edinburg, Texas");
        System.out.println("Origen de grabacion: " + song.getCiudad());
       
        song.setEstado("Texas");
        System.out.println("Estado de origen: " + song.getEstado());
        
       song.setRegion("USA");
        System.out.println("Pais de origen: " + song.getRegion());

        
    }
}
