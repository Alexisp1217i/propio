/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alsuperpickup;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class AlsuperPickUp {
    public static void main(String[] args) {
        GestorPasillos gestor = new GestorPasillos();
        Carrito carrito = new Carrito(10);
        ListaCompras listaCompras = new ListaCompras(10);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Array para almacenar los productos comprados
        String[] productosComprados = new String[10];
        int contadorComprados = 0;

        do {
            System.out.println("\n🛍️ --- Bienvenido a Alsuper PickUp ---");
            System.out.println("1️⃣ Buscar Producto");
            System.out.println("2️⃣ Agregar a Lista de Compras");
            System.out.println("3️⃣ Ver Lista de Compras");
            System.out.println("4️⃣ Pasar Lista a Carrito");
            System.out.println("5️⃣ Ver Carrito");
            System.out.println("6️⃣ Vaciar Carrito");
            System.out.println("7️⃣ Finalizar Compra");
            System.out.println("8️⃣ Salir");
            System.out.print("\nElige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("\n🔍 Ingresa el nombre del producto: ");
                    String productoBuscar = scanner.nextLine();
                    gestor.buscarProducto(productoBuscar);
                    break;
                case 2:
                    System.out.print("\n➕ Ingresa el producto para la lista de compras: ");
                    String productoLista = scanner.nextLine();
                    listaCompras.agregarProducto(productoLista);
                    break;
                case 3:
                    listaCompras.mostrarLista();
                    break;
                case 4:
                    String[] productosLista = listaCompras.getProductos();
                    int cantidadLista = listaCompras.getContador();
                    for (int i = 0; i < cantidadLista; i++) {
                        carrito.agregarProducto(productosLista[i]);
                        if (productosLista[i] != null && contadorComprados < productosComprados.length) {
                            productosComprados[contadorComprados++] = productosLista[i];
                        }
                    }
                    System.out.println("\n✅ Lista de compras agregada al carrito.");
                    break;
                case 5:
                    carrito.mostrarCarrito();
                    break;
                case 6:
                    carrito.vaciarCarrito();
                    break;
                case 7:
                    carrito.generarTicket();
                    gestor.generarRecomendaciones(productosComprados);
                    carrito.vaciarCarrito();
                    break;
                case 8:
                    System.out.println("\n👋 ¡Gracias por usar Alsuper PickUp!");
                    break;
                default:
                    System.out.println("\n❌ Opción no válida.");
            }
        } while (opcion != 8);
    }
}