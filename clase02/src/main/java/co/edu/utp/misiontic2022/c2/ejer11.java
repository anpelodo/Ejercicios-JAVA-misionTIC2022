package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer11 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el numero de un mes: ");
        int mes = input.nextInt();
        
        if(mes <1 || mes>12){
            System.out.println("\nEl valor del mes ingresado es incorrecto");
        } else {
            int diasm = totalDiasMes(mes);
            String name = numToMonth(mes);

            System.out.println("\nEl mes "+mes+" corresponde a "+name+" y tiene "+diasm+" días");
        }

        input.close();
    }

    private static int totalDiasMes(int m) {
        int meses31dias[] = { 1, 3, 5, 7, 8, 10, 12 };
        int dias = 0;

        if (m == 2) {
            dias = 28;
        } else {
            for (int i = 0; i < meses31dias.length; i++) {
                if(m==meses31dias[i]){
                    dias = 31;
                    break;
                } else {
                    dias = 30;
                }
            }
        }

        return dias;
    }

    private static String numToMonth(int m) {
        String [] meses = {
            "",
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
        };

        return meses[m];
    }
}
