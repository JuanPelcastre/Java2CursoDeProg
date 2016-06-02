import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CCuentaAhorro: clase derivada de CCuenta
//
public class CCuentaAhorro extends CCuenta implements IFecha
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
    if (día() == 1) reintegro(cuotaMantenimiento); // fa[0] => día
  }
  
  public double intereses()
  {
    if (día() != 1) return 0.0; // fa[0] => día
    // Acumular los intereses por mes sólo los días 1 de cada mes
    double interesesProducidos = 0.0;
    interesesProducidos = estado() * obtenerTipoDeInterés() / 1200.0;
    ingreso(interesesProducidos);
    
    // Devolver el interés mensual por si fuera necesario
    return interesesProducidos;
  }
  
  // Como ejercicio, complete el código según se explica en el libro

}
//////////////////////////////////////////////////////////////////

