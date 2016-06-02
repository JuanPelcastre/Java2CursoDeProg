import java.util.*;
/////////////////////////////////////////////////////////////////
// Definición de la clase CFecha
//
public class CFecha
{
  // Atributos
  private int día, mes, año;
  
  // Métodos
  public CFecha(int... fecha)
  {
    asignarFecha(); // asignar fecha actual
    
    if (fecha.length > 0) día = fecha[0];
    if (fecha.length > 1) mes = fecha[1];
    if (fecha.length > 2) año = fecha[2];
    if (!fechaCorrecta())
    {
      System.out.println("Fecha incorrecta. Se asigna la actual.");
      asignarFecha();
    }
  }
  
  public CFecha(final CFecha obj) // constructor copia
  {
    día = obj.día;
    mes = obj.mes;
    año = obj.año;
  }
  
  protected void finalize() throws Throwable // destructor
  {
    System.out.println("Objeto destruido");
  }
  
  protected boolean bisiesto()
  {
    return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
  }
  
  public void asignarFecha(int... fecha)
  {
    // Obtener la fecha actual.
    int[] fa = new int[3];
    GregorianCalendar fechaActual = new GregorianCalendar();
    fa[0] = fechaActual.get(Calendar.DAY_OF_MONTH);
    fa[1] = fechaActual.get(Calendar.MONTH)+1;
    fa[2] = fechaActual.get(Calendar.YEAR);
    
    // Asignar la fecha pasada (por omisión la fecha actual)
    if (fecha.length > 0) día = fecha[0];
    else día = fa[0];
    if (fecha.length > 1) mes = fecha[1];
    else mes = fa[1];
    if (fecha.length > 2) año = fecha[2];
    else año = fa[2];
  }
  
  public void obtenerFecha(int[] fecha)
  {
    fecha[0] = día;
    fecha[1] = mes;
    fecha[2] = año;
  }
  
  public boolean fechaCorrecta()
  {
    boolean díaCorrecto, mesCorrecto, añoCorrecto;
    // ¿año correcto?
    añoCorrecto = (año >= 1582);
    // ¿mes correcto?
    mesCorrecto = (mes >= 1) && (mes <= 12);
    switch (mes)
    // ¿día correcto?
    {
      case 2:
        if (bisiesto())
          díaCorrecto = (día >= 1 && día <= 29);
        else
          díaCorrecto = (día >= 1 && día <= 28);
        break;
      case 4: case 6: case 9: case 11:
        díaCorrecto = (día >= 1 && día <= 30);
        break;
      default:
        díaCorrecto = (día >= 1 && día <= 31);
    }
    return díaCorrecto && mesCorrecto && añoCorrecto;
  }
  
  public CFecha copiar(final CFecha obj)
  {
    día = obj.día;
    mes = obj.mes;
    año = obj.año;
    return this;
  }
}