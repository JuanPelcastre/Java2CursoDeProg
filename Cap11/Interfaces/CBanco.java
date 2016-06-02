import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CBanco: clase que mantiene una matriz de referencias a
// objetos de cualquier tipo de cuenta bancaria.
//
public class CBanco
{
  // Matriz de objetos
  private ArrayList<CCuenta> cuentas = new ArrayList<CCuenta>();
  
  public CBanco()
  {
    // Reservar espacio para 100 elementos (elementos iniciales: cero)
    cuentas.ensureCapacity(100);
  }
  
  public void añadir(CCuenta obj)
  {
    // Añadir un objeto a la matriz
    cuentas.add(obj);
  }

  public boolean asignar( int i, CCuenta objeto )
  {
    // Asignar al elemento i de la matriz, un nuevo objeto
    if (i >= 0 && i < cuentas.size())
    {
      cuentas.set(i, objeto);
      return true;      
    }
    else
    {
      System.out.println("Índice fuera de límites");
      return false;      
    }
  }
  
  public CCuenta obtener( int i )
  {
    // Devolver la referencia al objeto i de la matriz
    if (i >= 0 && i < cuentas.size())
      return cuentas.get(i);
    else
    {
      System.out.println("Índice fuera de límites");
      return null;
    }
  }
  
  public boolean eliminar(String s)
  {
    // Buscar la cuenta y eliminar el objeto
    for ( int i = 0; i < cuentas.size(); ++i )
      if (s.compareTo(cuentas.get(i).obtenerCuenta()) == 0)
      {
        cuentas.remove(i);
        return true;
      }
    return false;
  }
  
  public int buscar(String str, int pos)
  {
    // Buscar un objeto y devolver su posición
    String nom, cuen;
    if (str == null) return -1;
    if (pos < 0) pos = 0;
    for ( int i = pos; i < cuentas.size(); i++ )
    {
      // Buscar por el nombre
      nom = cuentas.get(i).obtenerNombre();
      if (nom == null) continue;
      // ¿str está contenida en nom?
      if (nom.indexOf(str) > -1)
        return i;
      // Buscar por la cuenta
      cuen = cuentas.get(i).obtenerCuenta();
      if (cuen == null) continue;
      // ¿str está contenida en cuen?
      if (cuen.indexOf(str) > -1)
        return i;
    }
    return -1;
  }
  
  public int longitud() { return cuentas.size(); }
}
//////////////////////////////////////////////////////////////////
