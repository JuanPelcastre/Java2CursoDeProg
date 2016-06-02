public class Test
{
  public static void main(String[] args)
  {
    CCuenta cuenta01 = new CCuenta();
    CCuenta cuenta02 = new CCuenta("Un nombre", "Una cuenta",
                                    6000, 3.5);

    cuenta01.asignarNombre("Un nombre");
    cuenta01.asignarCuenta("Una cuenta");
    cuenta01.asignarTipoDeInterés(2.5);

    cuenta01.ingreso(12000);
    cuenta01.reintegro(3000);
    
    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInterés());
    System.out.println();
    System.out.println(cuenta02.obtenerNombre());
    System.out.println(cuenta02.obtenerCuenta());
    System.out.println(cuenta02.estado());
    System.out.println(cuenta02.obtenerTipoDeInterés());
  }
}