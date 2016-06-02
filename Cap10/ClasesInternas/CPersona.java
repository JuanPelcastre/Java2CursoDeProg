public class CPersona
{
  private String nombre;
  private CFecha fechaNacimiento;
  
  private class CFecha
  {
    private int d�a, mes, a�o;
    
    private CFecha(int dd, int mm, int aa)
    {
      d�a = dd; mes = mm; a�o = aa;
    }
    
    public String obtenerFecha()
    {
      return d�a + "/" + mes + "/" + a�o;
    }
  }
  
  public CPersona() {}
  public CPersona(String nom, int dd, int mm, int aa)
  {
    nombre = nom;
    fechaNacimiento = new CFecha(dd, mm, aa);
  }
  public String obtenerNombre() { return nombre; }
  public String obtenerFechaNa()
  {
    return fechaNacimiento.obtenerFecha();
  }
}
