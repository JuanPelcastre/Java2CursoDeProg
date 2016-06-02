import java.util.*;
import java.io.*;

public class CArrayListObjsString
{
  public static void main(String[] args)
  {
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      
      // Definir una referencia al flujo estándar de salida: flujoS
      PrintStream flujoS = System.out;
      
      int fila = 0;
      // Matriz de cadenas de caracteres
      ArrayList<String> nombre = new ArrayList<String>();
      String snombre;
      
      System.out.println("Escriba los nombres que desea introducir.");
      System.out.println("Puede finalizar pulsando las teclas [Ctrl][Z].");


      // Como ejercicio, complete el código según se explica en el libro


      char respuesta;
      do
      {
        flujoS.print("¿Desea visualizar el contenido de la matriz? (s/n): ");
        respuesta = ((flujoE.readLine()).toLowerCase()).charAt(0);
      }
      while (respuesta != 's' && respuesta != 'n');
      if ( respuesta == 's' )
      {
        // Visualizar la lista de nombres
        flujoS.println();
        for (fila = 0; fila < nombre.size(); fila++)
          flujoS.println(nombre.get(fila));
      }
    }
    catch (IOException ignorada) { }
  }
}
