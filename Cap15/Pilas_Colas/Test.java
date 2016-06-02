//////////////////////////////////////////////////////////////////
// Pilas y colas
//
public class Test
{
  public static void mostrarPila(CPila<CDatos> pila)
  {
    // Mostrar todos los elementos de la pila
    int i = 0, tam = pila.tama�o();
    CDatos obj;
    while (i < tam)
    {
      obj = pila.sacarDePila();
      System.out.println(i + ".-  " + obj.obtenerNombre() + " " +
                         obj.obtenerNota());
      i++;
    }
    if (tam == 0) System.out.println("pila vac�a");
  }

  public static void mostrarCola(CCola<CDatos> cola)
  {
    // Mostrar todos los elementos de la cola
    int i = 0, tam = cola.tama�o();
    CDatos obj;
    while (i < tam)
    {
      obj = cola.sacarDeCola();
      System.out.println(i + ".-  " + obj.obtenerNombre() + " " +
                         obj.obtenerNota());
      i++;
    }
    if (tam == 0) System.out.println("cola vac�a");
  }

  public static void main(String[] args)
  {
    // Crear una pila y una cola vac�as
    CPila<CDatos> pila = new CPila<CDatos>();
    CCola<CDatos> cola = new CCola<CDatos>();
    
    // Leer datos y a�adirlos a ambas
    String nombre;
    double nota;
    int i = 0;
    System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
    System.out.print("nombre: ");
    while ((nombre = Leer.dato()) != null)
    {
      System.out.print("nota:   ");
      nota = Leer.datoDouble();
      pila.meterEnPila(new CDatos(nombre, nota));
      cola.meterEnCola(new CDatos(nombre, nota));
      System.out.print("nombre: ");
    }
    System.out.println("\n");

    // Mostrar la pila
    System.out.println("\nPila:");
    mostrarPila(pila);
    // Mostrar la pila por segunda vez
    System.out.println("\nPila:");
    mostrarPila(pila);
    
    // Mostrar la cola
    System.out.println("\nCola:");
    mostrarCola(cola);
    // Mostrar la cola por segunda vez
    System.out.println("\nCola:");
    mostrarCola(cola);
  }
}
