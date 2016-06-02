public class CCaballo extends Thread
{
  private CTablon Tablon; // acceso al tablón
  private int dorsal;     // número de caballo
  private String nombre;  // nombre del caballo
  
  public CCaballo()
  {
    nombre = new String("Caballo desconocido");
    dorsal = 0;
  }
  
  public CCaballo(int dor, String nom, CTablon t)
  {
    dorsal = dor;
    nombre = nom;
    Tablon = t;
  }
  
  public void run()
  {
    int limiteInf = 1, limiteSup = 1000; // milisegundos
    while(!Tablon.finCarrera())
    {
      try
      {
        sleep((int)((limiteSup-limiteInf+1) * Math.random() + limiteInf));
      }
      catch(InterruptedException e) {};
      // Avanzar
      Tablon.incrementarPosicion(dorsal);
    }
  }
}
