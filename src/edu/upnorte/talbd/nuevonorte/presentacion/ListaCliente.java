/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upnorte.talbd.nuevonorte.presentacion;

import edu.upnorte.talbd.nuevonorte.accesodatos.DAOCliente;
import edu.upnorte.talbd.nuevonorte.entidades.Cliente;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARGARITA
 */
public class ListaCliente extends javax.swing.JInternalFrame {

    List<Cliente> listaCliente;
    JDesktopPane dskPrincipal;
    
    public ListaCliente(JDesktopPane dskPrincipal) {
        initComponents();
        this.dskPrincipal = dskPrincipal;
        mostrar();
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
        tblCliente = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Clientes");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int index = tblCliente.getSelectedRow();
        if (index != -1){
            //Modificamos la fila seleccionada
            Cliente objCliente = listaCliente.get(index);
            ModificarCliente ventana = new ModificarCliente(objCliente,this);
            dskPrincipal.add(ventana);
            ventana.setVisible(true);
            mostrar();
        }else{
            JOptionPane.showMessageDialog(this,"Se necesita seleccionar una fila!");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    
    public void mostrar(){
        //1. Traemos objetos
        listaCliente = DAOCliente.getInstance().listar();
        //2. Creamos modelo
        DefaultTableModel modelo = new DefaultTableModel();
        //3. Agregamos columnas al modelo
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Documento");
        modelo.addColumn("Numero de Documento");
        //4. Agregamos filas al modelo
        for (Cliente c : listaCliente){
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombrecom(),
                c.getIdDoc().getNombre(),
                c.getNumerodoc()
            });
        }
        //5. Asignamos el modelo a la tabla
        tblCliente.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
