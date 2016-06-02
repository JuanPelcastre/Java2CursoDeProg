class COrdenador
{
  String marca = null;
  String procesador = null;
  int peso = 0;
  boolean encendido = false;
  boolean pantalla = false;


  // Como ejercicio, complete el código según se explica en el libro

      
  public void Estado()
  {
    System.out.print("\nEl estado del ordenador es el siguiente:");
    System.out.print("\nMarca: " + marca);
    System.out.print("\nProcesador: " + procesador);
    System.out.print("\nPeso: " + peso + " kg.");

    if (encendido == true)
    {
      System.out.print("\nEl ordenador está encendido");
    }
    else
      System.out.print("\nEl ordenador está apagado");

    if (pantalla == true)
    {
      System.out.print("\nLa pantalla está activada");
    }
    else
      System.out.print("\nLa pantalla está desactivada");

    System.out.println("\n");
  }
}
