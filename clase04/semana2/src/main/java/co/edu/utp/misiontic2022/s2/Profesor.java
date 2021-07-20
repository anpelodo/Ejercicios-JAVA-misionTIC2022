package co.edu.utp.misiontic2022.s2;

public class Profesor extends Persona{
    public Profesor(String nombre, String apellido){
        System.out.println("Constructor de Profesor");

        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void imprimirNombre(){
        System.out.print("Profesor: ");

        // LLamando a la función de la clase padre o
        // super clase.
        super.imprimirNombre();
    }
}
