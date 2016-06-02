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
        return "nació el día " + día + " del mes " + mes + " de " + año;
      }
    };
  }
  public String obtenerNombre() { return nombre; }
  public String obtenerFechaNa()
  {
    return fechaNacimiento.obtenerFecha();
  }
}
