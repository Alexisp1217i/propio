/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author nancy
 */
public class Proveedor {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    private boolean credito;
    
    
    public Proveedor(){
     nombre = "---";
     apellidoPaterno = "---";
     apellidoMaterno = "---";
     edad = 0 ;
     rfc = "---";
     credito = false;
      } 

   
     public Proveedor(String nombre,String apellidoPaterno,String apellidoMaterno,int edad,String rfc,boolean credito){
     this.nombre = "Jesus Alexis";
     this.apellidoPaterno = "Jimenez";
     this.apellidoMaterno = "Aldaba";
     this.edad = 18;
     this.rfc = "vffgrgrgrg";
     this.credito = false;
      }

     
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public String getRfc() {
        return rfc;
    }

    public boolean isCredito() {
        return credito;
    }
    
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

 
     
}