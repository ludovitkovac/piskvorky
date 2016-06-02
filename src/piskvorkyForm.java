
import javax.swing.JOptionPane;

//@author Ľudovít "Luigi" Kováč
public class piskvorkyForm extends javax.swing.JFrame {

    int pocitadlo;
    public static String pocitacVyhral = "Počítač vyhral!";
    public static String vyhralSi = "Vyhral si!";

    public piskvorkyForm() {
        initComponents();
    }

    public void overenie() {

        if ("0".equals(jTextField1.getText()) && "0".equals(jTextField2.getText()) && "0".equals(jTextField3.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField4.getText()) && "0".equals(jTextField5.getText()) && "0".equals(jTextField6.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField7.getText()) && "0".equals(jTextField8.getText()) && "0".equals(jTextField9.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField4.getText()) && "0".equals(jTextField7.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField2.getText()) && "0".equals(jTextField5.getText()) && "0".equals(jTextField8.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField3.getText()) && "0".equals(jTextField6.getText()) && "0".equals(jTextField9.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField5.getText()) && "0".equals(jTextField9.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("0".equals(jTextField3.getText()) && "0".equals(jTextField5.getText()) && "0".equals(jTextField7.getText())) {
            JOptionPane.showMessageDialog(this, pocitacVyhral);
            System.exit(0);
        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField2.getText()) && "X".equals(jTextField3.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField4.getText()) && "X".equals(jTextField5.getText()) && "X".equals(jTextField6.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField7.getText()) && "X".equals(jTextField8.getText()) && "X".equals(jTextField9.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField4.getText()) && "X".equals(jTextField7.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField2.getText()) && "X".equals(jTextField5.getText()) && "X".equals(jTextField8.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField3.getText()) && "X".equals(jTextField6.getText()) && "X".equals(jTextField9.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField5.getText()) && "X".equals(jTextField9.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        } else if ("X".equals(jTextField3.getText()) && "X".equals(jTextField5.getText()) && "X".equals(jTextField7.getText())) {
            JOptionPane.showMessageDialog(this, vyhralSi);
            System.exit(0);
        }

    }

    public void dopln(int pocitadlo) {

        String[] pole = {jTextField1.getText(), jTextField2.getText(), jTextField3.getText(),
            jTextField4.getText(), jTextField5.getText(), jTextField6.getText(),
            jTextField7.getText(), jTextField8.getText(), jTextField9.getText()};

        if ("X".equals(jTextField1.getText()) && "X".equals(jTextField2.getText()) && "".equals(jTextField3.getText())) {

            jTextField3.setText("0");

        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField3.getText()) && "".equals(jTextField2.getText())) {

            jTextField2.setText("0");

        } else if ("X".equals(jTextField2.getText()) && "X".equals(jTextField3.getText()) && "".equals(jTextField1.getText())) {

            jTextField1.setText("0");

        } else if ("X".equals(jTextField4.getText()) && "X".equals(jTextField5.getText()) && "".equals(jTextField6.getText())) {

            jTextField6.setText("0");

        } else if ("X".equals(jTextField4.getText()) && "X".equals(jTextField6.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("X".equals(jTextField5.getText()) && "X".equals(jTextField6.getText()) && "".equals(jTextField4.getText())) {

            jTextField4.setText("0");

        } else if ("X".equals(jTextField7.getText()) && "X".equals(jTextField8.getText()) && "".equals(jTextField9.getText())) {

            jTextField9.setText("0");

        } else if ("X".equals(jTextField7.getText()) && "X".equals(jTextField9.getText()) && "".equals(jTextField8.getText())) {

            jTextField8.setText("0");

        } else if ("X".equals(jTextField8.getText()) && "X".equals(jTextField9.getText()) && "".equals(jTextField7.getText())) {

            jTextField7.setText("0");

        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField4.getText()) && "".equals(jTextField7.getText())) {

            jTextField7.setText("0");

        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField7.getText()) && "".equals(jTextField4.getText())) {

            jTextField4.setText("0");

        } else if ("X".equals(jTextField4.getText()) && "X".equals(jTextField7.getText()) && "".equals(jTextField1.getText())) {

            jTextField1.setText("0");

        } else if ("X".equals(jTextField2.getText()) && "X".equals(jTextField5.getText()) && "".equals(jTextField8.getText())) {

            jTextField8.setText("0");

        } else if ("X".equals(jTextField2.getText()) && "X".equals(jTextField8.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("X".equals(jTextField5.getText()) && "X".equals(jTextField8.getText()) && "".equals(jTextField2.getText())) {

            jTextField2.setText("0");

        } else if ("X".equals(jTextField3.getText()) && "X".equals(jTextField6.getText()) && "".equals(jTextField9.getText())) {

            jTextField9.setText("0");

        } else if ("X".equals(jTextField3.getText()) && "X".equals(jTextField9.getText()) && "".equals(jTextField6.getText())) {

            jTextField6.setText("0");

        } else if ("X".equals(jTextField6.getText()) && "X".equals(jTextField9.getText()) && "".equals(jTextField3.getText())) {

            jTextField3.setText("0");

        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField5.getText()) && "".equals(jTextField9.getText())) {

            jTextField9.setText("0");

        } else if ("X".equals(jTextField1.getText()) && "X".equals(jTextField9.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("X".equals(jTextField5.getText()) && "X".equals(jTextField9.getText()) && "".equals(jTextField1.getText())) {

            jTextField1.setText("0");

        } else if ("X".equals(jTextField3.getText()) && "X".equals(jTextField5.getText()) && "".equals(jTextField7.getText())) {

            jTextField7.setText("0");

        } else if ("X".equals(jTextField3.getText()) && "X".equals(jTextField7.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("X".equals(jTextField5.getText()) && "X".equals(jTextField7.getText()) && "".equals(jTextField3.getText())) {

            jTextField3.setText("0");

        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField2.getText()) && "".equals(jTextField3.getText())) {

            jTextField3.setText("0");

        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField3.getText()) && "".equals(jTextField2.getText())) {

            jTextField2.setText("0");

        } else if ("0".equals(jTextField2.getText()) && "0".equals(jTextField3.getText()) && "".equals(jTextField1.getText())) {

            jTextField1.setText("0");

        } else if ("0".equals(jTextField4.getText()) && "0".equals(jTextField5.getText()) && "".equals(jTextField6.getText())) {

            jTextField6.setText("0");

        } else if ("0".equals(jTextField4.getText()) && "0".equals(jTextField6.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("0".equals(jTextField5.getText()) && "0".equals(jTextField6.getText()) && "".equals(jTextField4.getText())) {

            jTextField4.setText("0");

        } else if ("0".equals(jTextField7.getText()) && "0".equals(jTextField8.getText()) && "".equals(jTextField9.getText())) {

            jTextField9.setText("0");

        } else if ("0".equals(jTextField7.getText()) && "0".equals(jTextField9.getText()) && "".equals(jTextField8.getText())) {

            jTextField8.setText("0");

        } else if ("0".equals(jTextField8.getText()) && "0".equals(jTextField9.getText()) && "".equals(jTextField7.getText())) {

            jTextField7.setText("0");

        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField4.getText()) && "".equals(jTextField7.getText())) {

            jTextField7.setText("0");

        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField7.getText()) && "".equals(jTextField4.getText())) {

            jTextField4.setText("0");

        } else if ("0".equals(jTextField4.getText()) && "0".equals(jTextField7.getText()) && "".equals(jTextField1.getText())) {

            jTextField1.setText("0");

        } else if ("0".equals(jTextField2.getText()) && "0".equals(jTextField5.getText()) && "".equals(jTextField8.getText())) {

            jTextField8.setText("0");

        } else if ("0".equals(jTextField2.getText()) && "0".equals(jTextField8.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("0".equals(jTextField5.getText()) && "0".equals(jTextField8.getText()) && "".equals(jTextField2.getText())) {

            jTextField2.setText("0");

        } else if ("0".equals(jTextField3.getText()) && "0".equals(jTextField6.getText()) && "".equals(jTextField9.getText())) {

            jTextField9.setText("0");

        } else if ("0".equals(jTextField3.getText()) && "0".equals(jTextField9.getText()) && "".equals(jTextField6.getText())) {

            jTextField6.setText("0");

        } else if ("0".equals(jTextField6.getText()) && "0".equals(jTextField9.getText()) && "".equals(jTextField3.getText())) {

            jTextField3.setText("0");

        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField5.getText()) && "".equals(jTextField9.getText())) {

            jTextField9.setText("0");

        } else if ("0".equals(jTextField1.getText()) && "0".equals(jTextField9.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("0".equals(jTextField5.getText()) && "0".equals(jTextField9.getText()) && "".equals(jTextField1.getText())) {

            jTextField1.setText("0");

        } else if ("0".equals(jTextField3.getText()) && "0".equals(jTextField5.getText()) && "".equals(jTextField7.getText())) {

            jTextField7.setText("0");

        } else if ("0".equals(jTextField3.getText()) && "0".equals(jTextField7.getText()) && "".equals(jTextField5.getText())) {

            jTextField5.setText("0");

        } else if ("0".equals(jTextField5.getText()) && "0".equals(jTextField7.getText()) && "".equals(jTextField3.getText())) {

            jTextField3.setText("0");

        } else {

            for (int i = 0; i < 9; i++) {

                if ("X".equals(pole[i])) {

                } else if ("0".equals(pole[i])) {

                } else {

                    switch (i) {

                        case 0:

                            if (pocitadlo == 0) {

                                jTextField1.setText("0");

                            }
                            pocitadlo++;
                            break;
                        case 1:
                            if (pocitadlo == 0) {
                                jTextField2.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 2:
                            if (pocitadlo == 0) {
                                jTextField3.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 3:
                            if (pocitadlo == 0) {
                                jTextField4.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 4:
                            if (pocitadlo == 0) {
                                jTextField5.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 5:
                            if (pocitadlo == 0) {
                                jTextField6.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 6:
                            if (pocitadlo == 0) {

                                jTextField7.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 7:
                            if (pocitadlo == 0) {
                                jTextField8.setText("0");
                            }
                            pocitadlo++;
                            break;
                        case 8:
                            if (pocitadlo == 0) {
                                jTextField9.setText("0");
                            }
                            pocitadlo++;

                    }

                }

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed

    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();

    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("X");

        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        if (jTextField4.getText().equals("")) {
            jTextField4.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        if (jTextField5.getText().equals("")) {
            jTextField5.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        if (jTextField6.getText().equals("")) {
            jTextField6.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        if (jTextField7.getText().equals("")) {
            jTextField7.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        if (jTextField8.getText().equals("")) {
            jTextField8.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        if (jTextField9.getText().equals("")) {
            jTextField9.setText("X");
        } else {

        }
        overenie();
        dopln(0);
        overenie();
    }//GEN-LAST:event_jTextField9MouseClicked

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
            java.util.logging.Logger.getLogger(piskvorkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(piskvorkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(piskvorkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piskvorkyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new piskvorkyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
