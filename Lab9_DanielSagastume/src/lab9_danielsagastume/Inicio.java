/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_danielsagastume;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Daniel
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar_equipo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        e_nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        e_slogan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        e_pais = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        s_camp = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jd_jugador = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        j_nom = new javax.swing.JTextField();
        j_apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        j_nacionalidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        j_edad = new javax.swing.JSpinner();
        j_sexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        j_oro = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        j_medallas = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        cb_equipo = new javax.swing.JComboBox<>();
        isAtleta = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("NOMBRE DEL EQUIPO");

        e_nom.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel2.setText("SLOGAN");

        e_slogan.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel3.setText("PAIS DE ORIGEN");

        e_pais.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel4.setText("CANTIDAD DE CAMPEONATOS GANADOS");

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("CREAR EQUIPO");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregar_equipoLayout = new javax.swing.GroupLayout(jd_agregar_equipo.getContentPane());
        jd_agregar_equipo.getContentPane().setLayout(jd_agregar_equipoLayout);
        jd_agregar_equipoLayout.setHorizontalGroup(
            jd_agregar_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregar_equipoLayout.createSequentialGroup()
                .addGroup(jd_agregar_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregar_equipoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jd_agregar_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_agregar_equipoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s_camp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(e_pais)
                            .addComponent(e_slogan)
                            .addComponent(e_nom)))
                    .addGroup(jd_agregar_equipoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_agregar_equipoLayout.setVerticalGroup(
            jd_agregar_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregar_equipoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e_slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_agregar_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(s_camp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("NOMBRE DEL JUGADOR");

        j_nom.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        j_apellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel6.setText("APELLIDO DEL JUAGDOR");

        jLabel7.setText("NACIONALIDAD DEL JUGADOR");

        j_nacionalidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("EDAD");

        j_sexo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel9.setText("SEXO DEL JUGADOR");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("CANTIDAD DE BALONES DE ORO");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("CANTIDAD DE MEDALLA");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("¿ES ATLTETLA OLIMPICO?");

        isAtleta.add(jRadioButton1);
        jRadioButton1.setText("SI");

        isAtleta.add(jRadioButton2);
        jRadioButton2.setText("NO");

        jButton7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton7.setText("AGREGAR JUGADOR");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_jugadorLayout = new javax.swing.GroupLayout(jd_jugador.getContentPane());
        jd_jugador.getContentPane().setLayout(jd_jugadorLayout);
        jd_jugadorLayout.setHorizontalGroup(
            jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jugadorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_jugadorLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(102, 102, 102)))
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(j_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jd_jugadorLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(j_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_jugadorLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_jugadorLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton1)
                                    .addGap(14, 14, 14)
                                    .addComponent(jRadioButton2))
                                .addGroup(jd_jugadorLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(j_oro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_jugadorLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(46, 46, 46)
                                .addComponent(j_medallas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_jugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jd_jugadorLayout.setVerticalGroup(
            jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_jugadorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_jugadorLayout.createSequentialGroup()
                        .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(j_oro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(j_medallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(39, 39, 39)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_jugadorLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(cb_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_jugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(j_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CREAR EQUIPO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 24, 207, 60));

        jButton2.setText("MODIFICAR EQUIPO/JUGADOR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 32, 190, 50));

        jButton3.setText("ELIMINAR EQUIPO/JUGADOR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 200, 50));

        jButton4.setText("CREAR/AGREGAR JUGADOR AL EQUIPO");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 260, 50));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(arbol);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 770, 410));

        jButton5.setText("LISTAR");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 330, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // mostar ventana crear equipo
        jd_agregar_equipo.setModal(true);
        jd_agregar_equipo.pack();
        jd_agregar_equipo.setLocationRelativeTo(this);
        jd_agregar_equipo.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try {
            // AGREGAR JUGADOR
            adminEquipo ae = new adminEquipo("./equipos.txt");
            ae.cargarArchivo();
            String atleta = "";
            if (jRadioButton1.isSelected()) {
                atleta = "Si";
            } else if (jRadioButton2.isSelected()) {
                atleta = "No";
            }
            ae.getEquipos().get(cb_equipo.getSelectedIndex()).getJugadores().add(new Jugador(j_nom.getText(), j_apellido.getText(), j_nacionalidad.getText(), (Integer) j_edad.getValue(),
                    j_sexo.getText(), (Integer) j_oro.getValue(), (Integer) j_medallas.getValue(), atleta));
            ae.escribirArchivo();
            j_nom.setText("");
            j_apellido.setText("");
            j_nacionalidad.setText("");
            j_sexo.setText("");
        } catch (IOException ex) {
        }
        Listar();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try {
            // Agregar equipo
            adminEquipo ae = new adminEquipo("./equipos.txt");
            ae.cargarArchivo();
            jugadores = null;
            ae.getEquipos().add(new Equipo(e_nom.getText(), e_slogan.getText(), e_pais.getText(), (Integer) s_camp.getValue(),
                    jugadores));
            jugadores = new ArrayList();
            ae.escribirArchivo();
            e_nom.setText("");
            e_slogan.setText("");
            e_pais.setText("");
            JOptionPane.showMessageDialog(jd_agregar_equipo, "Equipo agregado");
        } catch (IOException ex) {
        }
        Listar();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        cb_equipo.removeAllItems();
        adminEquipo ae = new adminEquipo("./equipos.txt");
        ae.cargarArchivo();
        for (Equipo t : ae.getEquipos()) {
            cb_equipo.addItem(t.getNombre());
        }
        jd_jugador.setModal(true);
        jd_jugador.pack();
        jd_jugador.setLocationRelativeTo(this);
        jd_jugador.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked
    protected void Listar() {
        //LISTAR
        adminEquipo ae = new adminEquipo("./equipos.txt");
        ae.cargarArchivo();
        DefaultTreeModel m = (DefaultTreeModel) arbol.getModel();
        m.setRoot(new DefaultMutableTreeNode("Equipos"));
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        for (Equipo t : ae.getEquipos()) {
            DefaultMutableTreeNode equipo = new DefaultMutableTreeNode(t.getNombre());
            for (Jugador j : t.getJugadores()) {
                equipo.add(new DefaultMutableTreeNode(j));
            }
            raiz.add(equipo);
        }
        m.reload();
    }
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Listar();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Modificar equipo
        adminEquipo ae = new adminEquipo("./equipos.txt");
        ae.cargarArchivo();
        String salida = "";
        int i = 0;
        for (Equipo t : ae.getEquipos()) {
            salida += i + "- " + t.getNombre() + "\n";
            i++;
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                + "Seleccione el indice del equipo a modificar:"));
        int op = Integer.parseInt(JOptionPane.showInputDialog("1. Modificar el nombre\n"
                + "2. Modificar el slogan\n"
                + "3. Modificar pais de origen\n"
                + "4. Modificar campeonatos ganados\n"
                + "5. Modificar un jugador"));
        if (op == 1) {
            try {
                String nom = JOptionPane.showInputDialog("Ingrese el nuevo nombre del equipo: ");
                ae.getEquipos().get(pos).setNombre(nom);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Equipo modificado");
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (op == 2) {
            try {
                String nom = JOptionPane.showInputDialog("Ingrese el nuevo slogan del equipo: ");
                ae.getEquipos().get(pos).setSlogan(nom);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Equipo modificado");
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (op == 3) {
            try {
                String nom = JOptionPane.showInputDialog("Ingrese el nuevo pais de origen del equipo: ");
                ae.getEquipos().get(pos).setPais(nom);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Equipo modificado");
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (op == 4) {
            try {
                int nom = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo nombre del equipo: "));
                ae.getEquipos().get(pos).setCampeonatos(nom);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Equipo modificado");
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (op == 5) {
            String salida_j = "";
            int j = 0;
            for (Jugador t : ae.getEquipos().get(pos).getJugadores()) {
                salida_j += j + "- " + t.getNombre() + "\n";
                j++;
            }
            int pos_j = Integer.parseInt(JOptionPane.showInputDialog(salida_j + "\n"
                    + "Ingrese la posicion del jugador que desea modificar:"));
            int op_j = Integer.parseInt(JOptionPane.showInputDialog("1. modifica rl nombre\n"
                    + "2. Modificar el apellido\n"
                    + "3. Modificar la nacionalidad\n"
                    + "4. Modificar la edad\n"
                    + "5. Modificar el sexo\n"
                    + "6. Modificar Cantidad de balones de oro\n"
                    + "7. Modificar cantidad de medallas\n"
                    + "8. Modificar Si es atleta olimpico"));
            if (op_j == 1) {
                try {
                    String nom = JOptionPane.showInputDialog("Ingrese el nombre:");
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setNombre(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }

            } else if (op_j == 2) {
                try {
                    String nom = JOptionPane.showInputDialog("Ingrese el apellido:");
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setApellido(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            } else if (op_j == 2) {
                try {
                    String nom = JOptionPane.showInputDialog("Ingrese la nacionalidad:");
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setNacionalidad(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            } else if (op_j == 3) {
                try {
                    int nom = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setEdad(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            } else if (op_j == 4) {
                try {
                    String nom = JOptionPane.showInputDialog("Ingrese el sexo:");
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setSexo(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            } else if (op_j == 5) {
                try {
                    int nom = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de balones de oro:"));
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setBalones_oro(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            } else if (op_j == 6) {
                try {
                    int nom = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medallas:"));
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setCant_medallas(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            } else if (op_j == 7) {
                try {
                    String nom = JOptionPane.showInputDialog("Ingrese si es atleta o no:");
                    ae.getEquipos().get(pos).getJugadores().get(pos_j).setIsAtleta(nom);
                    ae.escribirArchivo();
                    JOptionPane.showMessageDialog(this, "Jugador modificado");
                } catch (IOException ex) {
                }
            }
            //Actualizar el arbol  
        }
         Listar();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // ELIMINAR EQUIPO
        adminEquipo ae = new adminEquipo("./equipos.txt");
        ae.cargarArchivo();
        String salida = "";
        int i = 0;
        for (Equipo t : ae.getEquipos()) {
            salida += i + "- " + t.getNombre() + "\n";
            i++;
        }
        int op = Integer.parseInt(JOptionPane.showInputDialog("1. Eliminar equipo\n"
                + "2. Eliminar jugador"));
        if (op == 1) {
            try {
                int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                        + "Seleccione el indice del equipo que va a eliminar:"));
                ae.getEquipos().remove(pos);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Equipo eliminado");
                Listar();
            } catch (IOException ex) {
            }
        } else if (op == 2) {
            try {
                int pos = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                        + "Seleccione el indice del equipo donde esta el jugador:"));
                String salida_j = "";
                int j = 0;
                for (Jugador t : ae.getEquipos().get(pos).getJugadores()) {
                    salida_j += j + "- " + t.getNombre() + "\n";
                    j++;
                }
                int pos_j = Integer.parseInt(JOptionPane.showInputDialog(salida_j + "\n"
                        + "Ingrese la posicion del jugador que desea eliminar:"));
                ae.getEquipos().get(pos).getJugadores().remove(pos_j);
                ae.escribirArchivo();
                JOptionPane.showMessageDialog(this, "Jugador eliminado");
            } catch (IOException ex) {
            }
            
        }
        Listar();
    }//GEN-LAST:event_jButton3MouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JComboBox<String> cb_equipo;
    private javax.swing.JTextField e_nom;
    private javax.swing.JTextField e_pais;
    private javax.swing.JTextField e_slogan;
    private javax.swing.ButtonGroup isAtleta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField j_apellido;
    private javax.swing.JSpinner j_edad;
    private javax.swing.JSpinner j_medallas;
    private javax.swing.JTextField j_nacionalidad;
    private javax.swing.JTextField j_nom;
    private javax.swing.JSpinner j_oro;
    private javax.swing.JTextField j_sexo;
    private javax.swing.JDialog jd_agregar_equipo;
    private javax.swing.JDialog jd_jugador;
    private javax.swing.JSpinner s_camp;
    // End of variables declaration//GEN-END:variables
ArrayList<Jugador> jugadores = new ArrayList();
}
