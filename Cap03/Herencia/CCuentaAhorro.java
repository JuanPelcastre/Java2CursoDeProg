class CCuentaAhorro extends CCuenta
{
  // Atributos
  private double cuotaMantenimiento;
  
  // Métodos


  // Como ejercicio, complete el código según se explica en el libro


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
    double tipoDeInterés = obtenerTipoDeInterés();

    if ( tipoDeInterés >= 3.5)
    {
      if (saldo - cantidad < 1500)
      {
        System.out.println("Error: no dispone de esa cantidad");
        return;
      }
    }
    super.reintegro(cantidad);// método reintegro de la clase base,
  }                           // también llamada superclase
}
