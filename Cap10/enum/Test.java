enum meses
{
  // Conjunto de valores
  enero(31), febrero(28), marzo(31), abril(30),
  mayo(31), junio(30), julio(31), agosto(31),
  septiembre(30), octubre(31), noviembre(30), diciembre(31);

  // Atributos
  private final int díasMes;

  // Métodos
  meses(int días) { díasMes = días; } // constructor
  public int DíasMes() { return díasMes; }
}

public class Test
{
  public static void main(String[] args)
  {
    meses mes = meses.marzo;
    // ...
    int ind = mes.ordinal(); // índice: 0, 1, 2, ...
    System.out.println("el mes " + (ind+1) + " es " +
                        mes.values()[ind]);
    System.out.println(mes + " tiene " + mes.DíasMes() + " días");
    // ...
  }
}
