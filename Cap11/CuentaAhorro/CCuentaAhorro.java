import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CCuentaAhorro: clase derivada de CCuenta
//
public class CCuentaAhorro extends CCuenta
{
  // Atributos
  private double cuotaMantenimiento;
  
  // Métodos
  public CCuentaAhorro() {} // constructor sin parámetros
  
  public CCuentaAhorro(String nom, String cue, double sal,
    double tipo, double mant)
  {
    super(nom, cue, sal, tipo); // invoca al constructor CCuenta
    asignarCuotaManten(mant);   // inicia cuotaMantenimiento
  }
  
  public CCuentaAhorro(final CCuentaAhorro ca)
  {
    copiar(ca);
  }
  
  public CCuentaAhorro copiar(final CCuentaAhorro ca)
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
  
  public CCuentaAhorro clone()
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
  
  protected void finalize() throws Throwable // destructor
  {
    // Ninguna operación
    super.finalize(); // invocar al método finalize de la superclase
  }
  
  public boolean asignarCuotaManten(double cantidad)
  {
    if (cantidad < 0)
    {
      System.out.println("Error: cantidad negativa");
      return false;
    }
    cuotaMantenimiento = cantidad;
    return cantidad >= 0;
  }
  
  public double obtenerCuotaManten()
  {
    return cuotaMantenimiento;
  }
  
  public void comisiones()
  {
    // Se aplican mensualmente por el mantenimiento de la cuenta
    int[] fa = CFecha.obtenerFechaActual(); // día, mes y año
    
    if (fa[0] == 1) reintegro(cuotaMantenimiento); // fa[0] => día
  }
  
  public double intereses()
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
}
//////////////////////////////////////////////////////////////////

