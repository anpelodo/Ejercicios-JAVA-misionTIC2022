package co.edu.utp.misiontic2022.s2;

public class Persona {
    protected String nombre;
    protected String apellido;

    protected Persona(){

    }

    public Persona(String nombre, String apellido){
        System.out.println("Constructor de Persona");
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void imprimirNombre(){
        System.out.println(nombre+" "+apellido);
    }
}
