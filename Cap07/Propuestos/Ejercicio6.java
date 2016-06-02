import java.io.*;
import java.util.*;

public class Ejercicio6
{
  public static void main(String[] arg)
  {
    Scanner Leer = new Scanner(System.in);
    PrintStream flujoS=System.out;
    
    long n = 0, cont = 0, sumInf = 0, sumSup = 0;
    try
    {
      flujoS.print("\nEscriba un número: ");
      n = Leer.nextLong(); // Si no se introduce un número correcto, se toma 1000 por defecto
    }
    catch(InputMismatchException ex)
    {
      n = 1000;
    }
    flujoS.println("Los centros numéricos que hay entre 1 y " + n + " son:");
    for (cont = 1; cont < n; cont++)
    {
      // 'sumInf' tiene la suma de los números anteriores a 'cont'
      long temp;
      for (temp = cont + 1, sumSup = 0; sumSup < sumInf; temp++)
      {
        // 'sumSup' tiene la suma de los números posteriores a 'cont'
        sumSup += temp;
        if (sumSup == sumInf) flujoS.print(cont + " ");
      }
      sumInf += cont;
    }
  }
}
