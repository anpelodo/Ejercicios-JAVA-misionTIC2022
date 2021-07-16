package co.edu.utp.misiontic2022.c2;

public class ejer16 {
    public static void main( String[] args )
    {   
        var n = 'A';
        for(char i='Z'; i>=n; i--){
            for(char k=i; k>=n; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
