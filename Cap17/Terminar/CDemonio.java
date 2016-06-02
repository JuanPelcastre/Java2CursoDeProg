//////////////////////////////////////////////////////////////////
// Hilo demonio. Suena "bip" aproximadamente cada segundo
//
public class CDemonio extends Thread
{
  public CDemonio()
  {
    setDaemon(true);
    start();
  }
  
  public void run()
  {
    char bip = '\u0007';
    while (true)
    {
      try
      {
        sleep(1000); // duerme durante 1 segundo
      }
      catch (InterruptedException e) {}
      System.out.print(bip);
    }
  }
}
//////////////////////////////////////////////////////////////////
