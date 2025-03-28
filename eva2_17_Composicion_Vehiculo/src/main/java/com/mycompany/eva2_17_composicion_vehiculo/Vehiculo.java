/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_composicion_vehiculo;

/**
 *
 * @author nancy
 */
public class Vehiculo {
  private int year;   
  private String modelo;   
  private String marca;
private Motor motor;

    public Vehiculo() {
        this.year = 0;
         this.modelo = "";
          this.marca = "";
           this.motor = new Motor();
    }

    public Vehiculo(int year, String modelo, String marca) {
        this.year = year;
         this.modelo = modelo;
          this.marca = marca;
           this.motor = new Motor();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
  
  @Override
  public String toString(){
      return "Datos delo vehiculo:  \n" +
              "Marca: " + marca + "\n" +
              "Modelo: " + modelo + "\n" +
              "Year: " + year + "\n" +
              "Tipo de motor: " + motor.getTipoMotor() + "\n" +
                      "Potencia: " + motor.getPotencia();
  }
  
}
