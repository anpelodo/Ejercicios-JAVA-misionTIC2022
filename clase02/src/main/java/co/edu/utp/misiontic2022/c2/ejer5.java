package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
//import java.lang.Math;

public class ejer5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculo de la hipotenusa");

        System.out.print("Ingrese el cateto 1: ");
        Float c1 = input.nextFloat();

        System.out.print("Ingrese el cateto 2: ");
        Float c2 = input.nextFloat();

        Double h = Math.sqrt(c1*c1 + c2*c2);

        System.out.println("\nEl valor de la hipotenusa es: " + h);

        input.close();
    }
}