public class CFecha
{
  int día, mes, año;
  
  public CFecha(int dd, int mm, int aa)
  {
    día = dd; mes = mm; año = aa;
  }
  public String obtenerFecha()
  {
    return día + "/" + mes + "/" + año;
  }
}
