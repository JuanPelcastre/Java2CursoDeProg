import java.util.*;

public class CEstudios
{
  private int ID;
  private String nombre; // nombre de la carrera
  private ArrayList<CAlumno> alumnos;
  private HashMap<Integer, String> asignatura; // lista de asignaturas de los estudios
  
  public CEstudios(int id, String nom)
  {
    asignarID(id);
    asignarNombre(nom);
    alumnos = new ArrayList<CAlumno>(1000);
    asignatura = new HashMap<Integer, String>();
    // Cargar lista de asignaturas
    String nombre_asig;
    for (int i = 1; i < 100; i++)
    {
      // Simulación de la carga de la lista de asignaturas
      nombre_asig = new String("asignatura" + i);
      asignatura.put(i, nombre_asig);
    }
  }
  
  public void asignarID(int id)
  {
    if (id < 1)
    {
      System.out.println("error: Id no válido");
      ID = 1;
    }
    ID = id;
  }
  
  public int obtenerID()
  {
    return ID;
  }
  
  public void asignarNombre(String nom)
  {
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }
  
  public void añadirAlumno(CAlumno al)
  {
    alumnos.add(al);
  }
  
  public CAlumno alumno(int i)
  {
    return alumnos.get(i);
  }
  
  public String nombreAsignatura(int id)
  {
    return asignatura.get(id);
  }
  
  public int numeroAlumnos()
  {
    return alumnos.size();
  }
}
