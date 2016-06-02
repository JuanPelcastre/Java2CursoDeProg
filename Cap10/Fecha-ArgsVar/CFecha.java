import java.util.*;
/////////////////////////////////////////////////////////////////
// Definici�n de la clase CFecha
//
public class CFecha
{
  // Atributos
  private int d�a, mes, a�o;
  
  // M�todos
  public CFecha(int... fecha)
  {
    asignarFecha(); // asignar fecha actual
    
    if (fecha.length > 0) d�a = fecha[0];
    if (fecha.length > 1) mes = fecha[1];
    if (fecha.length > 2) a�o = fecha[2];
    if (!fechaCorrecta())
    {
      System.out.println("Fecha incorrecta. Se asigna la actual.");
      asignarFecha();
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
    // Obtener la fecha actual.
    int[] fa = new int[3];
    GregorianCalendar fechaActual = new GregorianCalendar();
    fa[0] = fechaActual.get(Calendar.DAY_OF_MONTH);
    fa[1] = fechaActual.get(Calendar.MONTH)+1;
    fa[2] = fechaActual.get(Calendar.YEAR);
    
    // Asignar la fecha pasada (por omisi�n la fecha actual)
    if (fecha.length > 0) d�a = fecha[0];
    else d�a = fa[0];
    if (fecha.length > 1) mes = fecha[1];
    else mes = fa[1];
    if (fecha.length > 2) a�o = fecha[2];
    else a�o = fa[2];
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
}