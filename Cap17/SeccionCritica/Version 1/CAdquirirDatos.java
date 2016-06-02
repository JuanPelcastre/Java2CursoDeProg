//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Trabajar con secciones cr�ticas.
//
public class CAdquirirDatos extends Thread
{
  private CBufer m;    // objeto para almacenar los datos

  public CAdquirirDatos(CBufer muestras) // constructor
  {
    m = muestras;
  }

  public void run()
  {
    int i = 0;

    do
    {
      i = m.adquirirDato(getName()); // adquirir datos
    }
    while (i < m.tama�o);
  }
}
//////////////////////////////////////////////////////////////////
