import java.util.*;
/////////////////////////////////////////////////////////////////
// Aplicación que utiliza la clase genérica CVector
//
public class Test
{
  static <T1, T2> void colección_A_String(Collection<T1> a, T2[] m)
  {
    int i = 0;
    for (T1 e : a)
    {
      m[i++] = (T2)e.toString();
    }
  }
  
  // Visualizar un vector
  public static void visualizarVector(CVector v)
  {
    int ne = v.longitud();
    for (int i = 0; i < ne; i++)
      System.out.print(v.valorEn(i) + " ");
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    Double x[] = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0 }; // matriz x
    CVector<Double> vector1 = new CVector<Double>(x);
    
    CVector<Double> vector2 = new CVector<Double>(vector1);
    for (int i = 0; i < vector2.longitud(); i++)
      vector2.ponerValorEn(i, (Double)vector2.valorEn(i)*10.0);
    
    String[] m = new String[vector2.longitud()];
    colección_A_String(vector2.colección(),  m);
    for (String d : m)
      System.out.print(d + " "); // escribe 10.0 20.0 30.0 ... 70.0
    System.out.println();
  }
}
