public class CConvocatoria
{
  private int convocatoria;  // número (1, 2, ...) de convocatoria
  private String fecha; // seis dígitos (mes y año): mmaaaa
  private float nota;   // nota obtenida en la convocatoria especificada
  
  public CConvocatoria()
  {
    convocatoria = 0;
    asignarFecha();
    nota = 0;
  }
  
  public CConvocatoria(int c, float n)
  {
    // Comprobar que los valores c y n son válidos y
    // asignar la fecha actual.
    asignarConvocatoria(c);
    asignarFecha();
    asignarNota(n);
  }
  
  public CConvocatoria(final CConvocatoria c)
  {
    copiar(c);
  }
  
  public CConvocatoria copiar(final CConvocatoria c)
  {
    asignarConvocatoria(c.convocatoria);
    fecha = new String(c.fecha);
    asignarNota(c.nota);
    return this;
  }
  
  public void asignarConvocatoria(int conv)
  {
    if (convocatoria > 6)
    {
      System.out.println("error: convocatorias agotadas");
      return;
    }
    if (conv < 0 || conv > 6)
    {
      System.out.println("error: convocatoria no válida");
      convocatoria = 0;
      return;
    }
    convocatoria = conv;
  }

  public int obtenerConvocatoria()
  {
    return convocatoria;
  }

  public void asignarFecha()  // fecha actual
  {
    int[] f = new int[3];
    f = CFecha.obtenerFechaActual();
    fecha = Integer.toString(f[1])+Integer.toString(f[2]);
  }

  public void asignarFecha(int mes, int anyo) // por omisión, fecha actual
  {
    int[] f = new int[3];
    if (new CFecha(1, mes, anyo).fechaCorrecta())
    {
      f[1] = mes; f[2] = anyo;
    }
    else
      f = CFecha.obtenerFechaActual();
    fecha = Integer.toString(f[1])+Integer.toString(f[2]);
  }

  public String obtenerFecha()
  {
    return fecha;
  }

  public void asignarNota(float n)
  {
    if (n < 0 || n > 10)
    {
      System.out.println("error: nota no válida");
      nota = 0;
      return;
    }
    nota = n;
  }
  
  public float obtenerNota()
  {
    return nota;
  }
}
