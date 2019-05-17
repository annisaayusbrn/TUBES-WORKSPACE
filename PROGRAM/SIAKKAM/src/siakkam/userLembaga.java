package siakkam;

import java.awt.event.ActionEvent;




 class userLembaga extends javax.swing.JFrame{
     kalenderKu.kalender Kalender;
     javax.swing.JPanel panelKalender;
     javax.swing.JButton ajukanJadwal;
     javax.swing.JButton keluar;
     javax.swing.JPanel panelBawah;
     javax.swing.JFrame parent;
     String username="";
     int idUser;
     
     userLembaga(javax.swing.JFrame parent, String usr){
         this.parent = parent;
         this.username = usr;
         inisialisasiKomponen();
         this.setTitle("Selamat Datang Admin "+username);
        this.setSize(800, 800);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
     }
     
     
     private void inisialisasiKomponen(){
         Kalender = new kalenderKu.kalender();
         ajukanJadwal = new javax.swing.JButton();
         keluar = new javax.swing.JButton();
         panelKalender = new javax.swing.JPanel();
         panelBawah = new javax.swing.JPanel();
         
         //setting komponen
         ajukanJadwal.setBackground(new java.awt.Color(0, 102, 102));
         ajukanJadwal.setText("Ajukan Jadwal");
         ajukanJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         ajukanJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajukanJadwal(evt);
            }
        });
         
         keluar.setBackground(new java.awt.Color(0, 102, 102));
         keluar.setText("Keluar");
         keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
         
         
         javax.swing.GroupLayout layoutPanelKalender = new javax.swing.GroupLayout(panelKalender);
         panelKalender.setLayout(layoutPanelKalender);
         layoutPanelKalender.setHorizontalGroup(
                layoutPanelKalender.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(Kalender)
         );
         layoutPanelKalender.setVerticalGroup(
                layoutPanelKalender.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(Kalender)
         );
         
        
        
        
         //lll
         
         javax.swing.GroupLayout panelBawahLayout = new javax.swing.GroupLayout(panelBawah);
        panelBawah.setLayout(panelBawahLayout);
        panelBawahLayout.setHorizontalGroup(
            panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajukanJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(keluar, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBawahLayout.setVerticalGroup(
            panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajukanJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(panelBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelKalender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelKalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
     }
     
     
     private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {  
        parent.setVisible(true);
        this.dispose();
    } 
     
     private void ajukanJadwal(java.awt.event.ActionEvent evt) {  
        this.setVisible(false);
        new ajukanJadwal(this, username).setVisible(true);
    } 
     
     public static void main(String args[]){
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userLembaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userLembaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userLembaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userLembaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
         java.awt.EventQueue.invokeLater(new Runnable(){
             public void run(){
                 userLembaga frame = new userLembaga(null, "");
                 frame.setTitle("Selamat Datang Admin Lembaga");
                 frame.setSize(800, 800);
                 frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                 frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                 frame.setVisible(true);
             }
         });
         
     }
 }