package co.edu.utp.misiontic2022.c2;
public class testReto1 {
    public static void main(String arg[])
    {
        ProyectoFiduciaria pf = new ProyectoFiduciaria();
        int tiempo;
        double monto, interes;
        String respuesta;

        // Test 1;
        tiempo = 12;
        monto = 150000;
        interes = 0.1;
        respuesta = pf.diferenciaInteresSimpleYCompuesto(
            tiempo,
            monto,
            interes);

        System.out.println("  Test 1:");
        System.out.println("Inputs:");
        System.out.println("\tTiempo = "+tiempo);
        System.out.println("\tMonto = "+monto);
        System.out.println("\tInterés = "+interes);

        System.out.println("  Output:");
        System.out.println("\n"+respuesta);

        // Test 2;
        tiempo = 0;
        monto = 150000;
        interes = 0.1;
        respuesta = pf.diferenciaInteresSimpleYCompuesto(
            tiempo,
            monto,
            interes);

        System.out.println("Test 2:");
        System.out.println("  Inputs:");
        System.out.println("\tTiempo = "+tiempo);
        System.out.println("\tMonto = "+monto);
        System.out.println("\tInterés = "+interes);

        System.out.println("  Output:");
        System.out.println("\n"+respuesta);
    }
}
