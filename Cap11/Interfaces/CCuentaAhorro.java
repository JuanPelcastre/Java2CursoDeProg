import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CCuentaAhorro: clase derivada de CCuenta
//
public class CCuentaAhorro extends CCuenta implements IFecha
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
    super.copiar(ca);
    cuotaMantenimiento = ca.cuotaMantenimiento;
    return this;
  }
  
  public CCuentaAhorro clone()
  {
    return new CCuentaAhorro(this);
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
    if (d�a() == 1) reintegro(cuotaMantenimiento); // fa[0] => d�a
  }
  
  public double intereses()
  {
    if (d�a() != 1) return 0.0; // fa[0] => d�a
    // Acumular los intereses por mes s�lo los d�as 1 de cada mes
    double interesesProducidos = 0.0;
    interesesProducidos = estado() * obtenerTipoDeInter�s() / 1200.0;
    ingreso(interesesProducidos);
    
    // Devolver el inter�s mensual por si fuera necesario
    return interesesProducidos;
  }
  
  // Como ejercicio, complete el c�digo seg�n se explica en el libro

}
//////////////////////////////////////////////////////////////////

