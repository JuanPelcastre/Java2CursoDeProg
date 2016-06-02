// Matriz unidimensional

import java.util.*;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class Ejercicio5
{
  static ArrayList<Integer> m = new ArrayList<Integer>();
  
  static void CrearMatrizUni(int fi, int co)
  {
    int i, j, Num;
    for (i = 0; i < fi; i++)
    {
      for (j = 0; j < co; j++)
      {
        Num = 0;
        System.out.print("M[" + i + "][" + j + "] = ");
        Num = Leer.datoInt();
        if (Num != 0)
        {
          m.add(i); m.add(j); m.add(Num);
        }
      }
    }
  }
  
  static int Visualizar(int f, int c)
  {
    int cont, n = m.size();
    for (cont = 0; cont < n; cont += 3)
      if(m.get(cont) == f && m.get(cont+1) == c)
        return m.get(cont+2);
    return 0;
  }
  
  public static void main(String[] args)
  {
    int i, j, n, MaxFil = 3, MaxCol = 3; // 3 filas y columnas por defecto
    
    System.out.print("¿Cuántas filas tiene la matriz?: ");
    MaxFil = Leer.datoInt();
    System.out.print("¿Y cuántas columnas?: ");
    MaxCol = Leer.datoInt();
    
    System.out.println("\nIntroduzca los valores de la matriz bidimensional:");
    CrearMatrizUni(MaxFil, MaxCol);
    
    System.out.println("\n\nLa matriz es:\n");
    for (i = 0; i < MaxFil; i++)
    {
      for (j = 0; j < MaxCol; j++)
        System.out.printf("%8d", Visualizar(i, j));
      System.out.println();
    }
  }
}
