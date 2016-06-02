/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con CCuenta...
//
public class Test
{
  public static void main(String[] args)
  {
    CCuentaAhorro cuenta01 = new CCuentaAhorro();
    CCuentaAhorro cuenta02 = new CCuentaAhorro("Un nombre", "Una cuenta", 1000000, 3.5, 300);
    cuenta01.asignarNombre("Un nombre");
    cuenta01.asignarCuenta("Una cuenta");
    cuenta01.asignarTipoDeInterés(2.5);
    cuenta01.asignarCuotaManten(300);
    
    cuenta01.ingreso(1000000);
    cuenta01.reintegro(500000);
    cuenta01.comisiones();
    
    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInterés());
  }
}
