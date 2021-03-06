/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upnorte.talbd.nuevonorte.presentacion;

import edu.upnorte.talbd.nuevonorte.accesodatos.DAOCategoria;
import edu.upnorte.talbd.nuevonorte.accesodatos.DAOProducto;
import edu.upnorte.talbd.nuevonorte.entidades.Categoria;
import edu.upnorte.talbd.nuevonorte.entidades.Producto;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MARGARITA
 */
public class RegistrarProducto extends javax.swing.JInternalFrame {

    private List<Categoria> listaCategoria;
    
    
    public RegistrarProducto() {
        initComponents();
        //Combo Box Categorias
        listaCategoria = DAOCategoria.getInstance().listar();
        DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
        for (Categoria objCategoria : listaCategoria){
            modeloComboBox.addElement(objCategoria.getId() + "-" + objCategoria.getNombre());
        }
        cmbCategoria.setModel(modeloComboBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPventa = new javax.swing.JTextField();
        txtPcosto = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cmbCategoria = new javax.swing.JComboBox();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Producto");

        jLabel2.setText("Precio de venta:");

        jLabel3.setText("Precio de costo:");

        jLabel4.setText("Fecha:");

        jLabel5.setText("Categoria:");

        btnRegistrar.setText("Registrar Producto");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPventa)
                                .addComponent(txtPcosto)
                                .addComponent(cmbCategoria, 0, 99, Short.MAX_VALUE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnRegistrar)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try{
        Producto objProducto = new Producto();
        //objCategoria.setId(Integer.parseInt(txtID.getText()));
        objProducto.setPrecioventa(BigDecimal.valueOf(Double.valueOf(txtPventa.getText())));
        objProducto.setPreciocosto(BigDecimal.valueOf(Double.valueOf(txtPcosto.getText())));
        objProducto.setFecha(txtFecha.getDate());
        
        objProducto.setIdCategoria(listaCategoria.get(cmbCategoria.getSelectedIndex()));
        
        DAOProducto objDAO = DAOProducto.getInstance();
        objDAO.registrar(objProducto);
        
        JOptionPane.showMessageDialog(this, "Producto registrado con exito!");
        this.dispose();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtPcosto;
    private javax.swing.JTextField txtPventa;
    // End of variables declaration//GEN-END:variables
}