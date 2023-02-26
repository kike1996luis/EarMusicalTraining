
public class playEx implements Runnable{
    
    mainJFrame main;
    Game game;
    public playEx(mainJFrame main, Game game){
        this.main=main;
        this.game=game;
    }
    
        @Override
        public void run(){
            main.skip.setEnabled(false);
            main.getBac.setEnabled(false);
            main.next.setEnabled(false);
            main.textgB.setEnabled(false);
            if(game.poscActual==null){
                main.jLabel16.setEnabled(false);
                for(Sound s: game.adj[game.poscAdj]){
                    s.play();
                }main.jLabel16.setEnabled(true);
            }else{
                if(game.timesRepeated<game.numTrys){
                    main.jLabel16.setEnabled(false);
                    for(Sound s: game.adj[game.poscAdj]){
                        s.play();
                        }game.timesRepeated++;
                    }if(game.timesRepeated>=game.numTrys){
                        main.jLabel16.setEnabled(false);
                    }else{
                        main.jLabel16.setEnabled(true);
                }
        }main.getBac.setEnabled(true);
        main.skip.setEnabled(true);
        main.next.setEnabled(true);
        main.textgB.setEnabled(true);
    }
}
