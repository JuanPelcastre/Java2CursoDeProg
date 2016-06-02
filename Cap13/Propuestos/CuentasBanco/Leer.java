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
  
  public static Short datoShort()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return null;
      }
      return Short.valueOf(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoShort();
    }
  }
  
  public static Integer datoInt()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return null;
      }
      return Integer.valueOf(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoInt();
    }
  }
  
  public static Long datoLong()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return null;
      }
      return Long.valueOf(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoLong();
    }
  }

  public static Float datoFloat()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return null;
      }
      return Float.valueOf(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoFloat();
    }
  }

  public static Double datoDouble()
  {
    try
    {
      String sdato = dato();
      if (sdato == null)
      {
        System.out.println();
        return null;
      }
      return Double.valueOf(sdato);
    }
    catch(NumberFormatException e)
    {
      System.out.print("Ese dato no es válido. Teclee otro: ");
      return datoDouble();
    }
  }
}
