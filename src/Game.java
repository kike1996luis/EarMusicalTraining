import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import java.util.Date;

public final class Game {
    
    public final Bag<Sound>[] adj;      //Donde almaceno los sonidos
    private final int unidadesBuenas[];
    private final int unidadesMalas[];
    private final int size;     //Número de ejercicios totales
    public Integer poscActual;     //Evalúa cuantos ejercicios por unidad se crearon
    public int numTrys;      //Número de intentos para cada ejercicio
    private final int []vecesAparecidas;        //Número de veces que ha aparecido una unidad
    boolean respuesta[];        //Selecciones de los botones, para la respuesta
    Queue<Integer> respuestasfinales;
    Queue<Integer> temp;
    int tempo;              //tempo elegido para la reproducción de los ejercicios
    int timesRepeated;      //Veces que se ha reproducido el ejercicio
    int poscAdj;            //Posición actual del arreglo en el que se está
    JButton next;
    mainJFrame main;
    String hourFinish;
    String hourStart;
    String dateStart;
    String dateFinish;
    Game game;
    boolean close;
    boolean isTest;
    int sum;
    
    Game(boolean isTest, int sum,int numTrys, boolean[] opcUnity, int size, int tempo, 
            boolean respuesta[], mainJFrame main){
        this.main=main;
        this.timesRepeated=0;
        this.poscActual=0;
        this.game=this;
        this.tempo=tempo;
        this.close=false;
        this.sum=sum;
        this.respuesta=respuesta;
        this.isTest=isTest;
        this.numTrys=numTrys;
        this.size=size; 
        this.respuestasfinales=new LinkedList<>();
        this.temp=new LinkedList();
        unidadesMalas=new int[respuesta.length];
        unidadesBuenas=new int[respuesta.length];
        vecesAparecidas=new int[respuesta.length];
        for(int i=0;i<respuesta.length;i++){
            unidadesMalas[i]=0;
            unidadesBuenas[i]=0;
            vecesAparecidas[i]=0;
        }Random random=new Random();
        adj=(Bag<Sound>[]) new Bag[size];
        for(int i=0;i<size;i++){
            adj[i]=new Bag<>();
        }for(int i=0;i<size;i++){            //Se crean de 3 a 5 sonidos por cada posicion del arreglo
            int rand=random.nextInt(3);
            int randsum=rand+3;
            for(int j=0;j<randsum;j++){
                createSound(opcUnity, i);       //Aquí se crea el ejercicio
            }
        }
    }
    
    private void setRespuestafalse(){
        for(int m=0;m<respuesta.length;m++){
            respuesta[m]=false;
        }main.buttonsFalse();
    }
    
    private void createSound(boolean[] opcUnity, int posc){
        Sound s=new Sound(opcUnity, tempo);
        adj[posc].add(s);
    }
    
    public int poscActual(){
        return poscActual;
    }
    
    public void finish(){
        close=true;
        synchronized(adj){
            adj.notifyAll();
        }
    }
    
    public void start(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss");
        hourStart=("Hora de comienzo: "+hourdateFormat.format(date));
        hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateStart=("Fecha de comienzo: "+hourdateFormat.format(date));
        start s=new start();
        Thread t=new Thread(s);
        t.start();
    }

    public class start implements Runnable{
        
