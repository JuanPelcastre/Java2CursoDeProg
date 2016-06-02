import java.util.*;

public class Ejercicio02
{
  public static void main(String[] args)
  {
    Scanner leer = new Scanner(System.in);
    
    // Mapa inicialmente vacío
    CColeccion mapa = new CColeccion();
    String palabra;
    
    System.out.println("Introduzca el texto (para finalizar Ctrl+z (eof)): ");
    while (leer.hasNext()) // mientras haya datos...
    {
      palabra = leer.next();
      mapa.InsertarPalabra(palabra);      // se inserta
    }
    leer.close();

    mapa.VisualizarColeccion();
  }
}
