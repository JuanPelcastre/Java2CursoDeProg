import java.io.*;
/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con CEstudios, CAlumno, CAsignatura,
// CConvocatoria
//
public class Test
{
  public static int menu()
  {
    System.out.println();
    System.out.println("1. Matricular");
    System.out.println("2. Poner notas");
    System.out.println("3. Mostrar expediente");
    System.out.println("4. Salir");
    System.out.println();
    System.out.print("   Opción: ");
    int op;
    do
      op = Leer.datoInt();
    while (op < 1 || op > 4);
    return op;
  }
  
  public static CAsignatura leerDatosAsig()
  {
    CAsignatura asig = null;
    int id;
    String nombre_as;
    char[] sID = new char[8];
    do
    {
      System.out.print("ID:          "); id = Leer.datoInt();
      // Simular que el nombre de la asignatura procede de una base
      // de datos
      nombre_as = new String("asignatura" + id);
      if (nombre_as.length() == 0) System.out.println("ID no válido");
    }
    while (nombre_as.length() == 0);
    System.out.print("Nombre:      " + nombre_as);
    // Añadir una asignatura
    // Los códidos 1 a 70 son obligatorias
    // Los códigos 71 a 99 son optativas
    if (id < 71)
    {
      asig = new CAsignaturaOb(id, nombre_as);
      // la fecha por omisión es la actual
    }
    else
    {
      asig = new CAsignaturaOp(id, nombre_as);
      // la fecha por omisión es la actual
    }
    return asig;
  }
  
  public static void matricular(CEstudios v)
  {
    // Datos personales del alumno
    int dni;
    String nombre, direc;
    System.out.print("DNI:         "); dni = Leer.datoInt();
    System.out.print("Nombre:      "); nombre = Leer.dato();
    System.out.print("Dirección:   "); direc = Leer.dato();
    CAlumno al = new CAlumno(dni, nombre, direc);
    
    // Asignaturas de las que se va a matricular
    System.out.println();
    System.out.println("Asignaturas:");
    char respuesta = '\0';
    do
    {
      CAsignatura asig = leerDatosAsig();
      al.añadirAsignatura(asig);
      System.out.println();
      try
      {
        do
        {
          System.out.print("¿Otra asignatura? s/n: ");
          respuesta = (char)System.in.read();
          System.in.skip(System.in.available());
        }
        while(respuesta != 's' && respuesta != 'n');
      }
      catch(IOException ignorada)
      {}
    }
    while(respuesta == 's');
    // Añadir el alumno que se acaba de matricular
    v.añadirAlumno(al);
  }
  
  public static void poner_notas(CEstudios v, int id)
  {
    if (v.numeroAlumnos() == 0)
    {
      System.out.println("No hay alumnos matriculados");
      return;
    }
    // Poner la nota de la asignatura id, a todos los alumnos
    // matriculados en ella
    for (int al = 0; al < v.numeroAlumnos(); al++)
    {
      int[] pos = new int[1]; // posición de la asignatura id en la lista
      if (v.alumno(al).estaEnActa(id, pos)) // está en actas
      {
        CConvocatoria conv = new CConvocatoria(); // convocatoria a añadir
        System.out.print(v.alumno(al).obtenerNombre() + ", nota: ");
        float nota; // nota obtenida en esta convocatoria
        nota = Leer.datoFloat();
        conv.asignarConvocatoria(
          v.alumno(al).obtenerAsignatura(pos[0]).convocatoriasConsumidas()+1);
        conv.asignarFecha(); // fecha actual
        conv.asignarNota(nota);
        v.alumno(al).obtenerAsignatura(pos[0]).añadirConvocatoria(conv);
      }
    }
  }
  
  public static void mostrar_expediente(CEstudios v, int dni)
  {
    if (v.numeroAlumnos() == 0)
    {
      System.out.println("No hay alumnos matriculados");
      return;
    }
    CConvocatoria c;
    int al, i = 0;
    
    for (al = 0; al < v.numeroAlumnos(); al++)
      if (v.alumno(al).obtenerDNI() == dni) break;
    if (al == v.numeroAlumnos())
    {
      System.out.println("error: no existe un alumno con ese DNI");
      return;
    }
    // Mostrar el expediente del alumno "dni"
    System.out.println("Alumno " + v.alumno(al).obtenerNombre() + ": ");
    System.out.printf("%-25s%15s%15s\n", "Asignatura", "Convocatoria", "Nota");
    for (int as = 0; as < v.alumno(al).numeroAsignaturas(); as++)
    {
      CAsignatura asig = v.alumno(al).obtenerAsignatura(as);
      System.out.printf("%-25s", asig.obtenerNombre());
      for (i = 1; i <= asig.convocatoriasConsumidas(); i++)
      {
        c = asig.obtenerConvocatoria(i);
        System.out.printf("%15d%15.2f\n%-25s", c.obtenerConvocatoria(), c.obtenerNota(), "");
      }
      if (asig.convocatoriasConsumidas() == 0)
        System.out.printf("%30s\n", "NP");
      System.out.println();
    }
  }
  
  public static void main(String[] args)
  {
    // Crear un objeto estudio (carrera a cursar)
    CEstudios estudio = new CEstudios(177, "Ing. Telec.");
    int opcion = 0, id, dni;
    
    do
    {
      opcion = menu();
      switch (opcion)
      {
        case 1:
          matricular(estudio);
          break;
        case 2:
          System.out.print("ID asignatura: "); id = Leer.datoInt();
          poner_notas(estudio, id);
          break;
        case 3:
          System.out.print("DNI: "); dni = Leer.datoInt();
          mostrar_expediente(estudio, dni);
          break;
      }
    }
    while(opcion != 4);
  }
}
