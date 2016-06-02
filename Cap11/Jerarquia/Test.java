/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con CCuenta...
//
public class Test
{
  public static void main(String[] args)
  {
    CCuentaAhorro cuenta01 = new CCuentaAhorro(
                   "Un nombre", "1111111111", 10000, 3.5, 1);

    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInterés());
    System.out.println(cuenta01.intereses());
    
    CCuentaCorrienteConIn cuenta02 = new CCuentaCorrienteConIn();
    cuenta02.asignarNombre("cuenta 02");
    cuenta02.asignarCuenta("1234567890");
    cuenta02.asignarTipoDeInterés(3.0);
    cuenta02.asignarTransExentas(0);
    cuenta02.asignarImportePorTrans(1.0);

    cuenta02.ingreso(20000);
    cuenta02.reintegro(10000);
    cuenta02.intereses();
    cuenta02.comisiones();
    System.out.println(cuenta02.obtenerNombre());
    System.out.println(cuenta02.obtenerCuenta());
    System.out.println(cuenta02.estado());
  }
}
