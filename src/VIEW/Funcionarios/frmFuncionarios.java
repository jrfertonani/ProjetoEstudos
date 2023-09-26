/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW.Funcionarios;

import DAO.Funcionarios.FuncionarioDAO;
import DTO.FuncionarioDTO;
import VIEW.frmTelaPrincipalView;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fertonani
 */
public class frmFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionarios
     */
    public frmFuncionarios() {
        initComponents();
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditarFuncionarios = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtNomeFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEnderecoFuncionario = new javax.swing.JTextField();
        btnExcluirFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        btnRetornarTelaPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEditarFuncionario = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Funcionarios");

        jLabel2.setText("Nome:");

        btnEditarFuncionarios.setText("Carregar");
        btnEditarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncionariosActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereco:");

        btnExcluirFuncionario.setText("Excluir");
        btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioActionPerformed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Endereco"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionario);

        btnRetornarTelaPrincipal.setText("Voltar");
        btnRetornarTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarTelaPrincipalActionPerformed(evt);
            }
        });

        jLabel4.setText("codigo :");

        txtId.setEnabled(false);

        btnEditarFuncionario.setText("Editar");
        btnEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnRetornarTelaPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnEditarFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluirFuncionario)
                            .addComponent(jLabel4)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetornarTelaPrincipal)
                    .addComponent(btnEditarFuncionarios))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
        listar();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncionariosActionPerformed
        
        carregar();
    }//GEN-LAST:event_btnEditarFuncionariosActionPerformed

    private void btnRetornarTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarTelaPrincipalActionPerformed
        frmTelaPrincipalView frmtelaprincipalview = new frmTelaPrincipalView();
        frmtelaprincipalview.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnRetornarTelaPrincipalActionPerformed

    private void btnEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncionarioActionPerformed
        if(txtId.getText().isEmpty() || txtNomeFuncionario.getText().isEmpty() || txtEnderecoFuncionario.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "É obrigatorios carregar um Funcionario .","Erro!", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            Editar();
            listar();
            LimparCampos();
        }
        
        
        
    }//GEN-LAST:event_btnEditarFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed
        Excluir();
        listar();
        LimparCampos();
        
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditarFuncionario;
    private javax.swing.JButton btnEditarFuncionarios;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.JButton btnRetornarTelaPrincipal;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtEnderecoFuncionario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeFuncionario;
    // End of variables declaration//GEN-END:variables

private void cadastrar(){
       if(!txtNomeFuncionario.getText().isEmpty() && !txtEnderecoFuncionario.getText().isEmpty()){
           
           String nome, endereco;
           
           nome = txtNomeFuncionario.getText();
           endereco = txtEnderecoFuncionario.getText();
           
           FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
           objfuncionariodto.setNome_funcionario(nome);
           objfuncionariodto.setEndereco_funcionario(endereco);
           
           FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
           objfuncionariodao.cadastrarFuncionario(objfuncionariodto);
       }else {
           JOptionPane.showMessageDialog(rootPane, "O Nome e Endereco são obrigatorios.","Erro!", JOptionPane.INFORMATION_MESSAGE);
           
       }
};

private void listar(){
    
    FuncionarioDAO objFuncionariodao = new FuncionarioDAO();
    DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
    model.setNumRows(0);
    ArrayList<FuncionarioDTO> lista = objFuncionariodao.ListarFuncionario();
    for(int num = 0; num < lista.size(); num ++){
        
        model.addRow(new Object[]{
            lista.get(num).getId_funcionario(),
            lista.get(num).getNome_funcionario(),
            lista.get(num).getEndereco_funcionario()
                
        });
        
    }
    
};



private void carregar(){
    
    int setar = tabelaFuncionario.getSelectedRow();
    
    txtId.setText(tabelaFuncionario.getModel().getValueAt(setar,0).toString());
    txtNomeFuncionario.setText(tabelaFuncionario.getModel().getValueAt(setar,1).toString());
    txtEnderecoFuncionario.setText(tabelaFuncionario.getModel().getValueAt(setar,2).toString());
    
    
    
    
};

private void Editar(){

    int id_funcionario;
    String nome_funcionario, endereco_funcionario;
    
    id_funcionario = Integer.parseInt(txtId.getText());
    nome_funcionario = txtNomeFuncionario.getText();
    endereco_funcionario = txtEnderecoFuncionario.getText();
    
    FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
    objfuncionariodto.setId_funcionario(id_funcionario);
    objfuncionariodto.setNome_funcionario(nome_funcionario);
    objfuncionariodto.setEndereco_funcionario(endereco_funcionario);
    
    FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
    objfuncionariodao.editarFuncionario(objfuncionariodto);
      
    
};

private void Excluir(){
    
    int id_funcionario;
    
    id_funcionario = Integer.parseInt(txtId.getText());
    
    FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
    objfuncionariodto.setId_funcionario(id_funcionario);
    
    FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
    objfuncionariodao.excluirFuncionario(objfuncionariodto);
    
    
}


private void LimparCampos(){
    txtId.setText("");
    txtNomeFuncionario.setText("");
    txtEnderecoFuncionario.setText("");
    txtNomeFuncionario.requestFocus();
    
};

}
