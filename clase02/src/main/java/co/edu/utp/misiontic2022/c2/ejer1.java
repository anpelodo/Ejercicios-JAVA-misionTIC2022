package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Número de la suerte!");
        System.out.println("Este se calcula con su fecha de nacimiento");
        
        System.out.print("\tIngrese el Día: ");
        int dia = input.nextInt();

        System.out.print("\tIngrese el Mes: ");
        int mes = input.nextInt();

        System.out.print("\tIngrese el Año: ");
        int year = input.nextInt();

        Integer suerte = numSuerte(dia, mes, year);
        System.out.println("\n\tEl número de la suerte es: " + suerte);
        input.close();
    }


    private static int numSuerte(Integer day, Integer month, Integer  year)
    {
        Integer sumaFechas = day + month + year;
        
        // Separación de los dígitos
        Integer digits[] = digitos(sumaFechas);

        // Suma de los dígitos
        int acum = 0;
        for(int i=0; i<digits.length; i++){
            acum += digits[i];
        }

        return acum;
    }

    private static Integer[] digitos(Integer num){
        int numLen = num.toString().length();
        Integer digitos[] = new Integer[numLen];

        for(int i=0; i<numLen; i++){
            digitos[i] = num%10;
            num /= 10;
        }

        return digitos;
    }
}