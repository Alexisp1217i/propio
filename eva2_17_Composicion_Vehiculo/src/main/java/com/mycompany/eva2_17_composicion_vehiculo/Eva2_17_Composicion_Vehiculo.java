/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_composicion_vehiculo;

/**
 *
 * @author nancy
 */
public class Eva2_17_Composicion_Vehiculo {

    public static void main(String[] args) {
          Vehiculo vehi = new Vehiculo();
          System.out.println(vehi);
          vehi.setMarca("Ford");
          vehi.setModelo("Mustang");
          vehi.setYear(1970);
          Motor motor = new Motor(0, 500);
          vehi.setMotor(motor);
          System.out.println(vehi);
    }
    
}
ff