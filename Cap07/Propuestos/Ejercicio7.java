import java.io.*;

public class Ejercicio7
{
  public static void main(String args[])
  {
    PrintStream flujoS = System.out;
    
    final int DESPL = 'K' - 'A';
    int carIn, carOut;
    
    flujoS.println("Escribe un texto finalizado con un punto:");
    try
    {
      carIn = System.in.read();
      flujoS.println("Resultado de la conversión:");
      while( carIn != '.' )
      {
        if(carIn >= 'A' && carIn <= 'Z')
        {
          carOut = carIn + DESPL;
          if ((carIn + DESPL) > 'Z') carOut -= 'Z' - 'A' + 1;
        }
        else if (carIn >= 'a' && carIn <= 'z')
        {
          carOut = carIn + DESPL;
          if ((carIn + DESPL) > 'z') carOut -= 'z' - 'a' + 1;
        }
        else carOut = carIn;
        
        if(carIn == 0) break;
        
        flujoS.print((char)carOut);
        carIn = System.in.read();
      }
    }
    catch(IOException ignorada) {}
    flujoS.println();
  }
}
