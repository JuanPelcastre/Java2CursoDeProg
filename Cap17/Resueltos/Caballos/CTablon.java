public class CTablon
{
  private int[] m_Posicion; // posici�n de los caballos durante la carrera
  private int m_nParticipantes; // n�mero de participantes
  
  public CTablon(int participantes)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public boolean finCarrera()
  {
    for(int i = 0; i < m_nParticipantes; ++i)
    {
      if (m_Posicion[i] == 75) // distancia recorrer
        return true;           // final de la carrera
    }
    return false;              // continuar
  }
  
  public void incrementarPosicion(int dorsal)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public int posicion(int dorsal)
  {
    return (m_Posicion[dorsal]); // posici�n actual
  }
  
  public int numParticipantes()
  {
    return m_nParticipantes; // n�mero de participantes
  }
}
