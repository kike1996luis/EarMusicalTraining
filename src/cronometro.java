

import java.awt.Font;
import javax.swing.JLabel;


public class cronometro implements Runnable{
    
    JLabel tiempo;
    Thread hilo;
    boolean cronometroActivo;
    Integer minlimit;
    mainJFrame main;
    
    public cronometro(JLabel tiempo, String minlimit, mainJFrame main){
        this.tiempo=tiempo;
        tiempo.setFont( new Font( Font.SERIF, Font.BOLD, 16 ) );
        this.minlimit=Integer.parseInt(minlimit);
        this.main=main;
    }
    
    @SuppressWarnings("SleepWhileInLoop")
    @Override
    public void run(){
        Integer minutos = 0 , segundos = 0, milesimas = 0;
        String min, seg;
        try
        {
            while( cronometroActivo)
            {
                Thread.sleep( 4 );
                milesimas += 4;
                if( milesimas == 1000 )
                {
                    milesimas = 0;
                    segundos += 1;
                    if( segundos == 60 )
                    {
                        segundos = 0;
                        minutos++;
                    }
                }if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();
                tiempo.setText( min + ":" + seg);
                if(minutos.equals(minlimit)){           
                        main.showWindow(true);
                        pararCronometro();
                        break;
                    }
            }
        }catch(InterruptedException e){}
        tiempo.setText( "00:00" );
    }
    
    public void iniciarCronometro() {
        cronometroActivo = true;
        hilo = new Thread( this );
        hilo.start();
    }
  
    public void pararCronometro(){
        cronometroActivo = false;
    }
}