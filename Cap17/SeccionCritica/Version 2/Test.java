//////////////////////////////////////////////////////////////////
// Trabajar con secciones críticas.
//
public class Test
{
  public static void main(String[] args)
  {
    CBufer muestras = new CBufer(10);
    CAdquirirDatos adquirirDatos_0 = new CAdquirirDatos(muestras);
    CAdquirirDatos adquirirDatos_1 = new CAdquirirDatos(muestras);

    adquirirDatos_0.start();
    adquirirDatos_1.start();
  }
}
//////////////////////////////////////////////////////////////////
