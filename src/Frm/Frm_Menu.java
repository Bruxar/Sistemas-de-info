/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frm;

/**
 *
 * @author Moises
 */
public class Frm_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Menu
     */
    public Frm_Menu() {
        initComponents();
        setTitle("MENÚ CALL CENTER");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_ventana0 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnGerencia = new javax.swing.JButton();
        btnPlanCliente = new javax.swing.JButton();
        descripcion = new javax.swing.JLabel();
        descripcion1 = new javax.swing.JLabel();
        descripcion2 = new javax.swing.JLabel();
        descripcion3 = new javax.swing.JLabel();
        descripcion4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label_ventana0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_ventana0.setText("MENÚ");

        btnClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnClientes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnGerencia.setBackground(new java.awt.Color(51, 51, 51));
        btnGerencia.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnGerencia.setForeground(new java.awt.Color(255, 255, 255));
        btnGerencia.setText("GERENCIA");

        btnPlanCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnPlanCliente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnPlanCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnPlanCliente.setText("PLAN - CLIENTE");
        btnPlanCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanClienteActionPerformed(evt);
            }
        });

        descripcion.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        descripcion.setText("SISTEMAS DE INFORMACIÓN");

        descripcion1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        descripcion1.setText("Dylan Fernández");

        descripcion2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        descripcion2.setText("Nicolás Mendez");

        descripcion3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        descripcion3.setText("Moisés Leiva");

        descripcion4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        descripcion4.setText("Lucas Arancibia");

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(label_ventana0))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlanCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcion)
                            .addComponent(descripcion1)
                            .addComponent(descripcion4)
                            .addComponent(descripcion2)
                            .addComponent(descripcion3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(label_ventana0)
                .addGap(118, 118, 118)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPlanCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(descripcion)
                .addGap(7, 7, 7)
                .addComponent(descripcion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descripcion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSalir)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlanClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanClienteActionPerformed
        // TODO add your handling code here:
        FrmPlanCliente ventana_PlanCliente = new FrmPlanCliente();
        ventana_PlanCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPlanClienteActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        FrmCliente ventana_cliente = new FrmCliente();
        ventana_cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGerencia;
    private javax.swing.JButton btnPlanCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel descripcion1;
    private javax.swing.JLabel descripcion2;
    private javax.swing.JLabel descripcion3;
    private javax.swing.JLabel descripcion4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_ventana0;
    // End of variables declaration//GEN-END:variables
}
