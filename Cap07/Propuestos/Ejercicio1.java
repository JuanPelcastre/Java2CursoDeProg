import java.io.*;
import java.util.*;

public class Ejercicio1
{
  public static void main(String args [])
  {
    int x, y, suma = 0;
    PrintStream flujoS = System.out;
    Scanner Leer = new Scanner(System.in);
    
    do
    {
      flujoS.print("Introduce x: ");
      x = Leer.nextInt();
    }
    while (x < 0);
    do
    {
      flujoS.print("Introduce y: ");
      y  =  Leer.nextInt();
    }
    while (y < 0);
    
    if (y < x)
    {
      int z = x;
      x = y;
      y = z;
    }
    for(int i = x;i < y;i++)
    {
      if (i%5 == 0)
        suma +=  i;
    }
    flujoS.println("Suma: " + suma);
  }
}
