//////////////////////////////////////////////////////////////////
// Clase asociada con un hilo.
//
public class ContadorAtras implements Runnable
{
  private Thread cuentaAtrás;
  public ContadorAtras(String nombre) // constructor
  {
    cuentaAtrás = new Thread(this);   // objeto de la clase Thread
    if (nombre != null) cuentaAtrás.setName(nombre);
    cuentaAtrás.start(); // el hilo ejecuta el método run de
  }                      // ContadorAtrás
  public ContadorAtras() { this(null); } // constructor

  public void run()
  {
    for (int i = 100000; i > 0; i--)
    {
      System.out.print("\t\t\t" + cuentaAtrás.getName() + " " + i + " \r");
    }
    System.out.println();
  }
}
//////////////////////////////////////////////////////////////////
