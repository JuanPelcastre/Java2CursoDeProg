import java.util.*;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class CValoresMaxMin
{
  // Obtener el m�ximo y el m�nimo de un conjunto de valores
  public static void main(String[] args)
  {
    // Matriz de datos vac�a
    ArrayList<Float> dato = new ArrayList<Float>();
    
    System.out.println("Introducir los valores.\n" +
                       "Para finalizar pulse [Entrar]");
    int i = 0;
    System.out.print("dato[" + (i++) + "] = ");
    float valor = Leer.datoFloat();
    while (!Float.isNaN(valor))
    {
      dato.add(valor);
      System.out.print("dato[" + (i++) + "] = ");
      valor = Leer.datoFloat();
    }
    
    // Obtener los valores m�ximo y m�nimo

    // Como ejercicio, complete el c�digo seg�n se explica en el libro
}
