class CRadio
{
  //Atributos
  private int rad;
  
  //Constructor
  public CRadio()
  {
    rad=0;
  }
  
  //Métodos
  public void setRadio(int r)
  {
    rad=r;
  }
  public int getRadio()
  {
    return rad;
  }
  public double Volumen()
  {
    return (double)(4/3)*Math.PI*rad*rad*rad;
  }
}

public class Ejercicio1
{
  public static void main(String args [])
  {
    int radio;
    CRadio obj=new CRadio();
    
    System.out.print("Introduce el radio: ");
    radio=Leer.datoInt();
    obj.setRadio(radio);
    System.out.println("Volumen: "+ obj.Volumen());
    System.out.println("Radio: " + obj.getRadio());
  }
}
