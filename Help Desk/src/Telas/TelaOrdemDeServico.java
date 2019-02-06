package Telas;

import CRUD.Controlador;
import java.sql.*;
import dal.ModuloConexao;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaOrdemDeServico extends javax.swing.JInternalFrame implements Controlador {

    // variavel de conexão
    Connection conexao = null;
    //PreparedStatement e ResultSet são frameworks do pacote java.sql 
    // Prepara e executa as instruçoes SQL
    PreparedStatement pst = null;
    ResultSet rs = null;

    //Atributos
    //Armazena o resultado do radio button 
    private String tipo;

    public TelaOrdemDeServico() {
        initComponents();
        //Modulo Conexao
        conexao = ModuloConexao.conector();

        // Ao abrir o form , habilita um radio button e atribui uma String ao atributo tipo
        this.rbOrcamento.setSelected(true);
        this.tipo = "Orçamento";

        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlOs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOs = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        rbOrcamento = new javax.swing.JRadioButton();
        rbOs = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        txtClienteBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtClienteId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtOsProblema = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOsServico = new javax.swing.JTextField();
        txtOsTecnico = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOsValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtOsEquipamento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnOsConsultar = new javax.swing.JButton();
        btnOsAlterar = new javax.swing.JButton();
        btnOsDeletar = new javax.swing.JButton();
        btnOsAdd = new javax.swing.JButton();
        ImprimirOs = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbOsSituacao = new javax.swing.JComboBox<>();
        cbOsPrioridade = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ordem de Serviço");
        setPreferredSize(new java.awt.Dimension(1014, 630));

        pnlOs.setBackground(new java.awt.Color(153, 68, 72));
        pnlOs.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(224, 204, 149));
        jLabel3.setText("Nº Ordem de Serviço");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(224, 204, 149));
        jLabel4.setText("Data");

        txtOs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOs.setEnabled(false);

        txtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setEnabled(false);

        buttonGroup1.add(rbOrcamento);
        rbOrcamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbOrcamento.setForeground(new java.awt.Color(224, 204, 149));
        rbOrcamento.setText("Orçamento");
        rbOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOrcamentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOs);
        rbOs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbOs.setForeground(new java.awt.Color(224, 204, 149));
        rbOs.setText("Ordem de Serviço");
        rbOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOsLayout = new javax.swing.GroupLayout(pnlOs);
        pnlOs.setLayout(pnlOsLayout);
        pnlOsLayout.setHorizontalGroup(
            pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtOs, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOsLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(rbOrcamento)
                .addGap(6, 6, 6)
                .addComponent(rbOs)
                .addGap(21, 21, 21))
        );
        pnlOsLayout.setVerticalGroup(
            pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOrcamento)
                    .addComponent(rbOs))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtClienteBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteBuscarActionPerformed(evt);
            }
        });
        txtClienteBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteBuscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pesquisar.png"))); // NOI18N

        tblClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        txtClienteId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClienteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClienteId.setEnabled(false);

        lblId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblId.setText("Id");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.red);
        jLabel16.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblId)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblId)
                                .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addComponent(txtClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtOsProblema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("* Campos Obrigatórios");

        txtOsServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtOsTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Valor Total");

        txtOsValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOsValor.setText("00,00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Equipamento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Problema");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Serviço");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Técnico");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("*");

        txtOsEquipamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnOsConsultar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnOsConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/read.png"))); // NOI18N
        btnOsConsultar.setPreferredSize(new java.awt.Dimension(45, 45));
        btnOsConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsConsultarActionPerformed(evt);
            }
        });

        btnOsAlterar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnOsAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/update.png"))); // NOI18N
        btnOsAlterar.setPreferredSize(new java.awt.Dimension(45, 45));
        btnOsAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsAlterarActionPerformed(evt);
            }
        });

        btnOsDeletar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnOsDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/delete.png"))); // NOI18N
        btnOsDeletar.setPreferredSize(new java.awt.Dimension(45, 45));
        btnOsDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsDeletarActionPerformed(evt);
            }
        });

        btnOsAdd.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        btnOsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/create.png"))); // NOI18N
        btnOsAdd.setPreferredSize(new java.awt.Dimension(45, 45));
        btnOsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsAddActionPerformed(evt);
            }
        });

        ImprimirOs.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        ImprimirOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/imprimir.png"))); // NOI18N
        ImprimirOs.setPreferredSize(new java.awt.Dimension(45, 45));
        ImprimirOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirOsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(btnOsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOsConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOsAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOsDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImprimirOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImprimirOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOsDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOsConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOsAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Situação");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Prioridade");

        cbOsSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOsSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Orçamento Reprovado", "Aguardando Aprovação", "Aguardando Peças", "Abandonado", "Aguardando Retirada", "Fechada" }));

        cbOsPrioridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOsPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel13.setText("Pesquisar Cliente");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setText("Preencha os Dados");

        jPanel1.setBackground(new java.awt.Color(153, 68, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOsPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOsSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOsValor, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOsTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(84, 84, 84)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtOsEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addGap(42, 42, 42)
                            .addComponent(txtOsProblema))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(68, 68, 68)
                            .addComponent(txtOsServico, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtOsEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(txtOsProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOsServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOsTecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtOsValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOsSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOsPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1014, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteBuscarKeyReleased
        // Metodo pesquisar
        pesquisar();
    }//GEN-LAST:event_txtClienteBuscarKeyReleased

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // Clicando com o mouse no nome do Cliente chama o metodo selecionarDaTabela
        selecionarDaTabela();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteBuscarActionPerformed

    private void rbOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOrcamentoActionPerformed
        // Atribui ao atributo tipo uma string
        this.tipo = "Orçamento";
    }//GEN-LAST:event_rbOrcamentoActionPerformed

    private void rbOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOsActionPerformed
        // Atribui ao atributo tipo uma String
        this.tipo = "Ordem de Serviço";
    }//GEN-LAST:event_rbOsActionPerformed

    private void btnOsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsAddActionPerformed
        // Metodo adicionar
        adicionar();
    }//GEN-LAST:event_btnOsAddActionPerformed

    private void btnOsConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsConsultarActionPerformed
        // Metodo consultar Os
        consultar();
    }//GEN-LAST:event_btnOsConsultarActionPerformed

    private void btnOsAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsAlterarActionPerformed
        // Metodo alterar 
        alterar();
    }//GEN-LAST:event_btnOsAlterarActionPerformed

    private void btnOsDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsDeletarActionPerformed
        // Metodo deletar
        deletar();
    }//GEN-LAST:event_btnOsDeletarActionPerformed

    private void ImprimirOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirOsActionPerformed
        // Imprimir Ordem de Serviço
        imprimir();
        
    }//GEN-LAST:event_ImprimirOsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImprimirOs;
    private javax.swing.JButton btnOsAdd;
    private javax.swing.JButton btnOsAlterar;
    private javax.swing.JButton btnOsConsultar;
    private javax.swing.JButton btnOsDeletar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOsPrioridade;
    private javax.swing.JComboBox<String> cbOsSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JPanel pnlOs;
    private javax.swing.JRadioButton rbOrcamento;
    private javax.swing.JRadioButton rbOs;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtClienteBuscar;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtOs;
    private javax.swing.JTextField txtOsEquipamento;
    private javax.swing.JTextField txtOsProblema;
    private javax.swing.JTextField txtOsServico;
    private javax.swing.JTextField txtOsTecnico;
    private javax.swing.JTextField txtOsValor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void adicionar() {
        String sql = "insert into tbos (tipo,equipamento,problema,servico,tecnico,situacao,prioridade,valor,idcli) values (?,?,?,?,?,?,?,?,?)";
        try {
            //prepara a String(comando do banco)definida na varivel sql 
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.tipo);
            pst.setString(2, this.txtOsEquipamento.getText());
            pst.setString(3, this.txtOsProblema.getText());
            pst.setString(4, this.txtOsServico.getText());
            pst.setString(5, this.txtOsTecnico.getText());
            pst.setString(6, this.cbOsSituacao.getSelectedItem().toString());
            pst.setString(7, this.cbOsPrioridade.getSelectedItem().toString());
            // replace troca o ponto por virgula
            pst.setString(8, this.txtOsValor.getText().replace(",", "."));
            pst.setString(9, this.txtClienteId.getText());

            //Validar os campos obrigatorios
            if ((this.txtOsEquipamento.getText().isEmpty())
                    || (this.txtOsProblema.getText().isEmpty())
                    || (this.txtOsValor.getText().isEmpty())
                    || (this.txtClienteId.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Obrigatórios *");

                // Apos validar - executa 
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Ordem de Serviço Emitida com Sucesso");

                    //Limpa os campos
                    this.txtClienteId.setText(null);
                    this.txtOsEquipamento.setText(null);
                    this.txtOsProblema.setText(null);
                    this.txtOsServico.setText(null);
                    this.txtOsTecnico.setText(null);
                    this.txtOsValor.setText(null);
                    this.cbOsSituacao.setSelectedItem("Aberto");
                    this.cbOsPrioridade.setSelectedItem("Baixa");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //consultar os
    @Override
    public void consultar() {
        String numeroOs = JOptionPane.showInputDialog("Digite o Número da Ordem de Serviço : ");
        String sql = "select * from tbos where os =" + numeroOs;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                this.txtOs.setText(rs.getString(1));
                this.txtData.setText(rs.getString(2));
                //Rabio Buttons 
                String rbTipo = rs.getString(3);
                if (rbTipo.equals("Orçamento")) {
                    this.rbOrcamento.setSelected(true);
                    this.tipo = "Orçamento";
                } else {
                    this.rbOs.setSelected(true);
                    this.tipo = "Ordem de Serviço";
                }
                this.txtOsEquipamento.setText(rs.getString(4));
                this.txtOsProblema.setText(rs.getString(5));
                this.txtOsServico.setText(rs.getString(6));
                this.txtOsTecnico.setText(rs.getString(7));
                this.cbOsSituacao.setSelectedItem(rs.getString(8));
                this.cbOsPrioridade.setSelectedItem(rs.getString(9));
                this.txtOsValor.setText(rs.getString(10));
                this.txtClienteId.setText(rs.getString(11));

                this.btnOsAdd.setEnabled(false);
                this.tblClientes.setVisible(false);
                this.txtClienteBuscar.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Ordem de Serviço não cadastrada");

            }

        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException e) {
            JOptionPane.showMessageDialog(null, "Ordem de Serviço Inválida");
            //System.out.println(e);

        } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, e2);

        }

    }

    @Override
    public void alterar() {
        String sql = "update tbos set tipo=?,equipamento=?,problema=?,servico=?,tecnico=?,situacao=?,prioridade=?,valor=? where os=?";

        try {
            //prepara a String(comando do banco)definida na varivel sql 
            pst = conexao.prepareStatement(sql);
            pst.setString(1, this.tipo);
            pst.setString(2, this.txtOsEquipamento.getText());
            pst.setString(3, this.txtOsProblema.getText());
            pst.setString(4, this.txtOsServico.getText());
            pst.setString(5, this.txtOsTecnico.getText());
            pst.setString(6, this.cbOsSituacao.getSelectedItem().toString());
            pst.setString(7, this.cbOsPrioridade.getSelectedItem().toString());
            // replace troca o ponto por virgula
            pst.setString(8, this.txtOsValor.getText().replace(",", "."));
            pst.setString(9, this.txtOs.getText());

            //Validar os campos obrigatorios
            if ((this.txtOsEquipamento.getText().isEmpty())
                    || (this.txtOsProblema.getText().isEmpty())
                    || (this.txtOsValor.getText().isEmpty())
                    || (this.txtOs.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos Obrigatórios *");

                // Apos validar - executa 
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Ordem de Serviço Alterada com Sucesso");

                    //Limpa os campos
                    this.txtOs.setText(null);
                    this.txtData.setText(null);
                    this.txtClienteId.setText(null);
                    this.txtOsEquipamento.setText(null);
                    this.txtOsProblema.setText(null);
                    this.txtOsServico.setText(null);
                    this.txtOsTecnico.setText(null);
                    this.txtOsValor.setText(null);
                    this.cbOsSituacao.setSelectedItem("Aberto");
                    this.cbOsPrioridade.setSelectedItem("Baixa");

                    this.btnOsAdd.setEnabled(true);
                    this.txtClienteBuscar.setEnabled(true);
                    this.tblClientes.setVisible(true);

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @Override
    public void deletar() {
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja realmente Excluir Ordem de Serviço ?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbos where os=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, this.txtOs.getText());
                
                int apagado = pst.executeUpdate();
              
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Ordem de Serviço apagada com Sucesso");
                    
                    //Limpa os campos
                    this.txtOs.setText(null);
                    this.txtData.setText(null);
                    this.txtClienteId.setText(null);
                    this.txtOsEquipamento.setText(null);
                    this.txtOsProblema.setText(null);
                    this.txtOsServico.setText(null);
                    this.txtOsTecnico.setText(null);
                    this.txtOsValor.setText(null);
                    this.cbOsSituacao.setSelectedItem("Aberto");
                    this.cbOsPrioridade.setSelectedItem("Baixa");

                    this.btnOsAdd.setEnabled(true);
                    this.txtClienteBuscar.setEnabled(true);
                    this.tblClientes.setVisible(true);
                    
                } 
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        } else {
        }
    }

    //pesquisa cliente
    public void pesquisar() {
         
        String sql = "select idcli as Id,nomecli as Nome ,fonecli as Telefone from tbclientes where nomecli like ?;";
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

    }
    
    public void imprimir(){
        //imprimir Ordem de serviço
         int confirmar = JOptionPane.showConfirmDialog(null, "Deseja imprimir a Ordem de Serviço ?","Atenção",JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            // Imprimindo relatorio utilizando o framework JasperReport
            try {
                //Classe HashMap para criar um filtro -- Framework JasperReport
                HashMap filtro = new HashMap();
                //Linha abaixo no campo String colocar o nome igual ao parametro passado no iReport
                filtro.put("os",Integer.parseInt(this.txtOs.getText()));
                //Utilizando a Classe JasperPrint para fazer a impressão
                //Agora adiciona o caminho o filtro e a conexao
                JasperPrint print = JasperFillManager.fillReport("C:\\PIM\\Relatorios\\OrdemDeServico.jasper",filtro,conexao);
                // Exibe o Relátorio utilizando a Classe JasperViewer
                JasperViewer.viewReport(print,false);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            
        } else {
        }
    }
}
