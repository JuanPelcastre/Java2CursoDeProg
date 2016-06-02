import java.util.*;

public class CAlumno
{
  private long DNI;
  private String nombre;
  private String direccion;
  private ArrayList<CAsignatura> asignatura;
  
  public CAlumno(long dni, String nom, String dir)
  {
    asignarDNI(dni);
    asignarNombre(nom);
    asignarDireccion(dir);
    asignatura = new ArrayList<CAsignatura>(10);
  }
  
  public CAlumno(final CAlumno x)
  {
    copiar(x);
  }
  
  public CAlumno copiar(final CAlumno x)
  {
    // Eliminar las asignaturas del objeto CAlumno destino (*this)
    if (asignatura.size() != 0)
    {
      // Eliminar todos los elementos de la matriz asignatura
      asignatura.clear();
    }
    
    // Copiar el alumno origen, x, en el alumno destino
    DNI = x.DNI;
    nombre = new String(x.nombre);
    direccion = new String(x.direccion);
    for (int i = 0; i < x.asignatura.size(); i++)
      asignatura.add(new CAsignatura(x.asignatura.get(i)));
    
    return this;
  }
  
  public void asignarDNI(long dni)
  {
    if (dni < 0)
    {
      System.out.println("error: DNI no válido");
      dni = 0;
    }
    DNI = dni;
  }
  
  public long obtenerDNI()
  {
    return DNI;
  }
  
  public void asignarNombre(String nom)
  {
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }
  
  public void asignarDireccion(String dir)
  {
    direccion = dir;
  }
  
  public String obtenerDireccion()
  {
    return direccion;
  }
  
  public CAsignatura obtenerAsignatura(int i)
  {
    if (numeroAsignaturas() == 0) return null;
    if (i >= 0 && i < numeroAsignaturas())
      return asignatura.get(i);
    else
    {
      System.out.println("error: índice fuera de límites");
      return null;
    }
  }
  
  public void añadirAsignatura(CAsignatura asig)
  {
    asignatura.add(asig);
  }
  
  public boolean estaEnActa(int id, int[] i)
  {
    // En i se devuelve la posición de la asignatura id en la lista
    if (numeroAsignaturas() == 0) return false;
    // Un alumno pertenece al acta de la asignatura id si se ha
    // matriculado, aún no ha aprobado y no excede el número
    // de convocatorias.
    for (i[0] = 0; i[0] < numeroAsignaturas(); i[0]++)
    {
      CAsignatura asig = obtenerAsignatura(i[0]);
      if (asig.obtenerID() != id) continue;
      int nconv = asig.convocatoriasConsumidas();
      if (nconv > 0)
        if (asig.obtenerConvocatoria(nconv).obtenerNota() >= 5)
          return false;
      if (nconv == 6)
      {
        System.out.println("error: convocatorias agotadas");
        break;
      }
      return true; // está en el acta.
    }
    return false;  // no está en el acta.
  }
  
  public int numeroAsignaturas()
  {
    return asignatura.size();
  }
}
