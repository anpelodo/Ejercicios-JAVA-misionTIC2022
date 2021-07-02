package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejer6 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Programa que determina si num es multiplo de 10");

        System.out.print("Ingrese un número: ");

        Integer num = input.nextInt();

        String mensaje = "El número "+ num.toString();
        mensaje += num%10==0? " es ": " no es ";
        mensaje += "múltiplo de 10";

        System.out.println(mensaje);

        input.close();
    }
}
