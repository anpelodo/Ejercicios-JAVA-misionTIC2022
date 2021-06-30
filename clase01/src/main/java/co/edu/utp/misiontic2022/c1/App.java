package co.edu.utp.misiontic2022.c1;
import java.util.Scanner;

public class App 
{
    public static Scanner input = new Scanner(System.in);;
    public static void main( String[] args )
    {
        Boolean loop = true;
        
        while (loop == true){
            System.out.print("Hay 5 ejercicios.\n\n" +
                "Ingrese del 1 al 5 que ejercicio desea ejecutar.\n"+
                "de lo contrario se finalizará el código.: ");

            Integer val = input.nextInt();
            
            switch (val){
                case 1:
                    ejer1();
                    break;

                case 2:
                    ejer2();
                    break;

                case 3:
                    ejer3();
                    break;

                case 4:
                    ejer4();
                    break;

                case 5:
                    ejer5();
                    break;

                default:
                    loop = false;
                    break;
            };

            System.out.println("\n----------------------------------------");
        }
        System.out.println("\nFin de la ejecución");    
        App.input.close();
        
    }

    public static void ejer1()
    {
        String nombre = "Juan Felipe";

        System.out.println("Hola "+ nombre +"!");
    }

    public static void ejer2()
    {
        System.out.println("Este programa cuenta el número de dígitos"+
                " que tiene un número entero");

        System.out.print("\nPor favor ingrese un número: ");
        Integer num = input.nextInt();
        System.out.println();
        
        Integer numDigits = num.toString().length();

        System.out.println("Hay "+numDigits+" dígito(s) en el número "+num);
    }

    public static void ejer3()
    {
        System.out.println("Este programa entrega el doble y el triple"+
                " de un número entero ingresado");

        System.out.print("\nPor favor ingrese un número: ");
        Integer num = input.nextInt();
        System.out.println();

        System.out.println(num+"*2="+num*2);
        System.out.println(num+"*3="+num*3);
    }

    public static void ejer4()
    {
        System.out.println("Este programa Convierte de grados centígrados"+
                " a grados Fahrenheit.");

        System.out.print("\nIngrese la temperatura en °C: ");
        Float centi = input.nextFloat();
        System.out.println();

        Float faren = 32.0f + (9.0f * centi / 5.0f);
        System.out.println(centi+"°C a °F = "+faren+"°F");
    }

    public static void ejer5()
    {
        System.out.println("Este programa determina si un número es par o"+
                " o impar");

        System.out.print("\nPor favor ingrese un número: ");
        Integer num = input.nextInt();
        System.out.println();
        
        String tipoStr = num%2==0? "par" : "impar";

        String mensaje = num.toString() + " es " + tipoStr;

        System.out.println(mensaje);
    }

}
