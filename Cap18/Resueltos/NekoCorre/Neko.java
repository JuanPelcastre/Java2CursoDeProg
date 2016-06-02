/*
 * Neko.java
 *
 * autor: Fco. Javier Ceballos
 */

public class Neko extends java.applet.Applet implements Runnable
{
  java.awt.Image neko_img[] = new java.awt.Image[3];
  java.awt.Image imgActual;
  int pos_x = 0;
  int pos_y = 0;
  Thread neko;

  public void init() 
  {
    // Cargar los nombres de los ficheros gif en una matriz
    String neko_gif[] = {"pararse.gif", "correr1.gif", "correr2.gif"};
    // Cargar las imágenes en una matriz
    for (int i=0; i < neko_img.length; i++)
    {
      neko_img[i] = getImage(getDocumentBase(),
                             "Recursos/" + neko_gif[i]);
    }
    // Posición de partida: centro del applet
    pos_x = getSize().width / 2;
    pos_y = getSize().height / 2;
  }

  public void start()
  {
    if (neko == null)
    {
      neko = new Thread(this); // crear el hilo
      neko.start();            // lanzar el hilo
    }
  }
    
  public void stop()
  {
    neko = null;
  }

  public void run()
  {
    Thread hiloActual = Thread.currentThread();
    setBackground(java.awt.Color.white); // color de fondo
    while (neko == hiloActual)
    {    
      // Neko se para
      imgActual = neko_img[0];
      repaint();
      pausa(1500);
      // Neko corre
      nekoCorre();
    }
  }

  void nekoCorre()
  {
    for (int i = 0; i < 12; i ++)
    {
      if (pos_x+10 > getSize().width)
        pos_x = 0;
      else
        pos_x += 10;
      // Intercambiar imágenes
      if (imgActual == neko_img[1])
        imgActual = neko_img[2];
      else
        imgActual = neko_img[1];
      repaint();
      pausa(150);
    }
  }

  void pausa(int tiempo)
  {
    try
    {
      Thread.sleep(tiempo);
    }
    catch (InterruptedException ignorada) { }
  }

  public void paint(java.awt.Graphics g)
  {
    if (imgActual != null)
      g.drawImage(imgActual, pos_x, pos_y, this);
  }
}
