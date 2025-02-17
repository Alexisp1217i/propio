/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_ventas;

import ObjetosDeVentas.Productos;
import ObjetosDeVentas.Clientes;


/**
 *
 * @author nancy
 */
public class Eva1_7_VENTAS {

    public static void main(String[] args) {
        Productos produ = new Productos();
         Clientes client = new Clientes();
       
      produ.setMarca("Harina de maiz");
       produ.setNombre("Mizena");
        produ.setPrecio(20);
         produ.setClave(50221303);
          produ.setInventario(7);
         
        
 
         
             produ.imprimirDatos();
              
             
              client.setNombre("Jesus Alexis");
                    client.setApellido("Jimenez Aldaba");
                       client.setRfc("dffghnfgh");
                           client.setTipoP("Cliente Frecuente");
                               client.setEdad(18);
                                   client.setTelefono(614101846);
         
       
                client.imprimirDatos();
         
         
    }
}
