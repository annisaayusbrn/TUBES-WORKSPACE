/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakkam;

import javax.swing.JOptionPane;




/**
 *
 * @author lenovo
 */
public class setujuiPengajuan extends javax.swing.JFrame {

    java.sql.Connection koneksi;
    java.sql.PreparedStatement pst;
    java.sql.ResultSet rs;
    java.sql.Statement stmt;
    javax.swing.JFrame parent;
    /**
     * Creates new form Mengajukan_jadwal
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        Pengajuan_kegiatan = new javax.swing.JPanel();
        Judul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        List_pertanyaan = new javax.swing.JPanel();
        penyelenggara = new javax.swing.JPanel();
        pilihPengajuan = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        idPengajuan_ = new javax.swing.JTextField();
        setujui = new javax.swing.JButton();
        labelPesan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarPengajuan = new javax.swing.JTable();
        Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pengajuan_kegiatan.setBackground(new java.awt.Color(0, 102, 102));

        Judul.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menyetujui Pengajuan Jadwal");

        javax.swing.GroupLayout JudulLayout = new javax.swing.GroupLayout(Judul);
        Judul.setLayout(JudulLayout);
        JudulLayout.setHorizontalGroup(
            JudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JudulLayout.setVerticalGroup(
            JudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JudulLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        List_pertanyaan.setBackground(new java.awt.Color(0, 153, 153));

        penyelenggara.setBackground(new java.awt.Color(0, 153, 153));

        pilihPengajuan.setBackground(new java.awt.Color(0, 153, 153));

        label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Pilih id pengajuan");

        idPengajuan_.setText("id pengajuan");
        idPengajuan_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idPengajuan_FocusGained(evt);
            }
        });
        idPengajuan_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPengajuan_ActionPerformed(evt);
            }
        });

        setujui.setBackground(new java.awt.Color(0, 102, 102));
        setujui.setText("Setujui");
        setujui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setujui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setujuiActionPerformed(evt);
            }
        });

        labelPesan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPesan.setForeground(new java.awt.Color(255, 255, 255));
        labelPesan.setText(" ");

        javax.swing.GroupLayout pilihPengajuanLayout = new javax.swing.GroupLayout(pilihPengajuan);
        pilihPengajuan.setLayout(pilihPengajuanLayout);
        pilihPengajuanLayout.setHorizontalGroup(
            pilihPengajuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilihPengajuanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pilihPengajuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPengajuan_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setujui, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pilihPengajuanLayout.setVerticalGroup(
            pilihPengajuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilihPengajuanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pilihPengajuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idPengajuan_)
                    .addComponent(setujui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPesan)
                .addContainerGap())
        );

        daftarPengajuan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(daftarPengajuan);

        javax.swing.GroupLayout penyelenggaraLayout = new javax.swing.GroupLayout(penyelenggara);
        penyelenggara.setLayout(penyelenggaraLayout);
        penyelenggaraLayout.setHorizontalGroup(
            penyelenggaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addComponent(pilihPengajuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        penyelenggaraLayout.setVerticalGroup(
            penyelenggaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyelenggaraLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilihPengajuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout List_pertanyaanLayout = new javax.swing.GroupLayout(List_pertanyaan);
        List_pertanyaan.setLayout(List_pertanyaanLayout);
        List_pertanyaanLayout.setHorizontalGroup(
            List_pertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(penyelenggara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        List_pertanyaanLayout.setVerticalGroup(
            List_pertanyaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(penyelenggara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Kembali.setText("Kembali");
        Kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pengajuan_kegiatanLayout = new javax.swing.GroupLayout(Pengajuan_kegiatan);
        Pengajuan_kegiatan.setLayout(Pengajuan_kegiatanLayout);
        Pengajuan_kegiatanLayout.setHorizontalGroup(
            Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Pengajuan_kegiatanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(List_pertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Kembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Pengajuan_kegiatanLayout.setVerticalGroup(
            Pengajuan_kegiatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pengajuan_kegiatanLayout.createSequentialGroup()
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(List_pertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kembali)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pengajuan_kegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pengajuan_kegiatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setujuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuiActionPerformed
        // TODO add your handling code here:
        String idPengajuan = idPengajuan_.getText();
        try{
            String sql, nama_kegiatan, waktu_mulai, waktu_selesai, id_lembaga, id_tempat;
            sql = "select * from pengajuan where id='"+idPengajuan+"'";
            pst = koneksi.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                nama_kegiatan = rs.getString("nama_kegiatan");
                waktu_mulai = rs.getString("waktu_mulai");
                waktu_selesai = rs.getString("waktu_selesai");
                id_lembaga = rs.getString("id_lembaga");
                id_tempat = rs.getString("id_tempat");
                
                sql = "insert into daftarKegiatan("
                        + "nama_kegiatan, waktu_mulai, waktu_selesai, id_lembaga, id_tempat) "
                        + "values "
                        + "('"+nama_kegiatan+"','"+waktu_mulai+"','"+waktu_selesai+"','"+id_lembaga+"','"+id_tempat+"');";
                
                System.out.println("SQL ok : "+sql);
                stmt = koneksi.createStatement();
                stmt.executeUpdate(sql);
                sql = "delete from pengajuan where id="+idPengajuan+";";
                System.out.println("SQL ok : "+sql);
                stmt.executeUpdate(sql);
                updateTabel();
                labelPesan.setText("Berhasil menyetujui.");
            }else{
                labelPesan.setText("ID tidak ditemukan.");
            }
        }catch(Exception e){
            labelPesan.setText("ID tidak ditemukan, atau pengajuan kosong.");
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_setujuiActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void idPengajuan_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPengajuan_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPengajuan_ActionPerformed

    private void idPengajuan_FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPengajuan_FocusGained
        // TODO add your handling code here:
        idPengajuan_.setText("");
    }//GEN-LAST:event_idPengajuan_FocusGained

    public setujuiPengajuan(javax.swing.JFrame parent) {
        this.parent = parent;
        initComponents();
        
        this.setTitle("Menyetujui Pengajuan");
        this.setSize(800, 800);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        
        updateTabel();
    }
    
    private void updateTabel(){
        koneksi = dataBase.KoneksiDB.ConnectDB();
        try{
            String sql="select "
                    + "a.id as 'ID', a.waktu_diajukan as 'Diajukan', a.nama_kegiatan as 'Kegiatan', "
                    + "a.waktu_mulai as 'Mulai', a.waktu_selesai as 'Selesai', b.nama "
                    + "from "
                    + "pengajuan a, "
                    + "daftarlembaga b "
                    + "where "
                    + "a.id_lembaga = b.id;";
            pst = koneksi.prepareStatement(sql);
            rs = pst.executeQuery();
            daftarPengajuan.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(setujuiPengajuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setujuiPengajuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setujuiPengajuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setujuiPengajuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setujuiPengajuan(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Judul;
    private javax.swing.JButton Kembali;
    private javax.swing.JPanel List_pertanyaan;
    private javax.swing.JPanel Pengajuan_kegiatan;
    private javax.swing.JTable daftarPengajuan;
    private javax.swing.JTextField idPengajuan_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel labelPesan;
    private javax.swing.JPanel penyelenggara;
    private javax.swing.JPanel pilihPengajuan;
    private javax.swing.JButton setujui;
    // End of variables declaration//GEN-END:variables
}
