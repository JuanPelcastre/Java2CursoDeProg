class CCuenta
{
  // Atributos
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoDeInter�s;
  
  // M�todos
  public CCuenta() {}
  
  public CCuenta(String nom, String cue, double sal, double tipo)
  {
    asignarNombre(nom);
    asignarCuenta(cue);
    ingreso(sal);
    asignarTipoDeInter�s(tipo);
  }

  public void asignarNombre(String nom)
  {
    if (nom.length() == 0)
    {
      System.out.println("Error: cadena vac�a");
      return;
    }
    nombre = nom;
  }
  
  public String obtenerNombre()
  {
    return nombre;
  }

  
  // Como ejercicio, complete el c�digo seg�n se explica en el libro


  public void asignarTipoDeInter�s(double tipo)
  {
    if (tipo < 0)
    {
      System.out.println("Error: tipo no v�lido");
      return;
    }
    tipoDeInter�s = tipo;
  }
  
  public double obtenerTipoDeInter�s()
  {
    return tipoDeInter�s;
  }
}
