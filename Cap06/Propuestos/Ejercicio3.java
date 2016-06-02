import java.io.*;
import java.util.*;

public class Ejercicio3
{
  public static void main(String[] arg)
  {
    double  x;
    double res;
    
    PrintStream filtro=System.out;
    
    filtro.print("Introduzca el valor de x: ");
    x=Leer.datoInt();
    res=3*Math.pow(x,5)-5*Math.pow(x,3)+2*x-7;
    filtro.println("Para = " + x + " 3x^5-5x^3+2x-7 = "+res);
  }
}