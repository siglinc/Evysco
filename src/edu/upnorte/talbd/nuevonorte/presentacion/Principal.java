/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upnorte.talbd.nuevonorte.presentacion;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MARGARITA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        dskContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniAgregarProducto = new javax.swing.JMenuItem();
        mniAgregarAviso = new javax.swing.JMenuItem();
        mniAgregarPedido = new javax.swing.JMenuItem();
        mniBoleta = new javax.swing.JMenuItem();
        mniCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniListarProducto = new javax.swing.JMenuItem();
        mniListarAviso = new javax.swing.JMenuItem();
        mniListarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mniListarDocumento = new javax.swing.JMenuItem();
        mniListarMedida = new javax.swing.JMenuItem();
        mniListarColor = new javax.swing.JMenuItem();
        mniListarPagina = new javax.swing.JMenuItem();
        mniListarCategoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniAgregarDocumento = new javax.swing.JMenuItem();
        mniAgregarMedida = new javax.swing.JMenuItem();
        mniAgregarColor = new javax.swing.JMenuItem();
        mniAgregarPagina = new javax.swing.JMenuItem();
        mniAgregarCategoria = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Norte Soft");

        jMenu1.setText("Accion");

        mniAgregarProducto.setText("Producto");
        mniAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregarProducto);

        mniAgregarAviso.setText("Aviso");
        mniAgregarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarAvisoActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregarAviso);

        mniAgregarPedido.setText("Pedido");
        mniAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregarPedido);

        mniBoleta.setText("Boleta");
        mniBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBoletaActionPerformed(evt);
            }
        });
        jMenu1.add(mniBoleta);

        mniCliente.setText("Nuevo Cliente");
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniCliente);
        jMenu1.add(jSeparator1);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mniSalir);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Listas");

        mniListarProducto.setText("Lista de Productos");
        mniListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarProductoActionPerformed(evt);
            }
        });
        jMenu4.add(mniListarProducto);

        mniListarAviso.setText("Lista de Avisos");
        mniListarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarAvisoActionPerformed(evt);
            }
        });
        jMenu4.add(mniListarAviso);

        mniListarCliente.setText("Lista de Clientes");
        mniListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(mniListarCliente);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Mantenimiento");

        jMenu5.setText("Listar...");

        mniListarDocumento.setText("Documento");
        mniListarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarDocumentoActionPerformed(evt);
            }
        });
        jMenu5.add(mniListarDocumento);

        mniListarMedida.setText("Medida");
        mniListarMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarMedidaActionPerformed(evt);
            }
        });
        jMenu5.add(mniListarMedida);

        mniListarColor.setText("Color");
        mniListarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarColorActionPerformed(evt);
            }
        });
        jMenu5.add(mniListarColor);

        mniListarPagina.setText("Pagina");
        mniListarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarPaginaActionPerformed(evt);
            }
        });
        jMenu5.add(mniListarPagina);

        mniListarCategoria.setText("Categoria");
        mniListarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarCategoriaActionPerformed(evt);
            }
        });
        jMenu5.add(mniListarCategoria);

        jMenu2.add(jMenu5);

        jMenu3.setText("Agregar...");

        mniAgregarDocumento.setText("Documento");
        mniAgregarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarDocumentoActionPerformed(evt);
            }
        });
        jMenu3.add(mniAgregarDocumento);

        mniAgregarMedida.setText("Medida");
        mniAgregarMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarMedidaActionPerformed(evt);
            }
        });
        jMenu3.add(mniAgregarMedida);

        mniAgregarColor.setText("Color");
        mniAgregarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarColorActionPerformed(evt);
            }
        });
        jMenu3.add(mniAgregarColor);

        mniAgregarPagina.setText("Pagina");
        mniAgregarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarPaginaActionPerformed(evt);
            }
        });
        jMenu3.add(mniAgregarPagina);

        mniAgregarCategoria.setText("Categoria");
        mniAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarCategoriaActionPerformed(evt);
            }
        });
        jMenu3.add(mniAgregarCategoria);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        String contenido = "Estas seguro?";
        String titulo = "Salir del Sistema";
        int tipo = JOptionPane.OK_CANCEL_OPTION;
        
        int respuesta = JOptionPane.showConfirmDialog(this, contenido, titulo, tipo);
        if (respuesta == 0){
            this.dispose();
        }
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniAgregarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarDocumentoActionPerformed
        /*RegistrarDocumento ventana = new RegistrarDocumento();*/
        RegistrarDocumento ventana = new RegistrarDocumento();
        dskContenedor.add(ventana);
        
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarDocumentoActionPerformed

    private void mniAgregarMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarMedidaActionPerformed
        RegistrarMedida ventana = new RegistrarMedida();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarMedidaActionPerformed

    private void mniAgregarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarColorActionPerformed
        RegistrarColor ventana = new RegistrarColor();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarColorActionPerformed

    private void mniAgregarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarPaginaActionPerformed
        RegistrarPagina ventana = new RegistrarPagina();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarPaginaActionPerformed

    private void mniAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarCategoriaActionPerformed
        RegistrarCategoria ventana = new RegistrarCategoria();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarCategoriaActionPerformed

    private void mniListarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarDocumentoActionPerformed
        ListarDocumento ventana = new ListarDocumento(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarDocumentoActionPerformed

    private void mniListarMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarMedidaActionPerformed
        ListarMedida ventana = new ListarMedida(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarMedidaActionPerformed

    private void mniListarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarColorActionPerformed
        ListarColor ventana = new ListarColor(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarColorActionPerformed

    private void mniListarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarPaginaActionPerformed
        ListarPagina ventana = new ListarPagina(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarPaginaActionPerformed

    private void mniListarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarCategoriaActionPerformed
        ListarCategoria ventana = new ListarCategoria(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarCategoriaActionPerformed

    private void mniAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarPedidoActionPerformed
        RegistrarPedido ventana = new RegistrarPedido(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarPedidoActionPerformed

    private void mniAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarProductoActionPerformed
        RegistrarProducto ventana = new RegistrarProducto();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarProductoActionPerformed

    private void mniListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarProductoActionPerformed
        ListarProducto ventana = new ListarProducto(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarProductoActionPerformed

    private void mniAgregarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarAvisoActionPerformed
        RegistrarAviso ventana = new RegistrarAviso();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniAgregarAvisoActionPerformed

    private void mniListarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarAvisoActionPerformed
        ListarAviso ventana = new ListarAviso(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarAvisoActionPerformed

    private void mniBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBoletaActionPerformed
        RegistrarBoleta ventana = new RegistrarBoleta(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniBoletaActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        RegistrarCliente ventana = new RegistrarCliente();
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniClienteActionPerformed

    private void mniListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarClienteActionPerformed
        ListaCliente ventana = new ListaCliente(dskContenedor);
        dskContenedor.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mniListarClienteActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskContenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mniAgregarAviso;
    private javax.swing.JMenuItem mniAgregarCategoria;
    private javax.swing.JMenuItem mniAgregarColor;
    private javax.swing.JMenuItem mniAgregarDocumento;
    private javax.swing.JMenuItem mniAgregarMedida;
    private javax.swing.JMenuItem mniAgregarPagina;
    private javax.swing.JMenuItem mniAgregarPedido;
    private javax.swing.JMenuItem mniAgregarProducto;
    private javax.swing.JMenuItem mniBoleta;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniListarAviso;
    private javax.swing.JMenuItem mniListarCategoria;
    private javax.swing.JMenuItem mniListarCliente;
    private javax.swing.JMenuItem mniListarColor;
    private javax.swing.JMenuItem mniListarDocumento;
    private javax.swing.JMenuItem mniListarMedida;
    private javax.swing.JMenuItem mniListarPagina;
    private javax.swing.JMenuItem mniListarProducto;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables
}