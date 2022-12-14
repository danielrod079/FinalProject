package PipePal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MenuA extends javax.swing.JFrame {

    public MenuA() {
        initComponents();
        error.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stringSFX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        GPMdisplay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Storm Drain Pipe Sizing");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(700, 400));
        setResizable(false);

        error.setBackground(new java.awt.Color(255, 0, 0));
        error.setText("⚠Enter a number value ⚠");
        error.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Enter the square footage.");

        stringSFX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stringSFXActionPerformed(evt);
            }
        });

        jLabel3.setText("Square footage:");

        jLabel4.setText("Pipe size:");

        output.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        output.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {2, 22},
                {3, 55},
                {4, 115},
                {5, 165},
                {6, 344},
                {8, 714},
                {10, 1311},
                {12, 2093},
                {15, 3546}
            },
            new String [] {
                "Pipe size (inches)", "1/8 inch per foot"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("GPM:");

        GPMdisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GPMdisplay.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stringSFX, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(error)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(GPMdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(stringSFX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(error)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(GPMdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stringSFXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stringSFXActionPerformed
   
        Scanner read = new Scanner(System.in);
        String SFX = stringSFX.getText();
        double sfx = 0;
        while (sfx <= 0) {
                try {
                    sfx = Double.parseDouble(SFX);
                    error.setVisible(false);
                } catch (Exception e) {
                    error.setVisible(true);
                    output.setText("E");
                    SFX = stringSFX.getText();
                    break;
                }
            }
        double GPM = sfx * 0.052;
            DecimalFormat df = new DecimalFormat("0");
            DecimalFormat gpm = new DecimalFormat("0.00");
            output.setText("  " + df.format(pipes(GPM))+'"');
            GPMdisplay.setText("  " + gpm.format(GPM));
    }//GEN-LAST:event_stringSFXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainMenu().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuA().setVisible(true);
            }
        });
    }
    public static double pipes(double gpmMain) {
        double[] GPM = {22.00, 55.00, 115.00, 165.00, 344.00, 714.00, 1311.00, 2093.00, 3546.00};
        int[] pipeSize = {2, 3, 4, 5, 6, 8, 10, 12, 15};
        double size = 2;
        for (int i = 0; i < 9; i++){
            if (gpmMain > GPM[i]){
                size = pipeSize[i+1];
            }
        }
        return size;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GPMdisplay;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel output;
    private javax.swing.JTextField stringSFX;
    // End of variables declaration//GEN-END:variables

}