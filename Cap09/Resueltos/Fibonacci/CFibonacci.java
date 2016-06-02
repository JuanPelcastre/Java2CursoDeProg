import java.util.*;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class CFibonacci
{
  static int fibonacci(int n)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  static public void main(String[] args)
  {
    int n = 0, i = 0;
    
    System.out.println("�Cu�ntos n�meros de Fibonacci, a partir " +
                       "del primero, se quieren calcular?");
    
    n = Leer.datoInt();
    
    // Crear una matriz din�micamente
    ArrayList<Integer> f = new ArrayList<Integer>();
    
    // Obtener los n�meros de la serie
    for (i = 0; i < n; i++)
      f.add(fibonacci(i));
    
    // Visualizar la matriz
    for (i = 0; i < n; i++)
      System.out.printf("%5d", f.get(i));
    System.out.println();
  }
}