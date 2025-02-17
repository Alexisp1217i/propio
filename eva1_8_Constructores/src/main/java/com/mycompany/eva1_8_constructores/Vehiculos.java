/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_constructores;

/**
 *
 * @author nancy
 */
public class Vehiculos {
      private String marca;
    private String modelo;
    private int year;
    private double precio;
    private String color;
   //CONSTRUCTORES - METODOS
    //METODOS: NO TIENEN VALOR DE RETORNO
    // MODIFICADOR DE ACCESO NOMBE DE LA CLASE(LISTA DE PARAMETROS);
    //CONSTRUCTOR DEFAULT: CONSTRUCTOR SIN PARAMETROS
     
    public  Vehiculos(){
        System.out.println("CREANDO OBJETO VEHICULO!!");
        //inicializar atributos:
        marca = "SIN MARCA";
        modelo = "Sin modelo";
        year = 0;
        precio = 0;
        color = "Sin color";
    }    
    
    public Vehiculos(String mar, String mod, int year, double pre, String col){
        marca = "SIN MARCA";
        modelo = "Sin modelo";
        year = 0;
        precio = 0;
        color = "Sin color";    
    }
    
    
    
    
    
    
    
    
    
    
    public void setMarca(String valor){
      marca = valor;
  }
    public String getMarca(){
      return marca;
  }
    public void setModelo(String valor){
     modelo = valor;
  }
    public String getModelo(){
      return modelo;
  }
    public void setYear(int valor){
      year = valor;
  }
    public int getYear(){
      return year;
  }
    public void setPrecio(double valor){
      precio = valor;
  }
    public double getPrecio(){
      return precio;
  }
    public void setColor(String valor){
      color =  valor;
    }
    public String getColor(){
      return color;
    }
    public void imprimirDatos(){
        System.out.println("Datos del Vehículo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
}

