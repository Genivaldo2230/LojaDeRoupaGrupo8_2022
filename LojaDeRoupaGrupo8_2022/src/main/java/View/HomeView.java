
package View;

import javax.swing.JOptionPane;
public class HomeView extends javax.swing.JFrame {

    public HomeView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/person-icon.png"))); // NOI18N
        btnUsuario.setText("Usuario");
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart-icon (1).png"))); // NOI18N
        btnVenda.setText("Venda");
        btnVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenda.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart-icon.png"))); // NOI18N
        btnProduto.setText("Produto");
        btnProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User-icon.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flow-market-icon.png"))); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRelatorios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basket-icon.png"))); // NOI18N
        btnCategoria.setText("Categoria");
        btnCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda)
                    .addComponent(btnProduto))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelatorios)
                    .addComponent(btnCliente))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda)
                    .addComponent(btnUsuario)
                    .addComponent(btnCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
       UsuarioView home = new UsuarioView();
                home.setVisible(true);
              
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
            VendaView venda = new VendaView();
                venda.setVisible(true);
              
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        ProdutoView home = new ProdutoView();
                home.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        ClienteView cliene = new ClienteView();
                cliene.setVisible(true);
              
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
         RelatorioSinteticoView relatorio = new RelatorioSinteticoView();
                relatorio.setVisible(true);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
         CategoriaView categoria = new CategoriaView();
                categoria.setVisible(true);
              
    }//GEN-LAST:event_btnCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVenda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
