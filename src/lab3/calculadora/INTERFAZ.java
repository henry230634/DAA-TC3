
package lab3.calculadora;

import java.util.Stack;
import javax.swing.JOptionPane;

public class INTERFAZ extends javax.swing.JFrame {

    private String buffer = "";
    private String aux = "";
    private final Stack<String> PILA = new Stack<>();
    Calculadora Calculadora;

    public String getBuffer() {
        return buffer;
    }

    public void setBuffer(String buffer) {
        this.buffer = buffer;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }
    
    public char vector[];
    public INTERFAZ() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_borrarTodo = new javax.swing.JButton();
        btn_borrarAnt = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_factorial = new javax.swing.JButton();
        btn_potencia = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        txt_display = new javax.swing.JTextField();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        btn_1.setBackground(new java.awt.Color(51, 51, 51));
        btn_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(51, 51, 51));
        btn_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(51, 51, 51));
        btn_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_borrarTodo.setBackground(new java.awt.Color(255, 102, 102));
        btn_borrarTodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrarTodo.setText("C");
        btn_borrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarTodoActionPerformed(evt);
            }
        });

        btn_borrarAnt.setBackground(new java.awt.Color(255, 102, 102));
        btn_borrarAnt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrarAnt.setText("CE");
        btn_borrarAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarAntActionPerformed(evt);
            }
        });

        btn_suma.setBackground(new java.awt.Color(51, 51, 51));
        btn_suma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(51, 51, 51));
        btn_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(51, 51, 51));
        btn_6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(51, 51, 51));
        btn_5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_factorial.setBackground(new java.awt.Color(51, 51, 51));
        btn_factorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_factorial.setForeground(new java.awt.Color(255, 255, 255));
        btn_factorial.setText("!");
        btn_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factorialActionPerformed(evt);
            }
        });

        btn_potencia.setBackground(new java.awt.Color(51, 51, 51));
        btn_potencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_potencia.setForeground(new java.awt.Color(255, 255, 255));
        btn_potencia.setText("^");
        btn_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potenciaActionPerformed(evt);
            }
        });

        btn_resta.setBackground(new java.awt.Color(51, 51, 51));
        btn_resta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        txt_display.setBackground(new java.awt.Color(153, 204, 0));
        txt_display.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        btn_8.setBackground(new java.awt.Color(51, 51, 51));
        btn_8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(51, 51, 51));
        btn_7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(51, 51, 51));
        btn_9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_igual.setBackground(new java.awt.Color(51, 51, 51));
        btn_igual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_multiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        btn_multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicacion.setText("*");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_division.setBackground(new java.awt.Color(51, 51, 51));
        btn_division.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_division.setForeground(new java.awt.Color(255, 255, 255));
        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(51, 51, 51));
        btn_0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(153, 153, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setText("back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_display, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(btn_borrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_borrarAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_resta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_suma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_multiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_division, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txt_display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrarAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txt_display.setText(getBuffer()+"1");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txt_display.setText(getBuffer()+"2");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txt_display.setText(getBuffer()+"3");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        txt_display.setText(getBuffer()+"4");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txt_display.setText(getBuffer()+"5");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txt_display.setText(getBuffer()+"6");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txt_display.setText(getBuffer()+"7");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txt_display.setText(getBuffer()+"8");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        txt_display.setText(getBuffer()+"9");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txt_display.setText(getBuffer()+"0");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_borrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarTodoActionPerformed
        setAux(buffer);
        txt_display.setText("");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_borrarTodoActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        txt_display.setText(getBuffer()+"+");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        txt_display.setText(getBuffer()+"-");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        txt_display.setText(getBuffer()+"*");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        txt_display.setText(getBuffer()+"/");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_potenciaActionPerformed
        txt_display.setText(getBuffer()+"^");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_potenciaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        if (buffer.isEmpty()|| buffer.charAt(buffer.length() - 1) == '+'|| buffer.charAt(buffer.length() - 1) == '-'
         || buffer.charAt(buffer.length() - 1) == '*'|| buffer.charAt(buffer.length() - 1) == '/'
         || buffer.charAt(buffer.length() - 1) == '^') {
            JOptionPane.showMessageDialog(null, "Error: Expresión incompleta\nNo puede terminar con operador");
            return;
        }
        try {
            double resultado = Calculadora.evaluar(buffer);
            setAux(buffer);
            setBuffer(String.valueOf(resultado));
            txt_display.setText(getBuffer());
            PILA.push(getBuffer());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la expresión: " + e.getMessage());
            setBuffer(""); 
            txt_display.setText(getBuffer());
            PILA.push(getBuffer());
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_borrarAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarAntActionPerformed
        setAux(buffer);
        setBuffer(getBuffer().substring(0, buffer.length()-1));
        txt_display.setText(getBuffer());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_borrarAntActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        if(PILA.isEmpty()){
            setBuffer("");
        }else{
            setBuffer(PILA.peek());
            PILA.pop();
        }
        txt_display.setText(getBuffer());
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_factorialActionPerformed
        txt_display.setText(getBuffer()+"!");
        setBuffer(txt_display.getText());
        PILA.push(getBuffer());
    }//GEN-LAST:event_btn_factorialActionPerformed

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
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFAZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_borrarAnt;
    private javax.swing.JButton btn_borrarTodo;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_factorial;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_potencia;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_display;
    // End of variables declaration//GEN-END:variables
}
