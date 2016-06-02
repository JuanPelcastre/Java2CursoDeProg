/* Resultado del an�lisis
 */

/*
   El programa pedir� un car�cter y muestra su valor equivalente
   en binario.
   A continuaci�n muestra la cadena de bits anterior, invertida.
    
	 La funci�n Visualizar es la encargada de mostrar los bits uno
	 a uno del valor pasado c�mo argumento.
	 La funci�n fnxxx invierte el valor pasado como argumento,
	 utilizando operadores l�gicos a nivel de bits y devuelve
	 dicho resultado.
*/ 

import java.io.*;

public class Ejercicio4
{
  public static void Visualizar(byte car)
  {
    int i = 0, bit;
    for (i = 7; i >= 0; i--)
    {
      bit = ((car & (1 << i))!= 0) ? 1 : 0;
      System.out.print(bit);
    }
    System.out.println();
  }
  
  public static byte HaceAlgo(byte car)
  {
    return (byte)(((car & 0x01) << 7) | ((car & 0x02) << 5) |
                  ((car & 0x04) << 3) | ((car & 0x08) << 1) |
                  ((car & 0x10) >> 1) | ((car & 0x20) >> 3) |
                  ((car & 0x40) >> 5) | ((car & 0x80) >> 7));
  }


  public static void main(String[] args)
  {
    byte car;
    try
    {
      System.out.print("Introduce un car�cter ASCII: ");
      car = (byte)System.in.read();
      Visualizar(car);
      System.out.println("\nCar�cter resultante:");
      car = HaceAlgo(car);
      Visualizar(car);
    }
    catch (IOException ignorar){}
  }
}
