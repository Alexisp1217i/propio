/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_apa;
import Fichas_APA.Libro;
import Fichas_APA.SitIoWeb;
/**
 *
 * @author nancy
 */
public class Eva1_6_APA {

    public static void main(String[] args) {
     Libro book = new Libro();
        SitIoWeb web = new SitIoWeb();
     //LIBRO
        book.setAutor("Stephen_Kings");
       
        book.setTitulo(" IT ");
      
        book.setYear(1986);
        
         book.setCiudad("New York");
         
         book.setEditorial("Viking");
     
         book.imprimirReferencia();

         
     //Sitio_Web
     web.imprimirReferencia();
       web.setAutor("Wikipedia");
        System.out.println(" " + web.getAutor());
        
    }
    
}    

