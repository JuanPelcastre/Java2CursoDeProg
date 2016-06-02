import java.util.*;
/////////////////////////////////////////////////////////////////
// Definici�n de la clase CListaTfnos.
//
public class CListaTfnos
{
  private ArrayList<CPersona> listaTel�fonos = new ArrayList<CPersona>(); // matriz de objetos
  
  public CListaTfnos()
  {
    // Reservar espacio para 100 elementos
    listaTel�fonos.ensureCapacity(100);
  }
  
  public void a�adir(CPersona objeto)
  {
    listaTel�fonos.add(objeto);
  }
  
  public boolean eliminar(long tel)
  {
    // Buscar el tel�fono y eliminar registro
    for ( int i = 0; i < listaTel�fonos.size(); i++ )
      if (listaTel�fonos.get(i).obtenerTel�fono() == tel)
      {
        listaTel�fonos.remove(i);
        return true;
      }
    return false;
  }
  
  public int buscar(String str, int pos)
  {
    String nom;
    if (str == null) return -1;
    if (pos < 0) pos = 0;
    for ( int i = pos; i < listaTel�fonos.size(); i++ )
    {
      nom = listaTel�fonos.get(i).obtenerNombre();
      if (nom == null) continue;
      // �str est� contenida en nom?
      if (nom.indexOf(str) > -1)
        return i;
    }
    return -1;
  }
  
  public CPersona registro(int i) throws IndexOutOfBoundsException
  {
    return listaTel�fonos.get(i);
  }
  
  public int longitud() { return listaTel�fonos.size(); }
}
