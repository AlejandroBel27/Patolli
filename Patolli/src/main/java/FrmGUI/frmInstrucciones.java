/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrmGUI;

/**
 *
 * @author equipo 1
 */
public class frmInstrucciones extends javax.swing.JFrame {

    /**
     * Creates new form frmInstrucciones
     */
    public frmInstrucciones() {
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

        lblInstrucciones = new javax.swing.JLabel();
        sclpInstrucciones = new javax.swing.JScrollPane();
        txtaInstrucciones = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInstrucciones.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstrucciones.setText("Instrucciones");

        txtaInstrucciones.setEditable(false);
        txtaInstrucciones.setColumns(20);
        txtaInstrucciones.setLineWrap(true);
        txtaInstrucciones.setRows(5);
        txtaInstrucciones.setText("Instrucciones de Patolli\n\nObjetivo del Juego\nEl objetivo del Patolli es llevar todas tus fichas a la meta antes que tus oponentes, avanzando a lo largo del tablero en forma de cruz y apostando puntos en cada turno. Ganas el juego si eres el primer jugador en lograr que todas tus fichas lleguen a la meta o si tienes más fichas en meta cuando otros jugadores se queden sin fichas o puntos.\n\nEl Tablero\nEl tablero tiene forma de cruz (o \"X\") y se divide en 52 casillas que representan el ciclo de 52 años del calendario azteca. Las casillas están organizadas en cuatro brazos y tienen zonas especiales:\n- Casillas con Triángulo: Al caer aquí, debes pagar el doble de la apuesta.\n- Casillas Centrales: Si caes en una casilla central ocupada por otra ficha, esta será eliminada del tablero.\n- Casillas Semicirculares: Al caer aquí, juegas dos turnos seguidos.\n- Casillas de Meta y Salida: Cada jugador empieza en una casilla de salida y debe avanzar en sentido de las agujas del reloj para volver a su punto de inicio, que será su meta.\n\nJugadores y Fichas\n- De 2 a 4 jugadores pueden participar, cada uno con fichas de un color diferente.\n- Cada jugador cuenta con entre 2 y 6 fichas (configurable al inicio del juego). Todas las fichas deben recorrer el tablero en sentido de las agujas del reloj para llegar a la meta.\n\nDados (Cañas)\nEn lugar de dados, se usan 5 cañas, de las cuales un lado tiene un punto y el otro está liso. El resultado de cada tirada determina cuántas casillas puedes avanzar:\n- 1 caña con punto: avanzas 1 casilla.\n- 2 cañas con punto: avanzas 2 casillas.\n- 3 cañas con punto: avanzas 3 casillas.\n- 4 cañas con punto: avanzas 4 casillas.\n- 5 cañas con punto: avanzas 10 casillas.\n- Todas las cañas lisas: no avanzas y pierdes el turno.\n\nApuestas\nCada jugador comienza con un fondo inicial de puntos (configurable). En cada turno, podrás hacer apuestas en base al \"monto mínimo de apuesta\" configurado al inicio:\n- Al iniciar una ficha en el tablero: Para ingresar una ficha debes obtener al menos un punto en tu tirada. Si no lo logras, debes pagar una apuesta a los demás jugadores.\n- Si caes en una casilla triangular: Pagas el doble de la apuesta.\n- Si todas las cañas caen lisas (pierdes turno): También pagas una apuesta.\n- Si una de tus fichas llega a la meta: Los demás jugadores deben pagarte una apuesta.\n\nMovimientos Especiales\n- Entrar al tablero: Cada jugador coloca su ficha en el centro del brazo opuesto a su punto de salida. Una vez dentro, debe seguir el trayecto completo hasta su meta.\n- Casillas Ocupadas: Si caes en una casilla ocupada por otra ficha:\n  - Si es una casilla central, la ficha que estaba en la casilla es eliminada.\n  - Si no es una casilla central, tu ficha regresa a la casilla de origen.\n- Elección de Ficha: Si tienes varias fichas en el tablero, elige cuál avanzar en tu turno. Puedes pagar una apuesta adicional para elegir una ficha específica en vez de seguir el orden de entrada.\n\nFin del Juego\nEl juego termina cuando un jugador logra llevar todas sus fichas a la meta o cuando otros jugadores no tienen puntos o fichas disponibles. El jugador con más fichas en la meta será el ganador si nadie logra meter todas sus fichas.\n\nConsejos Finales\n- Administra tus apuestas con cuidado: ¡Perder puntos rápidamente puede dejarte fuera del juego!\n- Aprovecha las casillas semicirculares para ganar turnos extra.\n- Planifica tus movimientos para evitar casillas ocupadas y mantén tus puntos para sobrevivir hasta el final.\n\n¡Buena suerte y disfruta del juego de Patolli!");
        sclpInstrucciones.setViewportView(txtaInstrucciones);

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
            .addComponent(lblInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 364, Short.MAX_VALUE))
                    .addComponent(sclpInstrucciones))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblInstrucciones)
                .addGap(18, 18, 18)
                .addComponent(sclpInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new frmPrincipal().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(frmInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInstrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JScrollPane sclpInstrucciones;
    private javax.swing.JTextArea txtaInstrucciones;
    // End of variables declaration//GEN-END:variables
}