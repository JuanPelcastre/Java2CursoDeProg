//////////////////////////////////////////////////////////////////
// Hilos.
//
public class Test
{
  public static void main(String[] args)
  {
    int nCuentas = 4; // número de contadores
    // Crear y lanzar el hilo Cuentas
    Cuentas hiloCuentas = new Cuentas(nCuentas);
    hiloCuentas.start();
  }
}
//////////////////////////////////////////////////////////////////
