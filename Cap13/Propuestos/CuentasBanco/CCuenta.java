//////////////////////////////////////////////////////////////////
// Clase CCuenta: clase abstracta que agrupa los datos comunes a
// cualquier tipo de cuenta bancaria.
//
public abstract class CCuenta
{
  // Atributos
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoDeInter�s;
  
  // M�todos
  public CCuenta() {};
  public CCuenta(String nom, String cue, double sal, double tipo)
  {
    asignarNombre(nom);
    asignarCuenta(cue);
    ingreso(sal);
    asignarTipoDeInter�s(tipo);
  }
  
  public CCuenta(final CCuenta c)
  {
    copiar(c);
  }
  
  public CCuenta copiar(final CCuenta c)
  {
    nombre = c.nombre;
    cuenta = c.cuenta;
    saldo = c.saldo;
    tipoDeInter�s = c.tipoDeInter�s;
    return this;
  }
  
  public boolean asignarNombre(String nom)
  {
    if (nom.length() == 0)
    {
      System.out.println("Error: cadena vac�a");
      return false;
    }
    nombre = nom;
    return nom.length() != 0;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }
  
  public boolean asignarCuenta(String cue)
  {
    if (cue.length() == 0)
    {
      System.out.println("Error: cuenta no v�lida");
      return false;
    }
    cuenta = cue;
    return cue.length() != 0;
  }
  
  public String obtenerCuenta()
  {
    return cuenta;
  }
  
  public double estado()
  {
    return saldo;
  }
  
  public abstract void comisiones();
  
  public abstract double intereses();
  
  public boolean ingreso(double cantidad)
  {
    if (cantidad < 0)
    {
      System.out.println("Error: cantidad negativa");
      return false;
    }
    saldo += cantidad;
    return cantidad >= 0;
  }
  
  public void reintegro(double cantidad) throws ESaldoInsuficiente
  {
    if (saldo - cantidad < 0)
      throw new ESaldoInsuficiente(this, cantidad);
    saldo -= cantidad;
  }
  
  public boolean asignarTipoDeInter�s(double tipo)
  {
    if (tipo < 0)
    {
      System.out.println("Error: tipo no v�lido");
      return false;
    }
    tipoDeInter�s = tipo;
    return tipo >= 0;
  }
  
  public double obtenerTipoDeInter�s()
  {
    return tipoDeInter�s;
  }
}
