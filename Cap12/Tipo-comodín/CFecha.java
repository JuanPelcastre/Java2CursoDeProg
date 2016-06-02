import java.util.*;
/////////////////////////////////////////////////////////////////
// Definici�n de la clase CFecha
//
public class CFecha
{
  // Atributos
  private int d�a, mes, a�o;
  private static CFecha fechaPorOmision;
  
  static
  {
    // Iniciaci�n de los atributos static de la clase
    fechaPorOmision = new CFecha(1, 1, 2001);
  }
  
  // M�todos
  static void asignarFechaPorOmision(int dd, int mm, int aaaa)
  {
    fechaPorOmision.asignarFecha(dd, mm, aaaa);
  }
  
  public CFecha(int... fecha)
  {
    asignarFecha(); // asignar fecha actual
    
    if (0 < fecha.length) d�a = fecha[0];
    if (1 < fecha.length) mes = fecha[1];
    if (2 < fecha.length) a�o = fecha[2];
    if (!fechaCorrecta())
    {
      System.out.println("Fecha incorrecta. Se asigna la actual.");
      copiar(fechaPorOmision);
    }
  }
  
  public CFecha(final CFecha obj) // constructor copia
  {
    d�a = obj.d�a;
    mes = obj.mes;
    a�o = obj.a�o;
  }
  
  protected void finalize() throws Throwable // destructor
  {
    System.out.println("Objeto destruido");
  }
  
  protected boolean bisiesto()
  {
    return ((a�o % 4 == 0) && (a�o % 100 != 0) || (a�o % 400 == 0));
  }
  
  public void asignarFecha(int... fecha)
  {
    // Obtener la fecha actual
    int[] fa = obtenerFechaActual();
    
    // Asignar la fecha pasada
    if (0 < fecha.length) d�a = fecha[0]; else d�a = fa[0];
    if (1 < fecha.length) mes = fecha[1]; else mes = fa[1];
    if (2 < fecha.length) a�o = fecha[2]; else a�o = fa[2];
  }

  public void obtenerFecha(int[] fecha)
  {
    fecha[0] = d�a;
    fecha[1] = mes;
    fecha[2] = a�o;
  }
  
  public boolean fechaCorrecta()
  {
    boolean d�aCorrecto, mesCorrecto, a�oCorrecto;
    // �a�o correcto?
    a�oCorrecto = (a�o >= 1582);
    // �mes correcto?
    mesCorrecto = (mes >= 1) && (mes <= 12);
    switch (mes)
    // �d�a correcto?
    {
      case 2:
        if (bisiesto())
          d�aCorrecto = (d�a >= 1 && d�a <= 29);
        else
          d�aCorrecto = (d�a >= 1 && d�a <= 28);
        break;
      case 4: case 6: case 9: case 11:
        d�aCorrecto = (d�a >= 1 && d�a <= 30);
        break;
      default:
        d�aCorrecto = (d�a >= 1 && d�a <= 31);
    }
    return d�aCorrecto && mesCorrecto && a�oCorrecto;
  }
  
  public CFecha copiar(final CFecha obj)
  {
    d�a = obj.d�a;
    mes = obj.mes;
    a�o = obj.a�o;
    return this;
  }
  
  public static int[] obtenerFechaActual()
  {
    // Obtener la fecha actual
    GregorianCalendar fechaActual = new GregorianCalendar();
    int[] fecha = new int[] {
      fechaActual.get(Calendar.DAY_OF_MONTH),
      fechaActual.get(Calendar.MONTH)+1,
      fechaActual.get(Calendar.YEAR)
    };
    return fecha;
  }
}