import javax.sound.midi.*;
import java.io.*;
import java.util.Random;
        
public class Sound {
   
    private int unity;
    private final int numExc;
    private final int tempo;
    private Sequencer midiPlayer;
    
    private final String[] sounddir = {"/sounds/c/", "/sounds/csharp/", "/sounds/d/", "/sounds/dsharp/",
    "/sounds/e/", "/sounds/f/", "sounds/fsharp/", "/sounds/g/", "/sounds/gsharp/", "/sounds/a/",
    "/sounds/asharp/", "/sounds/b/"};
    
    private final String[] soundFileNames = { "ex0.mid", "ex1.mid",
    "ex2.mid", "ex3.mid", "ex4.mid", "ex5.mid", "ex6.mid", "ex7.mid", 
    "ex8.mid", "ex9.mid", "ex10.mid", "ex11.mid", "ex12.mid",
    "ex13.mid", "ex14.mid", "ex15.mid", "ex16.mid", "ex17.mid",
    "ex18.mid", "ex19.mid", "ex20.mid", "ex21.mid", "ex22.mid",
    "ex23.mid", "ex24.mid", "intro.mid", "ex25.mid", "ex26.mid"
    , "ex27.mid", "ex28.mid", "ex29.mid", "ex30.mid", "ex31.mid"
    , "ex32.mid", "ex33.mid", "ex34.mid", "ex35.mid", "ex36.mid"
    , "ex37.mid", "ex38.mid", "ex39.mid", "ex40.mid", "ex41.mid"
    , "ex42.mid", "ex43.mid", "ex44.mid", "ex45.mid", "ex46.mid"
    , "ex47.mid", "ex48.mid", "ex49.mid", "ex50.mid", "ex51.mid"
    , "ex52.mid", "ex53.mid", "ex54.mid", "ex55.mid", "ex56.mid"
    , "ex57.mid", "ex58.mid", "ex59.mid", "ex60.mid", "ex61.mid"
    , "ex62.mid", "ex63.mid", "ex64.mid", "ex65.mid", "ex66.mid"
    , "ex67.mid", "ex68.mid", "ex69.mid", "ex70.mid", "ex71.mid"
    , "ex72.mid", "ex73.mid", "ex74.mid", "ex75.mid", "ex76.mid"
    , "ex77.mid", "ex78.mid", "ex79.mid", "ex80.mid", "ex81.mid"
    , "ex82.mid", "ex83.mid", "ex84.mid", "ex85.mid", "ex86.mid"
    , "ex87.mid", "ex88.mid", "ex89.mid", "ex90.mid", "ex91.mid"
    , "ex92.mid", "ex93.mid", "ex94.mid", "ex95.mid", "ex96.mid"
    , "ex97.mid", "ex98.mid", "ex99.mid"};
    
    Sound(boolean[] opcUnity, int tempo){    //Se genera a partir de las opciones en TRUE
        
        Random random=new Random();
        this.tempo=tempo;
        this.unity=random.nextInt(12);       //Unidad aleatoria
        if(tempo==0){
            this.numExc=25;
        }else{
            this.numExc=random.nextInt(100);      //Número del ejercicio
        }
        while(opcUnity[unity]==false){
                unity=random.nextInt(12);    //Si el numero generado no está en la seleccion, se busca otro
        }
    }
    
    
    @SuppressWarnings("SleepWhileInLoop")
    public void play(){
        
            try {
                midiPlayer = MidiSystem.getSequencer();
                midiPlayer.open();
                midiPlayer.setSequence(MidiSystem.getSequence(getClass().getResource(sounddir[unity]+soundFileNames[numExc])));
                switch (tempo) {
                    case 0:
                        midiPlayer.setTempoInBPM(250);
                        break;
                    case 1:
                        midiPlayer.setTempoInBPM(60);
                        break;
                    case 2:
                        midiPlayer.setTempoInBPM(90);
                        break;
                    case 3:
                        midiPlayer.setTempoInBPM(120);
                        break;
                    case 4:
                        midiPlayer.setTempoInBPM(150);
                        break;
                    default:
                        break;
                }
                midiPlayer.start();
                while(true) {
                    if(midiPlayer.isRunning()) {
                        try {
                            Thread.sleep(1000);
                        } catch(InterruptedException ignore) {
                            break;
                        }
                    } else {
                        break;
                    }
                }midiPlayer.close();
            }
        catch(MidiUnavailableException mue) {
            System.out.println("Midi device unavailable!");
        } catch(InvalidMidiDataException imde) {
            System.out.println("Invalid Midi data!");
        } catch(IOException ioe) {
            System.out.println("I/O Error!");
        }
    }
    
    public boolean isRunning(){
        return midiPlayer.isRunning();
    }
    
    public int unity(){
        return unity;
    }
}