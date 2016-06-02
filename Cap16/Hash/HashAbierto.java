//////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CHashAbierto. Redefine
// los m�todos: fa (funci�n de acceso) y existe.
//
public class HashAbierto extends CHashAbierto
{
  public HashAbierto(int nElementos)
  {
    super(nElementos);
  }
  
  public int fa(Object obj)
  {
    return (int)((CAlumno)obj).obtenerMatr�cula() % n�meroDeElementos();
  }
  
  public boolean existe(Object obj1, Object obj2)
  {
    if (((CAlumno)obj1).obtenerMatr�cula() ==
           ((CAlumno)obj2).obtenerMatr�cula())
      return true;
    else
      return false;
  }
}
//////////////////////////////////////////////////////////////////