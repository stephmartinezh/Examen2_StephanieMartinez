package examen2_stephaniemartinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planetas = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre_planeta = new javax.swing.JTextField();
        temperatura_planeta = new javax.swing.JSpinner();
        anillos_planeta = new javax.swing.JComboBox<>();
        superficie_planeta = new javax.swing.JTextField();
        distancia_planeta = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        astronauta = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        nombre_astronauta = new javax.swing.JTextField();
        nacionalidad_astronauta = new javax.swing.JTextField();
        sueldo_astronauta = new javax.swing.JSpinner();
        xp_astronauta = new javax.swing.JSpinner();
        sexo_astronauta = new javax.swing.JComboBox<>();
        peso_astronauta = new javax.swing.JSpinner();
        naves = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        numero_nave = new javax.swing.JTextField();
        planeta_nave = new javax.swing.JComboBox<>();
        velocidad_nave = new javax.swing.JSpinner();
        tipo_nave = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        listar = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listar_planetas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listar_astronautas = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        menu = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        modificar_planeta = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        nombre_planetam = new javax.swing.JTextField();
        temperatura_planetam = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        anillos_planetam = new javax.swing.JComboBox<>();
        superficie_planetam = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        distancia_planetam = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        modificar_astronauta = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nombre_astronautam = new javax.swing.JTextField();
        nacionalidad_astronautam = new javax.swing.JTextField();
        sueldo_astronautam = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        xp_astronautam = new javax.swing.JSpinner();
        sexo_astronautam = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        peso_astronautam = new javax.swing.JSpinner();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Planetas");

        jLabel3.setText("Nombre");

        jLabel4.setText("Temperatura");

        jLabel5.setText("Anillos");

        jLabel6.setText("Superficie");

        jLabel7.setText("Distancia");

        temperatura_planeta.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        anillos_planeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        distancia_planeta.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jButton6.setText("Guardar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout planetasLayout = new javax.swing.GroupLayout(planetas.getContentPane());
        planetas.getContentPane().setLayout(planetasLayout);
        planetasLayout.setHorizontalGroup(
            planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planetasLayout.createSequentialGroup()
                .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planetasLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(planetasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(nombre_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planetasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(superficie_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(temperatura_planeta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(anillos_planeta, javax.swing.GroupLayout.Alignment.LEADING, 0, 61, Short.MAX_VALUE))
                            .addComponent(distancia_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planetasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(159, 159, 159))
        );
        planetasLayout.setVerticalGroup(
            planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planetasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(temperatura_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(anillos_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(superficie_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(distancia_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Astronauta");

        jLabel10.setText("Nombre");

        jLabel11.setText("Nacionalidad");

        jLabel12.setText("Sueldo");

        jLabel13.setText("Experiencia");

        jLabel14.setText("Sexo");

        jLabel15.setText("Peso");

        jButton7.setText("Guardar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        sueldo_astronauta.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        xp_astronauta.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sexo_astronauta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        peso_astronauta.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        javax.swing.GroupLayout astronautaLayout = new javax.swing.GroupLayout(astronauta.getContentPane());
        astronauta.getContentPane().setLayout(astronautaLayout);
        astronautaLayout.setHorizontalGroup(
            astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(astronautaLayout.createSequentialGroup()
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(astronautaLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel9))
                    .addGroup(astronautaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(28, 28, 28)
                        .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_astronauta)
                            .addComponent(nacionalidad_astronauta, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(sueldo_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xp_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, astronautaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(158, 158, 158))
        );
        astronautaLayout.setVerticalGroup(
            astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(astronautaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nombre_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nacionalidad_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sueldo_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(xp_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(sexo_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(peso_astronauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Nave Espacial");

        jLabel17.setText("Número de serie");

        jLabel18.setText("Planeta");

        jLabel19.setText("Velocidad");

        jLabel20.setText("Tipo");

        planeta_nave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                planeta_naveItemStateChanged(evt);
            }
        });

        velocidad_nave.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        tipo_nave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sonda Espacial", "Nave Tripulada" }));

        jButton9.setText("Guardar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navesLayout = new javax.swing.GroupLayout(naves.getContentPane());
        naves.getContentPane().setLayout(navesLayout);
        navesLayout.setHorizontalGroup(
            navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(135, 135, 135))
            .addGroup(navesLayout.createSequentialGroup()
                .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero_nave, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planeta_nave, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tipo_nave, javax.swing.GroupLayout.Alignment.LEADING, 0, 98, Short.MAX_VALUE)
                                .addComponent(velocidad_nave, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(navesLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton9)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        navesLayout.setVerticalGroup(
            navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(numero_nave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(planeta_nave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(29, 29, 29)
                .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(velocidad_nave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(32, 32, 32)
                .addGroup(navesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_nave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );

        listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarMouseClicked(evt);
            }
        });

        listar_planetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Temperatura", "Anillos", "Superficie", "Distancia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listar_planetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listar_planetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listar_planetas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Planetas", jPanel1);

        listar_astronautas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nacionalidad", "Sueldo", "Experiencia", "Sexo", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listar_astronautas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listar_astronautasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listar_astronautas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Astronautas", jPanel2);

        jButton12.setText("Salir");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout listarLayout = new javax.swing.GroupLayout(listar.getContentPane());
        listar.getContentPane().setLayout(listarLayout);
        listarLayout.setHorizontalGroup(
            listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(listarLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listarLayout.setVerticalGroup(
            listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        menu.add(eliminar);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        menu.add(modificar);

        jLabel8.setText("Nombre");

        temperatura_planetam.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel21.setText("Temperatura");

        jLabel22.setText("Anillos");

        anillos_planetam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel23.setText("Superficie");

        jLabel24.setText("Distancia");

        distancia_planetam.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Planetas");

        jButton10.setText("Guardar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificar_planetaLayout = new javax.swing.GroupLayout(modificar_planeta.getContentPane());
        modificar_planeta.getContentPane().setLayout(modificar_planetaLayout);
        modificar_planetaLayout.setHorizontalGroup(
            modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificar_planetaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(154, 154, 154))
            .addGroup(modificar_planetaLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel25)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modificar_planetaLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modificar_planetaLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(46, 46, 46)
                            .addComponent(nombre_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(modificar_planetaLayout.createSequentialGroup()
                            .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addGap(18, 18, 18)
                            .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(superficie_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(temperatura_planetam, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anillos_planetam, javax.swing.GroupLayout.Alignment.LEADING, 0, 61, Short.MAX_VALUE))
                                .addComponent(distancia_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        modificar_planetaLayout.setVerticalGroup(
            modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificar_planetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
            .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modificar_planetaLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(nombre_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(temperatura_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(anillos_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(superficie_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(distancia_planetam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        jLabel26.setText("Nombre");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Astronauta");

        sueldo_astronautam.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel28.setText("Sueldo");

        jLabel29.setText("Nacionalidad");

        jLabel30.setText("Experiencia");

        xp_astronautam.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sexo_astronautam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel31.setText("Sexo");

        jLabel32.setText("Peso");

        peso_astronautam.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jButton11.setText("Guardar");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificar_astronautaLayout = new javax.swing.GroupLayout(modificar_astronauta.getContentPane());
        modificar_astronauta.getContentPane().setLayout(modificar_astronautaLayout);
        modificar_astronautaLayout.setHorizontalGroup(
            modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificar_astronautaLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton11)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modificar_astronautaLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modificar_astronautaLayout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(jLabel27))
                        .addGroup(modificar_astronautaLayout.createSequentialGroup()
                            .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel29)
                                .addComponent(jLabel28)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(jLabel32))
                            .addGap(28, 28, 28)
                            .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombre_astronautam)
                                .addComponent(nacionalidad_astronautam, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                .addComponent(sueldo_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xp_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sexo_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(peso_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        modificar_astronautaLayout.setVerticalGroup(
            modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificar_astronautaLayout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addContainerGap())
            .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modificar_astronautaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel27)
                    .addGap(18, 18, 18)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(nombre_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(nacionalidad_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(sueldo_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(xp_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(sexo_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(modificar_astronautaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(peso_astronautam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Menu");

        jButton1.setText("Registrar Planetas");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Registrar Astronautas");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Listar Elementos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Expedición");

        jButton5.setText("Salir");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton8.setText("Registrar Naves");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(32, 32, 32)
                .addComponent(jButton4)
                .addGap(42, 42, 42)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        String condicion;
        if (anillos_planeta.getSelectedIndex() == 0) {
            condicion = "Si";
        } else {
            condicion = "No";
        }
        planeta.add(new Planetas(nombre_planeta.getText(), (double) temperatura_planeta.getValue(), condicion, superficie_planeta.getText(), (double) distancia_planeta.getValue()));
        Object[] newrow = {nombre_planeta.getText(), (double) temperatura_planeta.getValue(), condicion, superficie_planeta.getText(), (double) distancia_planeta.getValue()};
        DefaultTableModel modeloc = new DefaultTableModel();
        modeloc = (DefaultTableModel) listar_planetas.getModel();
        double temp = (double) temperatura_planeta.getValue();
        String n = nombre_planeta.getText();
        modeloc.addRow(newrow);
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./planetas.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write("Nombre: " + n + "\nTemperatura: " + temp + "\nCondicion: " + condicion + "\nSuperficie: " + superficie_planeta.getText() + "\nDistancia: " + (double) distancia_planeta.getValue() + "\n\n");
            bw.flush();
        } catch (Exception e) {

        }
        try {
            fw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombre_planeta.setText("");
        temperatura_planeta.setValue(0);
        anillos_planeta.setSelectedIndex(0);
        superficie_planeta.setText("");
        distancia_planeta.setValue(0);
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo = (DefaultComboBoxModel) planeta_nave.getModel();
        for (int i = 0; i < planeta.size(); i++) {
            modelo.addElement(planeta.get(i).getNombre());
            planeta_nave.setModel(modelo);
        }
        JOptionPane.showMessageDialog(this, "Planeta registrado exitosamente");
        planetas.setVisible(false);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        planetas.pack();
        planetas.setModal(true);
        planetas.setLocationRelativeTo(this);
        planetas.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        String sexo;
        if (sexo_astronauta.getSelectedIndex() == 0) {
            sexo = "Femenino";
        } else {
            sexo = "Masculino";
        }
        astronautas.add(new Astronautas(nombre_astronauta.getText(), nacionalidad_astronauta.getText(), (double) sueldo_astronauta.getValue(), (int) xp_astronauta.getValue(), sexo, (double) peso_astronauta.getValue()));
        Object[] newrow = {nombre_astronauta.getText(), nacionalidad_astronauta.getText(), (double) sueldo_astronauta.getValue(), (int) xp_astronauta.getValue(), sexo, (double) peso_astronauta.getValue()};
        DefaultTableModel modeloc = new DefaultTableModel();
        modeloc = (DefaultTableModel) listar_astronautas.getModel();
        modeloc.addRow(newrow);
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./astronautas.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write("Nombre: " + nombre_astronauta.getText() + "\nNacionalidad: " + nacionalidad_astronauta.getText() + "\nSueldo: " + (double) sueldo_astronauta.getValue() + "\nExperiencia: " + (int) xp_astronauta.getValue() + "\nSexo: " + sexo + "Peso: " + (double) peso_astronauta.getValue() + "\n\n");
            bw.flush();
        } catch (Exception e) {

        }
        try {
            fw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombre_astronauta.setText("");
        nacionalidad_astronauta.setText("");
        sueldo_astronauta.setValue(0);
        xp_astronauta.setValue(0);
        sexo_astronauta.setSelectedIndex(0);
        peso_astronauta.setValue(0);
        JOptionPane.showMessageDialog(this, "Astronauta guardado exitosamente");
        astronauta.setVisible(false);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        astronauta.pack();
        astronauta.setModal(true);
        astronauta.setLocationRelativeTo(this);
        astronauta.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        double tiempoida = 0, tiempovuelta = 0;
        if (tipo_nave.getSelectedIndex() == 0) {
            String material = JOptionPane.showInputDialog(this, "Ingrese el material de la nave");
            double peso = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el peso"));
            String nombre = planeta.get(pos).getNombre();
            double distancia = planeta.get(pos).getDistancia();
            nave.add(new Sonda_Espacial(material, peso, distancia, numero_nave.getText(), nombre, (double) velocidad_nave.getValue()));
        } else {
            String lugar = JOptionPane.showInputDialog(this, "Ingrese el lugar de despeje");
            String nombre = planeta.get(pos).getNombre();
            double distancia = planeta.get(pos).getDistancia();
            nave.add(new Nave_Tripulada(lugar, distancia, numero_nave.getText(), nombre, (double) velocidad_nave.getValue()));
        }
        JOptionPane.showMessageDialog(this, "Nave guardada exitosamente");
        tipo_nave.setSelectedIndex(0);
        numero_nave.setText("");
        planeta_nave.setSelectedIndex(0);
        velocidad_nave.setValue(0);
        naves.setVisible(false);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        naves.pack();
        naves.setModal(true);
        naves.setLocationRelativeTo(this);
        naves.setVisible(true);
    }//GEN-LAST:event_jButton8MouseClicked

    private void planeta_naveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_planeta_naveItemStateChanged
        if (evt.getStateChange() == 2) {
            pos = planeta_nave.getSelectedIndex();
        }
    }//GEN-LAST:event_planeta_naveItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        listar.pack();
        listar.setModal(true);
        listar.setLocationRelativeTo(this);
        listar.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        listar.setVisible(false);
    }//GEN-LAST:event_jButton12MouseClicked

    private void listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarMouseClicked
        if (evt.isMetaDown()) {
            menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listarMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (listar_planetas.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) listar_planetas.getModel();
            modelo.removeRow(listar_planetas.getSelectedRow());
            listar_planetas.setModel(modelo);
            int posi = listar_planetas.getSelectedRow();
            planetas.remove(posi);
        }
        if (listar_astronautas.getSelectedRow() >= 0) {
            int posi = listar_astronautas.getSelectedRow();
            astronautas.remove(posi);
            DefaultTableModel modelo = (DefaultTableModel) listar_astronautas.getModel();
            modelo.removeRow(listar_astronautas.getSelectedRow());
            listar_astronautas.setModel(modelo);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void listar_planetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listar_planetasMouseClicked
        if (evt.isMetaDown()) {
            menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listar_planetasMouseClicked

    private void listar_astronautasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listar_astronautasMouseClicked
        if (evt.isMetaDown()) {
            menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listar_astronautasMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (listar_planetas.getSelectedRow() >= 0) {
            pos = listar_planetas.getSelectedRow();
            modificar_planeta.pack();
            modificar_planeta.setModal(true);
            modificar_planeta.setLocationRelativeTo(this);
            modificar_planeta.setVisible(true);
        }
        if (listar_astronautas.getSelectedRow() >= 0) {
            pos = listar_planetas.getSelectedRow();
            modificar_astronauta.pack();
            modificar_astronauta.setModal(true);
            modificar_astronauta.setLocationRelativeTo(this);
            modificar_astronauta.setVisible(true);
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        String condicion;
        if (anillos_planetam.getSelectedIndex() == 0) {
            condicion = "Si";
        } else {
            condicion = "No";
        }
        planeta.get(pos).setNombre(nombre_planetam.getText());
        planeta.get(pos).setTemperatura((double) temperatura_planetam.getValue());
        planeta.get(pos).setAnillos(condicion);
        planeta.get(pos).setSuperficie(superficie_planetam.getText());
        planeta.get(pos).setDistancia((double) distancia_planetam.getValue());
        nombre_planetam.setText("");
        temperatura_planetam.setValue(0);
        anillos_planetam.setSelectedIndex(0);
        superficie_planetam.setText("");
        distancia_planetam.setValue(0);
        modificar_planeta.setVisible(false);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        String sexo;
        if (sexo_astronautam.getSelectedIndex() == 0) {
            sexo = "Femenino";
        } else {
            sexo = "Masculino";
        }
        astronautas.get(pos).setNombre(nombre_astronautam.getText());
        astronautas.get(pos).setNacionalidad(nacionalidad_astronautam.getText());
        astronautas.get(pos).setSueldo((double) sueldo_astronautam.getValue());
        astronautas.get(pos).setExperiencia((int) xp_astronautam.getValue());
        astronautas.get(pos).setSexo(sexo);
        astronautas.get(pos).setPeso((double) peso_astronautam.getValue());
        nombre_astronautam.setText("");
        nacionalidad_astronautam.setText("");
        sueldo_astronautam.setValue(0);
        xp_astronautam.setValue(0);
        sexo_astronautam.setSelectedIndex(0);
        peso_astronautam.setValue(0);
        modificar_astronauta.setVisible(false);
    }//GEN-LAST:event_jButton11MouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anillos_planeta;
    private javax.swing.JComboBox<String> anillos_planetam;
    private javax.swing.JDialog astronauta;
    private javax.swing.JSpinner distancia_planeta;
    private javax.swing.JSpinner distancia_planetam;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog listar;
    private javax.swing.JTable listar_astronautas;
    private javax.swing.JTable listar_planetas;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JDialog modificar_astronauta;
    private javax.swing.JDialog modificar_planeta;
    private javax.swing.JTextField nacionalidad_astronauta;
    private javax.swing.JTextField nacionalidad_astronautam;
    private javax.swing.JDialog naves;
    private javax.swing.JTextField nombre_astronauta;
    private javax.swing.JTextField nombre_astronautam;
    private javax.swing.JTextField nombre_planeta;
    private javax.swing.JTextField nombre_planetam;
    private javax.swing.JTextField numero_nave;
    private javax.swing.JSpinner peso_astronauta;
    private javax.swing.JSpinner peso_astronautam;
    private javax.swing.JComboBox<String> planeta_nave;
    private javax.swing.JDialog planetas;
    private javax.swing.JComboBox<String> sexo_astronauta;
    private javax.swing.JComboBox<String> sexo_astronautam;
    private javax.swing.JSpinner sueldo_astronauta;
    private javax.swing.JSpinner sueldo_astronautam;
    private javax.swing.JTextField superficie_planeta;
    private javax.swing.JTextField superficie_planetam;
    private javax.swing.JSpinner temperatura_planeta;
    private javax.swing.JSpinner temperatura_planetam;
    private javax.swing.JComboBox<String> tipo_nave;
    private javax.swing.JSpinner velocidad_nave;
    private javax.swing.JSpinner xp_astronauta;
    private javax.swing.JSpinner xp_astronautam;
    // End of variables declaration//GEN-END:variables
ArrayList<Planetas> planeta = new ArrayList();
    ArrayList<Astronautas> astronautas = new ArrayList();
    ArrayList<Naves> nave = new ArrayList();
    int pos;
}