        @Override
        @SuppressWarnings({"ResultOfObjectAllocationIgnored", "CallToThreadStopSuspendOrResumeManager"})
        public void run(){
            
            synchronized(adj){
                try{
                    main.jLabel15.setEnabled(true);
                    main.cronometer.iniciarCronometro();        //Iniciar el cronometro desde acá
                    int i=0;
                    while(i<size && main.cronometer.cronometroActivo && !close){//ciclo principal de reproducción, si no se oprime un boton, no avanza
                        
                        main.jLabel29.setText("Ejercicio#"+(i+1));
                        main.lol.setText("");
                        setRespuestafalse();    //Coloca todas las respuestas en false para volver a seleccionarse
                        poscActual=0;           //Se coloca en 0 para volver a usarse
                        main.answerAction=false;     //Se coloca en false para volver a usar la acción del click
                        poscAdj=i;              //Posicion actual del arreglo principal
                        timesRepeated=0;
                        if(numTrys==1){
                            main.jLabel16.setEnabled(false);
                        }for(Sound s: adj[i]){
                            poscActual++;       //Cuenta cuantos sonidos se incluyen en el ejercicio actual
                        }playEx a=new playEx(main, game); 
                        Thread t=new Thread(a);
                        t.start();
                        if(numTrys!=1){
                            main.jLabel16.setEnabled(true);
                        }adj.wait();
                        
                        if(main.answerAction){        //Si no se oprime el botón para avanzar, se queda quieto
                            
                            if(evaluarRespuesta(i)){
                                main.lol.setForeground(Color.green);
                                main.lol.setText("Correcto!");
                            }else{
                                String s = "Incorrecto!, la respuesta es ";
                                while(!respuestasfinales.isEmpty()){
                                    Integer aux=respuestasfinales.poll();
                                    if(null!=aux)switch (aux) {
                                        case 0:
                                            s = (s + "C ");
                                            break;
                                        case 1:
                                            s = (s + "C# ");
                                            break;
                                        case 2:
                                            s = (s + "D ");
                                            break;
                                        case 3:
                                            s = (s + "Eb ");
                                            break;
                                        case 5:
                                            s = (s + "F ");
                                            break;
                                        case 4:
                                            s = (s + "E ");
                                            break;
                                        case 6:
                                            s = (s + "F# ");
                                            break;
                                        case 7:
                                            s = (s + "G ");
                                            break;
                                        case 8:
                                            s = (s + "Ab ");
                                            break;
                                        case 9:
                                            s = (s + "A ");
                                            break;
                                        case 10:
                                            s = (s + "Bb ");
                                            break;
                                        case 11:
                                            s = (s + "B ");
                                            break;
                                        default:
                                            break;
                                    }
                                }main.lol.setForeground(Color.red);
                                main.lol.setText(s);
                            }
                            poscActual=null;            //Para volverlo a reproducir
                            main.jLabel16.setEnabled(true);
                            adj.wait();      //Se pausa hasta oprimir el botón de continuar                         
                        }i++;
                    }if(main.cronometer.cronometroActivo){
                        main.cronometer.pararCronometro();
                    }if(!close){
                        setFinishDate();
                        main.showWindow(false);
                    }
                }catch(InterruptedException e){
                    
                }
            }
        }
    }
    
    public void setFinishDate(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFinish=("Fecha de finalización: "+hourdateFormat.format(date));
        hourdateFormat = new SimpleDateFormat("HH:mm:ss");
        hourFinish=("Hora de finalización: "+hourdateFormat.format(date));
    }
    
    public void setResults(){
        Results rs=new Results(main);
        rs.setResults(isTest, hourStart, hourFinish, dateStart, dateFinish, 
                unidadesMalas, sum,unidadesBuenas, size, vecesAparecidas);
    }
    
    public boolean evaluarRespuesta(int i){
        
        for(Sound s: adj[i]){     
            vecesAparecidas[s.unity()]=vecesAparecidas[s.unity()]+1;
            if(!respuestasfinales.contains(s.unity())){     // determina respuestas Para luego mostrarse
                    respuestasfinales.add(s.unity());
            }
        }boolean finalAnswer=false;
        int tamaux=0;
        for(int j=0;j<respuesta.length;j++){
            if(respuesta[j]){           //Si la opcion está seleccionada
                
                int tamtemp=0;
                for(Sound s: adj[i]){       //Se comprueba si está en el ejercicio reproducido
                    
                    if(s.unity()==j){
                        
                        tamaux++;
                        if(!temp.contains(j)){      //Si no se ha seleccionado anteriormente
                            unidadesBuenas[j]=unidadesBuenas[j]+1;
                            temp.add(j);
                        }
                    }tamtemp++;
                }if(tamaux!=tamtemp){
                    if(!temp.contains(j)){
                            unidadesMalas[j]=unidadesMalas[j]+1;
                            temp.add(j);
                        }
                }else{
                    finalAnswer=true;
                }
            }temp.clear();
        }return finalAnswer;
    }
}