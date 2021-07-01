package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Conversor Km/h a m/s");

        System.out.print("Ingrese los Km/h: ");
        Float kmh = input.nextFloat();
        
        /* ms = kmh *1000[m]/3600[s]
         * ms = kmh * 10/36
         * ms = kmh * 5/18 */
        Float ms = kmh*5/18.0f;
        System.out.print(kmh + "Km/h a m/s = " + ms + "m/s");

        input.close();
    }
}
