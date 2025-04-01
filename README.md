public class Eva2_21_Polimorfismo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Animal{
    public Animal(){
        System.out.println("Animal");
    }
    public void respirarOxigeno(){
        System.out.println("Respirar oxigeno");
    }
}
class Mamifero extends Animal{
public Mamifero(){
    System.out.println("Mamifero");    
}
public void tenerPelo(){
    System.out.println("Tener pelo");
}
public void tenerSangreCaliente(){
    System.out.println("Tener Sangre Caliente");
}
}
class Reptil extends Animal{
 public Reptil(){
     System.out.println("Reptil");
 }
 public void tenerSangreFria(){
     System.out.println("Tener Sangre Fria");
 }
 
}

class Gato extends Mamifero{
    public Gato(){
        System.out.println("Gato");
    }
    public void tenerGarrasRetractiles(){
        System.out.println("Tener Garras Retractiles");
    }
}
class Serpiente extends Reptil{
  public Serpiente(){
      System.out.println("Serpiente");
  }   
  public void  seArrastra(){
      System.out.println("Se Arrastra");
  }
}
