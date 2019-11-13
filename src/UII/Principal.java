package UII;

import analizador.CargarArchivo;
import analizador.Analizador;


/**
 *
 * @author dylan
 */
public class Principal extends javax.swing.JFrame {
    String subido = "";
    String analizado = "";
    CargarArchivo ca;
    Analizador anal;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAnalizado = new javax.swing.JTextArea();
        bttLoad = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSubido = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttLoad1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 128, 0));

        txtAreaAnalizado.setColumns(20);
        txtAreaAnalizado.setRows(5);
        jScrollPane1.setViewportView(txtAreaAnalizado);

        bttLoad.setBackground(new java.awt.Color(235, 246, 57));
        bttLoad.setFont(new java.awt.Font("Noto Sans Symbols", 1, 18)); // NOI18N
        bttLoad.setForeground(new java.awt.Color(254, 254, 254));
        bttLoad.setText("Cargar Archivo");
        bttLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLoadActionPerformed(evt);
            }
        });

        txtAreaSubido.setColumns(20);
        txtAreaSubido.setRows(5);
        jScrollPane2.setViewportView(txtAreaSubido);

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("ARCHIVO ANALIZADO");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("ARCHIVO SUBIDO");

        bttLoad1.setBackground(new java.awt.Color(235, 246, 57));
        bttLoad1.setFont(new java.awt.Font("Noto Sans Symbols", 1, 18)); // NOI18N
        bttLoad1.setForeground(new java.awt.Color(254, 254, 254));
        bttLoad1.setText("Analizar Archivo");
        bttLoad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLoad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(bttLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttLoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttLoad)
                            .addComponent(bttLoad1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void bttLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLoadActionPerformed
        load();
    }//GEN-LAST:event_bttLoadActionPerformed

    private void bttLoad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLoad1ActionPerformed
        ca = new CargarArchivo();
     //   ca
    }//GEN-LAST:event_bttLoad1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttLoad;
    private javax.swing.JButton bttLoad1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaAnalizado;
    private javax.swing.JTextArea txtAreaSubido;
    // End of variables declaration//GEN-END:variables

    public void analizar(String[] separado){
        for (int i = 0; i <= separado.length-1; i++) {
            System.out.println(separado[i]);
        }
    }
    
    public void load(){
        ca = new CargarArchivo();
        ca.verArchivo();
        subido = ca.docCargado;
        txtAreaSubido.setText(subido);
    }
}