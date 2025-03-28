/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_16_composicion;

/**
 *
 * @author nancy
 */
public class Cliente {
 private String nombre;    
 private String apellido;
 private int edad;
 //Clase Direccion
 private Direccion direccion;//CLIENTE HAS A (TIENE UNA) DIRECCION
   
 
    public Cliente() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
        this.direccion = new Direccion();
    }
    
    public Cliente(String nombre, String apellido, int edad, String colonia, String estado, int codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
 
 @Override
 public String toString(){
     return "Datos del cliente: \n" +
     "Nombre: " + nombre + "\n"+
     "Apellido: " + apellido + "\n"+
     "Colonia: " + direccion.getColonia() + "\n"+
     "Estado: " + direccion.getEstado() + "\n"+
     "Codigo Postal: " + direccion.getCodigoPostal();
             
 }
}
