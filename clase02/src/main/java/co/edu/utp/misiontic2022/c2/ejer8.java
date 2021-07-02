package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el numero a: ");
        float a = input.nextFloat();

        System.out.print("Ingrese el numero b: ");
        float b = input.nextFloat();

        Float ans = a/b;

        System.out.println(a+"/"+b+" = "+ans);

        input.close();
    }
}
