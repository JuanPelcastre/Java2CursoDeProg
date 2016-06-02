import java.io.*;
import java.util.*;

class Ejercicio4
{
  public static void main(String[] args)
  {
    Scanner Leer = new Scanner(System.in);
    PrintStream flujoS = System.out;
    
    final int cols = 80;
    int a = 0, b = 1, c;
    int filas;
    
    do
    {
      flujoS.print("Número de filas entre 11 y 20: ");
      filas = Leer.nextInt();
    }
    while (filas < 11 || filas > 20);
    
    for (c = 1; c < filas; c++)
    {
      int despl, d;
      flujoS.println(); // pone el cursor en una línea nueva
      for (despl = cols/4 - b; despl >= 0; despl--)
        flujoS.print("  "); // desplaza el cursor lo necesario a la derecha
      for(d = 1; d <= b; d++)
      {
        // Imprime números hasta el centro del triángulo
        a++;
        if(a > 9) a = 0;
        flujoS.print(a + " ");
      }
      for(d = 1; d < b; d++)
      {
        // Imprime números hasta el final del triángulo
        a--;
        if(a < 0) a = 9;
        flujoS.print(a + " ");
      }
      b++;
    }
    flujoS.println();
  }
}
