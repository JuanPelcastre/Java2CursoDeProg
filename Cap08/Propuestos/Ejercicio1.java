/* Histograna */

import java.util.*;
public class Ejercicio1
{
  public static void main(String[] args)
  {
    HashMap<Float, Integer> alumno = new  HashMap<Float, Integer>();
    
    System.out.println("Escriba los pesos de los alumnos.\n" +
            "Para terminar escriba \"fin\" y pulse [Entrar]:");
    float peso;
    int contador, i = 0;
    System.out.print("Alumno " + (i++) + ", peso: ");
    peso = Leer.datoFloat();
    while(!Float.isNaN(peso))
    {
      if (peso < 10 || peso > 100)
        // Si se introduce un peso no válido:
        System.out.println("Error: el peso no puede ser menor que 10 ni mayor que 100");
      else
      {
        contador = 0;
        if (alumno.containsKey(peso)) contador = alumno.get(peso);
        alumno.put(peso, ++contador);
      }
      System.out.print("Alumno " + (i++) + ", peso: ");
      peso = Leer.datoFloat();
    }

/*
    System.out.println("\nPeso  Número de alumnos\n" +
                       "-----------------------");
    Set<Map.Entry<Float, Integer>> a = alumno.entrySet();
    Iterator it = a.iterator();
    Map.Entry<Float, Integer> elem;
    while (it.hasNext())
    {
      elem = (Map.Entry<Float, Integer>)it.next();
      System.out.println(elem.getKey() + "   " + elem.getValue());
    }
*/
    // Otra forma:
    System.out.println("\nPeso  Número de alumnos\n" +
                       "-----------------------");
    Set<Map.Entry<Float, Integer>> a = alumno.entrySet();
    for (Map.Entry<Float, Integer> e : a)
    {
      System.out.println(e.getKey() + "   " + e.getValue());
    }
  }
}
