public class CHipodromo
{
  public static void main(String[] args)
  {
    String nomCaballo = null;
    final int num_participantes = 5;
    
    CTablon Tablon = new CTablon(num_participantes);
    CCaballo[] participante = new CCaballo[num_participantes];
    CMarcador Marcador = new CMarcador(Tablon);
    
    // Iniciar el hilo marcador
    Marcador.start();
    for (int i = 0; i < num_participantes; ++i)
    {
      // Datos de los participantes
      nomCaballo = new String("Caballo " + i);
      participante[i] = new CCaballo(i, nomCaballo, Tablon);
      // Iniciar los hilos de los caballos participantes
      participante[i].start();
    }
  }
}