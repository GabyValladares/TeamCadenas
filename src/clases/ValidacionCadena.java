/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;



import javax.swing.JOptionPane;




/**
 *
 * @author HP
 */
public class ValidacionCadena extends javax.swing.JFrame {

    /**
     * Creates new form ValidacionCadena
     */
    public ValidacionCadena() {
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
        lblcadena = new javax.swing.JLabel();
        txtcadena = new javax.swing.JTextField();
        btnValidacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("VALIDACION CADENA");

        lblcadena.setBackground(new java.awt.Color(255, 204, 255));
        lblcadena.setForeground(new java.awt.Color(255, 102, 51));
        lblcadena.setText("Ingrese la oracion");

        btnValidacion.setBackground(new java.awt.Color(204, 255, 204));
        btnValidacion.setForeground(new java.awt.Color(51, 153, 0));
        btnValidacion.setText("VALIDACION");
        btnValidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblcadena)
                .addGap(37, 37, 37)
                .addComponent(txtcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnValidacion)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnValidacion)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidacionActionPerformed
        // TODO add your handling code here:
        ///ESCRIBIR UNA ORACION Y CONTAR LOS ESPACIOS EN BLANCO QUE TIENE LA ORACION
          //para obtener el texto del JtextFile
        String oracion = txtcadena.getText(); 
//inplemetacion del if para poder verificar que la cadena no esta vacia 
//o si ingreso numeros me va a decir que ingrese una oracion correcta espesificamente va a saltar al else
//IsEmpty devuelve True si la variable no se ha iniciado o si está explícitamente definida como Empty
//de lo contrario, devuelve el valor False.
    if (oracion != null && !oracion.isEmpty()) { 
        // aqui nos va a contar  los espacios en blanco en la oración
        int espacios = contarCaracteres(oracion, ' ');
        //aqui nos va a indicar en un mensaje los espacios que tiene la otacion
        JOptionPane.showMessageDialog(null, "La oración tiene " + espacios + " espacios en blanco.");
    } else {
        JOptionPane.showMessageDialog(null, "Ingresa una oración válida.");
    }
}
    ///implementacion del metodo para que pueda contar el espacio
private int contarCaracteres(String texto, char caracter) {
    //aqui declaramos o inicialisamos una variable 
    int contadorCaracteres = 0;
    
    //en esta parte recorremos sobre cada caracter de texto
    for (char c : texto.toCharArray()) {
        //aqui nos verifica si se trata de el mismo cararcter en este caso los espacios
        if (c == caracter) {
            //para incrementar el contados de caracteres
            contadorCaracteres++;
        }
    }
    //devolucion de todos los caracteres o espacios encontrados
    return contadorCaracteres;
    }//GEN-LAST:event_btnValidacionActionPerformed

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
            java.util.logging.Logger.getLogger(ValidacionCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidacionCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidacionCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidacionCadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidacionCadena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcadena;
    private javax.swing.JTextField txtcadena;
    // End of variables declaration//GEN-END:variables
}
