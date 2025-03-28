/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_composicion;

/**
 *
 * @author nancy
 */
public class Eva2_16_Composicion {

    public static void main(String[] args) {
        Cliente client =new Cliente("alexis", "Aldaba", 18, "papaya", "turepera", 2154151);
        System.out.println(client); 
        Direccion direc = new Direccion("Tecnologico", 65465, "complejo Industrial", 6546452, "Chihuahua", "Chihuahua");
        client.setDireccion(direc);
        System.out.println(client);
        
    }
}
