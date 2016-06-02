//////////////////////////////////////////////////////////////////
// Sincronización de hilos. Hilo consumidor.
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

    // Como ejercicio, complete el código según se explica en el libro

  }

  public void terminar()
  {
    continuar = false;
  }
}
//////////////////////////////////////////////////////////////////

