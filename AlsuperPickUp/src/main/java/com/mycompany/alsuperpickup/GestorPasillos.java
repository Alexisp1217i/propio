/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alsuperpickup;

/**
 *
 * @author Alexis
 */
public class GestorPasillos {
    private Pasillo[] pasillos;

    public GestorPasillos() {
        pasillos = new Pasillo[16];
        pasillos[0] = new PasilloFrutas();
        pasillos[1] = new PasilloCarnes();
        for (int i = 2; i < pasillos.length; i++) {
            pasillos[i] = null;
        }
    }

    public void buscarProducto(String producto) {
        boolean encontrado = false;
        for (Pasillo pasillo : pasillos) {
            if (pasillo != null) {
                for (String p : pasillo.getProductos()) {
                    if (p.equalsIgnoreCase(producto)) {
                        System.out.println("\n✅ " + producto + " está en el pasillo: " + pasillo.getNombre());
                        encontrado = true;
                        break;
                    }
                }
            }
            if (encontrado) {
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\n❌ Producto no encontrado.");
        }
    }

    // Método para generar recomendaciones basadas en la compra anterior
    public void generarRecomendaciones(String[] productosComprados) {
        System.out.println("\n🔄 --- Recomendaciones basadas en tu compra anterior ---");

        // Verificamos que no haya productos nulos
        boolean compróFrutas = false;
        boolean compróCarnes = false;

        // Verificar cada producto comprado para evitar NPE
        for (String producto : productosComprados) {
            if (producto != null) {
                if (producto.contains("Manzana") || producto.contains("Plátano") || producto.contains("Naranja")) {
                    compróFrutas = true;
                }
                if (producto.contains("Pollo") || producto.contains("Res") || producto.contains("Cerdo")) {
                    compróCarnes = true;
                }
            }
        }

        if (compróFrutas) {
            System.out.println("\n🍊 Recomendamos agregar más frutas como Uva, Mandarina o Kiwi.");
        }

        if (compróCarnes) {
            System.out.println("\n🥩 Recomendamos agregar más carnes como Pescado o Cordero.");
        }

        if (!compróFrutas && !compróCarnes) {
            System.out.println("\n🔄 Te sugerimos explorar productos en otras categorías.");
        }
    }
 }