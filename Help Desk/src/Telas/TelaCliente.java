package Telas;

import java.sql.*;
import dal.ModuloConexao;
import javax.swing.JOptionPane;
//importa recursos da biblioteca rs2xml
import net.proteanit.sql.DbUtils;
import CRUD.Controlador;
import java.awt.Color;

public class TelaCliente extends javax.swing.JInternalFrame implements Controlador {

    // variavel de conexão
    Connection conexao = null;
    //PreparedStatement e ResultSet são frameworks do pacote java.sql 
    // Prepara e executa as instruçoes SQL
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    

    public TelaCliente() {
        initComponents();

        //Modulo Conexao
        conexao = ModuloConexao.conector();
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().setBackground(Color.WHITE);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDadosCliente = new javax.swing.JPanel();
        txtClienteEndereco = new javax.swing.JTextField();
        txtClienteEmail = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        lblEnderecoCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNomeCliente1 = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        txtClienteBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        pnlClienteOpera = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlOs = new javax.swing.JPanel();
        pnlClienteOpera1 = new javax.swing.JPanel();
        btnClienteCreate = new javax.swing.JButton();
        btnClienteDelete = new javax.swing.JButton();
        btnClienteAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(923, 576));
        setPreferredSize(new java.awt.Dimension(1014, 630));

        pnDadosCliente.setBackground(new java.awt.Color(255, 255, 255));

        txtClienteEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtClienteEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome");

        lblEnderecoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnderecoCliente.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DDD + Telefone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        txtClienteNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("*");

        lblNomeCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente1.setText("Id Cliente ");

        txtClienteId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClienteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClienteId.setEnabled(false);

        try {
            ftxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)     ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnDadosClienteLayout = new javax.swing.GroupLayout(pnDadosCliente);
        pnDadosCliente.setLayout(pnDadosClienteLayout);
        pnDadosClienteLayout.setHorizontalGroup(
            pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCliente1)
                    .addGroup(pnDadosClienteLayout.createSequentialGroup()
                        .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnderecoCliente)
                            .addComponent(jLabel5)
                            .addGroup(pnDadosClienteLayout.createSequentialGroup()
                                .addComponent(lblNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pnDadosClienteLayout.setVerticalGroup(
            pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente1)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtClienteBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtClienteBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteBuscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pesquisar.png"))); // NOI18N

        tblClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtClienteBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlClienteOpera.setBackground(new java.awt.Color(153, 68, 72));

        javax.swing.GroupLayout pnlClienteOperaLayout = new javax.swing.GroupLayout(pnlClienteOpera);
        pnlClienteOpera.setLayout(pnlClienteOperaLayout);
        pnlClienteOperaLayout.setHorizontalGroup(
            pnlClienteOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlClienteOperaLayout.setVerticalGroup(
            pnlClienteOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel13.setText("Pesquisar Cliente");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel12.setText("Preencha os Dados");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("* Campos Obrigatórios");

        pnlOs.setBackground(new java.awt.Color(153, 68, 72));
        pnlOs.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pnlOsLayout = new javax.swing.GroupLayout(pnlOs);
        pnlOs.setLayout(pnlOsLayout);
        pnlOsLayout.setHorizontalGroup(
            pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlOsLayout.setVerticalGroup(
            pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        pnlClienteOpera1.setBackground(new java.awt.Color(255, 255, 255));

        btnClienteCreate.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnClienteCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/create.png"))); // NOI18N
        btnClienteCreate.setToolTipText("Adicionar");
        btnClienteCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteCreate.setPreferredSize(new java.awt.Dimension(45, 45));
        btnClienteCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCreateActionPerformed(evt);
            }
        });

        btnClienteDelete.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnClienteDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/delete.png"))); // NOI18N
        btnClienteDelete.setToolTipText("Remover");
        btnClienteDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteDelete.setPreferredSize(new java.awt.Dimension(45, 45));
        btnClienteDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteDeleteActionPerformed(evt);
            }
        });

