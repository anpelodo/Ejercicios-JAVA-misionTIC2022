package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args)
    {
        Integer h,m,s;
        Boolean horaIncorrecta = false;
        String respuesta = "La hora indicada es ";

        Scanner input = new Scanner(System.in);

        System.out.println("Este programa revisa si la hora ingresada es valida");
        System.out.println("La hora será en formato de 24H");

        System.out.print("Ingrese las horas: ");
        h = input.nextInt();

        System.out.print("Ingrese los minutoss: ");
        m = input.nextInt();

        System.out.print("Ingrese los segundos: ");
        s = input.nextInt();

        // Revisanddo la hora
        if(h>23 || h<0 || m>59  || m<0 || s>59 || s<0){
            horaIncorrecta = true;
        }

        respuesta += horaIncorrecta==true? "inválida":"válida";

        System.out.println(respuesta);
        input.close();
    }
}
