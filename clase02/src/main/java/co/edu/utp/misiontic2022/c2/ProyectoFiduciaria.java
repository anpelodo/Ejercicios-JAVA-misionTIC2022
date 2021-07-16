/* Universidad Tecnológica de Pereira
 * (Pereira, Risaralda - Colombia) 
 * */
package co.edu.utp.misiontic2022.c2;
import java.lang.Math;


/*
 * Clase que representa un Proyecto.
 */
public class ProyectoFiduciaria
{
    private int tiempo;
    private double monto;
    private double intereses;

    public String diferenciaInteresSimpleYCompuesto (
        int pTiempo,
        double pMonto,
        double pInteres)
    {   
        String respuesta="";
        double diff;
        /* Verificacion sobre los valores de capital, monto e 
        Intereses */
        if(pTiempo<=0 || pMonto<=0.0 || pInteres<= 0.0){
            respuesta = 
                "Faltan datos para calcular la diferencia en el total"+
                " de intereses generados para el proyecto.";
        } else {
            this.tiempo=pTiempo;
            this.monto=pMonto;
            this.intereses=pInteres;

            /* Cálculo de la diferencia entre tipos de tasas */
            diff = calcularInteresCompuesto() - calcularInteresSimple();

            respuesta = "La diferencia en el total de intereses "+
                "generados para el proyecto, si escogemos entre "+
                "evaluarlo a una tasa de interés Compuesto y "+
                "evaluarlo a una tasa de interés Simple, asciende "+
                "a la cifra de: $"+ diff;
        }

        return respuesta;
    }

    private double calcularInteresSimple()
    {
        double simple=monto*intereses*tiempo;

        return simple;
    }

    private double calcularInteresCompuesto()
    {
        double compuesto=monto*(Math.pow(1.0+intereses,tiempo)-1.0);

        return compuesto;
    }
}