        btnClienteAlterar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnClienteAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/update.png"))); // NOI18N
        btnClienteAlterar.setToolTipText("Alterar");
        btnClienteAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteAlterar.setPreferredSize(new java.awt.Dimension(45, 45));
        btnClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteOpera1Layout = new javax.swing.GroupLayout(pnlClienteOpera1);
        pnlClienteOpera1.setLayout(pnlClienteOpera1Layout);
        pnlClienteOpera1Layout.setHorizontalGroup(
            pnlClienteOpera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClienteOpera1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(btnClienteCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClienteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        pnlClienteOpera1Layout.setVerticalGroup(
            pnlClienteOpera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteOpera1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClienteOpera1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClienteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(113, 113, 113)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlClienteOpera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlClienteOpera1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(pnDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlClienteOpera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlClienteOpera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1014, 630));
    }// </editor-fold>//GEN-END:initComponents
    // Evento do txtClienteBuscar enquanto o Usuario digita vai preenchendo em tempo real
    private void txtClienteBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteBuscarKeyReleased
        // Metodo consultar
        consultar();
    }//GEN-LAST:event_txtClienteBuscarKeyReleased

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // Clicando com o mouse no nome do Cliente chama o metodo selecionarDaTabela
        selecionarDaTabela();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnClienteCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteCreateActionPerformed
        //Metodo adicionar 
        adicionar();
    }//GEN-LAST:event_btnClienteCreateActionPerformed

    private void btnClienteDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteDeleteActionPerformed
        // Metodo deletar
        deletar();
    }//GEN-LAST:event_btnClienteDeleteActionPerformed

    private void btnClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAlterarActionPerformed
        // Metodo alterar
        alterar();
    }//GEN-LAST:event_btnClienteAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteAlterar;
    private javax.swing.JButton btnClienteCreate;
    private javax.swing.JButton btnClienteDelete;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeCliente1;
    private javax.swing.JPanel pnDadosCliente;
    private javax.swing.JPanel pnlClienteOpera;
    private javax.swing.JPanel pnlClienteOpera1;
    private javax.swing.JPanel pnlOs;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtClienteBuscar;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteEndereco;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteNome;
    // End of variables declaration//GEN-END:variables

    //Metodo Adicionar Clientes
    @Override
    public void adicionar() {
        String sql = "insert into tbclientes (nomecli,endcli,fonecli,emailcli) values (?,?,?,?)";
        try {
            //Prepara a Query que foi gravada na variavel sql
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.txtClienteNome.getText());
            pst.setString(2, this.txtClienteEndereco.getText());
            pst.setString(3, this.ftxtTelefone.getText());
            pst.setString(4, this.txtClienteEmail.getText());

//Validação dos campos obrigatórios.
            if ((this.txtClienteNome.getText().isEmpty())
                    || (this.ftxtTelefone.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Obrigatórios!");

            } else {
//Após validar.. executa o else ^ 
//Adiciona na tbclientes com os dados digitados na tela
                // e exibe a mensagem de sucesso
                //Comando para atualizar o banco
                int adicionado = pst.executeUpdate();
                // a linha abaixo mostra o valor 1 quando a tabela ganha um registro,
                // serve para testar e maior entendimento ao codigo.
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso");
                    //Limpam os campos dos Usuarios
                    this.txtClienteNome.setText(null);
                    this.txtClienteEndereco.setText(null);
                    this.ftxtTelefone.setText(null);
                    this.txtClienteEmail.setText(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    //Metodo pesquisar clientes com filtros
    @Override
    public void consultar() {
        String sql = "select * from tbclientes where nomecli like ? ";

        try {
            //Prepara a String declarada da variavel sql
            pst = conexao.prepareStatement(sql);
            /*passando o conteudo da caixa de pesquisa para o "?"
            atenção ao "%" - continuação da String sql
             */
            pst.setString(1, this.txtClienteBuscar.getText() + "%");
            // Executa a Query
            rs = pst.executeQuery();
            // Linha abaixo utiliza  a biblioteca rs2xml para preencher a tabela
            this.tblClientes.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    //Metodo para trazer no pnl Dados o cliente selecionado na tabela
    public void selecionarDaTabela() {
        //Passo os dados para os campos da pnl Dados
        int selecionar = this.tblClientes.getSelectedRow();
        this.txtClienteId.setText(this.tblClientes.getModel().getValueAt(selecionar, 0).toString());
        this.txtClienteNome.setText(this.tblClientes.getModel().getValueAt(selecionar, 1).toString());
        this.txtClienteEndereco.setText(this.tblClientes.getModel().getValueAt(selecionar, 2).toString());
        this.ftxtTelefone.setText(this.tblClientes.getModel().getValueAt(selecionar, 3).toString());
        this.txtClienteEmail.setText(this.tblClientes.getModel().getValueAt(selecionar, 4).toString());

        //desabilta o botao adicionar
        this.btnClienteCreate.setEnabled(false);

    }
    // Metodo para alterar dados do clientes

    @Override
    public void alterar() {
        //Prepara a Query a ser executada no banco
        String sql = "update tbclientes set nomecli=?, endcli=?,fonecli=?,emailcli=? where idcli=?";
        try {
            //Preparo a Query que foi declarada na variavel sql
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.txtClienteNome.getText());
            pst.setString(2, this.txtClienteEndereco.getText());
            pst.setString(3, this.ftxtTelefone.getText());
            pst.setString(4, this.txtClienteEmail.getText());
            pst.setString(5, this.txtClienteId.getText());

//Validação dos campos obrigatórios.
            if ((this.txtClienteNome.getText().isEmpty())
                    || (this.ftxtTelefone.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Obrigatórios!");

            } else {

//Após validar.. executa o else ^ 
//Altera na tbclientes com os dados digitados na tela
                // e exibe a mensagem de sucesso
                //comando para atualizar o banco
                int adicionado = pst.executeUpdate();
                // a linha abaixo mostra o valor 1 quando a tabela altera um registro,
                // serve para testar e maior entendimento ao codigo.
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do Cliente alterado com sucesso");
                    //Limpam os campos dos Usuarios
                    this.txtClienteId.setText(null);
                    this.txtClienteNome.setText(null);
                    this.txtClienteEndereco.setText(null);
                    this.ftxtTelefone.setText(null);
                    this.txtClienteEmail.setText(null);

                    //habilita o botao adicionar
                    this.btnClienteCreate.setEnabled(true);

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    @Override
    public void deletar() {
        //Confirma se o cliente deseja deletar um dado do banco
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar o Cliente? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //Prepara a Query a ser executada no banco
            String sql = "delete from tbclientes where idcli=?";
            try {
                //Preparo a Query que foi declarada na variavel sql
                pst = conexao.prepareStatement(sql);
                pst.setString(1, this.txtClienteId.getText());
                //comando para atualizar o banco
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
                    //Limpam os campos dos Usuarios
                    this.txtClienteNome.setText(null);
                    this.txtClienteEndereco.setText(null);
                    this.ftxtTelefone.setText(null);
                    this.txtClienteEmail.setText(null);
                    //Habilita o botao adicionar
                    this.btnClienteCreate.setEnabled(true);
                }

                    // Cliente com Ordem de serviço em aberto
            } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null,"Cliente está com OS em aberto, Verifique.");

            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, e2);
                

            } 
            
            
                
            

        }

    }
}
