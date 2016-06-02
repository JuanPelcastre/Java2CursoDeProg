import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CCuentaCorriente: clase derivada de CCuenta
//
public class CCuentaCorriente extends CCuenta
{
  // Atributos
  private int transacciones;
  private double importePorTrans;
  private int transExentas;
  
  // Métodos
  public CCuentaCorriente() {} // constructor sin parámetros
  

  // Como ejercicio, complete el código según se explica en el libro

  
  public CCuentaCorriente(final CCuentaCorriente cc)
  {
    super(cc);
  }
  
  public CCuentaCorriente copiar(final CCuentaCorriente cc)
  {
    super.copiar(cc);
    return this;
  }
  
  public CCuentaCorriente clone()
  {
    return new CCuentaCorriente(this);
  }

  public void decrementarTransacciones()
  {
    transacciones--;
  }
  
  public boolean asignarImportePorTrans(double imptrans)
  {
    if (imptrans < 0)
    {
      System.out.println("Error: cantidad negativa");
      return false;
    }
    importePorTrans = imptrans;
	  return imptrans >= 0;
  }
  
  public double obtenerImportePorTrans()
  {
    return importePorTrans;
  }
  
  public boolean asignarTransExentas(int transex)
  {
    if (transex < 0)
    {
      System.out.println("Error: cantidad negativa");
      return false;
    }
    transExentas = transex;
	  return transex >= 0;
  }
  
  public int obtenerTransExentas()
  {
    return transExentas;
  }
  
  public boolean ingreso(double cantidad)
  {
    if (super.ingreso(cantidad))
    {
      transacciones++;
      return true;
    }
    else
      return false;
  }
  
  public void reintegro(double cantidad)
  {
    super.reintegro(cantidad);
    transacciones++;
  }

  public void comisiones()
  {
    // Se aplican mensualmente por el mantenimiento de la cuenta
    int[] fa = CFecha.obtenerFechaActual(); // día, mes y año
    
    if (fa[0] == 1)
    {
      int n = transacciones - transExentas;
      if (n > 0) reintegro(n * importePorTrans);
      transacciones = 0;
    }
  }
  
  public double intereses()
  {

    // Como ejercicio, complete el código según se explica en el libro

  }
}
//////////////////////////////////////////////////////////////////
