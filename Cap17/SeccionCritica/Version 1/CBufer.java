//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Secci�n cr�tica.
//
public class CBufer
{
  // Atributos
  private double[] muestra;
  private int ind = 0;
  public int tama�o;
  
  // M�todos
  public CBufer(int n)
  {
    if (n < 1) n = 10;
    tama�o = n;
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
    if (ind >= tama�o) return tama�o;
    double x = Math.random();
    System.out.println(hilo + " tom� la muestra " + ind);
    asignar(x, ind);
    ind++;
    return ind;
  }
}
//////////////////////////////////////////////////////////////////
