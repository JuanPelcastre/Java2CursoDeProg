//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Hilo consumidor.
//
public class Consumidor extends Thread
{
  private CMatriz matriz;
  private boolean continuar = true;
  
  public Consumidor(CMatriz m)  // constructor
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

