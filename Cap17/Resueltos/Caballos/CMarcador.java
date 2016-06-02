public class CMarcador extends Thread
{
  private CTablon m_Tablon; // acceso al tablón
  
  public CMarcador(CTablon Tablon)
  {
    m_Tablon = Tablon;
  }
  
  public void run()
  {
    int nParticipantes;
    nParticipantes = m_Tablon.numParticipantes();
    while(!m_Tablon.finCarrera())
    {
      System.out.println("POSICIONES DE CARRERA");
      System.out.println("---------------------");
      for (int i = 0; i < nParticipantes; ++i)
      {
        for (int p = 0; p < m_Tablon.posicion(i)-1; ++p)
          System.out.print("."); // distancia recorrida
        System.out.println("*"); // * = caballo
      }
      try
      {
        sleep(500);
      }
      catch(InterruptedException e) {};
    }
  }
}
