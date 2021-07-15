package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] arg) 
    {
        Scanner input = new Scanner(System.in);
        
        int n = 3;
        Integer nums[] = new Integer[n];

        System.out.println("Ingrese 3 número enteros");

        for (int i = 0; i<n; i++){
            nums[i] = input.nextInt();
        }

        int max = nums[0];
        for (int i=1; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("El número máximo es: "+max);

        input.close();
    }
}
