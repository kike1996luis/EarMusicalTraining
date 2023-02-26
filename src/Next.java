
public class Next implements Runnable{
    
        private final Bag<Sound> adj[];
    Next(Bag<Sound> adj[]){
        this.adj=adj;
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
