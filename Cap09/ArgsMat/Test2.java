import java.util.*;

public class Test2
{
  static void MultiplicarPorDosMatriz2D(ArrayList<ArrayList<Double>> x)
  {
    double v;
    int tamFila, nFilas = x.size();
    for (int f = 0; f < nFilas; f++)
    {
      tamFila = x.get(f).size();
      for (int c = 0; c < tamFila; c++)
      {
        v = x.get(f).get(c) * 2;
        x.get(f).set(c, v);
      }
    }
  }
  
  public static void main(String[] args)
  {
    final int k = 3;
    
    ArrayList<ArrayList<Double>> m = new ArrayList<ArrayList<Double>>();
    for (int i = 0; i < k; i++)
      m.add(new ArrayList<Double>());
    
    double v;
    for (int f = 0; f < k; f++)
    {
      for (int c = 0; c < k; c++)
      {
        v = (f+c+1) * 2;
        m.get(f).add(c, v);
      }
    }
    
    MultiplicarPorDosMatriz2D(m);
    // Visualizar la matriz por filas
    for (int f = 0; f < m.size(); f++)
    {
      for (int c = 0; c < m.get(f).size(); c++)
        System.out.printf("%10.2f", m.get(f).get(c));
      System.out.println();
    }
  }
}
