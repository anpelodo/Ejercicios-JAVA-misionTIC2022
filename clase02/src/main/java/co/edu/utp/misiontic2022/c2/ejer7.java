package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejer7
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Comprueba si la letra es mayuscula");

        System.out.print("Ingrese una letra: ");
        String letra = input.nextLine();
        String Mayusletra = letra.toUpperCase();
        
        Boolean estado = letra == Mayusletra;
        System.out.println(estado);
        input.close();
    }
    
}
