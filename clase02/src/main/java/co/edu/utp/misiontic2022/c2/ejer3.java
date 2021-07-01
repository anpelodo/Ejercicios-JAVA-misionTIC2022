package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Este programa recibe un número entero y elimina"+
            " N cifras menos significativas");

        System.out.print("Ingrese un número entero: ");
        Integer num = input.nextInt();

        System.out.print("Ingrese N: ");
        Integer n = input.nextInt();

        if(n>0){
            for(int i=0; i<n; i++){
                num /= 10;
            }
        }

        System.out.print("El nuevo número es: " + num);

        input.close();
    }
}
