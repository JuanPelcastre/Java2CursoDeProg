import java.io.*;
// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class CMatrizObjsString
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

      int nFilas = 0, fila = 0;
      do
      {
        System.out.print("Número de filas de la matriz:  ");
        nFilas = Leer.datoInt();
      }
      while (nFilas < 1);       // no permitir un valor negativo
      // Matriz de cadenas de caracteres
      String[] nombre = new String[nFilas];

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
        for (fila = 0; fila < nFilas; fila++)
          flujoS.println(nombre[fila]);
      }
    }
    catch (IOException ignorada) { }
  }
}
