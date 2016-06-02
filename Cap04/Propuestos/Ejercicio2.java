public class Ejercicio2
{
  public static void main(String args[])
  {
    int a=10,b=3,d,e;
    float x,y;
    boolean c=true;
    x=a/b; //x=3, pues a y b son int
    c=a<b&&c; // Error si 'c' es entero
    d=a+b++; // d=13, pues incrementa tras asignar
    e=++a-b; // e=7, pues ++a=11 y b=4 (incrementado antes)
    y=(float)a/b; // y=2.75, pues hacemos una conversion cast
    
    System.out.println("Las soluciones son:");
    
    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    System.out.println("d="+d);
    System.out.println("e="+e);
  }
}
