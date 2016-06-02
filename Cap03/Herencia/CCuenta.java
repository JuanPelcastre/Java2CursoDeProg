class CCuenta
{
  // Atributos
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoDeInterés;
  
  // Métodos
  public CCuenta() {}
  
  public CCuenta(String nom, String cue, double sal, double tipo)
  {
    asignarNombre(nom);
    asignarCuenta(cue);
    ingreso(sal);
    asignarTipoDeInterés(tipo);
  }

  public void asignarNombre(String nom)
  {
    if (nom.length() == 0)
    {
      System.out.println("Error: cadena vacía");
      return;
    }
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }

  
  // Como ejercicio, complete el código según se explica en el libro


  public void asignarTipoDeInterés(double tipo)
  {
    if (tipo < 0)
    {
      System.out.println("Error: tipo no válido");
      return;
    }
    tipoDeInterés = tipo;
  }
  
  public double obtenerTipoDeInterés()
  {
    return tipoDeInterés;
  }
}
