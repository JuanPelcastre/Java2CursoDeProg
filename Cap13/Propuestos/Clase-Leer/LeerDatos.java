// Utiliza la clase Leer que debe de estar almacenada
// en la misma carpeta

public class LeerDatos
{
  public static void main(String[] args)
  {
    Short dato; int i = 0;
    short[] a = new short[100];
    System.out.println("Introducir datos. Finalizar con Ctrl+Z");
    System.out.print("Dato short: ");
    while (i < 100 && (dato = Leer.datoShort()) != null)
    {
      a[i++] = dato;
      System.out.print("Dato short: ");
    }
    
    System.out.println("Datos leídos " + i);
    for (int k = 0; k < i; ++k)
      System.out.print(a[k] + " ");
  }
}
