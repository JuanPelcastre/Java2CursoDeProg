//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Hilo productor.
//
public class Productor extends Thread
{
  private CMatriz matriz;
  private boolean continuar = true;
  
  public Productor(CMatriz m) // constructor
  {
    matriz = m;
  }

  public void run()
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }

  public void terminar()
  {
    continuar = false;
  }
}
//////////////////////////////////////////////////////////////////
