public class CTermino
{
  private float Coeficiente;
  private int Exponente;
  
  public CTermino()
  {
    Coeficiente = 0;
    Exponente = 1;
  }

  public CTermino(float coef, int exp)
  {
    Coeficiente = coef;
    Exponente = exp;
  }
  
  public void AsignarCoeficiente(float coef)
  {
    Coeficiente = coef;
  }
  
  public float ObtenerCoeficiente()
  {
    return Coeficiente;
  }
  
  public void AsignarExponente(int exp)
  {
    Exponente = exp;
  }
  
  public int ObtenerExponente()
  {
    return Exponente;
  }
  
  // Visualizar un término
  public void VisualizarTermino()
  {
    System.out.print(((Coeficiente < 0) ? " - " : " + ") + Math.abs(Coeficiente));
    if (Exponente != 0) System.out.print("x^" + Exponente);
  }
}
