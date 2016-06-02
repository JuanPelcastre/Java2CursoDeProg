//////////////////////////////////////////////////////////////////
// Sincronización de hilos. Sección crítica.
//
public class CBufer
{
  // Atributos
  private double[] muestra;
  public int ind = 0;
  public int tamaño;
  
  // Métodos
  public CBufer(int n)
  {
    if (n < 1) n = 10;
    tamaño = n;
    muestra = new double[n];
  }

  public double obtener(int i)
  {
    return muestra[i];
  }

  public void asignar(double x, int i)
  {
    muestra[i] = x;
  }
}
//////////////////////////////////////////////////////////////////
