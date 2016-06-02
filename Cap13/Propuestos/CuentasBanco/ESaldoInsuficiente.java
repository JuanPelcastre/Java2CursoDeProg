public class ESaldoInsuficiente extends Exception
{
  private CCuenta cuenta;
  private double cantidad_solicitada;
  
  public ESaldoInsuficiente(CCuenta cue, double cant)
  {
    cuenta = cue;
    cantidad_solicitada = cant;
  }
  
  String mensaje()
  {
    String msj = "Error: el saldo de la cuenta " +
                 cuenta.obtenerCuenta() + " es " + cuenta.estado() +
                 " y ha solicitado la cantidad de " + cantidad_solicitada;
    return msj;
  }
}
