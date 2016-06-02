//////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CHashAbierto. Redefine
// los métodos: fa (función de acceso) y existe.
//
public class HashAbierto extends CHashAbierto
{
  public HashAbierto(int nElementos)
  {
    super(nElementos);
  }
  
  public int fa(Object obj)
  {
    return (int)((CAlumno)obj).obtenerMatrícula() % númeroDeElementos();
  }
  
  public boolean existe(Object obj1, Object obj2)
  {
    if (((CAlumno)obj1).obtenerMatrícula() ==
           ((CAlumno)obj2).obtenerMatrícula())
      return true;
    else
      return false;
  }
}
//////////////////////////////////////////////////////////////////