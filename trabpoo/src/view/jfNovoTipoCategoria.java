/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import banco.CategoriaRecurso;
import banco.TipoRecurso;
import javax.swing.table.DefaultTableModel;
import main.ConexaoBD;

/**
 *
 * @author garym
 */
public class jfNovoTipoCategoria extends javax.swing.JFrame {
    private ConexaoBD banco;
    private jfRecursos pai;
    /**
     * Creates new form jfNovoTipoCategoria
     */
    public jfNovoTipoCategoria(){}
    
    public jfNovoTipoCategoria(ConexaoBD banco, jfRecursos framePai) {
        initComponents();
        this.banco = banco;
        this.pai = framePai;
        preencherTabelaTipo();
        preencherTabelaCategoria();
    }
    
    private void preencherTabelaTipo(){
        DefaultTableModel dtmTipos = (DefaultTableModel)jTTipos.getModel();
        try{
            ResultSet dados = banco.select("SELECT * FROM TIPO_RECURSO");
            
            while(dados.next()){
                Object[] linha = {dados.getString("nome")};
                dtmTipos.addRow(linha);
            }
        }catch(SQLException ioe){
        }
    }
    
    private void preencherTabelaCategoria(){
        DefaultTableModel dtmCategorias = (DefaultTableModel)jTCategorias.getModel();
        try{
            ResultSet dados = banco.select("SELECT * FROM CATEGORIA_RECURSO");
            
            while(dados.next()){
                Object[] linha = {dados.getString("descricao")};
                dtmCategorias.addRow(linha);
            }
        }catch(SQLException ioe){
        }
    }
    
    private void resetTabela(DefaultTableModel dtm){
        dtm.setRowCount(0);
    }
    
    private void resetTabelas(){
        DefaultTableModel dtmCategorias = (DefaultTableModel)jTCategorias.getModel();
        dtmCategorias.setRowCount(0);
        preencherTabelaCategoria();
        
        DefaultTableModel dtmTipos = (DefaultTableModel)jTTipos.getModel();
        dtmTipos.setRowCount(0);
        preencherTabelaTipo();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTextoTipo = new javax.swing.JTextField();
        botaoAdicionarTipo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTipos = new javax.swing.JTable();
        botaoAdicionarCategoria = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCategorias = new javax.swing.JTable();
        campoTextoCategoria = new javax.swing.JTextField();
        botaoOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));

        botaoAdicionarTipo.setText("Adicionar");
        botaoAdicionarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarTipoActionPerformed(evt);
            }
        });

        jTTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTTipos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTTipos);
        if (jTTipos.getColumnModel().getColumnCount() > 0) {
            jTTipos.getColumnModel().getColumn(0).setResizable(false);
        }

        botaoAdicionarCategoria.setText("Adicionar");
        botaoAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarCategoriaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCategorias.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTCategorias);
        if (jTCategorias.getColumnModel().getColumnCount() > 0) {
            jTCategorias.getColumnModel().getColumn(0).setResizable(false);
        }

        botaoOK.setText("OK");
        botaoOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoTextoTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAdicionarTipo)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoTextoCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdicionarCategoria)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoOK)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAdicionarCategoria)
                            .addComponent(campoTextoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTextoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionarTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarTipoActionPerformed
        // TODO add your handling code here:
        TipoRecurso tr = new TipoRecurso(campoTextoTipo.getText());
        tr.salvar(banco);
        this.resetTabelas();
    }//GEN-LAST:event_botaoAdicionarTipoActionPerformed

    private void botaoAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarCategoriaActionPerformed
        // TODO add your handling code here:
        CategoriaRecurso cr = new CategoriaRecurso(campoTextoCategoria.getText());
        cr.salvar(banco);
        this.resetTabelas();
    }//GEN-LAST:event_botaoAdicionarCategoriaActionPerformed

    private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOKActionPerformed
        // TODO add your handling code here:
        pai.resetComboBox();
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
            java.util.logging.Logger.getLogger(jfNovoTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfNovoTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfNovoTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfNovoTipoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfNovoTipoCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarCategoria;
    private javax.swing.JButton botaoAdicionarTipo;
    private javax.swing.JButton botaoOK;
    private javax.swing.JTextField campoTextoCategoria;
    private javax.swing.JTextField campoTextoTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTCategorias;
    private javax.swing.JTable jTTipos;
    // End of variables declaration//GEN-END:variables
}
