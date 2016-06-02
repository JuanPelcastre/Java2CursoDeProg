//////////////////////////////////////////////////////////////////
// Clase asociada con un hilo.
//
public class ContadorAtras implements Runnable
{
  private Thread cuentaAtr�s;
  public ContadorAtras(String nombre) // constructor
  {
    cuentaAtr�s = new Thread(this);   // objeto de la clase Thread
    if (nombre != null) cuentaAtr�s.setName(nombre);
    cuentaAtr�s.start(); // el hilo ejecuta el m�todo run de
  }                      // ContadorAtr�s
  public ContadorAtras() { this(null); } // constructor

  public void run()
  {
    for (int i = 100000; i > 0; i--)
    {
      System.out.print("\t\t\t" + cuentaAtr�s.getName() + " " + i + " \r");
    }
    System.out.println();
  }
}
//////////////////////////////////////////////////////////////////
