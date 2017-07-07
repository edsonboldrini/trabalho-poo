/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import banco.CategoriaRecurso;
import banco.ConexaoBD;

/**
 *
 * @author garym
 */
public class jfEscolherRecursos extends javax.swing.JFrame {
    private ConexaoBD banco;
    private jfNovoModelo pai;
    /**
     * Creates new form jfEscolherRecursos
     */
    public jfEscolherRecursos(){}
    
    public jfEscolherRecursos(jfNovoModelo framePai) {
        initComponents();
        this.banco = framePai.getConexao();
        this.pai = framePai;
        preencherComboBox();
    }
    
    private void preencherComboBox(){
        ResultSet dados = banco.select("SELECT * FROM CATEGORIA_RECURSO");
        
        try{
            while(dados.next()){
                comboBoxRecursos.addItem(new CategoriaRecurso(dados.getInt("ID_Categoria"), dados.getString("Descricao")));
            }
        } catch(SQLException e){
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

        labelRecursosExistentes = new javax.swing.JLabel();
        labelRecursosSelecionados = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoOK = new javax.swing.JButton();
        comboBoxRecursos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRecursosSelecionados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRecursosExistentes.setText("Recursos existentes:");

        labelRecursosSelecionados.setText("Recursos selecionados:");

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoOK.setText("OK");
        botaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKActionPerformed(evt);
            }
        });

        tabelaRecursosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recurso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRecursosSelecionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaRecursosSelecionados);
        if (tabelaRecursosSelecionados.getColumnModel().getColumnCount() > 0) {
            tabelaRecursosSelecionados.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRecursosExistentes)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAdicionar))
                    .addComponent(labelRecursosSelecionados)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(botaoRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionar)
                    .addComponent(comboBoxRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRecursosExistentes))
                .addGap(18, 18, 18)
                .addComponent(labelRecursosSelecionados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoOK)
                    .addComponent(botaoRemover))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        // TODO add your handling code here:
        CategoriaRecurso cr = (CategoriaRecurso)comboBoxRecursos.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) tabelaRecursosSelecionados.getModel();
        CategoriaRecurso[] linha = {cr};
        dtm.addRow(linha);
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tabelaRecursosSelecionados.getModel();
        try{
            dtm.removeRow(tabelaRecursosSelecionados.getSelectedRow());
        } catch(Exception e){
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tabelaRecursosSelecionados.getModel();
        int rowsNumber = dtm.getRowCount();
        int i;
        CategoriaRecurso[] cr = new CategoriaRecurso[rowsNumber];
        
        for(i = 0; i <  rowsNumber; i++){
            cr[i] = (CategoriaRecurso)dtm.getValueAt(i, 0);
        }
        
        pai.preencherTabela(cr);
        this.dispose();
    }//GEN-LAST:event_botaoOKActionPerformed

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
            java.util.logging.Logger.getLogger(jfEscolherRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEscolherRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEscolherRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEscolherRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEscolherRecursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoOK;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JComboBox<Object> comboBoxRecursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRecursosExistentes;
    private javax.swing.JLabel labelRecursosSelecionados;
    private javax.swing.JTable tabelaRecursosSelecionados;
    // End of variables declaration//GEN-END:variables
}
