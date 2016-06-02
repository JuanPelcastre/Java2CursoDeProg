import java.io.*;
public class Leer
{
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
      return Short.MIN_VALUE; // valor más pequeño
    }
  }
  
  // Como ejercicio, complete el código según se explica en el libro

}
