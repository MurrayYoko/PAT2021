/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.BaitManager;
import Backend.LocationManager;
import Backend.LogSessionManager;
import Backend.SpeciesManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Murrayy
 */
public class ViewStatsScreen extends javax.swing.JFrame {

    /**
     * Creates new form ViewStatsScreen
     */
    public ViewStatsScreen() {
        initComponents();

        //recieves all sessions
        String sessions = LogSessionManager.getAllSessions();
        sessionsTextArea.setText(sessions);

        //recieves total number of fish
        int totalFish = LogSessionManager.getNumFish();
        totalFishTextField.setText(Integer.toString(totalFish));

        //recieves total hours spent
        int timeSpent = LogSessionManager.getNumHours();
        totalHoursTextField.setText(Integer.toString(timeSpent));

        //recieves total number of sessions
        int numsessions = LogSessionManager.getNumSessions();
        numSessionsTextField.setText(Integer.toString(numsessions));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        viewStatsLabel = new javax.swing.JLabel();
        totalFishLabel = new javax.swing.JLabel();
        numSessionsLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        numSessionsTextField = new javax.swing.JTextField();
        totalFishTextField = new javax.swing.JTextField();
        totalHoursTextField = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        sessionsTextArea = new javax.swing.JTextArea();
        sessionsLabel = new javax.swing.JLabel();
        totalHoursLabel = new javax.swing.JLabel();
        krakenImageLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewStatsLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        viewStatsLabel.setText("VIEW STATS");

        totalFishLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        totalFishLabel.setText("TOTAL FISH CAUGHT: ");

        numSessionsLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        numSessionsLabel.setText("NUMBER OF SESSIONS: ");

        homeButton.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        numSessionsTextField.setEditable(false);
        numSessionsTextField.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N

        totalFishTextField.setEditable(false);
        totalFishTextField.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N

        totalHoursTextField.setEditable(false);
        totalHoursTextField.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N

        sessionsTextArea.setEditable(false);
        sessionsTextArea.setColumns(20);
        sessionsTextArea.setRows(5);
        jScrollPane6.setViewportView(sessionsTextArea);

        sessionsLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        sessionsLabel.setText("SESSIONS:");

        totalHoursLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        totalHoursLabel.setText("TOTAL HOURS SPENT:");

        krakenImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kraken.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewStatsLabel)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(totalHoursLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(totalFishLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(numSessionsLabel))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalFishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numSessionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sessionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(krakenImageLabel)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewStatsLabel)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalFishLabel)
                    .addComponent(totalFishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalHoursLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numSessionsLabel)
                    .addComponent(numSessionsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sessionsLabel)
                    .addComponent(krakenImageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewStatsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStatsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStatsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStatsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStatsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel krakenImageLabel;
    private javax.swing.JLabel numSessionsLabel;
    private javax.swing.JTextField numSessionsTextField;
    private javax.swing.JLabel sessionsLabel;
    private javax.swing.JTextArea sessionsTextArea;
    private javax.swing.JLabel totalFishLabel;
    private javax.swing.JTextField totalFishTextField;
    private javax.swing.JLabel totalHoursLabel;
    private javax.swing.JTextField totalHoursTextField;
    private javax.swing.JLabel viewStatsLabel;
    // End of variables declaration//GEN-END:variables
}
