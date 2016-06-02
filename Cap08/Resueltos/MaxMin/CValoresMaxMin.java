import java.util.*;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class CValoresMaxMin
{
  // Obtener el máximo y el mínimo de un conjunto de valores
  public static void main(String[] args)
  {
    // Matriz de datos vacía
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
    
    // Obtener los valores máximo y mínimo

    // Como ejercicio, complete el código según se explica en el libro
}
