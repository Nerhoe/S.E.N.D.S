//user_insert
package GUI_Forms;
import java.time.LocalDate;
import Functions.Log_in;
import SQL_Conn.DFTs;
import SQL_Conn.DatabaseConnectionInnit;
import SQL_Conn.SQL_Conn;
import java.awt.Color;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
public class User_Admin_Panel extends javax.swing.JFrame {
    Log_in log = new Log_in();
    SQL_Conn db_conn = new SQL_Conn();
    DatabaseConnectionInnit db_in = new DatabaseConnectionInnit();
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    Log_in lin = new Log_in();
    DFTs tablemodel = new DFTs();
    DefaultTableModel dft = tablemodel.lists("", "");
    ButtonGroup bg = new ButtonGroup();
    public User_Admin_Panel() {
        initComponents();
        DATE.setText(("" + LocalDate.now()));
        label2.setText(Log_in.getC_Name());
        bg.add(Date);
        bg.add(Name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        haha2 = new javax.swing.JPanel();
        haha1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        haha3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        del = new javax.swing.JButton();
        search_Date = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        search_proName = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hahaha2 = new javax.swing.JLabel();
        hahaha1 = new javax.swing.JLabel();
        hahaha = new javax.swing.JLabel();
        run_total_sales = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        search_ = new javax.swing.JTextField();
        hahaha4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        Name = new javax.swing.JRadioButton();
        Date = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        light = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVENTORY SYSTEM_ADMIN");
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        haha2.setBackground(new java.awt.Color(102, 102, 102));

        haha1.setBackground(new java.awt.Color(19, 35, 44));

        DATE.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        DATE.setForeground(new java.awt.Color(255, 255, 255));
        DATE.setText("DD/MM/YYYY");

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("WELCOME:");

        label2.setFont(new java.awt.Font("Sitka Banner", 2, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("@User!01.");

        javax.swing.GroupLayout haha1Layout = new javax.swing.GroupLayout(haha1);
        haha1.setLayout(haha1Layout);
        haha1Layout.setHorizontalGroup(
            haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haha1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DATE)
                .addGap(18, 18, 18))
        );
        haha1Layout.setVerticalGroup(
            haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haha1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(label2))
                    .addComponent(DATE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        haha3.setBackground(new java.awt.Color(2, 39, 60));
        haha3.setForeground(new java.awt.Color(255, 255, 255));
        haha3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                haha3KeyReleased(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setDoubleBuffered(true);

        jTable1.setBackground(new java.awt.Color(204, 212, 230));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jTable1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jTable1.setModel(dft
        );
        jTable1.setFocusable(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        del.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        search_Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_DateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_DateMouseExited(evt);
            }
        });

        label3.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("DATE:");

        label4.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("PRODUCT NAME:");

        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hahaha2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        hahaha2.setForeground(new java.awt.Color(255, 255, 255));
        hahaha2.setText("NOTE!: UPDATE|| CLICK THE DESIRED ROW, ENTER THE VALUE THEN CLICK THE UPDATE BUTTON TO UPDATE ");

        hahaha1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        hahaha1.setForeground(new java.awt.Color(255, 255, 255));
        hahaha1.setText("NOTE!: DELETE|| CLICK THE DESIRED ROW, CLCIK THE DELETE BUTTON TO DELETE IT FROM THE TABLE ");

        hahaha.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        hahaha.setForeground(new java.awt.Color(255, 255, 255));
        hahaha.setText("YYYY/MM/DD");

        run_total_sales.setText("TOTAL SALES");
        run_total_sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                run_total_salesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                run_total_salesMouseReleased(evt);
            }
        });
        run_total_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_total_salesActionPerformed(evt);
            }
        });

        total.setFocusable(false);

        search_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_MouseExited(evt);
            }
        });

        hahaha4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        hahaha4.setForeground(new java.awt.Color(255, 255, 255));
        hahaha4.setText("NOTE!: THIS SHOW THE TOTAL SALES , TO USE THIS SIMPLY INPUT DATE OR PRODUCT TAHT YOU WNAT TO FIND AND HOLD SEARCH TO VIEW");

        label5.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("VALUE:");

        label6.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("WHAT:");

        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("PRODUCT NAME");
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("DATE");

        javax.swing.GroupLayout haha3Layout = new javax.swing.GroupLayout(haha3);
        haha3.setLayout(haha3Layout);
        haha3Layout.setHorizontalGroup(
            haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(haha3Layout.createSequentialGroup()
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(haha3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label3)
                        .addGap(18, 18, 18)
                        .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(haha3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(hahaha))
                            .addGroup(haha3Layout.createSequentialGroup()
                                .addComponent(search_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_proName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(search))))
                    .addGroup(haha3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hahaha4)
                            .addGroup(haha3Layout.createSequentialGroup()
                                .addComponent(label6)
                                .addGap(14, 14, 14)
                                .addComponent(Date)
                                .addGap(18, 18, 18)
                                .addComponent(Name)
                                .addGap(38, 38, 38)
                                .addComponent(label5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search_, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(run_total_sales)
                                .addGap(18, 18, 18)
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))))
                .addGap(38, 38, 38))
            .addGroup(haha3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hahaha2))
                .addGap(81, 81, 81)
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hahaha1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        haha3Layout.setVerticalGroup(
            haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, haha3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(search_proName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addComponent(hahaha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hahaha4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(run_total_sales)
                        .addComponent(search_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5)
                        .addComponent(label6)
                        .addComponent(Date)
                        .addComponent(Name)))
                .addGap(18, 18, 18)
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hahaha1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hahaha2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(haha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jScrollPane2.setViewportView(haha3);

        javax.swing.GroupLayout haha2Layout = new javax.swing.GroupLayout(haha2);
        haha2.setLayout(haha2Layout);
        haha2Layout.setHorizontalGroup(
            haha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
        );
        haha2Layout.setVerticalGroup(
            haha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haha2Layout.createSequentialGroup()
                .addComponent(haha1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 51));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 51));

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setText("  Settings");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenu3.setText("ACCOUNT MANAGER");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu3MouseEntered(evt);
            }
        });

        jMenu13.setText("MODIFY ACCOUNT");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu13);

        jMenu14.setText("DELETE ACCOUNT");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu14);

        jMenu1.add(jMenu3);

        jMenu12.setText("LOG_OUT");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu12);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("  Show Table");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText(" INSERT ");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu6.setText("REFRESH");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu6MouseEntered(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);
        jMenuBar1.add(jMenu5);

        jMenu7.setText("                                                                                                  ");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("themes");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });

        light.setText("LIGHT MODE");
        light.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lightMouseClicked(evt);
            }
        });
        jMenu8.add(light);

        jMenu10.setText("LEMON MODE");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu8.add(jMenu10);

        jMenu9.setText("CANDY MODE");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu8.add(jMenu9);

        jMenu11.setText("DEFAULT");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu8.add(jMenu11);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
