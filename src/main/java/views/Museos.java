/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author anton
 */
public class Museos extends javax.swing.JPanel {

    /**
     * Creates new form Museos
     */
    public Museos() {
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

        jLabel1 = new javax.swing.JLabel();
        txt_museo_cod = new com.goslinggroup.utilsui.TextField();
        txt_museo_nombre = new com.goslinggroup.utilsui.TextField();
        txt_museo_calle = new com.goslinggroup.utilsui.TextField();
        txt_museo_calle3 = new com.goslinggroup.utilsui.TextField();
        txt_museo_estado = new com.goslinggroup.utilsui.TextField();
        btn_guardar_museo = new javax.swing.JButton();
        btn_actualizar_museo = new javax.swing.JButton();
        btn_eliminar_museo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_museo = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Museos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txt_museo_cod.setLabelText("Codigo  de museo");
        add(txt_museo_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 250, -1));

        txt_museo_nombre.setLabelText("Nombre  de museo");
        add(txt_museo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, -1));

        txt_museo_calle.setLabelText("Calle  de museo");
        add(txt_museo_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 250, -1));

        txt_museo_calle3.setLabelText("Codigo postal   de museo");
        add(txt_museo_calle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 250, -1));

        txt_museo_estado.setLabelText("Estado  de museo");
        add(txt_museo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 250, -1));

        btn_guardar_museo.setText("Guardar");
        add(btn_guardar_museo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 120, 40));

        btn_actualizar_museo.setText("Actualizar");
        add(btn_actualizar_museo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 120, 40));

        btn_eliminar_museo.setText("Eliminar");
        add(btn_eliminar_museo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 120, 40));

        tabla_museo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Calle", "Cod Postal", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla_museo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 680, 360));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar_museo;
    public javax.swing.JButton btn_eliminar_museo;
    public javax.swing.JButton btn_guardar_museo;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla_museo;
    public com.goslinggroup.utilsui.TextField txt_museo_calle;
    public com.goslinggroup.utilsui.TextField txt_museo_calle3;
    public com.goslinggroup.utilsui.TextField txt_museo_cod;
    public com.goslinggroup.utilsui.TextField txt_museo_estado;
    public com.goslinggroup.utilsui.TextField txt_museo_nombre;
    // End of variables declaration//GEN-END:variables
}
