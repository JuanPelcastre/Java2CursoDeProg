import java.io.*;
// Se utiliza también la clase Leer modificada en este capítulo

public class CrearListaTfnos
{
  public static void crearFichero(File fichero)
    throws IOException
  {
    PrintStream flujoS = System.out; // salida estándar
    ObjectOutputStream oos = null;// salida de datos hacia el fichero
    char resp;
    try
    {
      // Crear un flujo hacia el fichero que permita escribir
      // objetos y datos de tipos primitivos.

      // Como ejercicio, complete el código según se explica en el libro

      // Declarar los datos a escribir en el fichero
      String nombre, dirección;
      long teléfono;
      // Leer datos de la entrada estándar y escribirlos
      // en el fichero
      do
      {

        // Como ejercicio, complete el código según se explica en el libro

            
        flujoS.print("¿desea escribir otro registro? (s/n) ");
        resp = Leer.carácter();
        Leer.limpiar();
      }
      while (resp == 's');
    }
    finally
    {
      // Cerrar el flujo
      if (oos != null) oos.close();
    }
  }

  public static void main(String[] args)
  {
    PrintStream flujoS = System.out; // salida estándar
    String nombreFichero = null;     // nombre del fichero
    File fichero = null; // objeto que identifica el fichero
    
    try
    {
      // Crear un objeto File que identifique al fichero
      flujoS.print("Nombre del fichero: ");
      nombreFichero = Leer.dato();
      fichero = new File(nombreFichero);
      
      // Verificar si el fichero existe
      char resp = 's';
      if (fichero.exists())
      {
        flujoS.print("El fichero existe ¿desea sobreescribirlo? (s/n) ");
        resp = Leer.carácter();
        Leer.limpiar();
      }
      if (resp == 's')
      {
        crearFichero(fichero);
      }
    }
    catch(IOException e)
    {
      flujoS.println("Error: " + e.getMessage());
    }
  }
}
