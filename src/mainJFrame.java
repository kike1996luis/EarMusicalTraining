import java.awt.*;
import java.awt.image.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class mainJFrame extends javax.swing.JFrame {

    private final String imagedir = "/images/";     //Ruta de imagenes
    private final String[] imageFileNames = { "C.png", "Db.png",    //Nombre de imagenes
    "D.png", "Eb.png", "E.png", "F.png", "Gb.png", "G.png",
    "Ab.png", "A.png", "Bb.png", "B.png", "COFcolor.png",
    "COFwhite.png"};
    private final boolean respuesta[];  //Variable que guarda las respuesta seleccionadas
    private final boolean opcNotas[];   //Variable que guarda las unidades seleccionadas para empezar el programa
    boolean nextAction=false;           //Variable que guarda la acción de siguiente
    boolean answerAction=false;         //Variable que guarda la acción de respuesta
    Game game;                          //El juego
    JLabel getBac;
    JLabel lol;
    JLabel textgB;
    boolean cronometerSelected;
    JLabel Exit1;
    String minlimit;
    int x=0, y=0;
    Results rs1;
    boolean Test;
    cronometro cronometer;
    
    @SuppressWarnings({"OverridableMethodCallInConstructor", "SillyAssignment", "ResultOfObjectAllocationIgnored"})
    public mainJFrame() {
        this.setUndecorated(true);
        initComponents();
        new Archivo();
        Time.setUndecorated(true);
        this.Test=false;
        Exit.setUndecorated(true);
        this.cronometerSelected=false;
        this.textgB=jLabel17;
        this.minlimit= "99999";
        this.opcNotas=new boolean[12];
        this.respuesta=new boolean[12];
        this.setBounds(WIDTH, WIDTH, 494, 231);
        this.setResizable(false);
        this.lol=answer;
        this.getBac=jLabel17;
        this.skip=skip;
        this.next=next;
        this.setLocation(220, 56);
    }

    public void reestablecerNotas(){
        for(int i=0;i<opcNotas.length;i++){
            opcNotas[i]=false;
        }
    }
    
    public void buttonsFalse(){
        C1.setEnabled(true);
        Csharp1.setEnabled(true);
        D1.setEnabled(true);
        Dsharp1.setEnabled(true);
        E1.setEnabled(true);
        F1.setEnabled(true);
        Fsharp1.setEnabled(true);
        G1.setEnabled(true);
        Gsharp1.setEnabled(true);
        A1.setEnabled(true);
        Asharp1.setEnabled(true);
        B1.setEnabled(true);
        C.setEnabled(true);
        Csharp.setEnabled(true);
        D.setEnabled(true);
        Dsharp.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        Fsharp.setEnabled(true);
        G.setEnabled(true);
        Gsharp.setEnabled(true);
        A.setEnabled(true);
        Asharp.setEnabled(true);
        B.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        practiceModeConfig = new javax.swing.JDialog(this);
        C = new javax.swing.JLabel();
        Csharp = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        Dsharp = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        Fsharp = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        Gsharp = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        Asharp = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        Slider = new javax.swing.JSlider();
        numTryscombo = new javax.swing.JComboBox<>();
        movingBar1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Error = new javax.swing.JLabel();
        help1 = new javax.swing.JLabel();
        minimized1 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        imgPconfig = new javax.swing.JLabel();
        practiceMode = new javax.swing.JDialog(this);
        C1 = new javax.swing.JLabel();
        Asharp1 = new javax.swing.JLabel();
        Csharp1 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        Dsharp1 = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Fsharp1 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        Gsharp1 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        skip = new javax.swing.JLabel();
        answer = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        help2 = new javax.swing.JLabel();
        movingBar = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimized = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        imgPractice = new javax.swing.JLabel();
        testModeConfig = new javax.swing.JDialog(this);
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Fsharp2 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        Csharp2 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Gsharp2 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        Dsharp2 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Asharp2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        close3 = new javax.swing.JLabel();
        help3 = new javax.swing.JLabel();
        minimized3 = new javax.swing.JLabel();
        movingBar3 = new javax.swing.JLabel();
        fondo4 = new javax.swing.JLabel();
        imgPconfig1 = new javax.swing.JLabel();
        results = new javax.swing.JDialog(this);
        minimized4 = new javax.swing.JLabel();
        movingBar4 = new javax.swing.JLabel();
        close4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        trash = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel(null);
        Time = new javax.swing.JDialog(this);
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        close5 = new javax.swing.JLabel();
        minimized5 = new javax.swing.JLabel();
        movingBar5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Exit = new javax.swing.JDialog();
        movingBar6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EraseAll = new javax.swing.JDialog();
        movingBar7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        movingBar2 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        minimized2 = new javax.swing.JLabel();
        linkedin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        website = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        practiceModeConfig.setUndecorated(true);
        practiceModeConfig.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        practiceModeConfig.setBackground(new java.awt.Color(242, 176, 53));
        practiceModeConfig.setBounds(new java.awt.Rectangle(444, 308, 0, 0));
        practiceModeConfig.setSize(new java.awt.Dimension(400, 300));
        practiceModeConfig.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/C.png"))); // NOI18N
        C.setText("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 30, -1));

        Csharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/C#.png"))); // NOI18N
        Csharp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CsharpMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(Csharp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/D.png"))); // NOI18N
        D.setText("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 30, -1));

        Dsharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Eb.png"))); // NOI18N
        Dsharp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DsharpMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(Dsharp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/E.png"))); // NOI18N
        E.setText("E");
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, -1));

        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/F.png"))); // NOI18N
        F.setText("F");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 30, -1));

        Fsharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/F#.png"))); // NOI18N
        Fsharp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FsharpMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(Fsharp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/G.png"))); // NOI18N
        G.setText("G");
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 30, -1));

        Gsharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Ab.png"))); // NOI18N
        Gsharp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GsharpMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(Gsharp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/A.png"))); // NOI18N
        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 30, -1));

        Asharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Bb.png"))); // NOI18N
        Asharp.setText("A#");
        Asharp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsharpMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(Asharp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 30, -1));

        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/B.png"))); // NOI18N
        B.setText("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });
        practiceModeConfig.getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 30, -1));

        Slider.setBackground(new java.awt.Color(242, 176, 53));
        Slider.setForeground(new java.awt.Color(0, 0, 0));
        Slider.setMajorTickSpacing(1);
        Slider.setMaximum(4);
        Slider.setMinimum(1);
        Slider.setPaintTicks(true);
        Slider.setSnapToTicks(true);
        Slider.setValue(2);
        Slider.setAutoscrolls(true);
        Slider.setFocusable(false);
        Slider.setVerifyInputWhenFocusTarget(false);
        practiceModeConfig.getContentPane().add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 200, 30));

        numTryscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5"}));
        numTryscombo.setFocusable(false);
        numTryscombo.setVerifyInputWhenFocusTarget(false);
        numTryscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTryscomboActionPerformed(evt);
            }
        });
        practiceModeConfig.getContentPane().add(numTryscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        movingBar1.setText(" ");
        movingBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar1MouseDragged(evt);
            }
        });
        movingBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar1MousePressed(evt);
            }
        });
        practiceModeConfig.getContentPane().add(movingBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ComenzarN.png"))); // NOI18N
        jLabel15.setText("jLabel1");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        practiceModeConfig.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 90, -1));

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png"))); // NOI18N
        close1.setText(" ");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close1MouseExited(evt);
            }
        });
        practiceModeConfig.getContentPane().add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 10, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarN.png"))); // NOI18N
        jLabel14.setText("jLabel1");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        practiceModeConfig.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 90, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 ejercicios", "10 ejercicios", "15 ejercicios", "20 ejercicios", "25 ejercicios" , "30 ejercicios", "35 ejercicios", "40 ejercicios", "45 ejercicios", "50 ejercicios", "Infinito"}));
        jComboBox1.setFocusable(false);
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        practiceModeConfig.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 107, -1));

        Error.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setText(" ");
        practiceModeConfig.getContentPane().add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 20));

        help1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png"))); // NOI18N
        help1.setToolTipText("<html><body><pre>"+
            "1)Selecciona todas las tonalidades que desees practicar"+
            "<html><body><pre>"+
            "2)Selecciona la velocidad de los ejercicios ajustando el tempo"+
            "<html><body><pre>"+
            "3)Selecciona cuantos intentos tendrás por cada ejercicio"+
            "<html><body><pre>"+
            "4)Selecciona cuantos ejercicios van a ser para terminar"+
            "<html><body><pre>"+
            "5)Oprime comenzar!");
        help1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help1MouseExited(evt);
            }
        });
        practiceModeConfig.getContentPane().add(help1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        minimized1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png"))); // NOI18N
        minimized1.setText(" ");
        minimized1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimized1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimized1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimized1MouseExited(evt);
            }
        });
        practiceModeConfig.getContentPane().add(minimized1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 30, -1));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/workbar3.png"))); // NOI18N
        fondo3.setText(" ");
        practiceModeConfig.getContentPane().add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        imgPconfig.setText(" ");
        practiceModeConfig.getContentPane().add(imgPconfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 460, -1));

        practiceMode.setUndecorated(true);
        practiceMode.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        practiceMode.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/C.png"))); // NOI18N
        C1.setText("C");
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 30, -1));

        Asharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Bb.png"))); // NOI18N
        Asharp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Asharp1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(Asharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        Csharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/C#.png"))); // NOI18N
        Csharp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Csharp1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(Csharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/B.png"))); // NOI18N
        B1.setText("B");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 30, -1));

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/D.png"))); // NOI18N
        D1.setText("D");
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 30, -1));

        Dsharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Eb.png"))); // NOI18N
        Dsharp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dsharp1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(Dsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        reloj.setText("Cronómetro");
        practiceMode.getContentPane().add(reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/E.png"))); // NOI18N
        E1.setText("E");
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, -1));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/F.png"))); // NOI18N
        F1.setText("F");
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 30, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/playExited.png"))); // NOI18N
        jLabel16.setText(" ");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 50, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarN.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, 40));

        Fsharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/F#.png"))); // NOI18N
        Fsharp1.setText("F#");
        Fsharp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fsharp1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(Fsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 30, 30));

        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/G.png"))); // NOI18N
        G1.setText("G");
        G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 30, -1));

        Gsharp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Ab.png"))); // NOI18N
        Gsharp1.setText("G#");
        Gsharp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gsharp1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(Gsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 30, -1));

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/A.png"))); // NOI18N
        A1.setText("A");
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        practiceMode.getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 30, -1));

        skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/next.png"))); // NOI18N
        skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skipMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                skipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                skipMouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 50, -1));

        answer.setText("Aquí va la respuesta...");
        practiceMode.getContentPane().add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel29.setText("Ejercicio# ");
        practiceMode.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        help2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png"))); // NOI18N
        help2.setToolTipText("<html><body><pre>"+
            "Selecciona las tonalidades (unidades) que has escuchado"+
            "<html><body><pre>"+
            "Si no estás seguro de la respuesta puedes darle al botón de replay"+
            "<html><body><pre>"+
            "(Sólo si activaste la opción en la configuración)"+
            "<html><body><pre>"+
            "Para responder oprime el botón del gancho y averigüa la respuesta"+
            "<html><body><pre>"+
            "Oprime el botón de siguiente para saltar de ejercicio");
        help2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help2MouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(help2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        movingBar.setText(" ");
        movingBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBarMouseDragged(evt);
            }
        });
        movingBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBarMousePressed(evt);
            }
        });
        practiceMode.getContentPane().add(movingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 20));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png"))); // NOI18N
        close.setText(" ");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 20));

        minimized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png"))); // NOI18N
        minimized.setText(" ");
        minimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizedMouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(minimized, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 30, -1));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/responder.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextMouseExited(evt);
            }
        });
        practiceMode.getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 50, -1));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/workbar4.png"))); // NOI18N
        fondo2.setText(" ");
        practiceMode.getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        imgPractice.setText(" ");
        practiceMode.getContentPane().add(imgPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, -1));
        practiceMode.getContentPane().add(imgPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 460, -1));

        testModeConfig.setUndecorated(true);
        testModeConfig.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Vrinda", 3, 11)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarN.png"))); // NOI18N
        jLabel19.setText(" Regresar");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        testModeConfig.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 90, 40));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Vrinda", 3, 11)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ComenzarN.png"))); // NOI18N
        jLabel21.setText(" Comenzar");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        testModeConfig.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 90, 40));

        jLabel25.setFont(new java.awt.Font("Vrinda", 3, 11)); // NOI18N
        testModeConfig.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 40, -1));

        Fsharp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/F#.png"))); // NOI18N
        Fsharp2.setText("F#");
        Fsharp2.setEnabled(false);
        Fsharp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fsharp2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(Fsharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 30, -1));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/C.png"))); // NOI18N
        C2.setText("C");
        C2.setEnabled(false);
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 30, -1));

        Csharp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/C#.png"))); // NOI18N
        Csharp2.setText("C#");
        Csharp2.setEnabled(false);
        Csharp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Csharp2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(Csharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 30, -1));

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/G.png"))); // NOI18N
        G2.setText("G");
        G2.setEnabled(false);
        G2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 30, -1));

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/D.png"))); // NOI18N
        D2.setText("D");
        D2.setEnabled(false);
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 30, -1));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setToolTipText("Usar cronómetro para fijar límite de tiempo.");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        testModeConfig.getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, 40));

        Gsharp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Ab.png"))); // NOI18N
        Gsharp2.setText("G#");
        Gsharp2.setEnabled(false);
        Gsharp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gsharp2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(Gsharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 30, -1));

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/A.png"))); // NOI18N
        A2.setText("A");
        A2.setEnabled(false);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 30, -1));

        Dsharp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Eb.png"))); // NOI18N
        Dsharp2.setText("D#");
        Dsharp2.setEnabled(false);
        Dsharp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dsharp2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(Dsharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 30, -1));

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/E.png"))); // NOI18N
        E2.setText("E");
        E2.setEnabled(false);
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 30, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField1.setText("Introduzca los minutos");
        jTextField1.setToolTipText("Introduzca cuantos minutos  va a ser límite el exámen.");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        testModeConfig.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 120, 20));

        Asharp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Bb.png"))); // NOI18N
        Asharp2.setEnabled(false);
        Asharp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Asharp2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(Asharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/B.png"))); // NOI18N
        B2.setText("B");
        B2.setEnabled(false);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 30, -1));

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/F.png"))); // NOI18N
        F2.setText("F");
        F2.setEnabled(false);
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F2MouseClicked(evt);
            }
        });
        testModeConfig.getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 30, -1));

        close3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png"))); // NOI18N
        close3.setText(" ");
        close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close3MouseExited(evt);
            }
        });
        testModeConfig.getContentPane().add(close3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 10, 20));

        help3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png"))); // NOI18N
        help3.setToolTipText("<html><body><pre>"+
            "NOTA: Todas las tonalidades son seleccionadas para este modo"+
            "<html><body><pre>"+
            "1)Selecciona la velocidad de los ejercicios ajustando el tempo"+
            "<html><body><pre>"+
            "2)Selecciona cuantos intentos tendrás por cada ejercicio"+
            "<html><body><pre>"+
            "3)Activa el cronómetro para hacer la prueba contratiempo"+
            "<html><body><pre>"+
            "NOTA: Al activar el cronómetro debes introducir por texto"+
            "<html><body><pre>"+
            "la cantidad de minutos límite, y luego presionar ENTER"+
            "<html><body><pre>"+
            "4)Selecciona cuantos ejercicios van a ser para terminar"+
            "<html><body><pre>"+
            "5)Oprime comenzar!");
        help3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                help3MouseExited(evt);
            }
        });
        testModeConfig.getContentPane().add(help3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        minimized3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png"))); // NOI18N
        minimized3.setText(" ");
        minimized3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimized3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimized3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimized3MouseExited(evt);
            }
        });
        testModeConfig.getContentPane().add(minimized3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 20, -1));

        movingBar3.setText(" ");
        movingBar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar3MouseDragged(evt);
            }
        });
        movingBar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar3MousePressed(evt);
            }
        });
        testModeConfig.getContentPane().add(movingBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/workbar2.png"))); // NOI18N
        fondo4.setText(" ");
        testModeConfig.getContentPane().add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        imgPconfig1.setText(" ");
        testModeConfig.getContentPane().add(imgPconfig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, -1));

        results.setUndecorated(true);
        results.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimized4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png"))); // NOI18N
        minimized4.setText(" ");
        minimized4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimized4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimized4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimized4MouseExited(evt);
            }
        });
        results.getContentPane().add(minimized4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 20, 20));

        movingBar4.setText("   ");
        movingBar4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar4MouseDragged(evt);
            }
        });
        movingBar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar4MousePressed(evt);
            }
        });
        results.getContentPane().add(movingBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 20));

        close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png"))); // NOI18N
        close4.setText(" ");
        close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close4MouseExited(evt);
            }
        });
        results.getContentPane().add(close4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 10, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/atras.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        results.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/adelante.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        results.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, 60));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/book.png"))); // NOI18N
        results.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 100, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Página# ");
        results.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 20));

        trash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/trash.png"))); // NOI18N
        trash.setToolTipText("Borrar progreso almacenado");
        trash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                trashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                trashMouseExited(evt);
            }
        });
        results.getContentPane().add(trash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 30, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/results.png"))); // NOI18N
        results.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jPanel1.setPreferredSize(new Dimension(500, 400));

        results.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 400, 300));

        Time.setAlwaysOnTop(true);
        Time.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/resultados.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        Time.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Menú.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        Time.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        close5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png"))); // NOI18N
        close5.setText(" ");
        close5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close5MouseExited(evt);
            }
        });
        Time.getContentPane().add(close5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 10, 20));

        minimized5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png"))); // NOI18N
        minimized5.setText(" ");
        minimized5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimized5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimized5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimized5MouseExited(evt);
            }
        });
        Time.getContentPane().add(minimized5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 20, 20));

        movingBar5.setText("   ");
        movingBar5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar5MouseDragged(evt);
            }
        });
        movingBar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar5MousePressed(evt);
            }
        });
        Time.getContentPane().add(movingBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/time.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        Time.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Exit.setAlwaysOnTop(true);
        Exit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movingBar6.setText(" ");
        movingBar6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar6MouseDragged(evt);
            }
        });
        movingBar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar6MousePressed(evt);
            }
        });
        Exit.getContentPane().add(movingBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/no.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        Exit.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/yes.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        Exit.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/exit.png"))); // NOI18N
        Exit.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        EraseAll.setAlwaysOnTop(true);
        EraseAll.setUndecorated(true);
        EraseAll.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movingBar7.setText(" ");
        movingBar7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar7MouseDragged(evt);
            }
        });
        movingBar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar7MousePressed(evt);
            }
        });
        EraseAll.getContentPane().add(movingBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/no.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        EraseAll.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/yes.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        EraseAll.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/erase.png"))); // NOI18N
        EraseAll.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 176, 53));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("/graphs/CSol.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movingBar2.setText("   ");
        movingBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingBar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingBar2MouseDragged(evt);
            }
        });
        movingBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingBar2MousePressed(evt);
            }
        });
        getContentPane().add(movingBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 20));

        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png"))); // NOI18N
        close2.setText(" ");
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close2MouseExited(evt);
            }
        });
        getContentPane().add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 10, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Progreso.png"))); // NOI18N
        jLabel6.setToolTipText("Ver resultados almacenados");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Practica.png"))); // NOI18N
        jLabel31.setToolTipText("Modo Práctica");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 50));

        minimized2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png"))); // NOI18N
        minimized2.setText(" ");
        minimized2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimized2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimized2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimized2MouseExited(evt);
            }
        });
        getContentPane().add(minimized2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 20, 20));

        linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/in.png"))); // NOI18N
        linkedin.setText("    ");
        linkedin.setToolTipText("Enlace a nuestro LinkedIn");
        linkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkedinMouseClicked(evt);
            }
        });
        getContentPane().add(linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 40, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Examen2.png"))); // NOI18N
        jLabel7.setToolTipText("Modo exámen");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 50));

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/fb.png"))); // NOI18N
        facebook.setText("  ");
        facebook.setToolTipText("Enlace a nuestro Facebook");
        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
        });
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, 50));

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/tw.png"))); // NOI18N
        twitter.setText(" ");
        twitter.setToolTipText("Enlace a nuestro Twitter");
        twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });
        getContentPane().add(twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 40, 50));

        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ig.png"))); // NOI18N
        instagram.setText(" ");
        instagram.setToolTipText("Enlace a nuestro Instagram");
        instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramMouseClicked(evt);
            }
        });
        getContentPane().add(instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 169, 40, 50));

        website.setText(" ");
        website.setToolTipText("Enlace a nuestra página web");
        website.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        website.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                websiteMouseClicked(evt);
            }
        });
        getContentPane().add(website, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 140));

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png"))); // NOI18N
        help.setToolTipText("<html><body><pre>"+"Presiona el modo práctica si sólo deseas entrenar tu destreza auditiva"+"<html><body><pre>"+"Presiona el modo examen si deseas evaluar tu progreso (todas las tonalidades están seleccionadas)"+"<html><body><pre>"+"Si quieres seguir nuestro trabajo, visita nuestras redes clickeando en los botónes de abajo");
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/main.PNG"))); // NOI18N
        jLabel30.setText("    ");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class playButtons implements Runnable{
    
        int opc;
        boolean aux[];
        Sound s;
        Thread hilo;
        @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
        public playButtons(int opc){
            this.opc=opc;
            aux=new boolean[12];
            if(opc==0){
                aux[0]=true;
                this.s=new Sound(aux,0);
            }if(opc==1){
                aux[1]=true;
                this.s=new Sound(aux,0);
            }if(opc==2){
                aux[2]=true;
                this.s=new Sound(aux,0);
            }if(opc==3){
                aux[3]=true;
                this.s=new Sound(aux,0);
            }if(opc==4){
                aux[4]=true;
                this.s=new Sound(aux,0);
            }if(opc==5){
                aux[5]=true;
                this.s=new Sound(aux,0);
            }if(opc==6){
                aux[6]=true;
                this.s=new Sound(aux,0);
            }if(opc==7){
                aux[7]=true;
                this.s=new Sound(aux,0);
            }if(opc==8){
                aux[8]=true;
                this.s=new Sound(aux,0);
            }if(opc==9){
                aux[9]=true;
                this.s=new Sound(aux,0);
            }if(opc==10){
                aux[10]=true;
                this.s=new Sound(aux,0);
            }if(opc==11){
                aux[11]=true;
                this.s=new Sound(aux,0);
            }hilo=new Thread(this);
            hilo.start();
        }
        
        @Override
        public void run(){
            s.play();
        }
}
    
    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        opcNotas[0] = !opcNotas[0];
        if(C.isEnabled()){
            new playButtons(0);
            C.setEnabled(false);
        }else{
            C.setEnabled(true);
        }
    }//GEN-LAST:event_CMouseClicked

    private void CsharpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CsharpMouseClicked
        opcNotas[1] = !opcNotas[1];
        if(Csharp.isEnabled()){
            new playButtons(1);
            Csharp.setEnabled(false);
        }else{
            Csharp.setEnabled(true);
        }
    }//GEN-LAST:event_CsharpMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        opcNotas[2] = !opcNotas[2];
        if(D.isEnabled()){
            new playButtons(2);
            D.setEnabled(false);
        }else{
            D.setEnabled(true);
        }
    }//GEN-LAST:event_DMouseClicked

    private void DsharpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DsharpMouseClicked
        opcNotas[3] = !opcNotas[3];
        if(Dsharp.isEnabled()){
            new playButtons(3);
            Dsharp.setEnabled(false);
        }else{
            Dsharp.setEnabled(true);
        }
    }//GEN-LAST:event_DsharpMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked
        opcNotas[4] = !opcNotas[4];
        if(E.isEnabled()){
            new playButtons(4);
            E.setEnabled(false);
        }else{
            E.setEnabled(true);
        }
    }//GEN-LAST:event_EMouseClicked

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
        opcNotas[5] = !opcNotas[5];
        if(F.isEnabled()){
            new playButtons(5);
            F.setEnabled(false);
        }else{
            F.setEnabled(true);
        }
    }//GEN-LAST:event_FMouseClicked

    private void FsharpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FsharpMouseClicked
        opcNotas[6] = !opcNotas[6];
        if(Fsharp.isEnabled()){
            new playButtons(6);
            Fsharp.setEnabled(false);
        }else{
            Fsharp.setEnabled(true);
        }
    }//GEN-LAST:event_FsharpMouseClicked

    private void GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseClicked
        opcNotas[7] = !opcNotas[7];
        if(G.isEnabled()){
            new playButtons(7);
            G.setEnabled(false);
        }else{
            G.setEnabled(true);
        }
    }//GEN-LAST:event_GMouseClicked

    private void GsharpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GsharpMouseClicked
        opcNotas[8] = !opcNotas[8];
        if(Gsharp.isEnabled()){
            new playButtons(8);
            Gsharp.setEnabled(false);
        }else{
            Gsharp.setEnabled(true);
        }
    }//GEN-LAST:event_GsharpMouseClicked

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        opcNotas[9] = !opcNotas[9];
        if(A.isEnabled()){
            new playButtons(9);
            A.setEnabled(false);
        }else{
            A.setEnabled(true);
        }
    }//GEN-LAST:event_AMouseClicked

    private void AsharpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsharpMouseClicked
        opcNotas[10] = !opcNotas[10];
        if(Asharp.isEnabled()){
            new playButtons(10);
            Asharp.setEnabled(false);
        }else{
            Asharp.setEnabled(true);
        }
    }//GEN-LAST:event_AsharpMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        opcNotas[11] = !opcNotas[11];
        if(B.isEnabled()){
            new playButtons(11);
            B.setEnabled(false);
        }else{
            B.setEnabled(true);
        }
    }//GEN-LAST:event_BMouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[0], 500, 300);
        imgPractice.setIcon(icon);
        if(C1.isEnabled()){
            C1.setEnabled(false);
        }else{
            C1.setEnabled(true);
        }respuesta[0] = respuesta[0] != true;
    }//GEN-LAST:event_C1MouseClicked

    private void Asharp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asharp1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[10], 500, 300);
        imgPractice.setIcon(icon);
        if(Asharp1.isEnabled()){
            Asharp1.setEnabled(false);
        }else{
            Asharp1.setEnabled(true);
        }respuesta[10] = respuesta[10] != true;
    }//GEN-LAST:event_Asharp1MouseClicked

    private void Csharp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Csharp1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[1], 500, 300);
        imgPractice.setIcon(icon);
        if(Csharp1.isEnabled()){
            Csharp1.setEnabled(false);
        }else{
            Csharp1.setEnabled(true);
        }respuesta[1] = respuesta[1] != true;
    }//GEN-LAST:event_Csharp1MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[11], 500, 300);
        imgPractice.setIcon(icon);
        if(B1.isEnabled()){
            B1.setEnabled(false);
        }else{
            B1.setEnabled(true);
        }respuesta[11] = respuesta[11] != true;
    }//GEN-LAST:event_B1MouseClicked

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[2], 500, 300);
        imgPractice.setIcon(icon);
        if(D1.isEnabled()){
            D1.setEnabled(false);
        }else{
            D1.setEnabled(true);
        }respuesta[2] = respuesta[2] != true;
    }//GEN-LAST:event_D1MouseClicked

    private void Dsharp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dsharp1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[3], 500, 300);
        imgPractice.setIcon(icon);
        if(Dsharp1.isEnabled()){
            Dsharp1.setEnabled(false);
        }else{
            Dsharp1.setEnabled(true);
        }respuesta[3] = respuesta[3] != true;
    }//GEN-LAST:event_Dsharp1MouseClicked

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[4], 500, 300);
        imgPractice.setIcon(icon);
        if(E1.isEnabled()){
            E1.setEnabled(false);
        }else{
            E1.setEnabled(true);
        }respuesta[4] = respuesta[4] != true;
    }//GEN-LAST:event_E1MouseClicked

    private void F1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[5], 500, 300);
        imgPractice.setIcon(icon);
        if(F1.isEnabled()){
            F1.setEnabled(false);
        }else{
            F1.setEnabled(true);
        }respuesta[5] = respuesta[5] != true;
    }//GEN-LAST:event_F1MouseClicked

    private void Fsharp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fsharp1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[6], 500, 300);
        imgPractice.setIcon(icon);
        if(Fsharp1.isEnabled()){
            Fsharp1.setEnabled(false);
        }else{
            Fsharp1.setEnabled(true);
        }respuesta[6] = respuesta[6] != true;
    }//GEN-LAST:event_Fsharp1MouseClicked

    private void G1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[7], 500, 300);
        imgPractice.setIcon(icon);
        if(G1.isEnabled()){
            G1.setEnabled(false);
        }else{
            G1.setEnabled(true);
        }respuesta[7] = respuesta[7] != true;
    }//GEN-LAST:event_G1MouseClicked

    private void Gsharp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gsharp1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[8], 500, 300);
        imgPractice.setIcon(icon);
        if(Gsharp1.isEnabled()){
            Gsharp1.setEnabled(false);
        }else{
            Gsharp1.setEnabled(true);
        }respuesta[8] = respuesta[8] != true;
    }//GEN-LAST:event_Gsharp1MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[9], 500, 300);
        imgPractice.setIcon(icon);
        if(A1.isEnabled()){
            A1.setEnabled(false);
        }else{
            A1.setEnabled(true);
        }respuesta[9] = respuesta[9] != true;
    }//GEN-LAST:event_A1MouseClicked

    private void comenzarJuego(boolean isTest){
        int numTrys=0, numEx=5;
        getBac.setEnabled(true);
        textgB.setEnabled(true);
        if(isTest){
            for(int i=0;i<opcNotas.length;i++){
                opcNotas[i]=true;
            }
        }if(numTryscombo.getSelectedItem().equals("0")){
            numTrys=0;
        }else if(numTryscombo.getSelectedItem().equals("1")){
            numTrys=1;
        }else if(numTryscombo.getSelectedItem().equals("2")){
            numTrys=2;
        }else if(numTryscombo.getSelectedItem().equals("3")){
            numTrys=3;
        }else if(numTryscombo.getSelectedItem().equals("4")){
            numTrys=4;
        }else if(numTryscombo.getSelectedItem().equals("5")){
            numTrys=5;
        }if(jComboBox1.getSelectedItem().equals("5 ejercicios")){
            numEx=5;
        }else if(jComboBox1.getSelectedItem().equals("10 ejercicios")){
            numEx=10;
        }else if(jComboBox1.getSelectedItem().equals("15 ejercicios")){
            numEx=15;
        }else if(jComboBox1.getSelectedItem().equals("20 ejercicios")){
            numEx=20;
        }else if(jComboBox1.getSelectedItem().equals("25 ejercicios")){
            numEx=25;
        }else if(jComboBox1.getSelectedItem().equals("30 ejercicios")){
            numEx=30;
        }else if(jComboBox1.getSelectedItem().equals("35 ejercicios")){
            numEx=35;
        }else if(jComboBox1.getSelectedItem().equals("40 ejercicios")){
            numEx=40;
        }else if(jComboBox1.getSelectedItem().equals("45 ejercicios")){
            numEx=45;
        }else if(jComboBox1.getSelectedItem().equals("50 ejercicios")){
            numEx=50;
        }else if(jComboBox1.getSelectedItem().equals("Infinito")){
            numEx=999;
        }
        boolean thereOpc=false;
        int sum=0;
        
        for(int i=0;i<opcNotas.length;i++){
            if(opcNotas[i]){
                thereOpc=true;
                sum++;
            }
        }if(thereOpc){
            jLabel15.setEnabled(false);
            ImageIcon icon = createImageIcon(imagedir + imageFileNames[13], 500, 300);
            imgPractice.setIcon(icon);
            this.cronometer=new cronometro(reloj, minlimit, this);
            game=new Game(isTest, sum, numTrys+1, opcNotas, numEx, Slider.getValue(), respuesta, this);
            game.start();
            practiceMode.setEnabled(true);
            practiceMode.setBounds(WIDTH, WIDTH, 460, 530);
            practiceMode.setVisible(true);
            Point windowLocation=this.getLocation();
            this.setLocation(windowLocation);
            practiceModeConfig.setLocation(windowLocation);
            practiceMode.setLocation(windowLocation);
            practiceMode.setResizable(false);
        }else{
            Error.setText("Seleccione al menos una unidad.");
        }
    }
    
    private void numTryscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTryscomboActionPerformed

    }//GEN-LAST:event_numTryscomboActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        OpenBrowser.openURL("https://www.facebook.com/emprendetumusica/");
    }//GEN-LAST:event_facebookMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        OpenBrowser.openURL("https://twitter.com/emprendetumusic");
    }//GEN-LAST:event_twitterMouseClicked

    private void instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseClicked
        OpenBrowser.openURL("https://www.instagram.com/emprendetumusica/");
    }//GEN-LAST:event_instagramMouseClicked

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOn.png")));
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png")));
    }//GEN-LAST:event_helpMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeReleased.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png")));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        practiceMode.setEnabled(false);
        showExit();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedMouseExited
        minimized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png")));
    }//GEN-LAST:event_minimizedMouseExited

    private void minimizedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedMouseEntered
        minimized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedReleased.png")));
    }//GEN-LAST:event_minimizedMouseEntered

    private void minimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizedMouseClicked

    private void movingBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBarMousePressed

    private void movingBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBarMouseDragged
        testModeConfig.setLocation(practiceMode.getLocation().x + evt.getX() - x, practiceMode.getLocation().y +evt.getY() - y);
        practiceMode.setLocation(practiceMode.getLocation().x + evt.getX() - x, practiceMode.getLocation().y +evt.getY() - y);
        practiceModeConfig.setLocation(practiceModeConfig.getLocation().x + evt.getX() - x, practiceModeConfig.getLocation().y +evt.getY() - y);
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBarMouseDragged

    private void movingBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar1MouseDragged
        practiceModeConfig.setLocation(practiceModeConfig.getLocation().x + evt.getX() - x, practiceModeConfig.getLocation().y +evt.getY() - y);
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar1MouseDragged

    private void movingBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar1MousePressed

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        practiceModeConfig.setEnabled(false);
        showExit();
    }//GEN-LAST:event_close1MouseClicked

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeReleased.png")));
    }//GEN-LAST:event_close1MouseEntered

    private void close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseExited
        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png")));
    }//GEN-LAST:event_close1MouseExited

    private void minimized1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimized1MouseClicked

    private void minimized1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized1MouseEntered
        minimized1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedReleased.png")));
    }//GEN-LAST:event_minimized1MouseEntered

    private void minimized1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized1MouseExited
        minimized1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png")));
    }//GEN-LAST:event_minimized1MouseExited

    private void help1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help1MouseEntered
        help1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOn.png")));
    }//GEN-LAST:event_help1MouseEntered

    private void help1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help1MouseExited
        help1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png")));
    }//GEN-LAST:event_help1MouseExited

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        this.setEnabled(false);
        showExit();
    }//GEN-LAST:event_close2MouseClicked

    private void close2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseEntered
        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeReleased.png")));
    }//GEN-LAST:event_close2MouseEntered

    private void close2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseExited
        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png")));
    }//GEN-LAST:event_close2MouseExited

    private void movingBar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar2MouseDragged

    private void movingBar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar2MousePressed

    private void help2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help2MouseEntered
        help2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOn.png")));
    }//GEN-LAST:event_help2MouseEntered

    private void help2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help2MouseExited
        help2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png")));
    }//GEN-LAST:event_help2MouseExited

    private void linkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkedinMouseClicked
        OpenBrowser.openURL("https://www.linkedin.com/company/emprendetumusica/");
    }//GEN-LAST:event_linkedinMouseClicked

    private void websiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_websiteMouseClicked
        OpenBrowser.openURL("https://www.kike19967.wixsite.com/emprendetumusica/");
    }//GEN-LAST:event_websiteMouseClicked

    private void close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseClicked
        testModeConfig.setEnabled(false);
        showExit();
    }//GEN-LAST:event_close3MouseClicked

    private void close3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseEntered
        close3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeReleased.png")));
    }//GEN-LAST:event_close3MouseEntered

    private void close3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseExited
        close3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png")));
    }//GEN-LAST:event_close3MouseExited

    private void help3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help3MouseEntered
        help3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOn.png")));
    }//GEN-LAST:event_help3MouseEntered

    private void help3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help3MouseExited
        help3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/turnedOff.png")));
    }//GEN-LAST:event_help3MouseExited

    private void minimized3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized3MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimized3MouseClicked

    private void minimized3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized3MouseEntered
        minimized3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedReleased.png")));
    }//GEN-LAST:event_minimized3MouseEntered

    private void minimized3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized3MouseExited
        minimized3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png")));
    }//GEN-LAST:event_minimized3MouseExited

    private void movingBar3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar3MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y +evt.getY() - y);
        testModeConfig.setLocation(testModeConfig.getLocation().x + evt.getX() - x, testModeConfig.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar3MouseDragged

    private void movingBar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar3MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar3MousePressed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(jLabel17.isEnabled()){
            practiceMode.dispose();
            cronometer.pararCronometro();
            if(Test){
                testModeConfig.setVisible(true);
            }else{
                reestablecerNotas();
                buttonsFalse();
                practiceModeConfig.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        if(jLabel17.isEnabled()){
            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarB.png")));
        }
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarN.png")));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(jLabel16.isEnabled()){
            playEx a=new playEx(this, game);
            Thread t=new Thread(a);
            t.start();
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        if(jLabel16.isEnabled()){
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/playReleased.png")));
        }        
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/playExited.png")));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        testModeConfig.dispose();
        this.setBounds(WIDTH, WIDTH, 494, 231);
        reestablecerNotas();
        this.setVisible(true);
        this.setLocation(testModeConfig.getLocation());
        testModeConfig.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarB.png")));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarN.png")));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        comenzarJuego(true);
        Test=true;
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ComenzarB.png")));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
         jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ComenzarN.png")));
    }//GEN-LAST:event_jLabel21MouseExited

    private void Fsharp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fsharp2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Fsharp2MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C2MouseClicked

    private void Csharp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Csharp2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Csharp2MouseClicked

    private void G2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_G2MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MouseClicked

    private void Gsharp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gsharp2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Gsharp2MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_A2MouseClicked

    private void Dsharp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dsharp2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Dsharp2MouseClicked

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_E2MouseClicked

    private void Asharp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asharp2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Asharp2MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B2MouseClicked

    private void F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_F2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        minlimit=evt.getActionCommand();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        if(cronometerSelected){
            jTextField1.setEnabled(false);
            jTextField1.setText("Introduzca los minutos");
            minlimit="99999";
            cronometerSelected=false;
        }else{
            jTextField1.setEnabled(true);
            cronometerSelected=true;
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    public void showExit(){
        Exit.setBounds(WIDTH, WIDTH, 285, 145);
        Point windowLocation=this.getLocation();
        Exit.setLocation(windowLocation);
        Exit.setVisible(true);
    }
    
    public void showWindow(boolean desdeCronometro){
        if(desdeCronometro){
            game.setFinishDate();
        }Time.setBounds(WIDTH, WIDTH, 285, 145);
        practiceMode.setEnabled(false);
        testModeConfig.setEnabled(false);
        practiceModeConfig.setEnabled(false);
        Point windowLocation=this.getLocation();
        Time.setLocation(windowLocation);
        Time.setVisible(true);
        getBac.setEnabled(false);
        textgB.setEnabled(false);
        Exit1.setEnabled(false);
    }
    
    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        
            
    }//GEN-LAST:event_helpMouseClicked

    
    private void minimized2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized2MouseExited
        minimized2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png")));
    }//GEN-LAST:event_minimized2MouseExited

    private void minimized2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized2MouseEntered
        minimized2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedReleased.png")));
    }//GEN-LAST:event_minimized2MouseEntered

    private void minimized2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized2MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimized2MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        initPractice();
        practiceModeConfig.setBounds(WIDTH, WIDTH, 460, 530);
        buttonsFalse();
        reestablecerNotas();
        practiceModeConfig.setVisible(true);
        Point windowLocation=this.getLocation();
        practiceModeConfig.setLocation(windowLocation);
        practiceModeConfig.setResizable(false);
        this.setBounds(WIDTH, WIDTH, 450, 231);
        this.setLocation(practiceModeConfig.getLocation());
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Point windowLocation=this.getLocation();
        results.setLocation(windowLocation);
        rs1=new Results(this);
        rs1.getResults();
        results.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        initTest();
        testModeConfig.setBounds(WIDTH, WIDTH, 460, 530);
        testModeConfig.setVisible(true);
        Point windowLocation=this.getLocation();
        this.setLocation(windowLocation);
        testModeConfig.setLocation(windowLocation);
        testModeConfig.setResizable(false);
        this.setBounds(WIDTH, WIDTH, 450, 231);
        this.setLocation(testModeConfig.getLocation());
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ProgresoN.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseClicked
        this.setBounds(WIDTH, WIDTH, 494, 231);
        this.setLocation(results.getLocation());
        results.setVisible(false);
    }//GEN-LAST:event_close4MouseClicked

    private void close4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseEntered
        close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeReleased.png")));
    }//GEN-LAST:event_close4MouseEntered

    private void close4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseExited
        close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png")));
    }//GEN-LAST:event_close4MouseExited

    private void minimized4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized4MouseExited
        minimized4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png")));
    }//GEN-LAST:event_minimized4MouseExited

    private void minimized4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized4MouseEntered
        minimized4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedReleased.png")));
    }//GEN-LAST:event_minimized4MouseEntered

    private void minimized4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized4MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimized4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(jLabel9.isEnabled()){
            rs1.setPagActual(false);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(jLabel10.isEnabled()){
            rs1.setPagActual(true);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void movingBar4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar4MouseDragged
        results.setLocation(results.getLocation().x + evt.getX() - x, results.getLocation().y +evt.getY() - y);
        this.setLocation(results.getLocation().x + evt.getX() - x, this.getLocation().y +evt.getY() - y);
        practiceModeConfig.setLocation(practiceModeConfig.getLocation().x + evt.getX() - x, practiceModeConfig.getLocation().y +evt.getY() - y);
        practiceMode.setLocation(practiceMode.getLocation().x + evt.getX() - x, practiceMode.getLocation().y +evt.getY() - y);
        testModeConfig.setLocation(testModeConfig.getLocation().x + evt.getX() - x, testModeConfig.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar4MouseDragged

    private void movingBar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar4MousePressed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        practiceMode.dispose();
        practiceModeConfig.dispose();
        testModeConfig.dispose();
        game.setResults();
        Point windowLocation=this.getLocation();
        results.setLocation(windowLocation);
        //results.setBounds(WIDTH, WIDTH, 499, 400);
        rs1=new Results(this);
        rs1.getResults();
        this.setBounds(WIDTH, WIDTH, 2, 3);
        results.setVisible(true);
        Time.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        practiceMode.setVisible(false);
        buttonsFalse();
        reestablecerNotas();
        practiceModeConfig.setVisible(false);
        this.setBounds(WIDTH, WIDTH, 494, 231);
        this.setVisible(true);
        Time.dispose();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void close5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close5MouseClicked
        showExit();
    }//GEN-LAST:event_close5MouseClicked

    private void close5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close5MouseEntered
        close5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeReleased.png")));
    }//GEN-LAST:event_close5MouseEntered

    private void close5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close5MouseExited
        close5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/closeExited.png")));
    }//GEN-LAST:event_close5MouseExited

    private void minimized5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized5MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimized5MouseClicked

    private void minimized5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized5MouseEntered
        minimized5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedReleased.png")));
    }//GEN-LAST:event_minimized5MouseEntered

    private void minimized5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimized5MouseExited
        minimized5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/minimizedExited.png")));
    }//GEN-LAST:event_minimized5MouseExited

    private void movingBar5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar5MouseDragged
        Time.setLocation(Time.getLocation().x + evt.getX() - x, Time.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar5MouseDragged

    private void movingBar5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar5MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar5MousePressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        practiceMode.setVisible(false);
        Time.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Test=false;
        comenzarJuego(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        practiceModeConfig.dispose();
        this.setBounds(WIDTH, WIDTH, 494, 231);
        reestablecerNotas();
        this.setVisible(true);
        this.setLocation(practiceModeConfig.getLocation());
    }//GEN-LAST:event_jLabel14MouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        if(next.isEnabled()){
            Next a=new Next(game.adj);
            Thread t=new Thread(a);
            t.start();
            answerAction=true;
            ImageIcon icon = createImageIcon(imagedir + imageFileNames[13], 500, 300);
            imgPractice.setIcon(icon);
        }
    }//GEN-LAST:event_nextMouseClicked

    private void skipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipMouseClicked
        if(skip.isEnabled()){
            Next n=new Next(game.adj);
            Thread t=new Thread(n);
            t.start();
        }
    }//GEN-LAST:event_skipMouseClicked

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
        if(next.isEnabled()){
            next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/responder2.png")));
        }
    }//GEN-LAST:event_nextMouseEntered

    private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
        if(next.isEnabled()){
            next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/responder.png")));
        }
    }//GEN-LAST:event_nextMouseExited

    private void skipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipMouseEntered
        if(skip.isEnabled()){
            skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/next2.png")));
        }
    }//GEN-LAST:event_skipMouseEntered

    private void skipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipMouseExited
        if(skip.isEnabled()){
            skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/next.png")));
        }
        
    }//GEN-LAST:event_skipMouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Exit.setVisible(false);
        this.setEnabled(true);
        practiceMode.setEnabled(true);
        practiceModeConfig.setEnabled(true);
        testModeConfig.setEnabled(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void movingBar6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar6MouseDragged
        Exit.setLocation(Exit.getLocation().x + evt.getX() - x, Exit.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar6MouseDragged

    private void movingBar6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar6MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar6MousePressed

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/PracticaN.png")));
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Practica.png")));
    }//GEN-LAST:event_jLabel31MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ExamenN.png")));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Examen2.png")));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Progreso.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ComenzarB.png")));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/ComenzarN.png")));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarB.png")));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/RegresarN.png")));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/yesN.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/yes.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/noN.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/no.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        if(jLabel9.isEnabled()){
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/atrasN.png")));
        }
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        if(jLabel9.isEnabled()){
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/atras.png")));
        }
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        if(jLabel10.isEnabled()){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/adelanteN.png")));
        }
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        if(jLabel10.isEnabled()){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/adelante.png")));
        }
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/resultadosN.png")));
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/resultados.png")));
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/MenúN.png")));
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/Menú.png")));
    }//GEN-LAST:event_jLabel33MouseExited

    private void trashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trashMouseEntered
        trash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/trash2.png")));
    }//GEN-LAST:event_trashMouseEntered

    private void trashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trashMouseExited
        trash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/trash.png")));
    }//GEN-LAST:event_trashMouseExited

    private void movingBar7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar7MouseDragged
        EraseAll.setLocation(EraseAll.getLocation().x + evt.getX() - x, EraseAll.getLocation().y +evt.getY() - y);
    }//GEN-LAST:event_movingBar7MouseDragged

    private void movingBar7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingBar7MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_movingBar7MousePressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        EraseAll.setVisible(false);
        results.setEnabled(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/noN.png")));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/no.png")));
    }//GEN-LAST:event_jLabel12MouseExited

    public void showErase(){
        EraseAll.setBounds(WIDTH, WIDTH, 285, 145);
        Point windowLocation=results.getLocation();
        EraseAll.setLocation(windowLocation);
        EraseAll.setVisible(true);     
    }
    
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        rs1.deleteData();
        results.setVisible(false);
        EraseAll.setVisible(false);
        results.setEnabled(true);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/yesN.png")));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphs/yes.png")));
    }//GEN-LAST:event_jLabel22MouseExited

    private void trashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trashMouseClicked
        showErase();
        results.setEnabled(false);
    }//GEN-LAST:event_trashMouseClicked

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String args[]) {
        new progressBar();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
                | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(mainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    private ImageIcon createImageIcon(String path, int w, int h) {
        
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            ImageIcon img=new ImageIcon(imgURL);
            img= new ImageIcon(getScaledImage(img.getImage(), w, h));
            return img;
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    private Image getScaledImage(Image srcImg, int w, int h){
        
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
    
    public void initTest(){
        
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[12], 500, 300);
        imgPconfig1.setIcon(icon);
        testModeConfig.add(numTryscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));
        testModeConfig.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 370, 107, -1));
        testModeConfig.getContentPane().add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 20));
        testModeConfig.getContentPane().add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 20));
        testModeConfig.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));
        testModeConfig.add(imgPconfig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 460, -1));
    }
    
    public void initPractice(){
        
        ImageIcon icon = createImageIcon(imagedir + imageFileNames[12], 500, 300);
        imgPconfig.setIcon(icon);
        practiceModeConfig.add(numTryscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));
        practiceModeConfig.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 370, 107, -1));
        practiceModeConfig.getContentPane().add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 20));
        practiceModeConfig.getContentPane().add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 20));
        practiceModeConfig.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));
        practiceModeConfig.getContentPane().add(imgPconfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 460, -1));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel Asharp;
    private javax.swing.JLabel Asharp1;
    private javax.swing.JLabel Asharp2;
    private javax.swing.JLabel B;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel C;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel Csharp;
    private javax.swing.JLabel Csharp1;
    private javax.swing.JLabel Csharp2;
    private javax.swing.JLabel D;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel Dsharp;
    private javax.swing.JLabel Dsharp1;
    private javax.swing.JLabel Dsharp2;
    private javax.swing.JLabel E;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JDialog EraseAll;
    private javax.swing.JLabel Error;
    private javax.swing.JDialog Exit;
    private javax.swing.JLabel F;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel Fsharp;
    private javax.swing.JLabel Fsharp1;
    private javax.swing.JLabel Fsharp2;
    private javax.swing.JLabel G;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel Gsharp;
    private javax.swing.JLabel Gsharp1;
    private javax.swing.JLabel Gsharp2;
    private javax.swing.JSlider Slider;
    public javax.swing.JDialog Time;
    private javax.swing.JLabel answer;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel close3;
    public javax.swing.JLabel close4;
    public javax.swing.JLabel close5;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel fondo4;
    private javax.swing.JLabel help;
    private javax.swing.JLabel help1;
    private javax.swing.JLabel help2;
    private javax.swing.JLabel help3;
    private javax.swing.JLabel imgPconfig;
    private javax.swing.JLabel imgPconfig1;
    private javax.swing.JLabel imgPractice;
    private javax.swing.JLabel instagram;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel linkedin;
    private javax.swing.JLabel minimized;
    private javax.swing.JLabel minimized1;
    private javax.swing.JLabel minimized2;
    private javax.swing.JLabel minimized3;
    public javax.swing.JLabel minimized4;
    public javax.swing.JLabel minimized5;
    private javax.swing.JLabel movingBar;
    private javax.swing.JLabel movingBar1;
    private javax.swing.JLabel movingBar2;
    private javax.swing.JLabel movingBar3;
    private javax.swing.JLabel movingBar4;
    private javax.swing.JLabel movingBar5;
    private javax.swing.JLabel movingBar6;
    private javax.swing.JLabel movingBar7;
    public javax.swing.JLabel next;
    private javax.swing.JComboBox<String> numTryscombo;
    private javax.swing.JDialog practiceMode;
    public javax.swing.JDialog practiceModeConfig;
    private javax.swing.JLabel reloj;
    public javax.swing.JDialog results;
    public javax.swing.JLabel skip;
    public javax.swing.JDialog testModeConfig;
    private javax.swing.JLabel trash;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel website;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new mainJFrame().setVisible(true);
        }
    }
}
