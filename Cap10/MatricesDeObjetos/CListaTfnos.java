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


    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public int buscar(String str, int pos)
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public CPersona registro(int i)
  {
    if (i >= 0 && i < listaTel�fonos.size())
      return listaTel�fonos.get(i);
    else
    {
      System.out.println("�ndice fuera de l�mites");
      return null;
    }
  }
  
  public int longitud() { return listaTel�fonos.size(); }
}
