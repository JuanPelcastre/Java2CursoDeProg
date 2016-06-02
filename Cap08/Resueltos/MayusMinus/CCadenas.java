import java.io.*;
public class CCadenas
{
  // Convertir una cadena a Mayúsculas
  static void MinusculasMayusculas(char[] str)
  {

    // Como ejercicio, complete el código según se explica en el libro

  }

  public static void main(String[] args)
  {
    char[] cadena = new char[80]; // matriz de caracteres
    int car, i = 0;  // un carácter y el subíndice para la matriz
    
    try
    {
      System.out.println("Escriba una cadena de caracteres:");
      while ((car = System.in.read()) != '\r' && i < cadena.length)
        cadena[i++] = (char)car;
      // Convertir minúsculas a mayúsculas
      MinusculasMayusculas(cadena); // llamar al método
      System.out.println(cadena);
    }
    catch(IOException ignorada) {}
  }
}
