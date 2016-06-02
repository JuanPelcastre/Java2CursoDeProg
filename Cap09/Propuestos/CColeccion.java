import java.util.*;

public class CColeccion
{
  // Frecuencia con la que aparecen las letras en un texto.
  TreeMap<String, Integer> a = new TreeMap<String, Integer>();
  
  boolean EstaPalabra(String spal)
  {
    return a.containsKey(spal); // No hubo coincidencias.
  }
  
  void InsertarPalabra(String spal)
  {
    if (EstaPalabra(spal))
    {
      int cont = a.get(spal) + 1;
      a.put(spal, cont);
    }
    else
      a.put(spal, 1);
  }
  
  void VisualizarColeccion()
  {
    System.out.println("\nEstadística de palabras:");
    System.out.printf("%-20s %s\n", "Palabra", "Veces");
    System.out.println("---------------------------");
    // Obtener los pares clave-valor de la agenda y mostrarlos
    Set<Map.Entry<String, Integer>> c = a.entrySet();
    Iterator it = c.iterator();
    Map.Entry<String, Integer> elem;
    while (it.hasNext())
    {
      elem = (Map.Entry<String, Integer>)it.next();
      System.out.printf("%-20s %5d\n", elem.getKey(), elem.getValue());
    }
  }
}
