package UICiclismo;

import DatosCiclismo.*;
import LogicaCiclismo.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Kevin Alonso Espinoza Barrantes
 */
public class UIPrincipal extends javax.swing.JFrame {
    /**
     * 
     */
    private GestorPrincipal manager;
    
    /**
     * 
     */
    DefaultTableModel modeloCiclistas;
    
    /**
     * 
     */
    DefaultTableModel modeloCarreras;
    
    /**
     * 
     */
    DefaultTableModel modeloCiclistasCarrera;

    /**
     * 
     * @param gestor 
     */
    public UIPrincipal(GestorPrincipal gestor) {
        initComponents();
        modeloCiclistas = (DefaultTableModel)this.jTableCiclistas.getModel();
        modeloCarreras = (DefaultTableModel)this.jTableCarreras.getModel();
        modeloCiclistasCarrera = (DefaultTableModel)this.jTableCiclistasCarrera.getModel();
        this.setLocationRelativeTo(null);
        manager = gestor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelCiclistas = new javax.swing.JPanel();
        jScrollPaneCiclistas = new javax.swing.JScrollPane();
        jTableCiclistas = new javax.swing.JTable();
        jButtonCrearCiclista = new javax.swing.JButton();
        jButtonEliminarCiclista = new javax.swing.JButton();
        jPanelCarreras = new javax.swing.JPanel();
        jScrollPaneCarreras = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jButtonCrearCarrera = new javax.swing.JButton();
        jButtonEliminarCarrera = new javax.swing.JButton();
        jButtonSimularCarrera = new javax.swing.JButton();
        jPanelCiclistasCarrera = new javax.swing.JPanel();
        jScrollPaneCiclistasCarrera = new javax.swing.JScrollPane();
        jTableCiclistasCarrera = new javax.swing.JTable();
        jButtonAgregarCiclistaCarrera = new javax.swing.JButton();
        jButtonReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciclismo (POO)");

        jPanelCiclistas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion de ciclistas"));

        jTableCiclistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCiclistas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableCiclistas.getTableHeader().setReorderingAllowed(false);
        jScrollPaneCiclistas.setViewportView(jTableCiclistas);
        jTableCiclistas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableCiclistas.getColumnModel().getColumnCount() > 0) {
            jTableCiclistas.getColumnModel().getColumn(0).setResizable(false);
            jTableCiclistas.getColumnModel().getColumn(1).setResizable(false);
            jTableCiclistas.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonCrearCiclista.setText("Crear");
        jButtonCrearCiclista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCiclistaActionPerformed(evt);
            }
        });

        jButtonEliminarCiclista.setText("Eliminar");
        jButtonEliminarCiclista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCiclistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCiclistasLayout = new javax.swing.GroupLayout(jPanelCiclistas);
        jPanelCiclistas.setLayout(jPanelCiclistasLayout);
        jPanelCiclistasLayout.setHorizontalGroup(
            jPanelCiclistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiclistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCiclistas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCiclistasLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButtonCrearCiclista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jButtonEliminarCiclista)
                .addGap(58, 58, 58))
        );
        jPanelCiclistasLayout.setVerticalGroup(
            jPanelCiclistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiclistasLayout.createSequentialGroup()
                .addComponent(jScrollPaneCiclistas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCiclistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearCiclista)
                    .addComponent(jButtonEliminarCiclista)))
        );

        jPanelCarreras.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion de carreras"));
        jPanelCarreras.setPreferredSize(new java.awt.Dimension(400, 283));

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Tipo", "Distancia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarreras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableCarreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarrerasMouseClicked(evt);
            }
        });
        jScrollPaneCarreras.setViewportView(jTableCarreras);
        if (jTableCarreras.getColumnModel().getColumnCount() > 0) {
            jTableCarreras.getColumnModel().getColumn(0).setResizable(false);
            jTableCarreras.getColumnModel().getColumn(1).setResizable(false);
            jTableCarreras.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonCrearCarrera.setText("Crear");
        jButtonCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCarreraActionPerformed(evt);
            }
        });

        jButtonEliminarCarrera.setText("Eliminar");
        jButtonEliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCarreraActionPerformed(evt);
            }
        });

        jButtonSimularCarrera.setText("Simular");
        jButtonSimularCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimularCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCarrerasLayout = new javax.swing.GroupLayout(jPanelCarreras);
        jPanelCarreras.setLayout(jPanelCarrerasLayout);
        jPanelCarrerasLayout.setHorizontalGroup(
            jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonCrearCarrera)
                .addGap(48, 48, 48)
                .addComponent(jButtonEliminarCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButtonSimularCarrera)
                .addGap(38, 38, 38))
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCarrerasLayout.setVerticalGroup(
            jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addComponent(jScrollPaneCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearCarrera)
                    .addComponent(jButtonEliminarCarrera)
                    .addComponent(jButtonSimularCarrera))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCiclistasCarrera.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciclista en carrera"));

        jTableCiclistasCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "1er apellido", "2do apellido", "Edad", "Sexo", "Categoria", "Especialidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneCiclistasCarrera.setViewportView(jTableCiclistasCarrera);
        if (jTableCiclistasCarrera.getColumnModel().getColumnCount() > 0) {
            jTableCiclistasCarrera.getColumnModel().getColumn(0).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(1).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(2).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(3).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(4).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(5).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(6).setResizable(false);
            jTableCiclistasCarrera.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanelCiclistasCarreraLayout = new javax.swing.GroupLayout(jPanelCiclistasCarrera);
        jPanelCiclistasCarrera.setLayout(jPanelCiclistasCarreraLayout);
        jPanelCiclistasCarreraLayout.setHorizontalGroup(
            jPanelCiclistasCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiclistasCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCiclistasCarrera)
                .addContainerGap())
        );
        jPanelCiclistasCarreraLayout.setVerticalGroup(
            jPanelCiclistasCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiclistasCarreraLayout.createSequentialGroup()
                .addComponent(jScrollPaneCiclistasCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonAgregarCiclistaCarrera.setText(">>");
        jButtonAgregarCiclistaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCiclistaCarreraActionPerformed(evt);
            }
        });

        jButtonReportes.setText("Reportes");
        jButtonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelCiclistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAgregarCiclistaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanelCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanelCiclistasCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jButtonReportes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCiclistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonAgregarCiclistaCarrera)
                        .addGap(134, 134, 134)))
                .addComponent(jPanelCiclistasCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReportes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearCiclistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCiclistaActionPerformed
        this.manager.mostrarVentanaCiclista();
    }//GEN-LAST:event_jButtonCrearCiclistaActionPerformed

    private void jButtonEliminarCiclistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCiclistaActionPerformed
        int fila = this.jTableCiclistas.getSelectedRow();
        if( fila >= 0){
           int idCiclista = (int)this.modeloCiclistas.getValueAt(fila, 0);
           this.manager.removerCiclista(idCiclista);
           this.modeloCiclistas.removeRow(fila);   
        } else {
            JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un ciclista para eliminarlo.");
        }
    }//GEN-LAST:event_jButtonEliminarCiclistaActionPerformed

    private void jButtonCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCarreraActionPerformed
        this.manager.mostrarVentanaCarreras();
    }//GEN-LAST:event_jButtonCrearCarreraActionPerformed

    private void jButtonEliminarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCarreraActionPerformed
        int fila = this.jTableCarreras.getSelectedRow();
        if( fila >= 0){
           int idCarrera = (int)this.modeloCarreras.getValueAt(fila, 0);
           this.manager.removerCarrera(idCarrera);
           this.modeloCarreras.removeRow(fila);   
        } else {
            JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un ciclista para eliminarlo.");
        }
    }//GEN-LAST:event_jButtonEliminarCarreraActionPerformed

    private void jButtonAgregarCiclistaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCiclistaCarreraActionPerformed
        int filaCiclista = this.jTableCiclistas.getSelectedRow();
        int filaCarrera = this.jTableCarreras.getSelectedRow();
        if(filaCiclista < 0 || filaCarrera < 0){
            JOptionPane.showMessageDialog(rootPane,"Debe seleccionar el ciclista y la carrera.");
        } else {
            int idCiclista = (int)this.modeloCiclistas.getValueAt(filaCiclista, 0);
            int idCarrera = (int)this.modeloCarreras.getValueAt(filaCarrera, 0);
            int agregado = this.manager.asignarCiclista(idCiclista, idCarrera);
            if(agregado < 0){
               JOptionPane.showMessageDialog(rootPane,"El ciclista ya esta asignado a la carrera."); 
            }
        }   
    }//GEN-LAST:event_jButtonAgregarCiclistaCarreraActionPerformed

    private void jTableCarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarrerasMouseClicked
        int filaCarrera = this.jTableCarreras.getSelectedRow();
        if(filaCarrera >= 0){
           this.removerCiclistasCarrera();
           int idCarrera = (int)this.modeloCarreras.getValueAt(filaCarrera, 0);
           Carrera carrera = this.manager.getCarrera(idCarrera);
           if (carrera != null){
               int cantidadCiclistas = carrera.getCiclistas().size();
               for (int i = 0; i < cantidadCiclistas; i++){
                  this.agregarCiclistaCarrera(carrera.getCiclistas().get(i));
               }
           }
        }
    }//GEN-LAST:event_jTableCarrerasMouseClicked

    private void jButtonSimularCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimularCarreraActionPerformed
        int filaCarrera = this.jTableCarreras.getSelectedRow();
        if(filaCarrera >= 0){
            Carrera carrera = this.manager.getCarrera((int)this.modeloCarreras.getValueAt(filaCarrera, 0));
            if(carrera.getCiclistas().size() > 0){
                if(carrera.getTipo() == "Carretera" || carrera.getTipo() == "Montaña"){
                    this.manager.simularRecorrido((Recorrido)carrera);
                    this.removerCarreraTabla();
                } else {
                    this.manager.simularCircuito((Circuito)carrera);
                    this.removerCarreraTabla();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,"Debe seleccionar una carrera que contenga ciclistas.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,"Debe seleccionar una carrera.");
        }
    }//GEN-LAST:event_jButtonSimularCarreraActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        this.manager.mostrarVentaReportes();
    }//GEN-LAST:event_jButtonReportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCiclistaCarrera;
    private javax.swing.JButton jButtonCrearCarrera;
    private javax.swing.JButton jButtonCrearCiclista;
    private javax.swing.JButton jButtonEliminarCarrera;
    private javax.swing.JButton jButtonEliminarCiclista;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JButton jButtonSimularCarrera;
    private javax.swing.JPanel jPanelCarreras;
    private javax.swing.JPanel jPanelCiclistas;
    private javax.swing.JPanel jPanelCiclistasCarrera;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneCarreras;
    private javax.swing.JScrollPane jScrollPaneCiclistas;
    private javax.swing.JScrollPane jScrollPaneCiclistasCarrera;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableCiclistas;
    private javax.swing.JTable jTableCiclistasCarrera;
    // End of variables declaration//GEN-END:variables

    public void agregarCiclista(Ciclista ciclista){
        this.modeloCiclistas.addRow(new Object[]{ciclista.getIdentificador(), ciclista.getNombre() +" "+ ciclista.getPrimerApellido() +" "+ ciclista.getSegundoApellido() , ciclista.getCategoria()});
    }
    
    public void agregarCarrera(Carrera carrera){
        this.modeloCarreras.addRow(new Object[]{carrera.getIdentificador(), carrera.getTipo(), carrera.getDistancia()});
    }
    
    public void agregarCiclistaCarrera(Ciclista ciclista){
        this.modeloCiclistasCarrera.addRow(new Object[]{ciclista.getIdentificador(), ciclista.getNombre(), ciclista.getPrimerApellido(), ciclista.getSegundoApellido(), ciclista.getEdad(), ciclista.getSexo(), ciclista.getCategoria(), ciclista.getEspecialidad()});
    }
    
    public void removerCarreraTabla(){
        int fila = this.jTableCarreras.getSelectedRow();
        if( fila >= 0){
           int idCarrera = (int)this.modeloCarreras.getValueAt(fila, 0);
           this.modeloCarreras.removeRow(fila);   
        } else {
            JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un ciclista para eliminarlo.");
        }
        
    }
    
    public void removerCiclistasCarrera(){
        int indice = this.modeloCiclistasCarrera.getRowCount();
        if (indice > 0){
            for(int i = 0; i < indice; i++){
               this.modeloCiclistasCarrera.removeRow(0);
            }
        }
    }
}