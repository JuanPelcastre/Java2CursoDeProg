import java.util.*;

public class CAsignatura
{
  private int ID;        // identificador de la asignatura
  private String nombre; // nombre de la asignatura
  private CFecha fecha;  // primera vez que se realizó la matrícula
  private ArrayList<CConvocatoria> convocatorias;

  public CAsignatura(int id, String nom)
  {
    asignarNombre(nom);
    asignarID(id);
    fecha = new CFecha();     // fecha actual por omisión
    convocatorias = new ArrayList<CConvocatoria>(6); // reservar espacio para 6 elementos
  }

  public CAsignatura(final CAsignatura asig)
  {
    copiar(asig);
  }

  public CAsignatura copiar(final CAsignatura asig)
  {
    asignarID(asig.ID);
    asignarNombre(asig.nombre);
    asignarFecha(asig.fecha);     // fecha actual por omisión
    convocatorias = new ArrayList<CConvocatoria>(6); // reservar espacio para 6 elementos
    convocatorias = (ArrayList<CConvocatoria>)asig.convocatorias.clone();
    return this;
  }
  
  public CAsignatura clone()
  {
    return new CAsignatura(this);
  }

  public void asignarID(int id)
  {
    if (id < 1)
    {
      System.out.println("error: Id no válido");
      id = 999999;
    }
    ID = id;
  }
  
  int obtenerID()
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
  
  public boolean asignarFecha(CFecha f)
  {
    boolean b = f.fechaCorrecta();
    if (b) fecha = f;
    return b;
  }
  
  public CFecha obtenerFecha()
  {
    return fecha;
  }
  
  public CConvocatoria obtenerConvocatoria(int i)
  {
    int n = convocatoriasConsumidas();
    if ( n == 0 ) return null;
    --i; // ajustar la convocatoria (1, 2, ...)
    // a los subíndices (0, 1, ...) del vector
    if (i >= 0 && i < n)
      return convocatorias.get(i);
    else
    {
      System.out.println("error: convocatorias consumidas " + n);
      return null;
    }
  }
  
  public void añadirConvocatoria(CConvocatoria c)
  {
    convocatorias.add(c);
  }
  
  public int convocatoriasConsumidas()
  {
    return convocatorias.size();
  }
}
