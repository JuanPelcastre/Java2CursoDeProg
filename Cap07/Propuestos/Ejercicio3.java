import java.io.*;
import java.util.*;

public class Ejercicio3
{
  public static void main(String[] arg)
  {
    Scanner Leer = new Scanner(System.in);
    PrintStream flujoS = System.out;
    int dd, mm, aaaa, ddo, resto, tarot;
    
    flujoS.println("Si tecleas tu fecha de nacimiento, te calculo tu n�mero de Tarot");
    do
    {
      flujoS.print("D�a:  ");
      dd = Leer.nextInt();
    }
    while (dd < 1 || dd > 31); // leer el d�a mientras no sea correcto
    // (se supone que los d�as 29, 30 y 31 son posibles)
    do
    {
      flujoS.print("Mes:  ");
      mm  = Leer.nextInt();
    }
    while (mm < 1 || mm > 12); // leer el mes mientras no sea correcto
    
    do
    {
      flujoS.print("A�o:  ");
      aaaa = Leer.nextInt();
    }
    while (aaaa < 1000 || aaaa > 9000); // leer el a�o
    
    tarot = dd + mm + aaaa;
    
    while (tarot > 9)
    {
      ddo = tarot;
      tarot = 0;
      do
      {
        resto = ddo % 10;
        tarot += resto;
        ddo = ddo / 10;
      }
      while (ddo != 0);
    }
    
    flujoS.println("\nSu n�mero de Tarot es: " + tarot);
  }
}
