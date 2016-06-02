import java.util.*;
import java.io.*;

public class CMapa
{
  // Frecuencia con la que aparecen las letras en un texto.
  public static void main(String[] args)
  {
    // Mapa c inicialmente vacío
    HashMap<Character, Integer> c = new HashMap<Character, Integer>();

    char car; // clave
    int v;    // valor
    final char eof = (char)-1;

    // Iniciar el mapa
    for (car = 'a'; car <= 'z'; car++) c.put(car, 0);

    // Entrada de datos y cálculo de la tabla de frecuencias
    System.out.println("Introducir un texto.");
    System.out.println("Para finalizar pulsar [Ctrl][z]\n");
    try
    {
      // Leer el siguiente carácter del texto y contabilizarlo
      while ((car = (char)System.in.read()) != eof)
      {

        // Como ejercicio, complete el código según se explica en el libro

      }
    }
    catch (IOException ignorada) {}
    
    // Mostrar la tabla de frecuencias
    System.out.println("\n");
    // Visualizar una cabecera "a b c ... "
    for (car = 'a'; car <= 'z'; car++)
      System.out.print("  " + car);
    System.out.println("\n ------------------------------------" +
    "-----------------------------------------");
    // Visualizar la frecuencia con la que han aparecido los caracteres
    for (car = 'a'; car <= 'z'; car++)
      System.out.printf("%3d", c.get(car));
    System.out.println();
  }
}
