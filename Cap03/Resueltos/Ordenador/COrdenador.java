class COrdenador
{
  String marca = null;
  String procesador = null;
  int peso = 0;
  boolean encendido = false;
  boolean pantalla = false;


  // Como ejercicio, complete el c�digo seg�n se explica en el libro

      
  public void Estado()
  {
    System.out.print("\nEl estado del ordenador es el siguiente:");
    System.out.print("\nMarca: " + marca);
    System.out.print("\nProcesador: " + procesador);
    System.out.print("\nPeso: " + peso + " kg.");

    if (encendido == true)
    {
      System.out.print("\nEl ordenador est� encendido");
    }
    else
      System.out.print("\nEl ordenador est� apagado");

    if (pantalla == true)
    {
      System.out.print("\nLa pantalla est� activada");
    }
    else
      System.out.print("\nLa pantalla est� desactivada");

    System.out.println("\n");
  }
}
