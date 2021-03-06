
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
public class Data_lapangan extends javax.swing.JInternalFrame {
    ResultSet rs;
    KoneksiDatabase con;
    /**
     * Creates new form Add_user
     */
    public Data_lapangan() {
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
        txt_id_lapangan = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        cb_lapangan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_jenis = new javax.swing.JComboBox<>();
        btn_refresh = new usu.widget.ButtonGlass();
        btn_add = new usu.widget.ButtonGlass();
        btn_edit = new usu.widget.ButtonGlass();
        btn_delete = new usu.widget.ButtonGlass();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        btn_cari = new usu.widget.ButtonGlass();
        txt_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_lapangan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1091, 768));
        setPreferredSize(new java.awt.Dimension(1091, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass1.setBackground(new java.awt.Color(255, 153, 0));
        panelGlass1.setWarna(new java.awt.Color(0, 0, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kode Lapangan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Lapangan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Lapangan");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga");

        cb_lapangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Studio 1", "Studio 2", "Studio 3" }));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lapangan.png"))); // NOI18N

        cb_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sintetis", "Plur" }));

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
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id_lapangan, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cb_jenis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_lapangan, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_lapangan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(cb_lapangan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 960, 280));

        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        btn_refresh.setText("REFRESH");
        btn_refresh.setGlassColor(new java.awt.Color(0, 0, 204));
        btn_refresh.setRoundRect(true);
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 130, 50));

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
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 130, 50));

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
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 130, 50));

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
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 130, 50));

        panelGlass2.setWarna(new java.awt.Color(0, 0, 204));

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

        getContentPane().add(panelGlass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 900, 40));

        tabel_lapangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Lapangan", "Lapangan", "Jenis", "Harga"
            }
        ));
        tabel_lapangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_lapanganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_lapangan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 960, 240));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA LAPANGAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG3.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1091, 960));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, -10, 1370, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try { 
            if( !txt_id_lapangan.getText().isEmpty() && !txt_harga.getText().isEmpty()){
                String kolom[] = {"id_lapangan","lapangan","jenis","harga"};
                String isi[] = { txt_id_lapangan.getText(),cb_lapangan.getSelectedItem().toString(),cb_jenis.getSelectedItem().toString(),txt_harga.getText()};
                
                System.out.println( con.queryInsert("tb_lapangan",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "Data Lapangan Berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Data Lapangan Masih ada yang Kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
            System.out.println("salah");
        }
        loadTabel();
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
           if( !txt_id_lapangan.getText().isEmpty() && !txt_harga.getText().isEmpty()){
                String kolom[] = {"id_lapangan","lapangan","jenis","harga"};
                String isi[] = { txt_id_lapangan.getText(),cb_lapangan.getSelectedItem().toString(),cb_jenis.getSelectedItem().toString(),txt_harga.getText()};
                
                con.queryUpdate("tb_lapangan", kolom, isi,"id_lapangan='"+String.valueOf(tabel_lapangan.getValueAt(tabel_lapangan.getSelectedRow(),0))+"'");
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
            //String id=txt_id_lapangan.getText();
            if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("tb_lapangan","id_lapangan='"+txt_id_lapangan.getText()+"'");

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

    private void tabel_lapanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_lapanganMouseClicked
       txt_id_lapangan.setText(String.valueOf(tabel_lapangan.getValueAt(tabel_lapangan.getSelectedRow(),0)));
       cb_lapangan.setSelectedItem(String.valueOf( tabel_lapangan.getValueAt(tabel_lapangan.getSelectedRow(),1)));
       cb_jenis.setSelectedItem(String.valueOf( tabel_lapangan.getValueAt(tabel_lapangan.getSelectedRow(),2)));
       txt_harga.setText(String.valueOf(tabel_lapangan.getValueAt(tabel_lapangan.getSelectedRow(),3)));
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_lapanganMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadTabel();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        if(txt_cari.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                String kolom[] = {"id_lapangan","lapangan","jenis","harga"};
                rs=con.querySelect(kolom ,"tb_lapangan", "id_lapangan LIKE '%"+txt_cari.getText()+"%' OR lapangan LIKE '%"+txt_cari.getText()+"%' OR harga LIKE '%"+txt_cari.getText()+"%'");
                
                tabel_lapangan.setModel(new Database.ResultSetTable(rs));
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_add;
    private usu.widget.ButtonGlass btn_cari;
    private usu.widget.ButtonGlass btn_delete;
    private usu.widget.ButtonGlass btn_edit;
    private usu.widget.ButtonGlass btn_refresh;
    private javax.swing.JComboBox<String> cb_jenis;
    private javax.swing.JComboBox<String> cb_lapangan;
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
    private javax.swing.JTable tabel_lapangan;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id_lapangan;
    // End of variables declaration//GEN-END:variables

    private void loadTabel() {
       String namaKolom[] = {"id_lapangan","lapangan","jenis","harga"};
       rs=con.querySelect(namaKolom,"tb_lapangan");
       tabel_lapangan.setModel(new ResultSetTable(rs));
       clear();
    }
    
    private void clear() {
        txt_id_lapangan.setText("");
        cb_lapangan.setSelectedItem("Studio 1");
        cb_jenis.setSelectedItem("Sintetis");
        txt_harga.setText("");
    }


}
