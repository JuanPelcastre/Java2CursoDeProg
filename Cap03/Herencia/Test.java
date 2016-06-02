public class Test
{
  public static void main(String[] args)
  {
    CCuentaAhorro cuenta01 = new CCuentaAhorro(
                    "Un nombre", "Una cuenta", 6000, 3.5, 0.80);
    // Cobrar cuota de mantenimiento
    cuenta01.reintegro(cuenta01.obtenerCuotaManten());
    // Ingreso
    cuenta01.ingreso(6000);
    // Reintegro
    cuenta01.reintegro(10000);
    // ...
    
    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInterés());
  }
}
