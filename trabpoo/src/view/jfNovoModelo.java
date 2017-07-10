
package view;

import banco.CategoriaRecurso;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.ConexaoBD;
import banco.TipoAtividade;
import javax.swing.table.DefaultTableModel;
import main.Modelo;
import main.Atividade;
import main.AtividadeList;
import main.RecursosList;

public class jfNovoModelo extends javax.swing.JFrame {
    private ConexaoBD banco;
    private jfModelos pai;
    private AtividadeList atividades;
    private RecursosList recursosSelecionados;
    
    public jfNovoModelo(){}
    
    public jfNovoModelo(jfModelos framePai) {
        initComponents();
        this.banco = framePai.getConexao();
        this.pai = framePai;
        this.atividades = new AtividadeList();
        preencherComboBox();
    }
    
    public ConexaoBD getConexao(){
        return this.banco;
    }
    
    private void preencherComboBox(){
        ResultSet dados = banco.select("SELECT * FROM TIPO_ATIVIDADE");
        
        try{
            while(dados.next()){
                comboBoxTipo.addItem(new TipoAtividade(dados.getInt("ID_TipoAtividade"), dados.getString("Nome")));
            }
        } catch(SQLException e){
        }
    }
    
    public void preencherTabela(RecursosList o){
        this.recursosSelecionados = o;
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaRecursosSelecionados.getModel();
        for(Object cr : o){
            CategoriaRecurso[] linha = {(CategoriaRecurso)cr};
            dtm.addRow(linha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNomeModelo = new javax.swing.JTextField();
        labelNomeModelo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAtividades = new javax.swing.JTable();
        labelAtividade = new javax.swing.JLabel();
        campoNomeAtividade = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<>();
        botaoAdicionarAtividade = new javax.swing.JButton();
        botaoEscolherRecursos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaRecursosSelecionados = new javax.swing.JTable();
        botaoSalvarModelo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(450, 200));
        setResizable(false);

        labelNomeModelo.setText("Nome do modelo:");

        tabelaAtividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Tipo", "Recursos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAtividades.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaAtividades);
        if (tabelaAtividades.getColumnModel().getColumnCount() > 0) {
            tabelaAtividades.getColumnModel().getColumn(0).setResizable(false);
            tabelaAtividades.getColumnModel().getColumn(1).setResizable(false);
            tabelaAtividades.getColumnModel().getColumn(2).setResizable(false);
        }

        labelAtividade.setText("Atividade:");

        labelTipo.setText("Tipo:");

        botaoAdicionarAtividade.setText("Adicionar atividade ao modelo");
        botaoAdicionarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAtividadeActionPerformed(evt);
            }
        });

        botaoEscolherRecursos.setText("Escolher recursos");
        botaoEscolherRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscolherRecursosActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabelaRecursosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recursos"
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
        jScrollPane3.setViewportView(tabelaRecursosSelecionados);
        if (tabelaRecursosSelecionados.getColumnModel().getColumnCount() > 0) {
            tabelaRecursosSelecionados.getColumnModel().getColumn(0).setResizable(false);
        }

        botaoSalvarModelo.setText("Salvar Modelo");
        botaoSalvarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTipo)
                                .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 5, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(botaoEscolherRecursos)
                                    .addGap(32, 32, 32)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeModelo)
                                .addGap(14, 14, 14)
                                .addComponent(campoNomeModelo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAtividade)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(campoNomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(botaoAdicionarAtividade)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvarModelo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeModelo)
                    .addComponent(campoNomeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtividade)
                    .addComponent(campoNomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEscolherRecursos)))
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionarAtividade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(botaoSalvarModelo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botaoAdicionarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarAtividadeActionPerformed
        Atividade atividade = new Atividade(campoNomeAtividade.getText(),(TipoAtividade)comboBoxTipo.getSelectedItem(),recursosSelecionados);
        this.atividades.add(atividade);
        
        Object[] linha = {atividade.getNome(),atividade.getTipo(),atividade.getRecursos()};
        DefaultTableModel dtm = (DefaultTableModel) tabelaAtividades.getModel();
        dtm.addRow(linha);
        
        campoNomeAtividade.setText("");
        dtm = (DefaultTableModel) tabelaRecursosSelecionados.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_botaoAdicionarAtividadeActionPerformed

    private void botaoEscolherRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscolherRecursosActionPerformed
        jfEscolherRecursos obj = new jfEscolherRecursos(this);
        obj.setVisible(true);
    }//GEN-LAST:event_botaoEscolherRecursosActionPerformed

    private void botaoSalvarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarModeloActionPerformed
        // TODO add your handling code here:
        Modelo m = new Modelo(campoNomeModelo.getText(), this.atividades);      // instancia um modelo
        m.salvar(banco);                                                        // salva os dados no banco
        pai.resetTabela();                                                      // atualiza a lista de modelos no banco
        this.dispose();                                                         // fecha janela
    }//GEN-LAST:event_botaoSalvarModeloActionPerformed

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
            java.util.logging.Logger.getLogger(jfNovoModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfNovoModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfNovoModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfNovoModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfNovoModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarAtividade;
    private javax.swing.JButton botaoEscolherRecursos;
    private javax.swing.JButton botaoSalvarModelo;
    private javax.swing.JTextField campoNomeAtividade;
    private javax.swing.JTextField campoNomeModelo;
    private javax.swing.JComboBox<Object> comboBoxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAtividade;
    private javax.swing.JLabel labelNomeModelo;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTable tabelaAtividades;
    private javax.swing.JTable tabelaRecursosSelecionados;
    // End of variables declaration//GEN-END:variables
}
