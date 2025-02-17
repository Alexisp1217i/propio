/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas_APA;

/**
 *
 * @author nancy
 */
public class SitIoWeb {
    
     private String autor; 
     private String nameWeb;
     private int year;
     private int mes;
     private int dia;
     private int consulta;

     
     public String getAutor(){
        return autor;
        
        }
    public void setAutor(String valor){
        autor = valor;
       } 
      
   
    public String getNameWeb(){
        return nameWeb;
        
      }
    public void setNameWeb(String valor){
        nameWeb = valor;
       }
    
   
    public int getYear(){
        return year;
      }
   public void setYear(int valor){
       year = valor;
      }
   
  
   public int getMes(){
        return mes;
     }
   public void setMes(int valor){
       mes = valor;
     }
   
   
   public int getDia(){
        return dia;
      }
   public void setDia(int valor){
       dia = valor;
     }
   
   
   public int getConsulta(){
        return consulta;
      }
   public void setConsulta(int valor){
       consulta = valor;
      }

 public void imprimirReferencia(){
        System.out.print("   Datos del Sito Web: " );
   
    }
 }

