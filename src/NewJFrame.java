
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        tiros=0;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    static int i;
    static int i2;
    static int i3;
    static int tiros;
    
    
    
    
    public void generar(){
        int x=lbl1.getX();     
        int y=lbl1.getY()+1;
        lbl1.setLocation(x, y);
        int y2=lbl2.getY()+1;
        int x2=lbl2.getX();
        lbl2.setLocation(x2, y2);
        int x3=lbl3.getX(); 
        int y3=lbl3.getY()+1;
        lbl3.setLocation(x3, y3);
        
       
    }
    
    public void generar2(){
        Timer timer = new Timer(15,null);
        
        int y2=lbl2.getY()+1;
        int x2=lbl2.getX();
        lbl2.setLocation(x2, y2);
    }
    
    public void generar3(){
        int x3=lbl3.getX(); 
        int y3=lbl3.getY()+1;
        lbl3.setLocation(x3, y3);
    }
    
  
    
    public void traer(){
       
        i=0;
        Timer timer = new Timer(15,null);
        timer.setRepeats(true);
        timer.addActionListener((e)->
        {
            generar();
            i++;
            i2++;
            i3++;
            
            if(i==150){
                timer.stop();
                
                lbl1.setLocation( lbl1.getX(), 0);
                lbl2.setLocation( lbl2.getX(), 0);
                lbl3.setLocation( lbl3.getX(), 0);
                traer();
            }
        
        });
        
        timer.start();            
        
                
        
    }
    
    public void checkTiros(){
        if(tiros == 3){
            
            lbl1.setVisible(false);
            lbl2.setVisible(false);
            lbl3.setVisible(false);
            JOptionPane.showMessageDialog(null, "Ganaste!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(814, 426));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(273, 322, 250, 32);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(6, 165, 802, 10);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kisspng-apple-food-fruit-drawing-odisea-the-game-manzana-png-5b4acdd6706fd1.6360847015316290144606.jpg"))); // NOI18N
        lbl1.setEnabled(false);
        lbl1.setOpaque(true);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kisspng-apple-food-fruit-drawing-odisea-the-game-manzana-png-5b4acdd6706fd1.6360847015316290144606.jpg"))); // NOI18N
        lbl3.setEnabled(false);
        lbl3.setOpaque(true);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/kisspng-apple-food-fruit-drawing-odisea-the-game-manzana-png-5b4acdd6706fd1.6360847015316290144606.jpg"))); // NOI18N
        lbl2.setEnabled(false);
        lbl2.setOpaque(true);
        lbl2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl2FocusGained(evt);
            }
        });
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lbl1)
                .addGap(172, 172, 172)
                .addComponent(lbl2)
                .addGap(165, 165, 165)
                .addComponent(lbl3)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl3)
                    .addComponent(lbl2)
                    .addComponent(lbl1))
                .addGap(0, 415, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lbl1.setEnabled(true);
        lbl2.setEnabled(true);
        lbl3.setEnabled(true);
        traer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        lbl1.setVisible(false);
        tiros++;
        checkTiros();
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        lbl2.setVisible(false);
        tiros++;
        checkTiros();
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        lbl3.setVisible(false);
        tiros++;
        checkTiros();
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl2FocusGained
        
    }//GEN-LAST:event_lbl2FocusGained

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    // End of variables declaration//GEN-END:variables
}
