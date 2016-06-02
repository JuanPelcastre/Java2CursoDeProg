import java.io.*;
public class Leer
{
  // Definir un flujo de caracteres de entrada: flujoE
  private static InputStreamReader isr = new InputStreamReader(System.in);  
  private static PushbackReader flujoE = new PushbackReader(isr);
  public static void limpiar()
  {
    int car = 0;
    try
    {
      while (flujoE.ready()) flujoE.read(); // limpiar flujoE
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
  }
  
  public static char mirar()
  {
    int car = 0;
    try
    {
      car = flujoE.read();
      flujoE.unread(car);
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return (char)car; // retornar el primer carácter disponible
  }
  
  public static String dato()
  {
    StringBuffer sdato = new StringBuffer();
    int car = 0;
    try
    {
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      while ((car = flujoE.read()) != '\r' && car != '\n' && car != -1)
        sdato.append((char)car);
      limpiar();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    if (car == -1) return null;
    return sdato.toString(); // devolver el dato tecleado
  }
  
  public static char carácter()
  {
    int car = 0;
    try
    {
      car = flujoE.read();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return (char)car; // devolver el dato tecleado
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
