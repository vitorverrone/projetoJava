package telas;

import connection.ConnectionFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaInicio extends javax.swing.JFrame {


    public TelaInicio() {
        initComponents();
        this.setDefaultCloseOperation(TelaInicio.DO_NOTHING_ON_CLOSE);
        btnAtualizarProd.setEnabled(false);
        btnDeletarProd.setEnabled(false);
        btnNovoProd.setEnabled(false);
        montaGridProd();
        
        btnAtualizarUsuario.setEnabled(false);
        btnDeletarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(false);
        montaGridUser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneItems = new javax.swing.JTabbedPane();
        jpProdutos = new javax.swing.JPanel();
        cbxAtivoProd = new javax.swing.JCheckBox();
        btnAtualizarProd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JTextField();
        txtTamanhoProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        txtEstoqueProd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnIncluirProd = new javax.swing.JButton();
        btnDeletarProd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricaoProd = new javax.swing.JTextArea();
        btnNovoProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnNovoUsuario = new javax.swing.JButton();
        btnIncluirUsuario = new javax.swing.JButton();
        btnAtualizarUsuario = new javax.swing.JButton();
        btnDeletarUsuario = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        cbxMostrarSenha2 = new javax.swing.JCheckBox();
        lblEmail1 = new javax.swing.JLabel();
        tblUsuarios = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCodUser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPaneItems.setBackground(new java.awt.Color(255, 255, 255));

        jpProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jpProdutos.setPreferredSize(new java.awt.Dimension(557, 200));

        cbxAtivoProd.setText("Ativo?");

        btnAtualizarProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnAtualizarProd.setText("ATUALIZAR");
        btnAtualizarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarProdMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("Preço*:");

        txtPrecoProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel2.setText("Nome do produto*:");

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel6.setText("Tamanho:");

        txtNomeProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        txtTamanhoProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel7.setText("Estoque*:");

        txtCodProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtCodProd.setEnabled(false);

        txtEstoqueProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel8.setText("Descrição:");

        btnIncluirProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnIncluirProd.setText("INCLUIR");
        btnIncluirProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirProdMouseClicked(evt);
            }
        });

        btnDeletarProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnDeletarProd.setText("DELETAR");
        btnDeletarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarProdMouseClicked(evt);
            }
        });

        txtDescricaoProd.setColumns(20);
        txtDescricaoProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtDescricaoProd.setRows(5);
        jScrollPane2.setViewportView(txtDescricaoProd);

        btnNovoProd.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnNovoProd.setText("NOVO");
        btnNovoProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoProdMouseClicked(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Produto", "Estoque", "Tamanho", "Preço", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setResizable(false);
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblProdutos.getColumnModel().getColumn(1).setResizable(false);
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblProdutos.getColumnModel().getColumn(2).setResizable(false);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblProdutos.getColumnModel().getColumn(3).setResizable(false);
            tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblProdutos.getColumnModel().getColumn(4).setResizable(false);
            tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblProdutos.getColumnModel().getColumn(5).setResizable(false);
            tblProdutos.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jpProdutosLayout = new javax.swing.GroupLayout(jpProdutos);
        jpProdutos.setLayout(jpProdutosLayout);
        jpProdutosLayout.setHorizontalGroup(
            jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpProdutosLayout.createSequentialGroup()
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTamanhoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstoqueProd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNovoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIncluirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProdutosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAtivoProd))))
                .addContainerGap())
        );
        jpProdutosLayout.setVerticalGroup(
            jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(cbxAtivoProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProdutosLayout.createSequentialGroup()
                        .addComponent(btnNovoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpProdutosLayout.createSequentialGroup()
                        .addComponent(btnIncluirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpProdutosLayout.createSequentialGroup()
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTamanhoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEstoqueProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPaneItems.addTab("Produtos", jpProdutos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnNovoUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnNovoUsuario.setText("NOVO");
        btnNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoUsuarioMouseClicked(evt);
            }
        });

        btnIncluirUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnIncluirUsuario.setText("INCLUIR");
        btnIncluirUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirUsuarioMouseClicked(evt);
            }
        });

        btnAtualizarUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnAtualizarUsuario.setText("ATUALIZAR");
        btnAtualizarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarUsuarioMouseClicked(evt);
            }
        });

        btnDeletarUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnDeletarUsuario.setText("DELETAR");
        btnDeletarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarUsuarioMouseClicked(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblEmail.setText("E-mail*:");

        txtEmail.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        txtSenha.setToolTipText("");
        txtSenha.setMinimumSize(new java.awt.Dimension(6, 21));
        txtSenha.setPreferredSize(new java.awt.Dimension(6, 21));

        cbxMostrarSenha2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        cbxMostrarSenha2.setText("Mostrar senha");
        cbxMostrarSenha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxMostrarSenha2MouseClicked(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblEmail1.setText("Senha*:");

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        tblUsuarios.setViewportView(tblUsers);
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblUsers.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Código:");

        txtCodUser.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtCodUser.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAtualizarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeletarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblEmail1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMostrarSenha2)
                                .addGap(0, 90, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(tblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail1)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMostrarSenha2))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPaneItems.addTab("Usuários", jPanel4);

        jPanel1.setBackground(new java.awt.Color(189, 29, 29));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/logo-branco.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneItems, javax.swing.GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneItems)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(643, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirProdMouseClicked
        if(txtNomeProd.getText().equals("") || txtEstoqueProd.getText().equals("") || 
                txtPrecoProd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos!");
        }
        else {
            Pattern pPreco = Pattern.compile("^\\d+(\\,\\d{2})?");
            Matcher mPreco = pPreco.matcher(txtPrecoProd.getText());
            
            boolean isPrecoValid = mPreco.matches();
            if(!isPrecoValid) {
                JOptionPane.showMessageDialog(null, "Digite um valor válido para o preço. EX: 90,00");
            }
            else {
                try {
                    ConnectionFactory con = new ConnectionFactory();
                    con.conecta();

                    String descricao = txtDescricaoProd.getText();
                    String estoque = txtEstoqueProd.getText();
                    String nomeProd = txtNomeProd.getText();
                    String preco = txtPrecoProd.getText();
                    String tamanho = txtTamanhoProd.getText();
                    int ativo = 0;
                    if(cbxAtivoProd.isSelected()) {
                        ativo = 1;
                    }

                    String sql = "INSERT INTO produtos (nomeProd ,estoque , tamanho, descricao, ativo, preco) VALUES"
                    + "('" + nomeProd + "','" + estoque + "','" + tamanho + "','" + descricao + "'," + ativo + ",'" + preco + "');";
                    System.out.println(sql);
                    con.executaInsert(sql);

                    JOptionPane.showMessageDialog(null, "Produto inserido com Sucesso!");

                    limpaCamposProd();
                    btnAtualizarProd.setEnabled(false);
                    btnDeletarProd.setEnabled(false);
                    btnNovoProd.setEnabled(false);
                    btnIncluirProd.setEnabled(true);
                    montaGridProd();

                    con.desconecta();
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir produto: "+e);
                }
            }
        }
    }//GEN-LAST:event_btnIncluirProdMouseClicked

    private void montaGridProd() {
        try {
            ConnectionFactory con = new ConnectionFactory();
            con.conecta();
            DefaultTableModel tabelaProdutos = (DefaultTableModel) tblProdutos.getModel();
            
            int rowCount = tabelaProdutos.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                tabelaProdutos.removeRow(i);
            }
            
            String sql = "SELECT * FROM produtos";
            System.out.println(sql);
            con.executaSQL(sql);
            
            String ativo = "Não";
            
            while(con.RS.next()) {
                ativo = "Não";
                if(con.RS.getInt("ativo") == 1) {
                    ativo = "Sim";
                }
                tabelaProdutos.addRow(new Object[] {
                    con.RS.getString("id"),
                    con.RS.getString("nomeProd"),
                    con.RS.getString("estoque"),
                    con.RS.getString("tamanho"),
                    con.RS.getString("preco"),
                    ativo
                });
            }
            con.desconecta();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro trazer produtos: "+e);
        }
    }
    
    private void montaGridUser() {
        try {
            ConnectionFactory con = new ConnectionFactory();
            con.conecta();
            DefaultTableModel tabelaUsuarios = (DefaultTableModel) tblUsers.getModel();
            
            int rowCount = tabelaUsuarios.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                tabelaUsuarios.removeRow(i);
            }
            
            String sql = "SELECT * FROM usuarios WHERE idUsuario != 1";
            System.out.println(sql);
            con.executaSQL(sql);
            
            while(con.RS.next()) {
                tabelaUsuarios.addRow(new Object[] {
                    con.RS.getString("idUsuario"),
                    con.RS.getString("email"),
                });
            }
            con.desconecta();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro trazer usuários: "+e);
        }
        txtEmail.setText("");
        txtSenha.setText("");
    }
    
    private void btnNovoProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoProdMouseClicked
        limpaCamposProd();
        btnIncluirProd.setEnabled(true);
    }//GEN-LAST:event_btnNovoProdMouseClicked

    private void limpaCamposProd() {
        txtCodProd.setText("");
        txtDescricaoProd.setText("");
        txtEstoqueProd.setText("");
        txtNomeProd.setText("");
        txtPrecoProd.setText("");
        txtTamanhoProd.setText("");
        cbxAtivoProd.setSelected(false);
        btnAtualizarProd.setEnabled(false);
        btnDeletarProd.setEnabled(false);
        btnNovoProd.setEnabled(false);
    }
    
    private void limpaCamposUser() {
        txtCodUser.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        cbxMostrarSenha2.setSelected(false);
        btnAtualizarUsuario.setEnabled(false);
        btnDeletarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(false);
    }
    
    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        try {
            ConnectionFactory con = new ConnectionFactory();
            con.conecta();

            int linha = tblProdutos.getSelectedRow();
            String id = (tblProdutos.getModel().getValueAt(linha, 0)).toString();
            con.executaSQL ("SELECT * FROM produtos WHERE id = "+id);
            if(con.RS.first()) {
                String idProd = con.RS.getString("id");
                String nomeProd = con.RS.getString("nomeProd");
                String estoque = con.RS.getString("estoque");
                String tamanho = con.RS.getString("tamanho");
                String descricao = con.RS.getString("descricao");
                String preco = con.RS.getString("preco");
                int ativo = con.RS.getInt("ativo");

                txtCodProd.setText(idProd);
                txtDescricaoProd.setText(descricao);
                txtEstoqueProd.setText(estoque);
                txtNomeProd.setText(nomeProd);
                txtPrecoProd.setText(preco);
                txtTamanhoProd.setText(tamanho);
                if(ativo == 1) {
                    cbxAtivoProd.setSelected(true);
                }
            }
            btnDeletarProd.setEnabled(true);
            btnAtualizarProd.setEnabled(true);
            btnNovoProd.setEnabled(true);
            btnIncluirProd.setEnabled(false);

            con.desconecta();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: "+e);
        }
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnIncluirUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirUsuarioMouseClicked
        if(txtEmail.getText().equals("") || txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos!");
        }
        else {
            try {
                ConnectionFactory con = new ConnectionFactory();
                con.conecta();
                String email = txtEmail.getText();
                
                con.executaSQL ("select * from usuarios where email = '"+email+"'");
                if(con.RS.first()) {
                    JOptionPane.showMessageDialog(null, "Esse e-mail já esta cadastrado em nosso sistema!");
                }
                else {
                    String senha = txtSenha.getText();

                    String sql = "INSERT INTO usuarios (email ,senha) VALUES"
                    + "('" + email + "','" + senha + "');";
                    System.out.println(sql);
                    con.executaInsert(sql);

                    JOptionPane.showMessageDialog(null, "Usuário inserido com Sucesso!");

                    limpaCamposUser();
                    btnAtualizarUsuario.setEnabled(false);
                    btnDeletarUsuario.setEnabled(false);
                    btnNovoUsuario.setEnabled(false);
                    btnIncluirUsuario.setEnabled(true);
                    montaGridUser();

                    con.desconecta();
                }
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir usuário: "+e);
            }
        }
    }//GEN-LAST:event_btnIncluirUsuarioMouseClicked

    private void cbxMostrarSenha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMostrarSenha2MouseClicked
        if(cbxMostrarSenha2.isSelected()) {
            txtSenha.setEchoChar((char)0);
        }
        else {
            txtSenha.setEchoChar('•');
        }
    }//GEN-LAST:event_cbxMostrarSenha2MouseClicked

    private void btnAtualizarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarProdMouseClicked
        if(txtNomeProd.getText().equals("") || txtEstoqueProd.getText().equals("") || 
                txtPrecoProd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos!");
        }
        else {
            Pattern pPreco = Pattern.compile("^\\d+(\\,\\d{2})?");
            Matcher mPreco = pPreco.matcher(txtPrecoProd.getText());
            
            boolean isPrecoValid = mPreco.matches();
            if(!isPrecoValid) {
                JOptionPane.showMessageDialog(null, "Digite um valor válido para o preço. EX: 90,00");
            }
            else {
                try {
                    ConnectionFactory con = new ConnectionFactory();
                    con.conecta();

                    int idProd = Integer.parseInt(txtCodProd.getText());
                    String descricao = txtDescricaoProd.getText();
                    String estoque = txtEstoqueProd.getText();
                    String nomeProd = txtNomeProd.getText();
                    String preco = txtPrecoProd.getText();
                    String tamanho = txtTamanhoProd.getText();
                    int ativo = 0;
                    if(cbxAtivoProd.isSelected()) {
                        ativo = 1;
                    }

                    String sql = 
                    "UPDATE produtos SET nomeProd = '"+nomeProd+"', estoque = '"+estoque+"',"
                    +"tamanho = '"+tamanho+"', descricao = '"+descricao+"', ativo = "+ativo+","
                    +"preco = '"+preco+"' WHERE id = "+idProd;
                    System.out.println(sql);
                    con.executaInsert(sql);

                    JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");

                    limpaCamposProd();
                    btnAtualizarProd.setEnabled(false);
                    btnDeletarProd.setEnabled(false);
                    btnNovoProd.setEnabled(false);
                    btnIncluirProd.setEnabled(true);
                    montaGridProd();

                    con.desconecta();
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar produto: "+e);
                }
            }
        }
    }//GEN-LAST:event_btnAtualizarProdMouseClicked

    private void btnDeletarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarProdMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (this, "Você realmente deseja deletar o produto " + txtNomeProd.getText() + "?","Deletar Produto?", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                ConnectionFactory con = new ConnectionFactory();
                con.conecta();

                int idProd = Integer.parseInt(txtCodProd.getText());

                String sql = "DELETE FROM produtos WHERE id = "+idProd;
                System.out.println(sql);
                con.executaInsert(sql);

                JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");

                limpaCamposProd();
                btnAtualizarProd.setEnabled(false);
                btnDeletarProd.setEnabled(false);
                btnNovoProd.setEnabled(false);
                btnIncluirProd.setEnabled(true);
                montaGridProd();

                con.desconecta();
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar produto: "+e);
            }
        }
    }//GEN-LAST:event_btnDeletarProdMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (this, "Você realmente deseja sair?","Aviso", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        try {
            ConnectionFactory con = new ConnectionFactory();
            con.conecta();

            int linha = tblUsers.getSelectedRow();
            String id = (tblUsers.getModel().getValueAt(linha, 0)).toString();
            con.executaSQL ("SELECT * FROM usuarios WHERE idUsuario = "+id);
            if(con.RS.first()) {
                String idUser = con.RS.getString("idUsuario");
                String emailUser = con.RS.getString("email");
                String senhaUser = con.RS.getString("senha");

                txtCodUser.setText(idUser);
                txtEmail.setText(emailUser);
                txtSenha.setText(senhaUser);
            }
            btnDeletarUsuario.setEnabled(true);
            btnAtualizarUsuario.setEnabled(true);
            btnNovoUsuario.setEnabled(true);
            btnIncluirUsuario.setEnabled(false);

            con.desconecta();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário: "+e);
        }
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoUsuarioMouseClicked
        limpaCamposUser();
        btnIncluirUsuario.setEnabled(true);
    }//GEN-LAST:event_btnNovoUsuarioMouseClicked

    private void btnAtualizarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarUsuarioMouseClicked
        if(txtEmail.getText().equals("") || txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos!");
        }
        else {
            Pattern pEmail = Pattern.compile("^([\\w]+)@([\\w]+)\\.([\\w]+)$");
            Matcher mEmail = pEmail.matcher(txtEmail.getText());
            
            boolean isEmailValid = mEmail.matches();
            if(!isEmailValid) {
                JOptionPane.showMessageDialog(null, "Digite um e-mail válido!");
            }
            else {
                try {
                    ConnectionFactory con = new ConnectionFactory();
                    con.conecta();

                    int idUser = Integer.parseInt(txtCodUser.getText());
                    String email = txtEmail.getText();
                    String senha = txtSenha.getText();

                    String sql = 
                    "UPDATE usuarios SET email = '"+email+"', senha = '"+senha+"' WHERE idUsuario = "+idUser;
                    System.out.println(sql);
                    con.executaInsert(sql);

                    JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");

                    limpaCamposUser();
                    btnAtualizarUsuario.setEnabled(false);
                    btnDeletarUsuario.setEnabled(false);
                    btnNovoUsuario.setEnabled(false);
                    btnIncluirUsuario.setEnabled(true);
                    montaGridUser();

                    con.desconecta();
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário: "+e);
                }
            }
        }
    }//GEN-LAST:event_btnAtualizarUsuarioMouseClicked

    private void btnDeletarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarUsuarioMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (this, "Você realmente deseja deletar o usuário " + txtEmail.getText() + "?","Deletar Usuário?", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                ConnectionFactory con = new ConnectionFactory();
                con.conecta();

                int idUser = Integer.parseInt(txtCodUser.getText());

                String sql = "DELETE FROM usuarios WHERE idUsuario = "+idUser;
                System.out.println(sql);
                con.executaInsert(sql);

                JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");

                limpaCamposUser();
                btnAtualizarUsuario.setEnabled(false);
                btnDeletarUsuario.setEnabled(false);
                btnNovoUsuario.setEnabled(false);
                btnIncluirUsuario.setEnabled(true);
                montaGridUser();

                con.desconecta();
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar usuário: "+e);
            }
        }
    }//GEN-LAST:event_btnDeletarUsuarioMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarProd;
    private javax.swing.JButton btnAtualizarUsuario;
    private javax.swing.JButton btnDeletarProd;
    private javax.swing.JButton btnDeletarUsuario;
    private javax.swing.JButton btnIncluirProd;
    private javax.swing.JButton btnIncluirUsuario;
    private javax.swing.JButton btnNovoProd;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JCheckBox cbxAtivoProd;
    private javax.swing.JCheckBox cbxMostrarSenha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jPaneItems;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpProdutos;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTable tblUsers;
    private javax.swing.JScrollPane tblUsuarios;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtCodUser;
    private javax.swing.JTextArea txtDescricaoProd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstoqueProd;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtPrecoProd;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTamanhoProd;
    // End of variables declaration//GEN-END:variables
}
