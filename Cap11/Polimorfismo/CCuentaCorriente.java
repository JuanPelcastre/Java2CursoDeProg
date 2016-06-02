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
  
  public CCuentaCorriente(String nom, String cue, double sal,
                          double tipo, double imptrans, int transex)
  {
    super(nom, cue, sal, tipo);       // invoca al constructor CCuenta
    transacciones = 0;                // inicia transacciones
    asignarImportePorTrans(imptrans); // inicia importePorTrans
    asignarTransExentas(transex);     // inicia transExentas
  }
  
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
    int[] fa = CFecha.obtenerFechaActual(); // día, mes y año
  
    if (fa[0] != 1) return 0.0;
      
    // Acumular los intereses por mes sólo los días 1 de cada mes
    double interesesProducidos = 0.0;
    // Hasta 3000 euros al 0.5%. El resto, al interés establecido.
    if (estado() <= 3000)
      interesesProducidos = estado() * 0.5 / 1200.0;
    else
    {
      interesesProducidos = 3000 * 0.5 / 1200.0 +
           (estado() - 3000) * obtenerTipoDeInterés() / 1200.0;
    }
    ingreso(interesesProducidos);
    // Este ingreso no debe incrementar las transacciones
    decrementarTransacciones(); 
    
    // Devolver el interés mensual por si fuera necesario
    return interesesProducidos;
  }
}
//////////////////////////////////////////////////////////////////
