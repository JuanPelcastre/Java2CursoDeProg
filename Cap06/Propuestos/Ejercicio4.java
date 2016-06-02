import java.io.*;
import java.util.*;

public class Ejercicio4
{
  public static void main(String[] args)
  {
    double  x, res;
    int a,b,c;
    
    PrintStream FS=System.out;
    
    FS.print("Introduzca el valor de x: ");
    x=Leer.datoDouble();
    FS.print("Introduzca el valor de a: ");
    a=Leer.datoInt();
    FS.print("Introduzca el valor de b: ");
    b=Leer.datoInt();
    FS.print("Introduzca el valor de c: ");
    c=Leer.datoInt();
    res=a*Math.pow(x,5)-b*Math.pow(x,3)+c*x-7;
    FS.println("Para x = " + x + ", Ax^5-Bx^3+Cx-7 = "+res);
  }
}
