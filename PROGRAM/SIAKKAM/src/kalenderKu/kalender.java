/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalenderKu;

import java.awt.event.MouseEvent;
import java.util.Locale;

/**
 *
 * @author Win10
 */
public class kalender extends javax.swing.JPanel{
    private javax.swing.JPanel header, body;
    private javax.swing.JPanel maju, mundur;
    private javax.swing.JLabel bulan, tahun, hari[];
    private kotakTanggal kotak[][];
    String hari_[] = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
    String bulan_[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    
    public siakkam.listJadwal listjadwal;
    
    private javax.swing.border.LineBorder garisPinggirDefault;
    private java.util.Calendar dataKalender;
    
    
    int hariMulai;
    int jumlahHari;
    int jumlahMinggu;
    
    public kalender(){
        initComponents();
    }
    
    private void initComponents(){
        dataKalender = new java.util.GregorianCalendar();
        
        listjadwal = new siakkam.listJadwal();
        header = new javax.swing.JPanel();
        maju = new javax.swing.JPanel();
        mundur = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        kotak = new kotakTanggal[6][7];
        bulan = new javax.swing.JLabel();
        tahun = new javax.swing.JLabel();
        hari = new javax.swing.JLabel[7];
        
        int ii;
        for( ii=0; ii<42; ii++){
            kotak[ii/7][ii%7] = new kotakTanggal(listjadwal);
        }
        
        for( ii=0; ii<7; ii++){
            hari[ii] = new javax.swing.JLabel();
            hari[ii].setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            hari[ii].setForeground(new java.awt.Color(255, 255, 255));
            hari[ii].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            hari[ii].setText(hari_[ii]);
        }
        
        garisPinggirDefault = new javax.swing.border.LineBorder(new java.awt.Color(0,51,51), 2, true);
        
        header.setBackground(new java.awt.Color(0, 102, 102));
        maju.setBackground(new java.awt.Color(0, 51, 51));
        maju.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));  
        maju.addMouseListener(new java.awt.event.MouseListener() {
            java.awt.Color bg = maju.getBackground();
            @Override
            public void mouseClicked(MouseEvent arg0) {
                dataKalender.add(java.util.Calendar.MONTH, -1);
                setKalender();
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                //setWarnaLatar(new java.awt.Color(20, 10, 20));
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                //setWarnaLatar(new java.awt.Color(198, 201, 206));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                //setWarnaLatar(new java.awt.Color(198, 201, 206));
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                //setWarnaLatar(bg);
            }
        });
        mundur.setBackground(new java.awt.Color(0, 51, 51));
        mundur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mundur.addMouseListener(new java.awt.event.MouseListener() {
            java.awt.Color bg = maju.getBackground();
            @Override
            public void mouseClicked(MouseEvent arg0) {
                dataKalender.add(java.util.Calendar.MONTH, +1);
                setKalender();
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                //setWarnaLatar(new java.awt.Color(20, 10, 20));
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                //setWarnaLatar(new java.awt.Color(198, 201, 206));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                //setWarnaLatar(new java.awt.Color(198, 201, 206));
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                //setWarnaLatar(bg);
            }
        });
        body.setBackground(new java.awt.Color(0, 102, 102));
        
        bulan.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bulan.setForeground(new java.awt.Color(255, 255, 255));
        bulan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bulan.setText("APRIL");
        
        tahun.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tahun.setForeground(new java.awt.Color(255, 255, 255));
        tahun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tahun.setText("2019");
        
        
        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(maju, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mundur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maju, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mundur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        
        java.awt.GridLayout bodyLayout;
        bodyLayout = new java.awt.GridLayout();
        bodyLayout.setColumns(7);
        bodyLayout.setRows(7);
        bodyLayout.setHgap(10);
        bodyLayout.setVgap(10);
        body.setLayout(bodyLayout);
        body.setBorder(new javax.swing.border.EmptyBorder(20, 20, 20, 20));
        
        for( ii=0; ii<7; ii++){
            body.add(hari[ii]);
        }
        for( ii=0; ii<42; ii++){
            kotak[ii/7][ii%7].setNomor(ii);
            kotak[ii/7][ii%7].setTanggal(-1, -1);
            kotak[ii/7][ii%7].setBorder(garisPinggirDefault);
            
            body.add(kotak[ii/7][ii%7]);
        }
        
        javax.swing.GroupLayout masterLayout = new javax.swing.GroupLayout(this);
        this .setLayout(masterLayout);
        masterLayout.setHorizontalGroup(
            masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        masterLayout.setVerticalGroup(
            masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
            ));
        
        this.setKalender();

    }
    
     void setKalender(){
        dataKalender.set(java.util.Calendar.DAY_OF_MONTH, 1);
        
        int year = dataKalender.get(java.util.Calendar.YEAR);
        int month = dataKalender.get(java.util.Calendar.MONTH);
        
        this.bulan.setText(bulan_[month]);
        this.tahun.setText(Integer.toString(year));
        
        hariMulai = dataKalender.get(java.util.Calendar.DAY_OF_WEEK);
        jumlahHari = dataKalender.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        jumlahMinggu = dataKalender.getActualMaximum(java.util.Calendar.WEEK_OF_MONTH);
        
        for(int ii=0; ii<42; ii++){
            kotak[ii/7][ii%7].setTanggal(-1, -1);
        }
        
        int i = hariMulai-1;
        for(int day=1; day<=jumlahHari; day++){
            kotak[i/7][i%7].setTanggal(day, java.util.Calendar.MONTH);
            i = i + 1;
        }
        
    }
   
    
    public static void main(String[] args){
        javax.swing.JFrame frame = new javax.swing.JFrame();
        kalender kalender = new kalender();
        javax.swing.JLabel teks = new javax.swing.JLabel();
        
        frame.add(kalender);
        kalender.setKalender();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
