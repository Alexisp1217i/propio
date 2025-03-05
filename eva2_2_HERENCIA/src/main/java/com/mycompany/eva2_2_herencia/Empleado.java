/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author nancy
 */
public class Empleado {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    private int numeroEmpleado;

    public Empleado(){
     nombre = "---";
     apellidoPaterno = "---";
     apellidoMaterno = "---";
     edad = 0 ;
     rfc = "---";
     numeroEmpleado = 0 ;
    }

    public Empleado(String nombre,String apellidoPaterno,String apellidoMaterno,int edad,String rfc,int numeroEmpleado){
     this.nombre = "Jesus Alexis";
     this.apellidoPaterno = "Jimenez";
     this.apellidoMaterno = "Aldaba";
     this.edad = 18;
     this.rfc = "vffgrgrgrg";
     this.numeroEmpleado = 18181818 ;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
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

    public int getNumeroEmpleado() {
        return numeroEmpleado;
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

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    
    
}
