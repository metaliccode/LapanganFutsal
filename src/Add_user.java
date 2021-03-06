import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Add_user extends javax.swing.JInternalFrame {
    ResultSet rs;
    KoneksiDatabase con;
    /**
     * Creates new form Add_user
     */
    public Add_user() {
        initComponents();
        con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
        loadTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        cb_status = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_refresh = new usu.widget.ButtonGlass();
        btn_add = new usu.widget.ButtonGlass();
        btn_edit = new usu.widget.ButtonGlass();
        btn_delete = new usu.widget.ButtonGlass();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        btn_cari = new usu.widget.ButtonGlass();
        txt_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1091, 768));
        setPreferredSize(new java.awt.Dimension(1091, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass1.setWarna(new java.awt.Color(0, 0, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Status");

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Operator" }));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add Group.png"))); // NOI18N

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nama)
                    .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 960, 280));

        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.setGlassColor(new java.awt.Color(0, 51, 204));
        btn_refresh.setRoundRect(true);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 130, 50));

        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus_1.png"))); // NOI18N
        btn_add.setText("ADD");
        btn_add.setGlassColor(new java.awt.Color(0, 0, 204));
        btn_add.setRoundRect(true);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 130, 50));

        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil_edit.png"))); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.setGlassColor(new java.awt.Color(0, 0, 204));
        btn_edit.setRoundRect(true);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 130, 50));

        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_box.png"))); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setGlassColor(new java.awt.Color(0, 0, 204));
        btn_delete.setRoundRect(true);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 130, 50));

        panelGlass2.setBackground(new java.awt.Color(0, 0, 204));
        panelGlass2.setWarna(new java.awt.Color(0, 0, 204));

        btn_cari.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_lense.png"))); // NOI18N
        btn_cari.setText("CARI");
        btn_cari.setRoundRect(true);
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txt_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cari))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 900, 40));

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID User", "Name", "Username", "Password", "Status"
            }
        ));
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 960, 230));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG3.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1091, 960));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, 0, 1380, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try { 
            if( !txt_nama.getText().isEmpty() && !txt_username.getText().isEmpty() && !txt_password.getText().isEmpty()){
                String kolom[] = {"nama","username","password","type"};
                String isi[] = { txt_nama.getText(),txt_username.getText(),txt_password.getText(),cb_status.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("tb_user",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "User Berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Data User Masih ada yang Kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
            System.out.println("salah");
        }
        loadTabel();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked
       txt_nama.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),1)));
       txt_username.setText(String.valueOf( table_user.getValueAt(table_user.getSelectedRow(),2)));
       txt_password.setText(String.valueOf( table_user.getValueAt(table_user.getSelectedRow(),3)));
       cb_status.setSelectedItem(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),4)));
       // TODO add your handling code here:
    }//GEN-LAST:event_table_userMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
           if( !txt_nama.getText().isEmpty() && !txt_username.getText().isEmpty() && !txt_password.getText().isEmpty()){
                String kolom[] = {"nama","username","password","type"};
                String isi[] = { txt_nama.getText(),txt_username.getText(),txt_password.getText(),cb_status.getSelectedItem().toString()};
                
                con.queryUpdate("tb_user", kolom, isi,"id_user='"+String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit"); 
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        loadTabel();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            String id=String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("tb_user","id_user="+id);

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
        }
        loadTabel();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        if(txt_cari.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                String kolom[] = {"nama","username","type"};
                rs=con.querySelect(kolom ,"tb_user", "nama LIKE '%"+txt_cari.getText()+"%' OR type LIKE '%"+txt_cari.getText()+"%'");
                
                table_user.setModel(new Database.ResultSetTable(rs));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadTabel();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_add;
    private usu.widget.ButtonGlass btn_cari;
    private usu.widget.ButtonGlass btn_delete;
    private usu.widget.ButtonGlass btn_edit;
    private usu.widget.ButtonGlass btn_refresh;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables


    private void loadTabel() {
       String namaKolom[] = {"id_user","nama","username","password","type"};
       rs=con.querySelect(namaKolom,"tb_user");
       table_user.setModel(new ResultSetTable(rs));
       clear();
    }
    
    private void clear() {
        txt_nama.setText("");
        txt_username.setText("");
        cb_status.setSelectedItem("Admin");
        txt_password.setText("");
       
    }
        
}

