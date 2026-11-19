/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Manue
 */
public class VistaGremio extends javax.swing.JFrame {

    /** Crea el formulario VistaGremio. */
    public VistaGremio() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClase1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNivel = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        lblVida = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField();
        lblClase = new javax.swing.JLabel();
        cmbClase = new javax.swing.JComboBox();
        lblAtributo = new javax.swing.JLabel();
        txtAtributo = new javax.swing.JTextField();
        lblRelleno = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        scrollGremio = new javax.swing.JScrollPane();
        txtGremio = new javax.swing.JTextArea();
        panelAcciones = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        btnSimular = new javax.swing.JButton();

        lblClase1.setText("Clase:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gremio de Héroes - Wizard of the Coast");

        lblTitulo.setBackground(new java.awt.Color(255, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gremio de Héroes - Calabozos y Dragones");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, java.awt.BorderLayout.NORTH);

        panelRegistro.setBackground(new java.awt.Color(250, 246, 246));
        panelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar aventurero"));
        panelRegistro.setLayout(new java.awt.GridLayout(6, 2, 8, 8));

        lblNombre.setText("Nombre:");
        panelRegistro.add(lblNombre);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelRegistro.add(txtNombre);

        lblNivel.setText("Nivel (1-20):");
        panelRegistro.add(lblNivel);
        panelRegistro.add(txtNivel);

        lblVida.setText("Puntos de vida:");
        panelRegistro.add(lblVida);
        panelRegistro.add(txtVida);

        lblClase.setText("Clase:");
        panelRegistro.add(lblClase);

        cmbClase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guerrero", "Mago", "Clérigo", "Monje", "Paladín", "Explorador", "Pícaro", "Bardo" }));
        panelRegistro.add(cmbClase);

        lblAtributo.setText("Atributo especial:");
        panelRegistro.add(lblAtributo);
        panelRegistro.add(txtAtributo);
        panelRegistro.add(lblRelleno);

        btnRegistrar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        panelRegistro.add(btnRegistrar);

        getContentPane().add(panelRegistro, java.awt.BorderLayout.LINE_START);

        scrollGremio.setBackground(new java.awt.Color(255, 204, 204));
        scrollGremio.setBorder(javax.swing.BorderFactory.createTitledBorder("Gremio / Bitácora de combate"));

        txtGremio.setEditable(false);
        txtGremio.setColumns(45);
        txtGremio.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtGremio.setLineWrap(true);
        txtGremio.setRows(16);
        txtGremio.setWrapStyleWord(true);
        scrollGremio.setViewportView(txtGremio);

        getContentPane().add(scrollGremio, java.awt.BorderLayout.CENTER);

        btnListar.setText("Ver gremio");
        panelAcciones.add(btnListar);

        btnSimular.setBackground(new java.awt.Color(255, 0, 0));
        btnSimular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSimular.setForeground(new java.awt.Color(255, 255, 255));
        btnSimular.setText("Simular Combate");
        panelAcciones.add(btnSimular);

        getContentPane().add(panelAcciones, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    // Métodos de presentación (sin lógica de negocio)

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtNivel() {
        return txtNivel;
    }

    public JTextField getTxtVida() {
        return txtVida;
    }

    public JTextField getTxtAtributo() {
        return txtAtributo;
    }

    public JComboBox<String> getCmbClase() {
        return cmbClase;
    }

    public JLabel getLblAtributo() {
        return lblAtributo;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public JButton getBtnSimular() {
        return btnSimular;
    }

    public void setTextoGremio(String texto) {
        txtGremio.setText(texto);
        txtGremio.setCaretPosition(0);
    }

    public void limpiarFormulario() {
        txtNombre.setText("");
        txtNivel.setText("");
        txtVida.setText("");
        txtAtributo.setText("");
        txtNombre.requestFocus();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Gremio", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSimular;
    private javax.swing.JComboBox cmbClase;
    private javax.swing.JLabel lblAtributo;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblClase1;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRelleno;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVida;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JScrollPane scrollGremio;
    private javax.swing.JTextField txtAtributo;
    private javax.swing.JTextArea txtGremio;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
