import java.util.*;

// Leer.class debe estar en la carpeta especificada por CLASSPATH
public class CMatrizUnidimensional
{
  // Trabajar con una matriz unidimensional
  public static void main(String[] args)
  {
    // Matriz notas inicialmente vac�a
    ArrayList<Float> notas = new ArrayList<Float>();
   
    // Entrada de datos
    int i = 0;
    System.out.println("Introducir notas medias. Finalizar con -1.");
    System.out.printf("Alumno n�mero %3d, nota media: ", ++i);
    float nota = Leer.datoFloat();
    while (nota != -1)
    {
      notas.add(nota); // a�adir un elemento
      System.out.printf("Alumno n�mero %3d, nota media: ", ++i);
      nota = Leer.datoFloat();
    }
    
    // Sumar las notas

    // Como ejercicio, complete el c�digo seg�n se explica en el libro
    
    // Escribir resultados
    System.out.printf("\n\nNota media del curso: %5.2f\n", suma / nalumnos);
  }
}
