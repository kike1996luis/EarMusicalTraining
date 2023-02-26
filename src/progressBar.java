import java.awt.Cursor;
import javax.swing.*;

public class progressBar{
    
    Cargando screen;
    public progressBar(){
        inicioPantalla();
        screen.velocidadDeCarga();
    }

  private void inicioPantalla(){
    ImageIcon myImage =  new ImageIcon(getClass().getResource("/graphs/charge.png"));
    screen = new Cargando(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(100);
    screen.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    screen.setVisible(true);
    screen.pack();
    }
}