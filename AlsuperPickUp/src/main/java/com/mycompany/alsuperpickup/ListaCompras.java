/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alsuperpickup;

/**
 *
 * @author Alexis
 */
public class ListaCompras {
    private String[] productos;
    private int contador;

    public ListaCompras(int capacidad) {
        this.productos = new String[capacidad];
        this.contador = 0;
    }

    public void agregarProducto(String producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
            System.out.println("📋 " + producto + " agregado a la lista de compras.");
        } else {
            System.out.println("❌ Lista de compras llena.");
        }
    }

    public void mostrarLista() {
        System.out.println("\n📋 Lista de Compras:");
        if (contador == 0) {
            System.out.println("Lista vacía.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("- " + productos[i]);
            }
        }
    }

    public String[] getProductos() {
        return productos;
    }

    public int getContador() {
        return contador;
    }
}

