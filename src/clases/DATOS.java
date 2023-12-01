package clases;


import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class DATOS extends javax.swing.JFrame {

    /**
     * Creates new form DATOS
     */
    public DATOS() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("DATOS");
        ///CODIGO PARA IMAGEN DE FONDO////
((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagen/fondo2.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
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
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        btncomprobar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("DATOS PERSONALES ");

        lbl1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 204, 255));
        lbl1.setText("INGRESAR CORREO :");

        lbl2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(153, 204, 255));
        lbl2.setText("INGRESAR CEDULA :");

        lbl3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(153, 204, 255));
        lbl3.setText("INGRESAR CELULAR :");

        lbl4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(153, 204, 255));
        lbl4.setText("INGRESAR CLAVE SEGURA : ");

        txtcorreo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        txtcedula.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        txtcelular.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        txtclave.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        btncomprobar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btncomprobar.setText("COMPROBAR");
        btncomprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl2)
                                .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addComponent(lbl4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcorreo)
                            .addComponent(txtcedula)
                            .addComponent(txtcelular)
                            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btncomprobar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(lbl1))
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl3)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btncomprobar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void btncomprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprobarActionPerformed
        String correo = txtcorreo.getText();
        String cedula = txtcedula.getText();
        String celular = txtcelular.getText();
        String clave = txtclave.getText();

        StringBuilder errores = new StringBuilder();

        if (!validarCorreo(correo)) {
            errores.append("El correo ").append(correo).append(" no es válido. Debe contener solo letras minúsculas.\n");
        }

        if (!validarCedula(cedula)) {
            errores.append("La cédula ").append(cedula).append(" no es válida. Debe contener solo números.\n");
        }

        if (!validarCelular(celular)) {
            errores.append("El celular ").append(celular).append(" no es válido. Debe contener solo números.\n");
        }

        if (!validarClave(clave)) {
            errores.append("La clave ").append(clave).append(" no es válida. Debe contener solo letras.\n");
        }

        if (errores.length() == 0) {

            JOptionPane.showMessageDialog(rootPane, "Todos los datos son válidos.\n"
                    + " El correo " + correo + " Contiene letras minusculas \n"
                    + "El cédula " + cedula + " contiene solo numeros  \n"
                    + "La celular " + celular + " contiene solo numeros \n"
                    + "la clave " + clave + " contiene solo letras ");
        } else {

            JOptionPane.showMessageDialog(rootPane, "Se encontraron errores:\n" + errores.toString());
        }
    }

    
    private boolean validarCorreo(String correo) {
        // Validar que el correo tiene solo letras minúsculas
        String regexCorreo = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
        return Pattern.matches(regexCorreo, correo);
    }

    private boolean validarCedula(String cedula) {
        // Validar que la cédula tiene solo números
        String regexCedula = "^[0-9]{10}$";
        return Pattern.matches(regexCedula, cedula);
    }

    private boolean validarCelular(String celular) {
        // Validar que el celular tiene solo números
        String regexCelular = "^[0-9]{10}$";
        return Pattern.matches(regexCelular, celular);
    }

    private boolean validarClave(String clave) {
        // Validar que la clave tiene solo letras
        String regexClave = "^[a-zA-Z]+$";
        return Pattern.matches(regexClave, clave);
    }//GEN-LAST:event_btncomprobarActionPerformed

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
            java.util.logging.Logger.getLogger(DATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DATOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncomprobar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables

  
}
