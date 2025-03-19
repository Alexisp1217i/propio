/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alsuperpickup;

/**
 *
 * @author Alexis
 */
public class Carrito {
    private String[] productos;
    private int contador;

    public Carrito(int capacidad) {
        productos = new String[capacidad];
        contador = 0;
    }

    // Agregar productos al carrito
    public void agregarProducto(String producto) {
        if (producto != null && contador < productos.length) {
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("❌ No se puede agregar el producto. El carrito está lleno o el producto es nulo.");
        }
    }

    // Mostrar el carrito
    public void mostrarCarrito() {
        if (contador == 0) {
            System.out.println("\n❌ El carrito está vacío.");
        } else {
            System.out.println("\n🛒 --- Productos en el carrito ---");
            for (int i = 0; i < contador; i++) {
                System.out.println("- " + productos[i]);
            }
        }
    }

    // Vaciar el carrito
    public void vaciarCarrito() {
        contador = 0;
        System.out.println("\n✅ El carrito ha sido vaciado.");
    }

    // Generar el ticket de compra
    public void generarTicket() {
        if (contador == 0) {
            System.out.println("\n❌ El carrito está vacío, no hay compra que procesar.");
            return;
        }

        System.out.println("\n🎟️ --- TICKET DE COMPRA ---");
        System.out.println("Productos comprados:");
        double total = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + productos[i]);
            total += 10;  // Supongamos que cada producto cuesta 10
        }
        System.out.println("\nTotal: $" + total);
        System.out.println("¡Gracias por tu compra!");
    }

    public String[] getProductos() {
        return productos;
    }

    public int getContador() {
        return contador;
    }
}