int choice = JOptionPane.showConfirmDialog(this, "You are about to be LOGOUT as an ADMIN\n and will be directed to the TABLE VIEW\n\n ARE YOU SURE?", "TABLE VIEW",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    
    if(choice == JOptionPane.YES_OPTION)
    {
        new User_TableView_Panel().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
         new User_Insert().setVisible(true);
         
    }//GEN-LAST:event_jMenu4MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        lin.setSearchInputA(search_Date.getText());
        lin.setSearchInputB(search_proName.getText());
        if(lin.getSearchInputA().isEmpty() && !lin.getSearchInputB().isEmpty()){
            dft = tablemodel.alists( lin.getSearchInputB(),"");
        }else if (lin.getSearchInputB().isEmpty() && !lin.getSearchInputA().isEmpty()){
            dft = tablemodel.alists("", lin.getSearchInputA());
        }else {dft = tablemodel.alists("", "");
        }
        jTable1.setModel(dft);
    }//GEN-LAST:event_searchActionPerformed

    private void lightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightMouseClicked
        haha1.setBackground(Color.GRAY);
        haha3.setBackground(Color.LIGHT_GRAY);
        label1.setForeground(Color.black);
        label2.setForeground(Color.black);
        label3.setForeground(Color.black);
        label4.setForeground(Color.black);
        hahaha.setForeground(Color.black);
        hahaha1.setForeground(Color.black);
        hahaha2.setForeground(Color.black);
        DATE.setForeground(Color.black);
    }//GEN-LAST:event_lightMouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        haha1.setBackground(Color.getHSBColor(201, 56, 17));
        haha3.setBackground(Color.getHSBColor(201, 96, 23));
        label1.setForeground(Color.black);
        label2.setForeground(Color.black);
        label3.setForeground(Color.black);
        label4.setForeground(Color.black);
        hahaha.setForeground(Color.black);
        hahaha1.setForeground(Color.black);
        hahaha2.setForeground(Color.black);
        DATE.setForeground(Color.black);
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        haha1.setBackground(Color.getHSBColor(19,35,44));
        haha3.setBackground(Color.getHSBColor(2,39,60));
        label1.setForeground(Color.black);
        label2.setForeground(Color.black);
        label3.setForeground(Color.black);
        label4.setForeground(Color.black);
        hahaha.setForeground(Color.black);
        hahaha1.setForeground(Color.black);
        hahaha2.setForeground(Color.black);
        DATE.setForeground(Color.black);
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        dft = tablemodel.alists("", "");
        jTable1.setModel(dft);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int selectRow = jTable1.getSelectedRow();
        int colCount = jTable1.getColumnCount();
        if (selectRow > -1){
            Log_in.setOld_pName((String) jTable1.getValueAt(selectRow, 1));
            new Product_Update_Values().setVisible(true);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        int selectRow = jTable1.getSelectedRow();
        int colCount = jTable1.getColumnCount();
        if (selectRow > -1){
            Log_in.setOld_pName((String) jTable1.getValueAt(selectRow, 1));
            SQL_Conn.dbProdDel(Log_in.getOld_pName(), "0");
            dft = tablemodel.alists("", "");
            jTable1.setModel(dft);
        }
    }//GEN-LAST:event_delActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
       
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
    haha1.setBackground(new java.awt.Color(19,35,44));
        haha3.setBackground(new java.awt.Color(2,39,60));
        label1.setForeground(Color.white);
        label2.setForeground(Color.white);
        label3.setForeground(Color.white);
        label4.setForeground(Color.white);
        hahaha.setForeground(Color.white);
        hahaha1.setForeground(Color.white);
        hahaha2.setForeground(Color.white);
        DATE.setForeground(Color.white);
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
               new User_AdminPassword().setVisible(true);
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
int choice = JOptionPane.showConfirmDialog(this, "You are about to be LOGOUT\n ARE YOU SURE?", "LOG OUT",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
if(choice == JOptionPane.YES_OPTION)
    {
        new User_LogIn_Panel().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseEntered

    private void search_DateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_DateMouseEntered
        
    }//GEN-LAST:event_search_DateMouseEntered

    private void search_DateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_DateMouseExited
        
    }//GEN-LAST:event_search_DateMouseExited

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        new User_DeleteAccount().setVisible(true);
    }//GEN-LAST:event_jMenu14MouseClicked

    private void haha3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_haha3KeyReleased

    }//GEN-LAST:event_haha3KeyReleased

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void jMenu6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseEntered

    private void run_total_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run_total_salesActionPerformed
        if(Name.isSelected()){
             total.setText(Double.toString(SQL_Conn.dbTotalName(search_.getText())));
        }
        if(Date.isSelected()){
             total.setText(Double.toString(SQL_Conn.dbTotalDate(search_.getText())));
        }
        
    }//GEN-LAST:event_run_total_salesActionPerformed

    private void run_total_salesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_run_total_salesMousePressed
        
    }//GEN-LAST:event_run_total_salesMousePressed

    private void run_total_salesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_run_total_salesMouseReleased
        
    }//GEN-LAST:event_run_total_salesMouseReleased

    private void search_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_search_MouseEntered

    private void search_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_search_MouseExited

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        lin.setSearchInputA(search_Date.getText());
        lin.setSearchInputB(search_proName.getText());
        dft = tablemodel.alists(lin.getSearchInputA(), lin.getSearchInputB());
    }//GEN-LAST:event_jTable1PropertyChange

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed
    
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
            java.util.logging.Logger.getLogger(User_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DATE;
    private javax.swing.JRadioButton Date;
    private javax.swing.JRadioButton Name;
    private javax.swing.JButton del;
    private javax.swing.JPanel haha1;
    private javax.swing.JPanel haha2;
    private javax.swing.JPanel haha3;
    private javax.swing.JLabel hahaha;
    private javax.swing.JLabel hahaha1;
    private javax.swing.JLabel hahaha2;
    private javax.swing.JLabel hahaha4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JMenu light;
    private javax.swing.JButton run_total_sales;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_;
    private javax.swing.JTextField search_Date;
    private javax.swing.JTextField search_proName;
    private javax.swing.JTextField total;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
