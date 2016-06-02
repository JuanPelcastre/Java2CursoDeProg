class Coche
{
  private String color;
  private String marca;
  private String tipo;
  private int marcha = 0;

  public String ObtenerColor()
  {
    return color;
  }

  public void EstablecerColor(String co)
  {
    if (co == null)
      color = "color desconocido";
    else
      color = co;
  }

  public String ObtenerMarca()
  {
    return marca;
  }

  public void EstablecerMarca(String ma)
  {
    if (ma == null)
      marca = "marca desconocida";
    else
      marca = ma;
  }

  public String TObteneripo()
  {
    return tipo;
  }

  public void EstablecerTipo(String ti)
  {
    if (ti == null)
      tipo = "marca desconocida";
    else
      tipo = ti;
  }

  public void ArrancarMotor()
  {
    System.out.println("\nBRrrrrrrrrummmmm...");
  }

  public void Acelerar()
  {
    System.out.println("Acelerando...");
  }

  public void SubirMarcha()
  {
    marcha++;
    System.out.println("Marcha: " + marcha);
  }

  public void BajarMarcha()
  {
    marcha--;
    System.out.println("Marcha: " + marcha);
  }

  public void Frenar()
  {
    System.out.println("Frenando...");
  }

  public void PararMotor()
  {
    System.out.println("\nMotor parado.");
  }

  public void DescribirCoche()
  {
    System.out.println("\n  -- Mi coche es un " + marca + " " + color + " " + tipo);
  } 
}
