public class CFecha
{
  int d�a, mes, a�o;
  
  public CFecha(int dd, int mm, int aa)
  {
    d�a = dd; mes = mm; a�o = aa;
  }
  public String obtenerFecha()
  {
    return d�a + "/" + mes + "/" + a�o;
  }
}
