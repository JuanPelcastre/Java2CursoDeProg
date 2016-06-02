//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Secci�n cr�tica.
//
public class CBufer
{
  // Atributos
  private double[] muestra;
  public int ind = 0;
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
}
//////////////////////////////////////////////////////////////////
