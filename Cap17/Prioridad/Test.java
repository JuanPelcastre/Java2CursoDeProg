//////////////////////////////////////////////////////////////////
// Hilos.
//
public class Test
{
  public static void main(String[] args)
  {
    int nCuentas = 4; // n�mero de contadores
    // Crear y lanzar el hilo Cuentas
    Cuentas hiloCuentas = new Cuentas(nCuentas);
    hiloCuentas.start();
  }
}
//////////////////////////////////////////////////////////////////
