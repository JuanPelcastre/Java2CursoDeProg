import java.util.*;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class Ejercicio01
{
  static int fibonacci(int n)
  {
    if ( n == 0 )
      return 0;
    else if ( n == 1 )
      return 1;
    else
    {
      int n1 = 0, n2 = 0, n3 = 1, i;
      for (i = 2; i <= n; i++)
      {
        n1 = n2; n2 = n3;
        n3 = n2 + n1;
      }
      return n3;
    }
  }
  
  static public void main(String[] args)
  {
    int n = 0, i = 0;
    
    System.out.println("¿Cuántos números de Fibonacci, a partir " +
      "del primero, se quieren calcular?");
    
    n = Leer.datoInt();
    
    // Crear una matriz dinámicamente
    ArrayList<Integer> f = new ArrayList<Integer>();
    
    // Obtener los números de la serie
    for (i = 0; i < n; i++)
      f.add(fibonacci(i));
    
    // Visualizar la matriz
    for (i = 0; i < n; i++)
      System.out.printf("%5d", f.get(i));
    System.out.println();
  }
}
