//////////////////////////////////////////////////////////////////
// Sincronización de hilos. Sección crítica.
//
public class CBufer
{
  // Atributos
  private double[] muestra;
  private int ind = 0;
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

  public synchronized int adquirirDato(String hilo)
  {
    if (ind >= tamaño) return tamaño;
    double x = Math.random();
    System.out.println(hilo + " tomó la muestra " + ind);
    asignar(x, ind);
    ind++;
    return ind;
  }
}
//////////////////////////////////////////////////////////////////
