
package computer_shop;

import java.sql.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frame3 extends javax.swing.JFrame {

    public Connection cn;

    public frame3() {
        initComponents();
        Connect();
    }
    
    Connection con;
    PreparedStatement me;
    ResultSet rs;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/comshop","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        comp2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        comp5 = new javax.swing.JRadioButton();
        comp3 = new javax.swing.JRadioButton();
        comp4 = new javax.swing.JRadioButton();
        comp1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        tier = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        card = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        age1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        reemove = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        minutes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMPUTER SHOP");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("KALIYAN'S COMPUTER SHOP");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comp2.setText("Computer 2");
        comp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Please select an option");

        comp5.setText("Computer 5");
        comp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp5ActionPerformed(evt);
            }
        });

        comp3.setText("Computer 3");
        comp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp3ActionPerformed(evt);
            }
        });

        comp4.setText("Computer 4");
        comp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp4ActionPerformed(evt);
            }
        });

        comp1.setText("Computer 1");
        comp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comp1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(comp3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(comp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comp3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comp5)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  " ", "Regular", "Silver", "Gold", "Platinum", "Diamond" }));
        tier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierActionPerformed(evt);
            }
        });

        jLabel6.setText("Choose a tier:");

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Kaliyan's card?");

        jLabel5.setText("Age:");

        card.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Yes", "No" }));

        jLabel3.setText("Please fillup");

        jLabel4.setText("Name:");

        jLabel7.setText("Do you have ");

        reemove.setText("Remove");
        reemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemoveActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tier, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(reemove))
                .addGap(16, 16, 16)
                .addComponent(add)
                .addContainerGap())
        );

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesActionPerformed(evt);
            }
        });

        jLabel9.setText("Number of minutes:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Id:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(exit)
                                .addGap(28, 28, 28)
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(clear)
                                .addGap(35, 35, 35)
                                .addComponent(next)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(exit)
                    .addComponent(back)
                    .addComponent(clear))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Queue<Task> taskQueue = new LinkedList<>();

    private void add() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

private class Task {
        String operation;
        String id;
        
        public Task(String operation, String id) {
            this.operation = operation;
            this.id = id;
        }
    }

    private void comp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp1ActionPerformed
        // TODO add your handling code here:
        if (comp1.isSelected())
        comp2.setSelected(false);
        comp3.setSelected(false);
        comp4.setSelected(false);
        comp5.setSelected(false);
    }//GEN-LAST:event_comp1ActionPerformed

    private void comp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp3ActionPerformed
        // TODO add your handling code here:
                if (comp3.isSelected())
        comp2.setSelected(false);
        comp1.setSelected(false);
        comp4.setSelected(false);
        comp5.setSelected(false);
    }//GEN-LAST:event_comp3ActionPerformed

    private void comp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp5ActionPerformed
        // TODO add your handling code here:
                if (comp5.isSelected())
        comp2.setSelected(false);
        comp3.setSelected(false);
        comp4.setSelected(false);
        comp1.setSelected(false);
    }//GEN-LAST:event_comp5ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        name1.setText("");
        age1.setText("");
        minutes.setText("");
        tier.setSelectedItem(null);
        card.setSelectedItem(null);
        comp5.setSelected(false);
        comp2.setSelected(false);
        comp3.setSelected(false);
        comp4.setSelected(false);
        comp1.setSelected(false);
    }//GEN-LAST:event_clearActionPerformed

    private void comp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp2ActionPerformed
        // TODO add your handling code here:
        if (comp2.isSelected())
        comp1.setSelected(false);
        comp3.setSelected(false);
        comp4.setSelected(false);
        comp5.setSelected(false);
    }//GEN-LAST:event_comp2ActionPerformed

    private void comp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp4ActionPerformed
        // TODO add your handling code here:
        if (comp4.isSelected())
        comp2.setSelected(false);
        comp3.setSelected(false);
        comp1.setSelected(false);
        comp5.setSelected(false);
    }//GEN-LAST:event_comp4ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
double Regular = 15;
double Silver = 18;
double Gold = 20;
double Platinum = 22;
double Diamond = 30;
double discount = 0.05;
double total = 0.0;
double totalCost = 0.0;
double all = 0.0;

