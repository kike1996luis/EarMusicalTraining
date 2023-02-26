import javax.swing.*;
import java.awt.*;

public final class Cargando extends JWindow{
  
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel imageLabel = new JLabel();
  JPanel southPanel = new JPanel();
  FlowLayout southPanelFlowLayout = new FlowLayout();
  JProgressBar progressBar = new JProgressBar();
  ImageIcon imageIcon;

  public Cargando(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
    dibujaVentana();
  }

  public void dibujaVentana() {    
    imageLabel.setIcon(imageIcon);
    this.getContentPane().setLayout(borderLayout1);
    southPanel.setLayout(southPanelFlowLayout);
    southPanel.setBackground(new java.awt.Color(242, 176, 53));
    this.getContentPane().add(imageLabel, BorderLayout.CENTER);
    this.getContentPane().add(southPanel, BorderLayout.NORTH);
    this.getContentPane().add(southPanel, BorderLayout.SOUTH);
    southPanel.add(progressBar, null);
    this.pack();
  }

  public void setProgresoMax(int maxProgress)
  {
    progressBar.setMaximum(maxProgress);}

  public void setProgreso(int progress)
  {
    final int progreso = progress;
        progressBar.setValue(progreso);}

  public void setProgreso(String message, int progress)
  {
    final int progreso = progress;
    final String theMessage = message;
    setProgreso(progress);
    progressBar.setValue(progreso);
    setMessage(theMessage);  }

  private void setMessage(String message)
  {
    if (message==null){
      message = "";
      progressBar.setStringPainted(false);}
    else{
      progressBar.setStringPainted(true);}

    progressBar.setString(message); }

public void velocidadDeCarga(){
    for (int i = 0; i <= 100; i++)
    {
      if(i>25 && i<=55){
          setProgreso("Cargando MIDI " + i+"%", i);
            for (long j=0; j<350000; ++j)
            {
              String poop = " " + (j + i);
            }
      }if(i<=25){
         setProgreso("Cargando medios " + i+"%", i);
         for (long j=0; j<200000; ++j)
            {
              String poop = " " + (j + i);
            }
      }if(i>55 && i<=80){
         setProgreso("Cargando UI " + i+"%", i);
         for (long j=0; j<250000; ++j)
            {
              String poop = " " + (j + i);
            }
     }if(i>80){
         setProgreso("Cargando interfaz " + i+"%", i);
         for (long j=0; j<150000; ++j)
            {
              String poop = " " + (j + i);
            }
     }if(i>82 && i<90){
         for (long j=0; j<450000; ++j)
            {
              String poop = " " + (j + i);
            }
        }
    }
    dispose();}
}