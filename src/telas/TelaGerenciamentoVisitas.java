/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import penitenciaria.ControleVisitas;
import penitenciaria.Visitante;

/**
 *
 * @author mique
 */
public class TelaGerenciamentoVisitas extends javax.swing.JFrame {

    //ATRIBUTO DO TIPO DefaultTable 
    public static DefaultTableModel tabela;

    /**
     * Creates new form GerenciamentoVisitas
     */
    /*CONSTRUTOR JA INICIANDO COM A INSTANCIA E O CASTING DA TABELA. ALEM DO METOO DE ORDENAR A TEBELA*/
    public TelaGerenciamentoVisitas() {
        initComponents();
        this.tabela = (DefaultTableModel) tabGerenVisit.getModel();
        //CODIGO PARA ORDERNAR A TABELA
        tabGerenVisit.setRowSorter(new TableRowSorter(this.tabela));
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabGerenVisit = new javax.swing.JTable();
        lblQuantVisit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtRg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegSaida = new javax.swing.JButton();
        btnRegEntrada = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();

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
        setTitle("SGP - Gerenciamento de Visitas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Gerenciamento de Visitas");

        tabGerenVisit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RG", "Nome", "Idade", "Sexo", "Codigo do Detento", "Parentesco", "Ala", "Setor", "Cela"
            }
        ));
        tabGerenVisit.setSelectionBackground(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(tabGerenVisit);

        lblQuantVisit.setFont(new java.awt.Font("Dialog", 1, 65)); // NOI18N
        lblQuantVisit.setText("0");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Quantidades de Visitantes / Lotação Maxima");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 65)); // NOI18N
        jLabel3.setText("/100");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtRg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setText("RG *");

        btnRegSaida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegSaida.setText("Registrar Saída");
        btnRegSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSaidaActionPerformed(evt);
            }
        });

        btnRegEntrada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegEntrada.setText("Registrar Entrada");
        btnRegEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEntradaActionPerformed(evt);
            }
        });

        jButton3.setText("Verificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lista de Visitantes Cadastrados");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-multidão-filled-100.png"))); // NOI18N

        btnAtualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))))
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton3))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuantVisit)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblQuantVisit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //CADASTRO DE VISITANTE
    private void btnRegEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEntradaActionPerformed

        //ESSE IF FAZ A VERIFICAÇÃO DA CAPACIDADE DO PRESÍDIO. PARA TESTE INICIAMOS COM 5
        if (this.tabela.getRowCount() < 5) {

            try {
                ControleVisitas controlVisit = new ControleVisitas();
                String rg = txtRg.getText();
                boolean achou = false;
                Visitante novo = controlVisit.pesquisaVisitas(rg);

                //VERIFICA SE O OBJETO "novo" VAI RETORNAR NULL OU RETORNA O OBJETO.
                if (novo != null) {

                    //ESSE FOR PERCORRE TODA AS LINHA DA TABELA PROUCURANDO SE O RG DO get.novo JA EXIXSTE NA TABELA
                    for (int i = 0; i < this.tabela.getRowCount(); i++) {
                        if (novo.getRg().equals(this.tabela.getValueAt(i, 0).toString())) {
                            achou = true;
                        }
                    }

                    /*APÓS EXECUTAR O FOR ACIMA, ELE VERIFICA SE ACHOU O RG, JA CADASTRADO NA TABELA, SE JA TIVER CADASTRADO
                     INFORMA QUE JA ESTÁ CADASTRADO, SE NÃO TIVER ELE CADASTRA CONFORME O ELSE*/
                    if (achou) {
                        JOptionPane.showMessageDialog(null, "Este visitante já se encontra no presídio");
                    } else {
                        tabela.addRow(new Object[]{novo.getRg(), novo.getNome(), novo.getIdade(),
                            novo.getSexo(), novo.getCrDetento(), novo.getParentesco(), novo.getAla(),
                            novo.getSetor(), novo.getCela()});
                        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                    }

                } else {
                    TelaOpcaoCadastroVisitantes novaTela = new TelaOpcaoCadastroVisitantes();
                    novaTela.setLocationRelativeTo(null);
                    novaTela.setVisible(true);
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro! Arquivo não encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Presídio Lotado!");
        }

        //ATUALIZAÇÃO DA QUANTIDADE DE VISITAS NO PRESÍDIO EM TEMPO REAL
        lblQuantVisit.setText(Integer.toString(this.tabela.getRowCount()));

    }//GEN-LAST:event_btnRegEntradaActionPerformed

    //BOTÃO QUE CHAMA A TELA RELATORIO TOTAL VISITANTES
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaRelatTotVisit tela = new TelaRelatTotVisit();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    //BOTÃO PARA REMOVER ALGUMA LINHA SELECIONADA NA TABELA
    private void btnRegSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSaidaActionPerformed
        if (tabGerenVisit.getSelectedRow() != -1) {

            this.tabela.removeRow(tabGerenVisit.getSelectedRow());
            lblQuantVisit.setText(Integer.toString(this.tabela.getRowCount()));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um visitante da Lista para REMOVER do Presidio");
        }


    }//GEN-LAST:event_btnRegSaidaActionPerformed

    /*ATUALIZA OS DADOS. ESSE METODO PEGAS OS DADOS QUE ESTÃO NA TABELA E PASSA POR PARAMETRO PARA 
    A TELA CADASTRO VISITANTES ATRAVES DE UM OBJETO INSTANCIADO DO TIPO TelaCadastroVisit*/
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        ControleVisitas controlVisit;
        try {

            controlVisit = new ControleVisitas();

            if (tabGerenVisit.getSelectedRow() != -1) {
                String rg = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 0).toString();
                String nome = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 1).toString();
                String idade = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 2).toString();
                String sexo = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 3).toString();
                String codDetent = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 4).toString();
                String parentesco = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 5).toString();
                String ala = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 6).toString();
                String setor = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 7).toString();
                String cela = tabGerenVisit.getValueAt(tabGerenVisit.getSelectedRow(), 8).toString();

                TelaCadastroVisit novaTela = new TelaCadastroVisit(rg, nome, idade, codDetent,
                        parentesco, ala, setor, cela, sexo);
                novaTela.setLocationRelativeTo(null);
                novaTela.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um visitante da Lista para ATUALIZAR do Presidio");
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro! Arquivo não encontrado");
        }


    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciamentoVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciamentoVisitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnRegEntrada;
    private javax.swing.JButton btnRegSaida;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblQuantVisit;
    private javax.swing.JTable tabGerenVisit;
    private javax.swing.JTextField txtRg;
    // End of variables declaration//GEN-END:variables
}
