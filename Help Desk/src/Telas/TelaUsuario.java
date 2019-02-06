package Telas;

import java.sql.*;
import dal.ModuloConexao;
import javax.swing.JOptionPane;
import CRUD.Controlador;
import java.awt.Color;

public class TelaUsuario extends javax.swing.JInternalFrame implements Controlador {

    // variavel de conexão
    Connection conexao = null;
    //PreparedStatement e ResultSet são frameworks do pacote java.sql 
    // Prepara e executa as instruçoes SQL
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaUsuario() {
        initComponents();

        

        //Metodo conexão
        conexao = ModuloConexao.conector();

        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().setBackground(Color.WHITE);
    }
    
    
    @Override
    public void consultar() {
        String sql = "  select * from tbusuarios where iduser =?";
        try {
            //Prepara a Query que foi gravada na variavel sql
            pst = conexao.prepareStatement(sql);
            // Le o campo txtUsuarioId que sera responsavel por indicar qual id 
            pst.setString(1, txtUsuarioId.getText());
            rs = pst.executeQuery();
            if (this.rs.next()) {
                this.txtUsuarioNome.setText(rs.getString(2));
                this.ftxtUsuarioFone.setText(rs.getString(3));
                this.txtUsuarioLogin.setText(rs.getString(4));
                this.txtUsuarioSenha.setText(rs.getString(5));
                //Linha abaixo se refere ao combo box
                this.cbUsuarioPerfil.setSelectedItem(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                //Limpam os campos dos Usuarios
                this.txtUsuarioNome.setText(null);
                this.ftxtUsuarioFone.setText(null);
                this.txtUsuarioLogin.setText(null);
                this.txtUsuarioSenha.setText(null);
                //Linha abaixo se refere ao combo box
                this.cbUsuarioPerfil.setSelectedItem(" ");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    @Override
    public void adicionar() {
        String sql = "insert into tbusuarios (iduser,usuario,fone,login,senha,perfil) values (?,?,?,?,?,?)";
        try {
            //Prepara a Query que foi gravada na variavel sql
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.txtUsuarioId.getText());
            pst.setString(2, this.txtUsuarioNome.getText());
            pst.setString(3, this.ftxtUsuarioFone.getText());
            pst.setString(4, this.txtUsuarioLogin.getText());
            pst.setString(5, this.txtUsuarioSenha.getText());
            pst.setString(6, this.cbUsuarioPerfil.getSelectedItem().toString());

//Validação dos campos obrigatórios.
            if ((this.txtUsuarioId.getText().isEmpty())
                    || (this.txtUsuarioNome.getText().isEmpty())
                    || (this.txtUsuarioLogin.getText().isEmpty())
                    || (this.txtUsuarioSenha.getText().isEmpty())
                    || this.cbUsuarioPerfil.getSelectedItem().equals(" ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Obrigatórios!");

            } else {
//Após validar.. executa o else ^ 
//Adiciona na tbusuarios com os dados digitados na tela
                // e exibe a mensagem de sucesso
                //comando para atualizar o banco
                int adicionado = pst.executeUpdate();
                // a linha abaixo mostra o valor 1 quando a tabela ganha um registro,
                // serve para testar e maior entendimento ao codigo.
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso");
                    //Limpam os campos dos Usuarios
                    this.txtUsuarioId.setText(null);
                    this.txtUsuarioNome.setText(null);
                    this.ftxtUsuarioFone.setText(null);
                    this.txtUsuarioLogin.setText(null);
                    this.txtUsuarioSenha.setText(null);
                    //Linha abaixo se refere ao combo box
                    this.cbUsuarioPerfil.setSelectedItem(" ");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    //Metodo Alterar Dados
    @Override
    public void alterar() {
        //Prepara a Query a ser executada no banco
        String sql = "update tbusuarios set usuario=?, fone=?,login=?,senha=?,perfil=? where iduser=?";
        try {
            //Preparo a Query que foi declarada na variavel sql
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.txtUsuarioNome.getText());
            pst.setString(2, this.ftxtUsuarioFone.getText());
            pst.setString(3, this.txtUsuarioLogin.getText());
            pst.setString(4, this.txtUsuarioSenha.getText());
            //combo box
            pst.setString(5, this.cbUsuarioPerfil.getSelectedItem().toString());
            pst.setString(6, this.txtUsuarioId.getText());

//Validação dos campos obrigatórios.
            if ((this.txtUsuarioId.getText().isEmpty())
                    || (this.txtUsuarioNome.getText().isEmpty())
                    || (this.txtUsuarioLogin.getText().isEmpty())
                    || (this.txtUsuarioSenha.getText().isEmpty())
                    || this.cbUsuarioPerfil.getSelectedItem().equals(" ")) {

                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Obrigatórios!");

            } else {
//Após validar.. executa o else ^ 
//Altera na tbusuarios com os dados digitados na tela
                // e exibe a mensagem de sucesso
                //comando para atualizar o banco
                int adicionado = pst.executeUpdate();
                // a linha abaixo mostra o valor 1 quando a tabela altera um registro,
                // serve para testar e maior entendimento ao codigo.
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    //Limpam os campos dos Usuarios
                    this.txtUsuarioId.setText(null);
                    this.txtUsuarioNome.setText(null);
                    this.ftxtUsuarioFone.setText(null);
                    this.txtUsuarioLogin.setText(null);
                    this.txtUsuarioSenha.setText(null);
                    //Linha abaixo se refere ao combo box
                    this.cbUsuarioPerfil.setSelectedItem(" ");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    @Override
    public void deletar() {
        //Confirma se o cliente deseja deletar um dado do banco
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar o usuário? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //Prepara a Query a ser executada no banco
            String sql = "delete from tbusuarios where iduser=?";
            try {
                //Preparo a Query que foi declarada na variavel sql
                pst = conexao.prepareStatement(sql);
                pst.setString(1, this.txtUsuarioId.getText());
                //comando para atualizar o banco
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso");
                    //Limpam os campos dos Usuarios
                    this.txtUsuarioId.setText(null);
                    this.txtUsuarioNome.setText(null);
                    this.ftxtUsuarioFone.setText(null);
                    this.txtUsuarioLogin.setText(null);
                    this.txtUsuarioSenha.setText(null);
                    //Linha abaixo se refere ao combo box
                    this.cbUsuarioPerfil.setSelectedItem(" ");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }

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

        pnDadosUsuario = new javax.swing.JPanel();
        txtUsuarioSenha = new javax.swing.JTextField();
        cbUsuarioPerfil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioId = new javax.swing.JTextField();
        txtUsuarioNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ftxtUsuarioFone = new javax.swing.JFormattedTextField();
        pnlUsuarioOpera = new javax.swing.JPanel();
        btnUsuarioCreate = new javax.swing.JButton();
        btnUsuarioDelete = new javax.swing.JButton();
        btnUsuarioRead = new javax.swing.JButton();
        btnUsuarioUpdate = new javax.swing.JButton();
        pnlOs = new javax.swing.JPanel();
        pnlClienteOpera = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(1014, 630));

        pnDadosUsuario.setBackground(new java.awt.Color(255, 255, 255));

        txtUsuarioSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbUsuarioPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "admin", "atende", "tec" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("*");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Formatar Tel");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Login");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Senha");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Perfil");

        txtUsuarioId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuarioId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtUsuarioNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("*");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("*");

        txtUsuarioLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("*");

        try {
            ftxtUsuarioFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)     ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtUsuarioFone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnDadosUsuarioLayout = new javax.swing.GroupLayout(pnDadosUsuario);
        pnDadosUsuario.setLayout(pnDadosUsuarioLayout);
        pnDadosUsuarioLayout.setHorizontalGroup(
            pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                        .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                .addComponent(txtUsuarioNome)
                                .addGap(59, 59, 59))))
                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(67, 67, 67))
                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                        .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ftxtUsuarioFone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(cbUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnDadosUsuarioLayout.setVerticalGroup(
            pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftxtUsuarioFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7))
                    .addGroup(pnDadosUsuarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pnlUsuarioOpera.setBackground(new java.awt.Color(255, 255, 255));

        btnUsuarioCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/create.png"))); // NOI18N
        btnUsuarioCreate.setToolTipText("Adicionar");
        btnUsuarioCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioCreate.setPreferredSize(new java.awt.Dimension(45, 45));
        btnUsuarioCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioCreateActionPerformed(evt);
            }
        });

        btnUsuarioDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/delete.png"))); // NOI18N
        btnUsuarioDelete.setToolTipText("Remover");
        btnUsuarioDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioDelete.setPreferredSize(new java.awt.Dimension(45, 45));
        btnUsuarioDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioDeleteActionPerformed(evt);
            }
        });

        btnUsuarioRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/read.png"))); // NOI18N
        btnUsuarioRead.setToolTipText("Consultar");
        btnUsuarioRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioRead.setPreferredSize(new java.awt.Dimension(45, 45));
        btnUsuarioRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioReadActionPerformed(evt);
            }
        });

        btnUsuarioUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/update.png"))); // NOI18N
        btnUsuarioUpdate.setToolTipText("Alterar");
        btnUsuarioUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioUpdate.setPreferredSize(new java.awt.Dimension(45, 45));
        btnUsuarioUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuarioOperaLayout = new javax.swing.GroupLayout(pnlUsuarioOpera);
        pnlUsuarioOpera.setLayout(pnlUsuarioOperaLayout);
        pnlUsuarioOperaLayout.setHorizontalGroup(
            pnlUsuarioOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuarioOperaLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnUsuarioCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        pnlUsuarioOperaLayout.setVerticalGroup(
            pnlUsuarioOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioOperaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnUsuarioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOs.setBackground(new java.awt.Color(153, 68, 72));
        pnlOs.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        pnlOs.setPreferredSize(new java.awt.Dimension(301, 396));

        javax.swing.GroupLayout pnlOsLayout = new javax.swing.GroupLayout(pnlOs);
        pnlOs.setLayout(pnlOsLayout);
        pnlOsLayout.setHorizontalGroup(
            pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        pnlOsLayout.setVerticalGroup(
            pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        pnlClienteOpera.setBackground(new java.awt.Color(153, 68, 72));

        javax.swing.GroupLayout pnlClienteOperaLayout = new javax.swing.GroupLayout(pnlClienteOpera);
        pnlClienteOpera.setLayout(pnlClienteOperaLayout);
        pnlClienteOperaLayout.setHorizontalGroup(
            pnlClienteOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        pnlClienteOperaLayout.setVerticalGroup(
            pnlClienteOperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel14.setText("Usuários");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("* Campos Obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(pnDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlClienteOpera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlUsuarioOpera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlUsuarioOpera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlClienteOpera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(pnDadosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );

        setSize(new java.awt.Dimension(1014, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioCreateActionPerformed
        // Metodo adicionar
        adicionar();
    }//GEN-LAST:event_btnUsuarioCreateActionPerformed

    private void btnUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioUpdateActionPerformed
        // Metodo Alterar
        alterar();
    }//GEN-LAST:event_btnUsuarioUpdateActionPerformed

    private void btnUsuarioReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioReadActionPerformed
        // Metodo consultar
        consultar();

    }//GEN-LAST:event_btnUsuarioReadActionPerformed

    private void btnUsuarioDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioDeleteActionPerformed
        // Metodo deletar
        deletar();
    }//GEN-LAST:event_btnUsuarioDeleteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioCreate;
    private javax.swing.JButton btnUsuarioDelete;
    private javax.swing.JButton btnUsuarioRead;
    private javax.swing.JButton btnUsuarioUpdate;
    private javax.swing.JComboBox<String> cbUsuarioPerfil;
    private javax.swing.JFormattedTextField ftxtUsuarioFone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnDadosUsuario;
    private javax.swing.JPanel pnlClienteOpera;
    private javax.swing.JPanel pnlOs;
    private javax.swing.JPanel pnlUsuarioOpera;
    private javax.swing.JTextField txtUsuarioId;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioSenha;
    // End of variables declaration//GEN-END:variables
}
