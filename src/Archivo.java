
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    
    Scanner mirar;
    File file;
    FileWriter fichero;
    PrintWriter pw;
    BufferedWriter bw;
    public Archivo(){
        try{
            file=new File("data.rs");
            mirar = new Scanner (file);
            fichero=new FileWriter(file.getPath(), true);
            pw=new PrintWriter(fichero);
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(IOException e)
	   { System.out.print(e); }
    }
    
    public String readLine(){
        if(mirar.hasNextLine()){
            return mirar.nextLine();
        }else{
            return "null";
        }    
    }
    
    public void deleteFile(){
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write("");
            closeFile();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addLine(String line){
        pw.println(line);
    }
    
    public void closeFile(){
        try {
            pw.close();
            fichero.close();
            mirar.close();
            //bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
