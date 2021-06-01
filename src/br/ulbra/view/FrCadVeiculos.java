/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Veiculos;
import br.ulbra.model.VeiculosDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
* @author JPGR
 */
public class FrCadVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form FrCadUsuario
     */
    public FrCadVeiculos() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        showTable();
    }

    public void showTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculosDao udao = new VeiculosDao();
        for (Veiculos p : udao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getmarca(),
                p.getmodelo(),
                p.getano(),
                p.getcor(),
                p.getplaca(),
                p.getmotor(),
                p.getkm(),
                p.getvalorFipe()
            });
        }
    }

    public void showTableForName(String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculosDao udao = new VeiculosDao();
        for (Veiculos p : udao.readPesq(nome)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getmarca(),
                p.getmodelo(),
                p.getano(),
                p.getcor(),
                p.getplaca(),
                p.getmotor(),
                p.getkm(),
                p.getvalorFipe()
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMODELO = new javax.swing.JTextField();
        txtMOTOR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCOD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPLACA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtANO = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCOR = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtVTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btNOVO = new javax.swing.JButton();
        btSALVAR = new javax.swing.JButton();
        btALTERNAR = new javax.swing.JButton();
        btEXCLUIR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVeiculos = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Veiculos Manejer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 634, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Modelo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        txtMODELO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMODELO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMODELOActionPerformed(evt);
            }
        });
        getContentPane().add(txtMODELO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 240, 34));

        txtMOTOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMOTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMOTORActionPerformed(evt);
            }
        });
        getContentPane().add(txtMOTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Placa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        txtMARCA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMARCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMARCAActionPerformed(evt);
            }
        });
        getContentPane().add(txtMARCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 68, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Km");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        txtCOD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCODActionPerformed(evt);
            }
        });
        getContentPane().add(txtCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 68, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CÓDIGO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtPLACA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPLACA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLACAActionPerformed(evt);
            }
        });
        getContentPane().add(txtPLACA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 68, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Marca");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txtKM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });
        getContentPane().add(txtKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 220, 110, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ano");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        txtANO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtANOActionPerformed(evt);
            }
        });
        getContentPane().add(txtANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 68, 34));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Motor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Motor");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        txtCOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCORActionPerformed(evt);
            }
        });
        getContentPane().add(txtCOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, 34));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Valor Pela Tabela Fipe");

        txtVTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtVTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Placa");

        btNOVO.setBackground(new java.awt.Color(0, 153, 255));
        btNOVO.setForeground(new java.awt.Color(255, 255, 255));
        btNOVO.setText("NOVO");
        btNOVO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNOVOActionPerformed(evt);
            }
        });

        btSALVAR.setBackground(new java.awt.Color(51, 255, 51));
        btSALVAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSALVAR.setForeground(new java.awt.Color(255, 255, 255));
        btSALVAR.setText("SALVAR");
        btSALVAR.setEnabled(false);
        btSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSALVARActionPerformed(evt);
            }
        });

        btALTERNAR.setBackground(new java.awt.Color(255, 255, 0));
        btALTERNAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btALTERNAR.setForeground(new java.awt.Color(255, 255, 255));
        btALTERNAR.setText("ALTERAR");
        btALTERNAR.setEnabled(false);
        btALTERNAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btALTERNARActionPerformed(evt);
            }
        });

        btEXCLUIR.setBackground(new java.awt.Color(255, 0, 0));
        btEXCLUIR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEXCLUIR.setForeground(new java.awt.Color(255, 255, 255));
        btEXCLUIR.setText("EXCLUIR");
        btEXCLUIR.setEnabled(false);
        btEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEXCLUIRActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbVeiculos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD", "MARCA", "MODELO", "ANO", "COR", "PLACA", "MOTOR", "KM", "VALOR TABELA FIPE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVeiculosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVeiculos);

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lupa.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btALTERNAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVTF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSALVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btALTERNAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 600, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNOVOActionPerformed
        btSALVAR.setEnabled(true);
    }//GEN-LAST:event_btNOVOActionPerformed

    private void btEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEXCLUIRActionPerformed
        Veiculos u = new Veiculos();
        u.setId(Integer.parseInt(txtCOD.getText()));
        VeiculosDao udao;
        try {
            udao = new VeiculosDao();
            udao.delete(u);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEXCLUIRActionPerformed

    private void btALTERNARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btALTERNARActionPerformed
        Veiculos u = new Veiculos();
        u.setId(Integer.parseInt(txtCOD.getText()));
        u.setmarca(txtMARCA.getText());
        u.setmodelo(txtMODELO.getText());
        u.setano(Integer.parseInt(txtANO.getText()));
        u.setcor(txtCOR.getText());
        u.setplaca(txtPLACA.getText());
        u.setmotor(txtMOTOR.getText());
        u.setkm(Integer.parseInt(txtKM.getText()));
        u.setvalorFipe(Double.parseDouble(txtVTF.getText()));

        VeiculosDao udao;
        try {
            udao = new VeiculosDao();
            udao.update(u);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btALTERNARActionPerformed

    private void btSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSALVARActionPerformed
        Veiculos u = new Veiculos();
        u.setmarca(txtMARCA.getText());
        u.setmodelo(txtMODELO.getText());
        u.setano(Integer.parseInt(txtANO.getText()));
        u.setcor(txtCOR.getText());
        u.setplaca(txtPLACA.getText());
        u.setmotor(txtMOTOR.getText());
        u.setkm(Integer.parseInt(txtKM.getText()));
        u.setvalorFipe(Double.parseDouble(txtVTF.getText()));
    }//GEN-LAST:event_btSALVARActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        try {
            showTableForName(txtPesquisa.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrCadVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tbVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVeiculosMouseClicked
        if (tbVeiculos.getSelectedRow() != -1) {
            txtCOD.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 0)
                .toString());
            txtPLACA.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 1)
                .toString());
            txtMODELO.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 2)
                .toString());
            txtMARCA.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 3)
                .toString());
            txtCOR.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 3)
                .toString());
            txtMOTOR.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 3)
                .toString());
            txtKM.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 3)
                .toString());
            txtVTF.setText(tbVeiculos.getValueAt(tbVeiculos.getSelectedRow(), 3)
                .toString());

            btSALVAR.setEnabled(false);
            btALTERNAR.setEnabled(true);
            btEXCLUIR.setEnabled(true);

        }
    }//GEN-LAST:event_tbVeiculosMouseClicked

    private void txtMODELOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMODELOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMODELOActionPerformed

    private void txtVTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVTFActionPerformed

    private void txtMOTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMOTORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMOTORActionPerformed

    private void txtMARCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMARCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMARCAActionPerformed

    private void txtCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCODActionPerformed

    private void txtPLACAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLACAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLACAActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKMActionPerformed

    private void txtANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtANOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtANOActionPerformed

    private void txtCORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCORActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrCadVeiculos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrCadVeiculos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btALTERNAR;
    private javax.swing.JButton btEXCLUIR;
    private javax.swing.JButton btNOVO;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSALVAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbVeiculos;
    private javax.swing.JTextField txtANO;
    private javax.swing.JTextField txtCOD;
    private javax.swing.JTextField txtCOR;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtMARCA;
    private javax.swing.JTextField txtMODELO;
    private javax.swing.JTextField txtMOTOR;
    private javax.swing.JTextField txtPLACA;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtVTF;
    // End of variables declaration//GEN-END:variables

}
