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
    for ( int i = 0; i < listaTeléfonos.size(); i++ )
      if (listaTeléfonos.get(i).obtenerTeléfono() == tel)
      {
        listaTeléfonos.remove(i);
        return true;
      }
    return false;
  }
  
  public int buscar(String str, int pos)
  {
    String nom;
    if (str == null) return -1;
    if (pos < 0) pos = 0;
    for ( int i = pos; i < listaTeléfonos.size(); i++ )
    {
      nom = listaTeléfonos.get(i).obtenerNombre();
      if (nom == null) continue;
      // ¿str está contenida en nom?
      if (nom.indexOf(str) > -1)
        return i;
    }
    return -1;
  }
  
  public CPersona registro(int i) throws IndexOutOfBoundsException
  {
    return listaTeléfonos.get(i);
  }
  
  public int longitud() { return listaTeléfonos.size(); }
}
