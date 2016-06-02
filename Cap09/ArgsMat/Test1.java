public class Test1
{
  static void MultiplicarPorDosMatriz2D(double[][] x)
  {
    for (int f = 0; f < x.length; f++)
    {
      for (int c = 0; c < x[0].length; c++)
        x[f][c] *= 2;
    }
  }

  public static void main(String[] args)
  {
    double[][] m = {{10, 20, 30}, {40, 50, 60}};
    
    MultiplicarPorDosMatriz2D(m);
    // Visualizar la matriz por filas
    for (int f = 0; f < m.length; f++)
    {
      for (int c = 0; c < m[0].length; c++)
        System.out.printf("%10.2f", m[f][c]);
      System.out.println();
    }
  }
}
