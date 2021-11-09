/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;
import java.applet.AudioClip;

/**
 *
 * @author luisa
 */
public class Mesa extends javax.swing.JFrame {

    
    
    AudioClip[] audio = new AudioClip [54];
    String[] cartas = {"El gallo" , "El diablito", "La dama", "El catrín", "El paraguas", "La sirena", "La escalera",
    "La botella", "El barril", "El arbol", "El melón", "El valiente", "El gorrito", "La muerte", "La pera", "La bandera",
    "El badolón", "El violoncello","La garza", "El pajaro", "La mano", "La bota", "La luna", "El cotorro", "El borracho",
    "El negrito", "El corazón", "La sandía", "El tambor", "El camarón", "Las jaras", "El músico", "La araña", "El soldado", 
    "La estrella", "El cazo", "El mundo", "El apache", "El nopal", "El alacrán", "La rosa", "La calavera", "La campana", "El cantarito", 
    "El venado", "El sol", "La corona", "La chalupa", "El pino", "El pescado", "La palma", "La maceta", "EL arpa", "La rana"};
    
    int baraja[] = new int [54], i = 0;
    boolean ocupado[] = new boolean [54];
    boolean buenas = false; 
    /**
     * Creates new form Mesa
     */
    public Mesa() { 
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        txtCarta = new javax.swing.JLabel();
        txtBase = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        btnBarajear = new javax.swing.JButton();
        btnBuenas = new javax.swing.JButton();
        txtBuenas = new javax.swing.JLabel();
        txtBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 428));
        setResizable(false);
        getContentPane().setLayout(null);

        txtNombre.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(350, 50, 180, 30);
        getContentPane().add(txtCarta);
        txtCarta.setBounds(370, 80, 140, 230);

        txtBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/base.png"))); // NOI18N
        getContentPane().add(txtBase);
        txtBase.setBounds(50, 70, 190, 230);

        btnEmpezar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmpezar.setText("Empezar");
        btnEmpezar.setEnabled(false);
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpezar);
        btnEmpezar.setBounds(240, 330, 110, 50);

        btnBarajear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBarajear.setText("Barajear");
        btnBarajear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarajearActionPerformed(evt);
            }
        });
        getContentPane().add(btnBarajear);
        btnBarajear.setBounds(70, 330, 110, 50);

        btnBuenas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuenas.setText("Loteria!");
        btnBuenas.setEnabled(false);
        btnBuenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuenasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuenas);
        btnBuenas.setBounds(410, 330, 110, 50);

        txtBuenas.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 30)); // NOI18N
        txtBuenas.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(txtBuenas);
        txtBuenas.setBounds(370, 10, 150, 40);

        txtBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/metate.jpg"))); // NOI18N
        getContentPane().add(txtBackground);
        txtBackground.setBounds(0, 0, 612, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarajearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarajearActionPerformed
        HiloBuenas h = new HiloBuenas(this);
        barajear();
        h.barajear = true;
        h.start();
    }//GEN-LAST:event_btnBarajearActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        HiloBuenas h = new HiloBuenas(this);
        h.tirar = true;
        h.start();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void btnBuenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuenasActionPerformed
        txtBuenas.setText("BUENAS!!!");
        btnBuenas.setEnabled(false);
        buenas = true;
    }//GEN-LAST:event_btnBuenasActionPerformed

    public void barajear(){
        for(int i=0; i < 54; i++)ocupado[i] = false;
            while(i != 53){
                int carta = (int)(Math.random()*54);
                if(!ocupado[carta]){
                    baraja[i] = carta;
                    ocupado[carta] = true;
                    i++;
                }
            }
            i = 0;
    }
    
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
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBarajear;
    public javax.swing.JButton btnBuenas;
    public javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel txtBackground;
    public javax.swing.JLabel txtBase;
    private javax.swing.JLabel txtBuenas;
    public javax.swing.JLabel txtCarta;
    public javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
