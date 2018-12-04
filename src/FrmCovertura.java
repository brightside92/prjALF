/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import Structures.*;
import java.awt.Panel;
import javax.swing.ImageIcon;

public class FrmCovertura extends javax.swing.JFrame {

    /**
     * Creates new form FrmCovertura
     */
    public FrmCovertura() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        postMatrix = new javax.swing.JTable();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        transitionsCounter = new javax.swing.JSpinner();
        placesCounter = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        preMatrix = new javax.swing.JTable();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        m0Matrix = new javax.swing.JTable();
        label5 = new java.awt.Label();
        createPNGraph = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();

        org.jdesktop.layout.GroupLayout jFrame1Layout = new org.jdesktop.layout.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrmCovertura");
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PN Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        postMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "0", "0"},
                {"1", "1", "0"},
                {"0", "1", "1"}
            },
            new String [] {
                "t0", "t1", "t2"
            }
        ));
        postMatrix.setRowHeight(18);
        postMatrix.getTableHeader().setResizingAllowed(false);
        postMatrix.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(postMatrix);

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("TRANSITIONS");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("PLACES");

        transitionsCounter.setModel(new javax.swing.SpinnerNumberModel(3, 1, null, 1));
        transitionsCounter.setValue(3);
        transitionsCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                transitionsCounterStateChanged(evt);
            }
        });

        placesCounter.setModel(new javax.swing.SpinnerNumberModel(3, 1, null, 1));
        placesCounter.setValue(3);
        placesCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                placesCounterStateChanged(evt);
            }
        });

        preMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "0"},
                {"0", "0", "1"},
                {"0", "0", "1"}
            },
            new String [] {
                "t0", "t1", "t2"
            }
        ));
        preMatrix.setRowHeight(18);
        preMatrix.getTableHeader().setResizingAllowed(false);
        preMatrix.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(preMatrix);

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("PRE MATRIX");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("POST MATRIX");

        m0Matrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1"},
                {"0"},
                {"0"}
            },
            new String [] {
                "MARKING"
            }
        ));
        m0Matrix.setRowHeight(18);
        m0Matrix.getTableHeader().setResizingAllowed(false);
        m0Matrix.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(m0Matrix);

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("INIT. MARKING");

        createPNGraph.setText("Create PN Graph");
        createPNGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPNGraphActionPerformed(evt);
            }
        });

        jButton2.setText("Clear PN Config.");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(label2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(transitionsCounter)
                            .add(placesCounter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, createPNGraph, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(40, 40, 40)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 208, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 208, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(transitionsCounter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(placesCounter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(label2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(createPNGraph))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(label3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(label4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(label5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PN Graph", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        org.jdesktop.layout.GroupLayout panel1Layout = new org.jdesktop.layout.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout panel2Layout = new org.jdesktop.layout.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 531, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 578, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Pre_Matrix");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Set columns width in preMatrix and postMatrix tables
        updateColumnWidth();
        transitionsCounter.setValue(3);
        placesCounter.setValue(3);

    }//GEN-LAST:event_formComponentShown

    private void transitionsCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_transitionsCounterStateChanged
        // Add remove transitions (columns) to the tables.
        int colVal = Integer.parseInt(transitionsCounter.getValue().toString());
        int nCol = preMatrix.getColumnModel().getColumnCount();
        TableColumn tcolPre = new TableColumn();
        TableColumn tcolPost = new TableColumn();
        DefaultTableModel preMatrixModel = (DefaultTableModel) preMatrix.getModel();
        DefaultTableModel postMatrixModel = (DefaultTableModel) postMatrix.getModel();

        nCol = (nCol < 1) ? 1 : nCol;

        if (nCol < colVal) { //Agregar Columnas
            preMatrixModel.addColumn("t" + (nCol));
            postMatrixModel.addColumn("t" + (nCol));

            for (int i = 0; i < preMatrixModel.getRowCount(); i++) {
                preMatrixModel.setValueAt("0", i, preMatrixModel.getColumnCount() - 1);
                postMatrixModel.setValueAt("0", i, preMatrixModel.getColumnCount() - 1);
            }
        } else if (nCol > colVal) { //Remover Columnas            
            removeColumn(nCol - 1, preMatrix);
            removeColumn(nCol - 1, postMatrix);
        }
        updateColumnWidth();
    }//GEN-LAST:event_transitionsCounterStateChanged

    private void placesCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_placesCounterStateChanged
        // Add remove places (rows) to the tables.
        int rowVal = Integer.parseInt(placesCounter.getValue().toString());
        int nRow = preMatrix.getModel().getRowCount();

        nRow = (nRow < 1) ? 1 : nRow;

        if (nRow < rowVal) { //Agregar Columnas
            DefaultTableModel model = (DefaultTableModel) preMatrix.getModel();
            model.addRow(new Object[]{});

            for (int i = 0; i < model.getColumnCount(); i++) {
                model.setValueAt("0", model.getRowCount() - 1, i);
            }

            model = (DefaultTableModel) postMatrix.getModel();
            model.addRow(new Object[]{});

            for (int i = 0; i < model.getColumnCount(); i++) {
                model.setValueAt("0", model.getRowCount() - 1, i);
            }

            model = (DefaultTableModel) m0Matrix.getModel();
            model.addRow(new Object[]{});

            model.setValueAt("0", model.getRowCount() - 1, 0);

        } else if (nRow > rowVal) { //Remover Columnas            
            removeRows(nRow - 1, preMatrix);
            removeRows(nRow - 1, postMatrix);
            removeRows(nRow - 1, m0Matrix);
        }

        updateColumnWidth();
    }//GEN-LAST:event_placesCounterStateChanged

    private void createPNGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPNGraphActionPerformed
        // Initializes Petry Network Object called "pn": Do not modify.
        petryNetwork pn = new petryNetwork(Integer.parseInt(placesCounter.getValue().toString()),
                Integer.parseInt(transitionsCounter.getValue().toString()));

        int nRows = Integer.parseInt(placesCounter.getValue().toString());
        int nCols = Integer.parseInt(transitionsCounter.getValue().toString());

        //Loads the preMatrix  data onto the pn object: Do not modify.
        for (int colIndex = 0; colIndex < nCols; colIndex++) {
            for (int rowIndex = 0; rowIndex < nRows; rowIndex++) {
                int value = Integer.parseInt(preMatrix.getValueAt(rowIndex, colIndex).toString());
                pn.setPreValue(rowIndex, colIndex, value);
            }
        }
        //Loads the postMatrix  data onto the pn object: Do not modify.
        for (int colIndex = 0; colIndex < nCols; colIndex++) {
            for (int rowIndex = 0; rowIndex < nRows; rowIndex++) {
                int value = Integer.parseInt(postMatrix.getValueAt(rowIndex, colIndex).toString());
                pn.setPostValue(rowIndex, colIndex, value);
            }
        }
        //Loads the inital marking (m0) data onto the pn object: Do not modify.      
        for (int rowIndex = 0; rowIndex < nRows; rowIndex++) {
            int value = Integer.parseInt(m0Matrix.getValueAt(rowIndex, 0).toString());
            pn.setm0(rowIndex, value);
        }
        //Print loaded data for debugging puposes: Do not modify.
        pn.printPreMatrix();
        pn.printPostMatrix();
        pn.printm0Matrix();
        pn.printIncidenceMatrix();
        // Drop additional code down below ... //
        Graph gcover = pn.getCoverGraph();    
        
        makeGraph(pn.getPre(), pn.getPost());
        makeCoverGraph(gcover);
        
        
        
    }//GEN-LAST:event_createPNGraphActionPerformed
    public void makeCoverGraph(Graph gcover) {
        System.out.println(""+gcover.getNodes().size());
        
        String nombreArchivo = "CoverGraph";
        String content = "digraph CoverGraph          {\n"
                //+ "rankdir=LR;"
                + //girar a la derecha
                //"# page = \"8.2677165,11.692913\" ;\n" +
                "ratio = \"auto\" ;\n"
                + "mincross = 6.0 ;\n";

        for(int i=0;i<gcover.getNodes().size();i++){
            content = content + "\"" + gcover.getNodes().get(i).getMarkString() + "\" [shape=box,label=\"" + gcover.getNodes().get(i).getMarkString() + "\",height=.1,width=.1] ;\n";
        }
        
        for(int i=0;i<gcover.getNodes().size();i++){
            //System.out.println(""+gcover.getNodes().get(i).getParent().getMarkString()+"->"+gcover.getNodes().get(i).getMarkString()+"sda");           
            for(int j=0;j<gcover.getNodes().get(i).getTransitions().size();j++){
                //System.out.println(""+gcover.getNodes().get(i).getMarkString()+"->"+gcover.getNodes().get(i).getTransitions().get(j).getEnd().getMarkString()+" : "+gcover.getNodes().get(i).getTransitions().get(j).getId());
                content = content + "\"" + gcover.getNodes().get(i).getMarkString() + "\" -> \"" + gcover.getNodes().get(i).getTransitions().get(j).getEnd().getMarkString() + "\" [dir=normal,weight=1,label = \""+gcover.getNodes().get(i).getTransitions().get(j).getId()+"\"] ;\n";
            }
        }
              
        content = content + "}";
        //System.out.print(content);
        FileUtils.write(nombreArchivo, content, "txt");
        FileUtils.generateImg(nombreArchivo, "png");

        //new GraphFrame(nombreArchivo);
        panel2.removeAll();
        panel2.add(new GraphJPanel("CoverGraph",panel2.getWidth(),panel2.getHeight()));
        panel2.repaint();
        
    }
    public void makeGraph(int[][] mpre, int[][] mpost) {
        String nombreArchivo = "PetriNetwork";
        String content = "digraph PetriNetwork          {\n"
                + "rankdir=LR;"
                + //girar a la derecha
                //"# page = \"8.2677165,11.692913\" ;\n" +
                "ratio = \"auto\" ;\n"
                + "mincross = 6.0 ;\n";

        int[][] pre = mpre;
        int[][] post = mpost;

        for (int i = 0; i < pre.length; i++) {
            //Se instancias las P
            content = content + "\"P" + (i) + "\" [shape=circle  , regular=1,style=filled,fillcolor=white] ;\n";
        }
        for (int i = 0; i < pre[0].length; i++) {
            //Se instancias las T
            content = content + "\"t" + (i) + "\" [shape=box,label=\"t" + (i) + "\",height=.1,width=.1] ;\n";
        }
        for (int i = 0; i < pre.length; i++) {
            //Se Instancian las P
            for (int j = 0; j < pre[0].length; j++) {
                //Se generan las transiciones
                if (pre[i][j] == 1) {//de P's  a T's
                    content = content + "\"P" + (i) + "\" -> \"t" + (j) + "\" [dir=normal,weight=1] ;\n";
                }
                if (post[i][j] == 1) {//de T's  a P's
                    content = content + "\"t" + (j) + "\" -> \"P" + (i) + "\" [dir=normal,weight=1] ;\n";
                }
            }
        }
        content = content + "}";
        //System.out.print(content);
        FileUtils.write(nombreArchivo, content, "txt");
        FileUtils.generateImg(nombreArchivo, "png");

        //new GraphFrame(nombreArchivo);
        panel1.removeAll();
        panel1.add(new GraphJPanel("PetriNetwork",panel1.getWidth(),panel1.getHeight()));
        panel1.repaint();
    }

    private void updateColumnWidth() {
        TableColumn column;
        for (int i = 0; i < this.preMatrix.getColumnModel().getColumnCount(); i++) {
            column = this.preMatrix.getColumnModel().getColumn(i);
            column.setMaxWidth(30);
            column = this.postMatrix.getColumnModel().getColumn(i);
            column.setMaxWidth(30);
        }
        preMatrix.updateUI();
        postMatrix.updateUI();
    }

    private void removeColumn(int index, JTable myTable) {
        int nRow = myTable.getRowCount();
        int nCol = myTable.getColumnCount();

        if ((nCol > 0)) {
            Object[][] cells = new Object[Integer.parseInt(placesCounter.getValue().toString())][nCol - 1];
            String[] names = new String[nCol - 1];

            for (int j = 0; j < nCol - 1; j++) {
                names[j] = myTable.getColumnModel().getColumn(j).getHeaderValue().toString();
                for (int i = 0; i < nRow; i++) {
                    cells[i][j] = myTable.getValueAt(i, j);
                }
            }

            DefaultTableModel newModel = new DefaultTableModel(cells, names);
            myTable.setModel(newModel);
        }
    }

    private void removeRows(int index, JTable myTable) {
        int nRow = myTable.getRowCount();
        int nCol = myTable.getColumnCount();

        if (nRow > 0) {
            Object[][] cells = new Object[Integer.parseInt(placesCounter.getValue().toString())][nCol];
            String[] names = new String[nCol];

            for (int j = 0; j < nCol; j++) {
                names[j] = myTable.getColumnModel().getColumn(j).getHeaderValue().toString();
                for (int i = 0; i < nRow - 1; i++) {
                    cells[i][j] = myTable.getValueAt(i, j);
                }
            }

            DefaultTableModel newModel = new DefaultTableModel(cells, names);
            myTable.setModel(newModel);
        }
    }

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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCovertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCovertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCovertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCovertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCovertura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPNGraph;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTable m0Matrix;
    public static java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JSpinner placesCounter;
    private javax.swing.JTable postMatrix;
    private javax.swing.JTable preMatrix;
    private javax.swing.JSpinner transitionsCounter;
    // End of variables declaration//GEN-END:variables
}
