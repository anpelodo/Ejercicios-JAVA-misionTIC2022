package co.edu.utp.misiontic2022.s2;

public class Estudiante extends Persona{
    public Estudiante(String nombre, String apellido){
        System.out.println("Constructor de Estudiante");

        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void imprimirNombre(){
        System.out.print("Estudiante: ");
        
        // LLamando a la función de la clase padre o
        // super clase.
        super.imprimirNombre();
    }
}
