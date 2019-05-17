/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalenderKu;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Win10
 */
public class kotakTanggal extends javax.swing.JPanel{
    protected javax.swing.JLabel labelTanggal;
    int nomorKotak;
    
    kotakTanggal(){
        inisialisasi();
    }
    
    private void inisialisasi(){
        //objek label baru
        labelTanggal = new javax.swing.JLabel(); //konstruksi
        labelTanggal.setFont(new java.awt.Font("Tahoma", 1, 18));    //properti font di objek label ini
        labelTanggal.setBorder(new javax.swing.border.EmptyBorder(10, 10, 10, 10));
        labelTanggal.setText("null");
        

        this.setLayout(new java.awt.GridLayout());
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(116, 130, 153), 2, true));
        this.setPreferredSize(new java.awt.Dimension(200, 50));
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.addMouseListener(new java.awt.event.MouseListener() {
            java.awt.Color bg = getWarnaLatar();
            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                setWarnaLatar(new java.awt.Color(20, 10, 20));
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                setWarnaLatar(new java.awt.Color(198, 201, 206));
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                setWarnaLatar(new java.awt.Color(198, 201, 206));
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                setWarnaLatar(bg);
            }
        });
        this.add(labelTanggal);
        
    }
    
    public void setTanggal(String tanggal_){
        this.labelTanggal.setText(tanggal_);
    }
    
    public void setWarnaLatar(java.awt.Color warna){
        this.setBackground(warna);
    }
    
    public void setNomor(int i){
        this.nomorKotak = i;
    }
    
    public java.awt.Color getWarnaLatar(){
        return this.getBackground();
    }
    
    public static void main(String[] args){
        javax.swing.JFrame f;
        f = new javax.swing.JFrame();
        
        java.awt.GridLayout layout = new java.awt.GridLayout();
        layout.setColumns(2);
        layout.setRows(2);
        
        layout.setHgap(5);
        
        f.setLayout(layout);
        
        kotakTanggal kotak;
        kotak = new kotakTanggal();
        kotak.setTanggal("10");
        
        kotakTanggal kotak1[];
        kotak1 = new kotakTanggal[4];
        for(int i=0; i<4; i++){
            kotak1[i] = new kotakTanggal();
            kotak1[i].setTanggal(Integer.toString(i));
            
            
            f.add(kotak1[i]);
        }
        
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.add(kotak);
        f.setSize(300, 600);
        f.setVisible(true);
        
    }
}
