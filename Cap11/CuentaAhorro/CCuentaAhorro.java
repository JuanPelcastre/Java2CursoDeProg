import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CCuentaAhorro: clase derivada de CCuenta
//
public class CCuentaAhorro extends CCuenta
{
  // Atributos
  private double cuotaMantenimiento;
  
  // M�todos
  public CCuentaAhorro() {} // constructor sin par�metros
  
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

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  public CCuentaAhorro clone()
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
  
  protected void finalize() throws Throwable // destructor
  {
    // Ninguna operaci�n
    super.finalize(); // invocar al m�todo finalize de la superclase
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
    int[] fa = CFecha.obtenerFechaActual(); // d�a, mes y a�o
    
    if (fa[0] == 1) reintegro(cuotaMantenimiento); // fa[0] => d�a
  }
  
  public double intereses()
  {

    // Como ejercicio, complete el c�digo seg�n se explica en el libro

  }
}
//////////////////////////////////////////////////////////////////

