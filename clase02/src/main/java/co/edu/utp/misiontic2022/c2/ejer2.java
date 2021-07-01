package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Este programa calcula el precio "+
            "de venta de un producto");

        System.out.print("Ingrese el precio por unidad (sin IVA): ");
        Float precio = input.nextFloat();

        System.out.print("Ingrese la cantidad: ");
        Integer cantidad = input.nextInt();

        System.out.print("Ingrese el porcentaje del IVA (19%): ");
        Integer iva = input.nextInt();

        Float total = precioVenta(precio, cantidad, iva);

        System.out.println("El precio de venta es de " + total);

        input.close();
    }

    private static Float precioVenta(Float precio, Integer cantidad, Integer iva)
    {
        Float total = precio*cantidad;
        total *= (iva+100)/100.0f;
        return total;
    }
    
}
