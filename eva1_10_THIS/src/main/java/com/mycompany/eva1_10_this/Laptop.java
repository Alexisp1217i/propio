/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_this;

/**
 *
 * @author nancy
 */
public class Laptop {
    private String procesador;
    private int ram;
    private int solid_disk;
    private int pantalla;
    private String marca;
    private String modelo;
    
    public Laptop(){
        this.procesador = "Ryzen";
        this.ram = 32;
        this.solid_disk = 500;
        this.pantalla = 17;
        this.marca = "Asus";
        this.modelo = "ASUS ROG Strix Scar 18";
    }
    
    public Laptop(String pro, int R, int Solid, int pant, String marc, String model){
        this.procesador = "Ryzen";
        this.ram = 32;
        this.solid_disk = 100;
        this.pantalla = 17;
        this.marca = "Asus";
        this.modelo = "ASUS ROG Strix Scar 18";
    }
    
    public void setProcesador(String valor){
        this.procesador = valor;
    
    }
    
    public String getProcesador(){
        return this.procesador;
    }
    
    public void setRam(int valor){
        this.ram = valor;
    
    }
    
    public int getRam(){
        return this.ram;
    }
    
    public void setSolidisk(int valor){
        this.solid_disk = valor;
    
    }
    
    public int getSolidisk(){
        return this.solid_disk;
    }
    
    public void setPanrtalla(int valor){
        this.pantalla = valor;
    
    }
    
    public int getPantalla(){
        return this.pantalla;
    }
    
    public void setMarca(String valor){
        this.marca = valor;
    
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setModelo(String valor){
        this.modelo = valor;
    
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    
}