try {
    String Name = name1.getText();
    int Minutes = Integer.parseInt(minutes.getText());
    String Tier = tier.getSelectedItem().toString();
    
    if (Tier.equals("Regular")) {
        total = Regular * (Minutes / 60.0);
    } else if (Tier.equals("Silver")) {
        total = Silver * (Minutes / 60.0);
    } else if (Tier.equals("Gold")) {
        total = Gold * (Minutes / 60.0);
    } else if (Tier.equals("Platinum")) {
        total = Platinum * (Minutes / 60.0);
    } else if (Tier.equals("Diamond")) {
        total = Diamond * (Minutes / 60.0);
    }
    
    String Card = card.getSelectedItem().toString();
    if (Card.equals("Yes")) {
        totalCost = total * discount;
        all = total - totalCost;
    } else if (Tier.equals("No")) {
        all = total;
    }
    
    boolean Computer1 = comp1.isSelected();
    boolean Computer2 = comp2.isSelected();
    boolean Computer3 = comp3.isSelected();
    boolean Computer4 = comp4.isSelected();
    boolean Computer5 = comp5.isSelected();
    
    new frame4(Name, Minutes, Tier, Computer1, Computer2, Computer3, Computer4, Computer5, total, all).setVisible(true);
    
} catch (Exception e) {
    e.printStackTrace();
}
        dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        frame2 f2 = new frame2();
        f2.show();
        
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void minutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutesActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void tierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tierActionPerformed
private void addTaskToQueue(String operation, String id) {
        Task task = new Task(operation, id);
        taskQueue.offer(task);
    }

private void processQueue() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            if (task != null) {
                switch (task.operation) {
                    case "ADD":
                        // Process add operation
                        // You can call your existing add method here
                        add();
                        break;
                    case "UPDATE":
                        // Process update operation
                        // You can call your existing update method here
                        update();
                        break;
                    // Add more cases for other operations if needed
                }
            }
        }
    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        addTaskToQueue("ADD", txtid.getText());
    String Name = name1.getText();
    int Age = Integer.parseInt(age1.getText());
    int Minutes = Integer.parseInt(minutes.getText());
    String Tier = tier.getSelectedItem().toString();
    String Card = card.getSelectedItem().toString();
    boolean Computer1 = comp1.isSelected();
    boolean Computer2 = comp2.isSelected();
    boolean Computer3 = comp3.isSelected();
    boolean Computer4 = comp4.isSelected();
    boolean Computer5 = comp5.isSelected();

        try {
            me = con.prepareStatement("INSERT INTO comptable(Name, Age, Computer1, Computer2, Computer3, Computer4, Computer5, Minutes, Tier, Card) VALUES(?,?,?,?,?,?,?,?,?,?)");
            me.setString(1, Name);
            me.setInt(2, Age);
            me.setBoolean(3, Computer1);
            me.setBoolean(4, Computer2);
            me.setBoolean(5, Computer3);
            me.setBoolean(6, Computer4);
            me.setBoolean(7, Computer5);
            me.setInt(8, Minutes);
            me.setString(9, Tier);
            me.setString(10, Card);
            
            int k=me.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Your data is now added!");
               
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        addTaskToQueue("UPDATE", txtid.getText());
    String Name = name1.getText();
    int Age = Integer.parseInt(age1.getText());
    int Minutes = Integer.parseInt(minutes.getText());
    String Tier = tier.getSelectedItem().toString();
    String Card = card.getSelectedItem().toString();
    boolean Computer1 = comp1.isSelected();
    boolean Computer2 = comp2.isSelected();
    boolean Computer3 = comp3.isSelected();
    boolean Computer4 = comp4.isSelected();
    boolean Computer5 = comp5.isSelected();
    String Id = txtid.getText();

    
        try {
            me = con.prepareStatement("UPDATE comptable set Name=?, Age=?, Computer1=?, Computer2=?, Computer3=?, Computer4=?, Computer5=?, Minutes=?, Tier=?, Card=? WHERE id=?");
            me.setString(1, Name);
            me.setInt(2, Age);
            me.setBoolean(3, Computer1);
            me.setBoolean(4, Computer2);
            me.setBoolean(5, Computer3);
            me.setBoolean(6, Computer4);
            me.setBoolean(7, Computer5);
            me.setInt(8, Minutes);
            me.setString(9, Tier);
            me.setString(10, Card);
            me.setString(11, Id);
            
            int k=me.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Your data is now updated!");
               
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void reemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemoveActionPerformed
        // TODO add your handling code here:
        String Id = txtid.getText();
        try {
            me = con.prepareStatement("DELETE FROM comptable WHERE id=?");
            me.setString(1, Id);
            
            int k=me.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Your data is now removed!");
               
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reemoveActionPerformed

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
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame3().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField age1;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> card;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton comp1;
    private javax.swing.JRadioButton comp2;
    private javax.swing.JRadioButton comp3;
    private javax.swing.JRadioButton comp4;
    private javax.swing.JRadioButton comp5;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField minutes;
    private javax.swing.JTextField name1;
    private javax.swing.JButton next;
    private javax.swing.JButton reemove;
    private javax.swing.JComboBox<String> tier;
    private javax.swing.JTextField txtid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
