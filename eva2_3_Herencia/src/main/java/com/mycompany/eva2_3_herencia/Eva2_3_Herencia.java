/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_herencia;

/**
 *
 * @author nancy
 */
public class Eva2_3_Herencia {

    public static void main(String[] args) {
    Empleado empleado = new Empleado();
       empleado.setNombre("Jesus Alexis");
          System.out.println("Nombre: " + empleado.getNombre());
          
          empleado.setNumeroEmpleado(1000);
          System.out.println("Numero de Empleado: " + empleado.getNumeroEmpleado());
  //Proveedor
        System.out.println("-------------------");   
  Proveedor prove = new Proveedor();

  prove.setNombre("Walmart");
        System.out.println("Nombre: " + prove.getNombre());
        
     prove.setCredito(false);
        System.out.println("Credito: " + prove.getCredito());
  
          //Cliente
         System.out.println("-------------------");
          Cliente client = new Cliente();
          client.setNombre("JUAN");
          System.out.println("Nombre: " + client.getNombre());
          client.setRazonSocial("Cobrando algo creo o no se");
          System.out.println("Razon Social: " + client.getRazonSocial());
          
          
    }
}
