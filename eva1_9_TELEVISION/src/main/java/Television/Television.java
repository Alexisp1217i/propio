/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Television;

/**
 *
 * @author nancy
 */
public class Television {
      private boolean encendido;
     private int volumen;
     private int canal;
     
    
    
     public Television(){
         System.out.println("Creando objeto tipo Television!!!!!");
         encendido = false;
         volumen = 10;
         canal = 3;
     }
     
     public Television(boolean On, int vol, int canal){
          System.out.println("Creando objeto tipo Television!!!!!");
         encendido = false;
         volumen = 10;
         canal = 3;
     }
     public void encenderApagar(){
         if (encendido == true)//Encendido la TV
             encendido = false;//Apagada la TV
         else
             encendido = true;
     }
     public void imprimirDatos(){
         if(encendido == true)
             System.out.println("TV encendida!!");
         else 
             System.out.println("TV apagada");
         System.out.println("Volumen: " + volumen);
         System.out.println("canal: " + canal);
     }
     //VOLUMEN SON 2 METODOS: subir y bajar volumen
     public void subirVolumen(){
         if((volumen < 100) && (encendido == false))
         volumen += 5; //acumulador volumen = volumen + 5;
         
     }
     public void bajarVolumen(){
                if((volumen > 0) && (encendido == true))
         volumen -= 5; //acumulador volumen = volumen + 5;
         
     }
     
     public void subirCanal(){
                 if (encendido == true)
                     if(canal == 10)
                         canal = 0;
         else
                 canal += 1;
     }
     public void bajarCanal(){
                if(encendido == false)
                   if(canal == 0)
                       canal = 10;
                    canal -= 1;
           
     }
     public void setCanal(int valor){
         canal = valor;
     }
     

}