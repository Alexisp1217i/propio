/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_this;

/**
 *
 * @author nancy
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
     this.nombre = "SIN NOMBRE";
     this.apellido = "SIN APELLIDO";
     this.edad =0 ;
     }
    
    public Persona(String nomb, String apell, int nom){
     this.nombre = "SIN NOMBRE";
     this.apellido = "SIN APELLIDO";
     this.edad =0 ; 
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String valor){
        this.apellido = valor;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public void setEdad(int valor){
        this.edad = valor;
    }
    public int getEdad(){
        return this.edad;
    }
}
