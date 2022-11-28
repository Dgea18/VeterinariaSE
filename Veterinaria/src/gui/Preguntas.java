package gui;

import org.jpl7.Query;
import org.jpl7.Term;

public class Preguntas extends javax.swing.JFrame {
    
    public static String diagnostico = "";
    int contador = 0;
    String [][] sintomas = {{"irritacióncutanea","picazon","rascarse","costras","llagas"},
            {"tos","estornudos","fiebre","diarrea","flema"},
            {"vomito","diarrea","perdida de apetito","decaido","perdida de peso"},
            {"anorexia","depresion","diarrea","deshidratacion","hipotermia"},
            {"lagrimeo","lagaña","enrrojecimiento","dolorocular","inflamacion"},
            {"violencia","fiebre y escalofrios","sensibilidad","cansancio","dolor articular"},
            {"mal olor en oidos","rasca las orejas","liquido amarillo","frotarse","no dormir"},
            {"dolorabdominal","perdidadeapetito","perdidadepeso","diarrea","debilidad"},
            {"dolorabdominal","hinchazonabdomen","nauseas","perdidaapetito","diarrea"},
            {"sangreenorina","incontinencia","doloralorinar","sed","miccion"},
            {"sed","temblores","perdidadepeso","duermemucho","poliuria"},
            {"estornudos","dificultadalrespirar","narizhumeda","congestionnasal","ojosllorosos"}};
    
    public Preguntas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkSin1 = new javax.swing.JCheckBox();
        chkSin2 = new javax.swing.JCheckBox();
        chkSin3 = new javax.swing.JCheckBox();
        chkSin4 = new javax.swing.JCheckBox();
        chkSin5 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        jlbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("¿Cuales de estos síntomas presenta?");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 330, 70));

        chkSin1.setText("Irritación Cutanea");
        jPanel1.add(chkSin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        chkSin2.setText("Picazon");
        jPanel1.add(chkSin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        chkSin3.setText("Costras");
        jPanel1.add(chkSin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        chkSin4.setText("Llagas");
        jPanel1.add(chkSin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        chkSin5.setText("Rascarse");
        jPanel1.add(chkSin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, 200));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 390, 290, -1));

        jlbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        jPanel1.add(jlbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        //Si todos los sintomas son seleccionados es que esa enfermedad tiene el animal
        if(chkSin1.isSelected() && 
           chkSin2.isSelected() && 
           chkSin3.isSelected() && 
           chkSin4.isSelected() && 
           chkSin5.isSelected()){
            
           diagnostico = chkSin1.getText() + "," + chkSin2.getText() + "," + chkSin3.getText() + "," + chkSin4.getText() + "," + chkSin5.getText();
           diagnostico = diagnostico.replace(" ","");//quitamos espacios
           diagnostico = diagnostico.toLowerCase();//conertimos a minusculas
           
//           //Hacemos la consulta con el sistema experto
//           String t1 = "consult('Dogtor.pl')";//aqui colocan el nombre de su archivo a compilar
//           Query con = new Query(t1);
//           System.out.println(t1 + " " + (con.hasSolution() ? "verdadero" : "fallo")); //mostrara mensaje  si hay o no conexion
//           
//           String t2 = "diagnostico(irritacióncutanea,picazon,rascarse,costras,llagas)";
//           Query q2 = new Query(t2);
//           System.out.println(q2.oneSolution().get("E"));
           
           //Llamamos a la ventana para que muestre el resultado
           Diagnostico d = new Diagnostico();
           d.setVisible(true);
           //Cerramos esta ventana
           this.dispose();
           
        }
        else{
            
            contador++;
            //le ponemos los siguientes sintomas a los checkbox
            chkSin1.setText(sintomas[contador][0]);
            chkSin2.setText(sintomas[contador][1]);
            chkSin3.setText(sintomas[contador][2]);
            chkSin4.setText(sintomas[contador][3]);
            chkSin5.setText(sintomas[contador][4]);
            //Deseleccionamos las casillas
            chkSin1.setSelected(false);
            chkSin2.setSelected(false); 
            chkSin3.setSelected(false); 
            chkSin4.setSelected(false); 
            chkSin5.setSelected(false);
        }//else
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chkSin1;
    private javax.swing.JCheckBox chkSin2;
    private javax.swing.JCheckBox chkSin3;
    private javax.swing.JCheckBox chkSin4;
    private javax.swing.JCheckBox chkSin5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbFondo;
    // End of variables declaration//GEN-END:variables
}
