package cyberlexcr;
public class NuevoDiccionario extends javax.swing.JFrame {
public static java.util.ArrayList<Termino> NuevoSetTerminos =
        new java.util.ArrayList<>();

    public NuevoDiccionario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezadoNuevo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        palabra = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConcepto = new javax.swing.JTextArea();
        btnGuardarTermino = new javax.swing.JButton();
        btnGuardarDiccionario = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CyberLex CR - Nuevo Diccionario");

        panelEncabezadoNuevo.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Diccionario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CyberLex CR - Gestion de terminos digitales");

        javax.swing.GroupLayout panelEncabezadoNuevoLayout = new javax.swing.GroupLayout(panelEncabezadoNuevo);
        panelEncabezadoNuevo.setLayout(panelEncabezadoNuevoLayout);
        panelEncabezadoNuevoLayout.setHorizontalGroup(
            panelEncabezadoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoNuevoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelEncabezadoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEncabezadoNuevoLayout.setVerticalGroup(
            panelEncabezadoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoNuevoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        palabra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        palabra.setText("Palabra o termino:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Definicion del termino :");

        txtConcepto.setColumns(20);
        txtConcepto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConcepto.setLineWrap(true);
        txtConcepto.setRows(5);
        txtConcepto.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtConcepto);

        btnGuardarTermino.setBackground(new java.awt.Color(51, 153, 255));
        btnGuardarTermino.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardarTermino.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarTermino.setText("Guardar Termino");
        btnGuardarTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTerminoActionPerformed(evt);
            }
        });

        btnGuardarDiccionario.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardarDiccionario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGuardarDiccionario.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDiccionario.setText("Guardar Diccionario");
        btnGuardarDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDiccionarioActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEncabezadoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(btnGuardarTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarDiccionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezadoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(palabra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnGuardarTermino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarDiccionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTerminoActionPerformed
        
String palabra = txtPalabra.getText().trim();
String concepto = txtConcepto.getText().trim();

if (palabra.isEmpty() || concepto.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Debe ingresar una palabra y su definición.",
            "CyberLex CR",
            javax.swing.JOptionPane.WARNING_MESSAGE);
    return;
}

Termino nuevoTermino = new Termino(palabra, concepto);

NuevoSetTerminos.add(nuevoTermino);

javax.swing.JOptionPane.showMessageDialog(this,
        "Término guardado exitosamente en CyberLex CR.");

txtPalabra.setText("");
txtConcepto.setText("");

txtPalabra.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarTerminoActionPerformed

    private void btnGuardarDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDiccionarioActionPerformed
    if (NuevoSetTerminos.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Primero debe agregar al menos un término.");
    return;
}
String nombreArchivo = "Diccionario.KennethVargas";
java.util.ArrayList<Termino> todosTerminos =
        new java.util.ArrayList<>();
java.io.File archivoExistente = new java.io.File(nombreArchivo);
// Leer los términos guardados anteriormente
if (archivoExistente.exists()) {
    try (java.io.ObjectInputStream entrada =
            new java.io.ObjectInputStream(
                    new java.io.FileInputStream(archivoExistente))) {

        Diccionario anterior = (Diccionario) entrada.readObject();
        todosTerminos.addAll(anterior.getTerminos());

    } catch (java.io.IOException | ClassNotFoundException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Error al leer el diccionario anterior: "
                + e.getMessage());
        return;
    }
}
// Agregar o actualizar términos
for (Termino nuevo : NuevoSetTerminos) {
    boolean actualizado = false;
    for (Termino existente : todosTerminos) {
        if (existente.getPalabra().equalsIgnoreCase(
                nuevo.getPalabra())) {
            existente.setConcepto(nuevo.getConcepto());
            actualizado = true;
            break;
        }
    }

    if (!actualizado) {
        todosTerminos.add(nuevo);
    }
}
java.util.Collections.sort(todosTerminos);
// Crear el diccionario actualizado
Diccionario diccionario = new Diccionario(todosTerminos);
// Guardar el archivo
try (java.io.ObjectOutputStream salida =
        new java.io.ObjectOutputStream(
                new java.io.FileOutputStream(nombreArchivo))) {
    salida.writeObject(diccionario);
    NuevoSetTerminos.clear();
    javax.swing.JOptionPane.showMessageDialog(this,
            "Diccionario actualizado correctamente en CyberLex CR.");
} catch (java.io.IOException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Error al guardar el diccionario: " + e.getMessage());
}
    }//GEN-LAST:event_btnGuardarDiccionarioActionPerformed
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoDiccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoDiccionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDiccionario;
    private javax.swing.JButton btnGuardarTermino;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel palabra;
    private javax.swing.JPanel panelEncabezadoNuevo;
    private javax.swing.JTextArea txtConcepto;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
