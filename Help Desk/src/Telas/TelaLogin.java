package Telas;

//Necessario importar os metodos do banco de dados
import java.sql.*;
import dal.ModuloConexao;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

// variavel de conexão
    Connection conexao = null;
    //PreparedStatement e ResultSet são frameworks do pacote java.sql 
    // Prepara e executa as instruçoes SQL
    PreparedStatement pst = null;
    ResultSet rs = null;
    //Botao Default

    //Metodo logar
    public void logar() {
        String sql = "  select * from tbusuarios where login =? and senha =?";
        try {
            //Prepara // Consulta o banco se Login e Senha existem
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, txtSenha.getText());
            //Executa a Query 
            rs = pst.executeQuery();
            //Se existir usuario e senha 
            if (rs.next()) {
                //Verifica qual o Perfil do usuario no Banco/Tabela > tbusuarios
                String perfil = rs.getString(6);
                //System.out.println(perfil);
                // Estrutura de tratamento de Perfil
                if (perfil.equals("admin")) {
                    // Usuario então passa a TelaPrincipal
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    //Informação da pnlUsuario
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(new Color (153,68,72));
                    TelaPrincipal.lblPerfil.setText("Administrador");

                    this.dispose();
                } else if (perfil.equals("tec")) {
                    //Usuario Tecnico
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    //Telas Ocultadas para o usuario Atendente
                    TelaPrincipal.pnlCadastrar.setVisible(false);
                    TelaPrincipal.btnCadastrarAll.setVisible(false);
                    TelaPrincipal.btnCadastroCliente.setVisible(false);
                    TelaPrincipal.btnCadastroUsuario.setVisible(false);
                    TelaPrincipal.btnCadastraOS.setVisible(false);
                    TelaPrincipal.pnlRelatorio.setVisible(false);
                    TelaPrincipal.btnRelatorioCliente.setVisible(false);
                    TelaPrincipal.btnRelatorioServ.setVisible(false);
                    //Informação da pnlUsuario
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.YELLOW);
                    TelaPrincipal.lblPerfil.setText("Técnico");

                    this.dispose();

                } else {
                    //Usuario Atendente
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    //Nome do usuario na label TelaPrincipal
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    //Telas Ocultadas para o usuario Atendente
                    TelaPrincipal.btnTec.setVisible(false);
                    TelaPrincipal.pnlRelatorio.setVisible(false);
                    TelaPrincipal.btnRelatorioCliente.setVisible(false);
                    TelaPrincipal.btnRelatorioServ.setVisible(false);
                    //Informação da pnlUsuario
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.YELLOW);
                    TelaPrincipal.lblPerfil.setText("Atendente");

                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, " Usuario e/ou Senha Inválido(s) ! ");
                this.txtUsuario.setText(null);
                this.txtSenha.setText(null);
                
                
            }

        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Verifique sua Conexão com o Banco de Dados");
            this.txtUsuario.setText(null);
            this.txtSenha.setText(null);

        } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, e2);
            this.txtUsuario.setText(null);
            this.txtSenha.setText(null);
        }

    }

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();

        //botao default
        getRootPane().setDefaultButton(this.btnLogin);

        this.pnlBanco.setVisible(false);
        //Metodo de conexao
        conexao = ModuloConexao.conector();
        //Verificando conexao do Banco de dados
        if (conexao != null) {
            this.pnlBanco.setVisible(true);
            this.rbBancoOn.setSelected(true);
            this.rbBancoOff.setSelected(false);
            this.rbBancoOff.setEnabled(false);

        } else {
            this.pnlBanco.setVisible(true);
            this.rbBancoOff.setSelected(true);
            this.rbBancoOn.setSelected(false);
            this.rbBancoOn.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblStatus1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        pnlBanco = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        rbBancoOn = new javax.swing.JRadioButton();
        lblBancoOn = new javax.swing.JLabel();
        lblBancoOff = new javax.swing.JLabel();
        rbBancoOff = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Desk - Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(224, 204, 149));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(392, 327));

        jPanel1.setBackground(new java.awt.Color(153, 68, 72));

        lblStatus1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblStatus1.setForeground(new java.awt.Color(224, 204, 149));
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus1.setText("Login de Acesso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblStatus1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-coroa-50.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 68, 72));
        jLabel4.setText("Help Desk");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Usuário");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setPreferredSize(new java.awt.Dimension(77, 34));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Senha");

        btnSair.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnSair.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setPreferredSize(new java.awt.Dimension(77, 34));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pnlBanco.setBackground(new java.awt.Color(224, 204, 149));

        lblStatus.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(153, 68, 72));
        lblStatus.setText("Banco de Dados");

        buttonGroup1.add(rbBancoOn);

        lblBancoOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-aceitar-banco-de-dados-30.png"))); // NOI18N

        lblBancoOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-excluir-banco-de-dados-30.png"))); // NOI18N

        buttonGroup1.add(rbBancoOff);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 68, 72));
        jLabel3.setText("Status");

        javax.swing.GroupLayout pnlBancoLayout = new javax.swing.GroupLayout(pnlBanco);
        pnlBanco.setLayout(pnlBancoLayout);
        pnlBancoLayout.setHorizontalGroup(
            pnlBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBancoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(pnlBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBancoOn)
                .addGap(18, 18, 18)
                .addComponent(rbBancoOn)
                .addGap(18, 18, 18)
                .addComponent(lblBancoOff)
                .addGap(18, 18, 18)
                .addComponent(rbBancoOff)
                .addGap(29, 29, 29))
        );
        pnlBancoLayout.setVerticalGroup(
            pnlBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBancoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBancoOff)
                    .addComponent(rbBancoOff)
                    .addComponent(lblBancoOn)
                    .addComponent(rbBancoOn)
                    .addGroup(pnlBancoLayout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(392, 327));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // Fecha programa
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Metodo logar
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBancoOff;
    private javax.swing.JLabel lblBancoOn;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JPanel pnlBanco;
    private javax.swing.JRadioButton rbBancoOff;
    private javax.swing.JRadioButton rbBancoOn;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
