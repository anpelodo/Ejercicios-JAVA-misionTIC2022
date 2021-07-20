package co.edu.utp.misiontic2022.s2;

public class App 
{
    public static void main( String[] args )
    {
        Persona objetoPersona = new Persona("Oscar", "Yepes");
        Persona objetoEstudiante = new Estudiante("Laura", "Bayardo");
        Persona objetoProfesor = new Profesor("Francisco", "Perdomo");

        objetoPersona.imprimirNombre();
        objetoEstudiante.imprimirNombre();
        objetoProfesor.imprimirNombre();
    }
}
