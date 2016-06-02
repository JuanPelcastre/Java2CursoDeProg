public class CPersona
{
  private String nombre;
  private CFecha fechaNacimiento;
  
  public CPersona() {}
  public CPersona(String nom, int dd, int mm, int aa)
  {
    nombre = nom;
    fechaNacimiento = new CFecha(dd, mm, aa)
    {
      public String obtenerFecha()
      {
        return "naci� el d�a " + d�a + " del mes " + mes + " de " + a�o;
      }
    };
  }
  public String obtenerNombre() { return nombre; }
  public String obtenerFechaNa()
  {
    return fechaNacimiento.obtenerFecha();
  }
}
