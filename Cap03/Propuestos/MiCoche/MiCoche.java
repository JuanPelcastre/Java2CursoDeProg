class MiCoche
{
  public static void main(String[] args)
  {
    Coche micoche = new Coche();
    micoche.EstablecerMarca("BMW");
    micoche.EstablecerColor("Negro metalizado");
    micoche.EstablecerTipo("descapotable");
    micoche.ArrancarMotor();
    micoche.Acelerar();
    micoche.SubirMarcha();
    micoche.Acelerar();
    micoche.SubirMarcha();
    micoche.Acelerar();
    micoche.SubirMarcha();      
    micoche.Frenar();
    micoche.BajarMarcha();
    micoche.Frenar();
    micoche.BajarMarcha();
    micoche.Frenar();
    micoche.BajarMarcha();
    micoche.PararMotor();
    micoche.DescribirCoche();
  }
}
