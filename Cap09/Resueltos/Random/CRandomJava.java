import java.util.*;

public class CRandomJava
{
  public static double rnd(int[] random)
  {
    random[0] = (25173 * random[0] + 13849) % 65536;
    return ((double)random[0] / 65535);
  }
  
  // Obtener n�meros dentro de un rango
  public static void main(String[] args)
  {
    int inicio = (int)((new Date()).getTime()%65536); // semilla
    int[] random = {inicio}; // random = n�mero entre 0 y 65535
    int l�miteSup = 49, l�miteInf = 1;
    int n[] = new int[6], i, k;
    
    for (i = 0; i < n.length; i++)
    {

      // Como ejercicio, complete el c�digo seg�n se explica en el libro

    }
    // Clasificar la matriz
    Arrays.sort(n);
    // Mostrar la matriz
    for (i = 0; i < n.length; i++)
      System.out.print(n[i] + " ");
    System.out.println();
  }
}
