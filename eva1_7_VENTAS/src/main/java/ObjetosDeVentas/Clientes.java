/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosDeVentas;

/**
 *
 * @author nancy
 */
public class Clientes {
    
    private String nombre;
    private String apellido;
    private String rfc;
    private String tipoP;
    private int edad;
    private int telefono;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String valor){
        apellido = valor;
    }
    
    public String getRfc(){
        return rfc;
    }
    
    public void setRfc(String valor){
        rfc = valor;
    }
    
    public String getTipoP(){
        return tipoP;
    }
    
    public void setTipoP(String valor){
        tipoP = valor;
    }
    
    public int getEdad(){
        return edad;
    }
    
        public void setEdad(int valor){
        edad = valor;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
        public void setTelefono(int valor){
        telefono = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("------Datos del cliente:------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("RFC: " + rfc);
        System.out.println("Tipo: " + tipoP);
        System.out.println("Edad: " + edad);
        System.out.println("Numero: " + telefono);
    }
}
