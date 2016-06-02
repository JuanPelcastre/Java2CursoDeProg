class CCuentaAhorro extends CCuenta
{
  // Atributos
  private double cuotaMantenimiento;
  
  // M�todos


  // Como ejercicio, complete el c�digo seg�n se explica en el libro


  public void asignarCuotaManten(double cantidad)
  {
    if (cantidad < 0)
    {
      System.out.println("Error: cantidad negativa");
      return;
    }
    cuotaMantenimiento = cantidad;
  }
  
  public double obtenerCuotaManten()
  {
    return cuotaMantenimiento;
  }

  public void reintegro(double cantidad)
  {
    double saldo = estado();
    double tipoDeInter�s = obtenerTipoDeInter�s();

    if ( tipoDeInter�s >= 3.5)
    {
      if (saldo - cantidad < 1500)
      {
        System.out.println("Error: no dispone de esa cantidad");
        return;
      }
    }
    super.reintegro(cantidad);// m�todo reintegro de la clase base,
  }                           // tambi�n llamada superclase
}
