/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upnorte.talbd.nuevonorte.presentacion;

import edu.upnorte.talbd.nuevonorte.accesodatos.DAOColor;
import edu.upnorte.talbd.nuevonorte.entidades.Color;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARGARITA
 */
public class ListarColor extends javax.swing.JInternalFrame {

    List<Color> listaColor;
    JDesktopPane dskPrincipal;
    
    
    public ListarColor(JDesktopPane dskPrincipal) {
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
        tblColor = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Colores");

        tblColor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblColor);

        btnModificar.setText("ModificarColor");
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnModificar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int index = tblColor.getSelectedRow();
        if (index != -1){
            //Modificamos la fila seleccionada
            Color objColor = listaColor.get(index);
            ModificarColor ventana = new ModificarColor(objColor,this);
            dskPrincipal.add(ventana);
            ventana.setVisible(true);
            mostrar();
        }else{
            JOptionPane.showMessageDialog(this,"Se necesita seleccionar una fila!");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    
    
    public void mostrar(){
        //1. Traemos objetos
        listaColor = DAOColor.getInstance().listar();
        //2. Creamos modelo
        DefaultTableModel modelo = new DefaultTableModel();
        //3. Agregamos columnas al modelo
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("P. Costo");
        modelo.addColumn("P. Venta");
        //4. Agregamos filas al modelo
        for (Color c : listaColor){
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getPreciocosto(),
                c.getPrecioventa()
            });
        }
        //5. Asignamos el modelo a la tabla
        tblColor.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblColor;
    // End of variables declaration//GEN-END:variables
}