import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.PrintJob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Form_Event extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    KoneksiDatabase con;
    /**
     * Creates new form Add_user
     */
    public Form_Event() {
        con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadlapangan();
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
        jLabel8 = new javax.swing.JLabel();
        j_booking = new com.toedter.calendar.JDateChooser();
        txt_lama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_selesai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        j_main = new com.toedter.calendar.JDateChooser();
        txt_hari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_penyewa = new javax.swing.JTextField();
        txt_main = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lbl_lapangan = new javax.swing.JLabel();
        lbl_jenis = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        box_kode = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        lbl_tagihan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_total = new usu.widget.ButtonGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_event = new javax.swing.JTable();
        buttonGlass1 = new usu.widget.ButtonGlass();
        btn_clear = new usu.widget.ButtonGlass();
        btn_save = new usu.widget.ButtonGlass();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1091, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass1.setWarna(new java.awt.Color(0, 0, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal Main");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jam Main");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Booking");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jam Selesai");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lama");

        txt_lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lamaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jam");

        txt_selesai.setText("00:00");
        txt_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_selesaiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selama");

        txt_hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hariActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hari");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Atas Nama");

        txt_main.setText("00:00");
        txt_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelGlass1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(78, 78, 78)
                            .addComponent(txt_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txt_selesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGlass1Layout.createSequentialGroup()
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)))
                            .addGap(18, 18, 18)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addComponent(txt_hari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10))
                                .addComponent(j_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_main, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9))
                                .addComponent(txt_penyewa, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(txt_penyewa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(j_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(j_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_hari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txt_selesai)
                    .addComponent(txt_main))
                .addGap(27, 27, 27))
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 460, 240));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA TRANSAKSI BOOKING FOR EVENT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 50));

        panelGlass4.setWarna(new java.awt.Color(0, 0, 204));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Kode Lapangan");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nama Lapangan");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Jenis");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Harga sewa");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(":  ");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText(":  ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText(":  ");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText(":  ");

        lbl_lapangan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_lapangan.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lapangan.setText("lbl_lapangan");

        lbl_jenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_jenis.setForeground(new java.awt.Color(255, 255, 255));
        lbl_jenis.setText("lbl_jenis");

        lbl_harga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_harga.setForeground(new java.awt.Color(255, 255, 255));
        lbl_harga.setText("lbl_harga");

        box_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_kodeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("HITUNG TOTAL PEMBAYARAN");

        lbl_tagihan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tagihan.setForeground(new java.awt.Color(204, 0, 0));
        lbl_tagihan.setText("Tagihan");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rp.");

        btn_total.setForeground(new java.awt.Color(255, 255, 255));
        btn_total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calculator.png"))); // NOI18N
        btn_total.setText("Hitung ");
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_harga))
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_jenis))
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_lapangan))))
                    .addComponent(jLabel13)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_tagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_total, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31)
                    .addComponent(box_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32)
                    .addComponent(lbl_lapangan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel33)
                    .addComponent(lbl_jenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34)
                    .addComponent(lbl_harga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tagihan)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(btn_total, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 460, 240));

        tabel_event.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_eventMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_event);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 930, 240));

        buttonGlass1.setForeground(new java.awt.Color(255, 255, 255));
        buttonGlass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        buttonGlass1.setText("Cetak Resi");
        buttonGlass1.setGlassColor(new java.awt.Color(0, 0, 204));
        buttonGlass1.setRoundRect(true);
        buttonGlass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGlass1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 148, 60));

        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_box.png"))); // NOI18N
        btn_clear.setText("Clear All");
        btn_clear.setGlassColor(new java.awt.Color(0, 0, 204));
        btn_clear.setRoundRect(true);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 143, 60));

        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btn_save.setText("SAVE");
        btn_save.setGlassColor(new java.awt.Color(0, 0, 204));
        btn_save.setRoundRect(true);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 161, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BG3.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1091, 960));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 1370, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lamaActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        save();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_selesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_selesaiActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed
        try {
            int harga = Integer.parseInt(lbl_harga.getText());
            int lama = Integer.parseInt(txt_lama.getText());
            int hari = Integer.parseInt(txt_hari.getText());
            int total = harga * lama * hari;
            String aa = (Long.toString(total));
            lbl_tagihan.setText(aa);

        } catch (Exception a) {
            JOptionPane.showMessageDialog(this, "Masukkan Lama Menyewa");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_totalActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void box_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_kodeActionPerformed
        String st = (String) box_kode.getSelectedItem();
        ResultSet rst = con.querySelectAll("tb_lapangan", "id_lapangan='" + st + "'");
        try {
            while (rst.next()) {
                this.lbl_lapangan.setText(rst.getString("lapangan"));
                this.lbl_jenis.setText(rst.getString("jenis"));
                this.lbl_harga.setText(rst.getString("harga"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form_booking_regular.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }//GEN-LAST:event_box_kodeActionPerformed

    private void txt_hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hariActionPerformed

    private void buttonGlass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGlass1ActionPerformed
        resi();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGlass1ActionPerformed

    private void tabel_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_eventMouseClicked
        Date n = (Date) tabel_event.getValueAt(tabel_event.getSelectedRow(), 0);
        j_booking.setDate(n);
        txt_penyewa.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),1)));
        Date c = (Date) tabel_event.getValueAt(tabel_event.getSelectedRow(), 2);
        j_main.setDate(c);
        txt_hari.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),3)));
        txt_lama.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),4)));
        txt_main.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),5)));
        txt_selesai.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),6)));
        lbl_lapangan.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),7)));
        lbl_harga.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),8)));
        lbl_tagihan.setText(String.valueOf(tabel_event.getValueAt(tabel_event.getSelectedRow(),9)));
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_eventMouseClicked

    private void txt_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_kode;
    private usu.widget.ButtonGlass btn_clear;
    private usu.widget.ButtonGlass btn_save;
    private usu.widget.ButtonGlass btn_total;
    private usu.widget.ButtonGlass buttonGlass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser j_booking;
    private com.toedter.calendar.JDateChooser j_main;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_jenis;
    private javax.swing.JLabel lbl_lapangan;
    private javax.swing.JLabel lbl_tagihan;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass4;
    private javax.swing.JTable tabel_event;
    private javax.swing.JTextField txt_hari;
    private javax.swing.JTextField txt_lama;
    private javax.swing.JTextField txt_main;
    private javax.swing.JTextField txt_penyewa;
    private javax.swing.JTextField txt_selesai;
    // End of variables declaration//GEN-END:variables

    private void loadlapangan() {  // mengambil database
        rs = con.querySelectAll("tb_lapangan");
        try {
            while (rs.next()) {
                box_kode.addItem(rs.getString("id_lapangan"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Form_booking_regular.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void loadTabel(){
    String namaKolom[] = {"tgl_booking","penyewa","tgl_main","lama_hari","jam","jam_main","jam_selesai","lapangan","harga","total"}; 
        rs = con.querySelect(namaKolom, "tb_event");
        tabel_event.setModel(new ResultSetTable(rs));
    }
    
    private void clear() {
       
        txt_lama.setText("");
        txt_main.setText("00:00");
        txt_selesai.setText("00:00");
        txt_hari.setText("");
    }
    
    private void save() {

        try {
            java.util.Date tgl = (java.util.Date) this.j_booking.getDate();
            java.util.Date tgl1 = (java.util.Date) this.j_main.getDate();
            if(!txt_penyewa.getText().isEmpty() && !new java.sql.Date(tgl.getTime()).toString().isEmpty() && !new java.sql.Date(tgl1.getTime()).toString().isEmpty() && !txt_hari.getText().isEmpty()&& !txt_lama.getText().isEmpty()){
                
                String kolom[] = {"tgl_booking","penyewa","tgl_main","lama_hari","jam","jam_main","jam_selesai","lapangan","harga","total"};
                String isi[] = { new java.sql.Date(tgl.getTime()).toString(),txt_penyewa.getText(),new java.sql.Date(tgl1.getTime()).toString(),txt_hari.getText(),txt_lama.getText(),txt_main.getText(),txt_selesai.getText(),lbl_lapangan.getText(),lbl_harga.getText(),lbl_tagihan.getText()};
                
                System.out.println( con.queryInsert("tb_event",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "Data Transaksi Berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Data Transaksi Masih ada yang Kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
            System.out.println("salah");
        }
        loadTabel();
        clear();
    }
    
    public void resi(){
                
        Login su = new Login();

        PrintJob p = getToolkit().getPrintJob(su,"Report",null);
        Graphics g = p.getGraphics();

        try{
            String n = txt_penyewa.getText();
            rs=con.querySelectAll("tb_event","penyewa='"+n+"'");
            //String id = String.valueOf(table_transaksi1.getValueAt(table_transaksi1.getSelectedRow(),0));
        if(rs.next()){
            String id = rs.getString("id_event");
            String nama = rs.getString("penyewa");
            String nom = rs.getString("total");

            g.drawLine(10, 75, 580, 75);
            g.drawLine(10, 75, 10, 285);
            
            g.drawLine(580, 75, 580, 285);
            g.drawLine(10, 285, 580, 285);

            g.setFont(new Font("Serif",Font.BOLD,16));
            g.drawString("No.",100, 102);
            g.drawString(id, 140, 101 );
            g.drawString("_ _ _ _ _ _ _ _",135, 100);

            g.setFont(new Font("Serif",Font.PLAIN,13));
            g.drawString("Terima Dari", 100, 125);
            g.setFont(new Font("Serif",Font.BOLD,14));
            g.drawString(nama, 195, 124 );
            g.setFont(new Font("Serif",Font.PLAIN,13));
            g.drawString("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _", 188, 124);

            g.drawString("Uang Sebanyak", 100, 146);
            g.setColor(java.awt.Color.GRAY);
            for(int i=0; i<=6; i++)
                {g.drawString("______________________________________________________", 200-(i*2), 135+(i*2));}
            for(int i=0; i<=6; i++)
                {g.drawString("______________________________________________________", 200-(i*2), 151+(i*2));}

            g.setColor(java.awt.Color.BLACK);
            for(int i=0; i<=3; i++) 
                {g.drawString("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _", 100, 180+(i*14));}

            g.drawLine(100, 250, 350, 250);
            g.setFont(new Font("Serif",Font.BOLD,12));
            g.drawString("Terbilang Rp. ", 100, 264);
            g.setFont(new Font("Serif",Font.BOLD,14));
            g.drawString(nom, 205, 264 );
            for(int i=0; i<=6; i++)
                {g.setColor(java.awt.Color.GRAY);
                g.drawString("_____________________", 200-(i*2), 251+(i*2));}
            g.setColor(java.awt.Color.BLACK);
            
            g.drawLine(100, 270, 350, 270);
            g.drawLine(440, 270, 550, 270);

            p.end();
        }
        else{
            JOptionPane.showMessageDialog(this, "Gagal Cetak!!");
        }
        
        }catch(SQLException|HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error!!");
        }
        
        dispose();
        Form_booking_regular fm = new Form_booking_regular();
        fm.setVisible(true);
    }
    
    
}
