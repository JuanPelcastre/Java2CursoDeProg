public class Reloj extends javax.swing.JApplet
                   implements Runnable
{
  public void init()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    horaActual = new javax.swing.JLabel();

    horaActual.setFont(new java.awt.Font("Arial", 1, 48));
    horaActual.setHorizontalAlignment(
                         javax.swing.SwingConstants.CENTER);
    horaActual.setText("00:00:00");
    getContentPane().add(horaActual, java.awt.BorderLayout.CENTER);
  }

  public void start()
  {
    if (hilo == null)
    {
      hilo = new Thread(this, "Reloj");
      hilo.start();
    }
  }

  public void run()
  {

    // Como ejercicio, complete el código según se explica en el libro

  }

  public void stop()
  {
    hilo = null;
  }
  
  // Declaración de variables
  private javax.swing.JLabel horaActual;
  private Thread hilo = null;
  private java.awt.Font fuente;
}
