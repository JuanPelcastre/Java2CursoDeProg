import java.io.*;
import java.util.*;

public class Ejercicio2
{
  public static void main(String args[])
  {
    Scanner Leer = new Scanner(System.in);
    PrintStream flujoS = System.out;
    
    int b = 0, a = 0;
    int aux = 0;
    double x, y, suma = 0;
    
    do
    {
      flujoS.print("Introduce el valor de x: ");
      x = Leer.nextDouble();
    }
    while (x < 0);
    
    do
    {
      flujoS.print("Introduce el valor de y: ");
      y = Leer.nextDouble();
    }
    while (y < 0);
    
    do
    {
      flujoS.print("Introduce el valor de b: ");
      b = Leer.nextInt();
    }
    while (b < 0);
    
    if (b < a)
    {
      aux = a;
      a = b;
      b = aux;
    }
    
    for(a = 0;a < b;a++)
    {
      suma +=  1/(x+a*y);
    }
    flujoS.println("La suma es " + suma);
  }
}
