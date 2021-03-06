/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upnorte.talbd.nuevonorte.presentacion;

import edu.upnorte.talbd.nuevonorte.accesodatos.DAOAviso;
import edu.upnorte.talbd.nuevonorte.accesodatos.DAOCategoria;
import edu.upnorte.talbd.nuevonorte.accesodatos.DAOColor;
import edu.upnorte.talbd.nuevonorte.accesodatos.DAOMedida;
import edu.upnorte.talbd.nuevonorte.accesodatos.DAOPagina;
import edu.upnorte.talbd.nuevonorte.entidades.Aviso;
import edu.upnorte.talbd.nuevonorte.entidades.Categoria;
import edu.upnorte.talbd.nuevonorte.entidades.Color;
import edu.upnorte.talbd.nuevonorte.entidades.Medida;
import edu.upnorte.talbd.nuevonorte.entidades.Pagina;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MARGARITA
 */
public class RegistrarAviso extends javax.swing.JInternalFrame {

    private List<Medida> listaMedida;
    private List<Color> listaColor;
    private List<Pagina> listaPagina;
    private List<Categoria> listaCategoria;
    
    public RegistrarAviso() {
        initComponents();
        //Combo Box Medida
        listaMedida = DAOMedida.getInstance().listar();
        DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
        for (Medida objMedida : listaMedida){
            modeloComboBox.addElement(objMedida.getId() + "-" + objMedida.getNombre());
        }
        cmbMedida.setModel(modeloComboBox);
        
        
        //Combo Box Color
        listaColor = DAOColor.getInstance().listar();
        DefaultComboBoxModel modeloComboBox1 = new DefaultComboBoxModel();
        for (Color objColor : listaColor){
            modeloComboBox1.addElement(objColor.getId() + "-" + objColor.getNombre());
        }
        cmbColor.setModel(modeloComboBox1);
        
        
        //Combo Box Pagina
        listaPagina = DAOPagina.getInstance().listar();
        DefaultComboBoxModel modeloComboBox2 = new DefaultComboBoxModel();
        for (Pagina objPagina : listaPagina){
            modeloComboBox2.addElement(objPagina.getId() + "-" + objPagina.getNombre());
        }
        cmbPagina.setModel(modeloComboBox2);
        
        
        //Combo Box Categorias
        listaCategoria = DAOCategoria.getInstance().listar();
        DefaultComboBoxModel modeloComboBox3 = new DefaultComboBoxModel();
        for (Categoria objCategoria : listaCategoria){
            modeloComboBox3.addElement(objCategoria.getId() + "-" + objCategoria.getNombre());
        }
        cmbCategoria.setModel(modeloComboBox3);
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        cmbMedida = new javax.swing.JComboBox();
        cmbColor = new javax.swing.JComboBox();
        cmbPagina = new javax.swing.JComboBox();
        cmbCategoria = new javax.swing.JComboBox();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Aviso");

        jLabel2.setText("Precio:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Medida:");

        jLabel5.setText("Color:");

        jLabel6.setText("Pagina:");

        jLabel7.setText("Categoria:");

        btnRegistrar.setText("Registrar Aviso");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        cmbMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPagina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRegistrar)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPagina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
        Aviso objAviso = new Aviso();
        //objCategoria.setId(Integer.parseInt(txtID.getText()));
        objAviso.setPrecio(BigDecimal.valueOf(Double.valueOf(txtPrecio.getText())));
        objAviso.setFecha(txtFecha.getDate());
        
        objAviso.setIdMedida(listaMedida.get(cmbMedida.getSelectedIndex()));
        objAviso.setIdColor(listaColor.get(cmbColor.getSelectedIndex()));
        objAviso.setIdPagina(listaPagina.get(cmbPagina.getSelectedIndex()));
        objAviso.setIdCategoria(listaCategoria.get(cmbCategoria.getSelectedIndex()));
        
        DAOAviso objDAO = DAOAviso.getInstance();
        objDAO.registrar(objAviso);
        
        JOptionPane.showMessageDialog(this, "Aviso registrado con exito!");
        this.dispose();
        }catch(Exception e){
            e.printStackTrace();}
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbColor;
    private javax.swing.JComboBox cmbMedida;
    private javax.swing.JComboBox cmbPagina;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}