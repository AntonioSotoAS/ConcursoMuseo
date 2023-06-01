/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author anton
 */
public class Exposiciones extends javax.swing.JPanel {

    /**
     * Creates new form Exposiciones
     */
    public Exposiciones() {
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

        cbx_exposicion_empleado = new javax.swing.JComboBox<>();
        txt_fecha_inicio = new com.goslinggroup.utilsui.TextField();
        txt_fecha_fin = new com.goslinggroup.utilsui.TextField();
        cbx_exposicion_estado = new javax.swing.JComboBox<>();
        btn_expo_guardar = new javax.swing.JButton();
        btn_expo_actualizar = new javax.swing.JButton();
        btn_expo_eliminar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_exposiciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_exposicion_empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar empleado" }));
        add(cbx_exposicion_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 85, 231, 50));

        txt_fecha_inicio.setLabelText("Fecha de inicio");
        txt_fecha_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_inicioActionPerformed(evt);
            }
        });
        add(txt_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 230, -1));

        txt_fecha_fin.setLabelText("Fecha de fin");
        txt_fecha_fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_finActionPerformed(evt);
            }
        });
        add(txt_fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, -1));

        cbx_exposicion_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar estado" }));
        add(cbx_exposicion_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 231, 50));

        btn_expo_guardar.setText("Gaurdar");
        add(btn_expo_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 170, 40));

        btn_expo_actualizar.setText("Gaurdar");
        add(btn_expo_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 170, 40));

        btn_expo_eliminar.setText("Eliminar");
        add(btn_expo_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 170, 40));

        tabla_exposiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tabla_exposiciones);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 740, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fecha_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_inicioActionPerformed

    private void txt_fecha_finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_finActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_expo_actualizar;
    private javax.swing.JButton btn_expo_eliminar;
    private javax.swing.JButton btn_expo_guardar;
    private javax.swing.JComboBox<String> cbx_exposicion_empleado;
    private javax.swing.JComboBox<String> cbx_exposicion_estado;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tabla_exposiciones;
    private com.goslinggroup.utilsui.TextField txt_fecha_fin;
    private com.goslinggroup.utilsui.TextField txt_fecha_inicio;
    // End of variables declaration//GEN-END:variables
}
