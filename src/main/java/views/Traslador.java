/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author anton
 */
public class Traslador extends javax.swing.JPanel {

    /**
     * Creates new form Traslador
     */
    public Traslador() {
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

        cbx_activo_traslado = new javax.swing.JComboBox<>();
        txt_fecha_retorno = new com.goslinggroup.utilsui.TextField();
        txt_motivo_traslado = new com.goslinggroup.utilsui.TextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_traslado = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_activo_traslado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        add(cbx_activo_traslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 260, 40));

        txt_fecha_retorno.setLabelText("Fecha de Retorno");
        add(txt_fecha_retorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 257, -1));

        txt_motivo_traslado.setLabelText("Motivo de traslado");
        add(txt_motivo_traslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 257, -1));

        jButton1.setText("Guardar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 210, 50));

        tabla_traslado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Traspado", "ID Activo", "Fecha", "Fecha de Retorno", "Motivo", "ID Estado"
            }
        ));
        jScrollPane4.setViewportView(tabla_traslado);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 750, 340));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_activo_traslado;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla_traslado;
    private com.goslinggroup.utilsui.TextField txt_fecha_retorno;
    private com.goslinggroup.utilsui.TextField txt_motivo_traslado;
    // End of variables declaration//GEN-END:variables
}
