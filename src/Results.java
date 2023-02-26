
import java.awt.GridLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class Results {
    
    Archivo archivo;
    mainJFrame main;
    Bag<String>[] pagina;
    int numPaginas;
    int pagActual;
    
    public Results(mainJFrame main){
        
        pagActual=0;
        this.main=main;
        numPaginas=0;
        archivo=new Archivo();
        pagina=(Bag<String>[]) new Bag[9999];
        for(int i=0;i<99;i++){
            pagina[i]=new Bag<>();
        }
    }
    
    public void getResults(){
        
        comprobarSigAnt();
        String linea="";
        int i=0;
        while(!linea.equals("null")){
            pagina[i].add(linea);
            linea=archivo.readLine();
            if(linea.equals("FINISH")){
                
                linea=archivo.readLine();
                i++;
                numPaginas++;
            }
        }pagActual=numPaginas-1;
        showPage(numPaginas-1);
        comprobarSigAnt();       
    }
    
    public void setPagActual(boolean suma){
        if(suma){
            pagActual=pagActual+1;
        }else{
            pagActual=pagActual-1;
        }showPage(pagActual);
    }
    
    public void comprobarSigAnt(){          
        if(pagActual==0){
            main.jLabel9.setEnabled(false);
        }else{
            main.jLabel9.setEnabled(true);
        }if(pagActual<numPaginas-1){
            main.jLabel10.setEnabled(true);
        }else{
            main.jLabel10.setEnabled(false);
        }
    }

    public void deleteData(){
        archivo.deleteFile();
    }
    
    public void showPage(int page){
        
        main.jLabel4.setText("Página#"+(pagActual+1));
        comprobarSigAnt();
        JPanel panel = new JPanel();
        GridLayout experimentLayout = new GridLayout(0,1);
        for(String line: pagina[page]){
            panel.setLayout(experimentLayout);
            panel.add(new JLabel(line));
        }JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50, 30, 400, 300);
        scrollPane.setEnabled(true);
        main.jPanel1.removeAll();
        main.jPanel1.add(scrollPane);
        main.results.add(main.jPanel1, new AbsoluteConstraints(0, 0, -1, -1));
        main.results.pack();
    }
    
    public void setResults(boolean isTest, String hourStart, String hourFinish, String dateStart, String dateFinish, int unidadesMalas[], 
            int unidadesElegidas, int unidadesBuenas[], int numEjercicios, int vecesAparecidas[]){
        
        int cant=14;
        archivo.addLine(dateStart);
        archivo.addLine(hourStart);
        archivo.addLine("");
        if(isTest){
            archivo.addLine("Modo Exámen: ");
        }else{
            archivo.addLine("Modo Práctica: ");
        }this.archivo=new Archivo();
        archivo.addLine("");
        if(numEjercicios==999){
            archivo.addLine("Total de ejercicios: "+"Infinito");
        }else{
            archivo.addLine("Total de ejercicios: "+numEjercicios);
        }
        archivo.addLine("Unidades evaluadas: "+unidadesElegidas);
        archivo.addLine("Respondido correctamente: ");
        for(int i=0;i<unidadesBuenas.length;i++){
            if(unidadesBuenas[i]!=0){
                switch (i) {
                    case 0:
                        archivo.addLine("    C: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 1:
                        archivo.addLine("    C#: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 2:
                        archivo.addLine("    D: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 3:
                        archivo.addLine("    Eb: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 4:
                        archivo.addLine("    E: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 5:
                        archivo.addLine("    F: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 6:
                        archivo.addLine("    F#: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 7:
                        archivo.addLine("    G: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 8:
                        archivo.addLine("    Ab: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 9:
                        archivo.addLine("    A: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 10:
                        archivo.addLine("    Bb: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 11:
                        archivo.addLine("    B: "+unidadesBuenas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    default:
                        break;
                }
            }
        }archivo.addLine("");
        archivo.addLine("Respondido incorrectamente: ");
        for(int i=0;i<unidadesMalas.length;i++){
            if(unidadesMalas[i]!=0){
                switch (i) {
                    case 0:
                        archivo.addLine("    C: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 1:
                        archivo.addLine("    C#: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 2:
                        archivo.addLine("    D: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 3:
                        archivo.addLine("    Eb: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 4:
                        archivo.addLine("    E: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 5:
                        archivo.addLine("    F: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 6:
                        archivo.addLine("    F#: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 7:
                        archivo.addLine("    G: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 8:
                        archivo.addLine("    Ab: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 9:
                        archivo.addLine("    A: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 10:
                        archivo.addLine("    Bb: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    case 11:
                        archivo.addLine("    B: "+unidadesMalas[i]+"/"+vecesAparecidas[i]);
                        cant=cant+1;
                        break;
                    default:
                        break;
                }
            }
        }archivo.addLine("");
        archivo.addLine(dateFinish);
        archivo.addLine(hourFinish);
        if(cant<18){
            int sum=18-cant;
            for(int i=0;i<sum;i++){
                archivo.addLine("");
            }
        }archivo.addLine("FINISH");
        archivo.closeFile();
    }
}