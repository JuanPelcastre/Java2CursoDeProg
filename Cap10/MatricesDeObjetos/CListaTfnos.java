import java.util.*;
/////////////////////////////////////////////////////////////////
// Definición de la clase CListaTfnos.
//
public class CListaTfnos
{
  private ArrayList<CPersona> listaTeléfonos = new ArrayList<CPersona>(); // matriz de objetos
  
  public CListaTfnos()
  {
    // Reservar espacio para 100 elementos
    listaTeléfonos.ensureCapacity(100);
  }
  
  public void añadir(CPersona objeto)
  {
    listaTeléfonos.add(objeto);
  }
  
  public boolean eliminar(long tel)
  {
    // Buscar el teléfono y eliminar registro


    // Como ejercicio, complete el código según se explica en el libro

  }
  
  public int buscar(String str, int pos)
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
  
  public CPersona registro(int i)
  {
    if (i >= 0 && i < listaTeléfonos.size())
      return listaTeléfonos.get(i);
    else
    {
      System.out.println("Índice fuera de límites");
      return null;
    }
  }
  
  public int longitud() { return listaTeléfonos.size(); }
}
