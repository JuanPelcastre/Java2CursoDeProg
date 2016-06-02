import java.io.*;

public class CCalculadora
{
  // Simulación de una calculadora 
  static int menú()
  {
    int op;
    do
    {
      System.out.println("\t1. sumar");
      System.out.println("\t2. restar");
      System.out.println("\t3. multiplicar");
      System.out.println("\t4. dividir");
      System.out.println("\t5. salir");
      System.out.print("\nSeleccione la operación deseada: ");
      op = Leer.datoInt();
    }
    while (op < 1 || op > 5);
    return op;
  }
  
  public static void main(String[] args)
  {
    java.util.Scanner Leer = new java.util.Scanner(System.in);
    double dato1 = 0, dato2 = 0, resultado = 0;
    int operación = 0;
    
    try
    {
      while (true)
      {
        operación = menú();
        if (operación != 5)
        {
          // Leer datos
          System.out.print("Dato 1: "); dato1 = Leer.nextDouble();
          System.out.print("Dato 2: "); dato2 = Leer.nextDouble();
          // Limpiar el buffer del flujo de entrada
          System.in.skip(System.in.available());
          // Realizar la operación
          switch (operación)
          {

            // Como ejercicio, complete el código según se explica en el libro

          }
          // Escribir el resultado
          System.out.println("Resultado = " + resultado);
          // Hacer una pausa
          System.out.println("Pulse [Entrar] para continuar");
          System.in.read();
          // Limpiar el buffer del flujo de entrada
          System.in.skip(System.in.available());
        }
        else
          break;
      }
    }
    catch(IOException ignorada) {}
  }
}
