
public class Answer implements Runnable{        //Cuando se oprima el boton para responder el ejercicio
    
        private final Bag<Sound> adj[];
        //private boolean answerAction;
    Answer(Bag<Sound> adj[]){
        this.adj=adj;
        //this.answerAction=answerAction;
    }
    
        @Override
        public void run(){
            
            try{
                synchronized(adj){
                    
                    adj.notify();
                }
            }catch(Exception ex){
                
            }
        }
}
