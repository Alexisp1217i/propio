/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alsuperpickup;

/**
 *
 * @author Alexis
 */
public class Pasillo {
    protected String nombre;
    protected String[] productos;

    public Pasillo(String nombre, String[] productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getProductos() {
        return productos;
    }
}

