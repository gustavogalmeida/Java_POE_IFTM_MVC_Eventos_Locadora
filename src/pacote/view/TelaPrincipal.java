/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pacote.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Almeida
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public TelaPrincipal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCacamba = new javax.swing.JMenuItem();
        menuMotorista = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        btnOpcoes = new javax.swing.JMenu();
        btnSwing = new javax.swing.JMenuItem();
        btnSobre = new javax.swing.JMenuItem();
        btnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Locação de Caçambas");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/img/Cacamba-Estacionaria2 .png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastro");

        menuCacamba.setText("Caçamba");
        menuCacamba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCacambaActionPerformed(evt);
            }
        });
        jMenu1.add(menuCacamba);

        menuMotorista.setText("Motorista");
        menuMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMotoristaActionPerformed(evt);
            }
        });
        jMenu1.add(menuMotorista);

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuCliente);

        jMenuBar1.add(jMenu1);

        btnOpcoes.setText("Opções");
        btnOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcoesActionPerformed(evt);
            }
        });

        btnSwing.setText("Recursos utilizados");
        btnSwing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwingActionPerformed(evt);
            }
        });
        btnOpcoes.add(btnSwing);

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        btnOpcoes.add(btnSobre);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnOpcoes.add(btnSair);

        jMenuBar1.add(btnOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcoesActionPerformed
        
    }//GEN-LAST:event_btnOpcoesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSwingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwingActionPerformed
        JOptionPane.showMessageDialog(null, 
            "TextField\n" +
            "TextArea\n" +
            "CompoBox\n" +
            "RadioButton\n" +
            "RadioButtonGroup\n" +
            "CheckBox\n" +
            "Table\n" +
            "Button\n" +
            "GridLayout\n" +
            "MenuBar\n" +
            "MenuItem\n" +
            "JOptionPane");
    }//GEN-LAST:event_btnSwingActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        JOptionPane.showMessageDialog(null, 
                "##################Trabalho final POE###################\n\n\n"
                + "Descrição: Usar recursos apresentados anteriormente\n"
                + "e implementar integração com MySQL, modelo de trabalho é CRUD\n\n"
                + "Valor: 40 Pontos\n\n"
                + "Professora: Lígia\n\n"
                + "Aluno: Gustavo Almeida\n\n"
                + "Tema escolhido: Locação de Caçambas\n\n"
                + "Diretorio do projeto no GitHub:\ngithub.com/gustavogalmeida/Java_POE_IFTM_MVC_Eventos_Locadora.git\n\n"
                + "\nTodos direitos reservados."
                );
    }//GEN-LAST:event_btnSobreActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        TelaCliente c = new TelaCliente ();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMotoristaActionPerformed
        TelaMotorista m = new TelaMotorista();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuMotoristaActionPerformed

    private void menuCacambaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCacambaActionPerformed
        TelaCacamba c = new TelaCacamba();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCacambaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnOpcoes;
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JMenuItem btnSobre;
    private javax.swing.JMenuItem btnSwing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuCacamba;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuMotorista;
    // End of variables declaration//GEN-END:variables
}
