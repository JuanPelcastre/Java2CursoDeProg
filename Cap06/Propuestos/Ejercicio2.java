import java.io.*;
import java.util.*;

public class Ejercicio2
{
  public static void main(String args[])
  {
    String nombre;
    int anyo=2030;
    int nacimiento;
    int edad;
    System.out.print("Introduce el nombre: ");
    nombre=Leer.dato();
    System.out.print("Introduzca el año de nacimiento: ");
    nacimiento=Leer.datoInt();
    edad=2030-nacimiento;
    System.out.println("Hola " + nombre + " en el año 2030 tendrás "+ edad +" años.");
    edad=anyo-nacimiento;
  }
}
