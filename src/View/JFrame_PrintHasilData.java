/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DataUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import Controller.Controller;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author HansNotFound
 */
public class JFrame_PrintHasilData extends JFrame implements ActionListener{
    
    JFrame frame_printData;
    JButton ExitButton, UpdateButton, DeleteButton, BackToMenuButton;
    JLabel labelatas_1,labelatas_2,labelNIK,labelNama,labelTTL,labelAlamat,labelRTRW,
            labelKecamatan,labelKelDesa,labelAgama,labelStatus,labelGender,labelKewarganegaraan,
            labelPekerjaan,labelBerlakuHingga,labelfotoUser,labelKotaPembuatanKTP,
            labelTglPembuatanKTP,labelfotoTT;
    String NIK,defaultFoto,defaultTT;
    
    public JFrame_PrintHasilData(String NIKUSER){
        
        DataUser du = Controller.getUser(NIKUSER);
        frame_printData = new JFrame("Output Data User");
        
        frame_printData.setSize(700,550);
        frame_printData.setLocationRelativeTo(null);
        frame_printData.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        labelatas_1 = new JLabel("REPUBLIK HARAPAN BANGSA");
        labelatas_1.setBounds(250, 10, 500, 20);
        labelatas_1.setFont(new Font(labelatas_1.getFont().getName(),labelatas_1.getFont().getStyle(),15));
        labelatas_2 = new JLabel("KOTA " + du.getTempatPembuatKTP().toUpperCase());
        labelatas_2.setBounds(280, 40, 300, 20);
        //labelatas_2.setHorizontalAlignment(SwingConstants.CENTER);
        labelatas_2.setFont(new Font(labelatas_2.getFont().getName(),labelatas_2.getFont().getStyle(),15));
        
        labelNIK = new JLabel("NIK \t: " + du.getNIK().toUpperCase());
        labelNIK.setBounds(10, 60, 400, 25);
        NIK = du.getNIK();
        
        labelNama = new JLabel("Nama \t: " + du.getNama().toUpperCase());
        labelNama.setBounds(10, 90, 400, 25);
        
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-YYYY");
        labelTTL = new JLabel("Tempat/Tgl Lahir \t: " + du.getTempatLahir().toUpperCase() +", " + du.getTanggallahir());
        labelTTL.setBounds(10, 120, 400, 25);
        
        labelGender = new JLabel("JenisKelamin \t: " + du.getJenisKelamin().toUpperCase() + "     Gol. Darah :" + du.getGolonganDarah().toUpperCase());
        labelGender.setBounds(10, 150, 400, 25);
        
        labelAlamat = new JLabel("Alamat \t: " + du.getAlamat().toUpperCase());
        labelAlamat.setBounds(10, 180, 400, 25);
        
        labelRTRW = new JLabel("RT/RW \t: " + du.getRTRW().toUpperCase());
        labelRTRW.setBounds(50, 210, 400, 25);
        
        labelKelDesa = new JLabel("KelDesa \t: " + du.getKelDesa().toUpperCase());
        labelKelDesa.setBounds(50, 240, 400, 25);
        
        labelKecamatan = new JLabel("Kecamatan \t: " + du.getKecamatan().toUpperCase());
        labelKecamatan.setBounds(50, 270, 400, 25);
        
        labelAgama = new JLabel("Agama \t: " + du.getAgama().toUpperCase());
        labelAgama.setBounds(10, 300, 400, 25);
        
        labelStatus = new JLabel("Status Perkawinan \t: " + du.getStatusPerkawinan().toUpperCase());
        labelStatus.setBounds(10, 330, 400, 25);
        
        labelPekerjaan = new JLabel("Pekerjaan \t: " + du.getPekerjaan().toUpperCase());
        labelPekerjaan.setBounds(10, 360, 400, 25);
        
        labelKewarganegaraan = new JLabel("Kewarganegaraan \t: " + du.getKewarganegaraan().toUpperCase());
        labelKewarganegaraan.setBounds(10, 390, 400, 25);
        
        labelBerlakuHingga = new JLabel("Berlaku Hingga \t: SEUMUR HIDUP");
        labelBerlakuHingga.setBounds(10, 420, 400, 25);
        
        labelfotoUser = new JLabel();
        //String path=new File(".").getCanonicalPath();
        //Image image=toolkit.getImage(path+"/image/"+book.getImage());
        labelfotoUser.setIcon(new ImageIcon(du.getFoto()));
        labelfotoUser.setBounds(420, 60, 200, 250);
        
        labelKotaPembuatanKTP = new JLabel("KOTA " + du.getTempatPembuatKTP().toUpperCase());
        labelKotaPembuatanKTP.setFont(new Font(labelKotaPembuatanKTP.getFont().getName(),labelKotaPembuatanKTP.getFont().getStyle(),10));
        labelKotaPembuatanKTP.setBounds(430, 310, 100, 20);
        
        //String tanggalKTP = formatTanggal.format(du.getTanggalPembuatKTP());
        labelTglPembuatanKTP = new JLabel(du.getTanggalPembuatKTP());
        labelTglPembuatanKTP.setFont(new Font(labelTglPembuatanKTP.getFont().getName(),labelTglPembuatanKTP.getFont().getStyle(),10));
        labelTglPembuatanKTP.setBounds(430, 330, 100, 20);
        
        labelfotoTT = new JLabel();
        labelfotoTT.setIcon(new ImageIcon(du.getTandaTangan()));
        labelfotoTT.setBounds(420, 350, 100, 100);
        
        ExitButton = new JButton("EXIT");
        ExitButton.setBounds(10,450,80,30);
        ExitButton.addActionListener(this);
        
        BackToMenuButton = new JButton("BACK");
        BackToMenuButton.setBounds(100,450,80,30);
        BackToMenuButton.addActionListener(this);
        
        frame_printData.add(labelatas_1);
        frame_printData.add(labelatas_2);
        
        frame_printData.add(labelNIK);
        frame_printData.add(labelNama);
        frame_printData.add(labelTTL);
        frame_printData.add(labelGender);
        frame_printData.add(labelAlamat);
        frame_printData.add(labelRTRW);
        frame_printData.add(labelKelDesa);
        frame_printData.add(labelKecamatan);
        frame_printData.add(labelAgama);
        frame_printData.add(labelStatus);
        frame_printData.add(labelPekerjaan);
        frame_printData.add(labelKewarganegaraan);
        frame_printData.add(labelBerlakuHingga);
        frame_printData.add(labelfotoUser);
        frame_printData.add(labelKotaPembuatanKTP);
        frame_printData.add(labelTglPembuatanKTP);
        frame_printData.add(labelfotoTT);
        
        frame_printData.add(ExitButton);
        frame_printData.add(BackToMenuButton);
        frame_printData.setLayout(null);
        frame_printData.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command) {
            case "BACK":
                frame_printData.setVisible(false);
                new MainMenu();
                break;
            case "Delete":
                boolean delete = Controller.deleteUser(NIK);
                if(delete){
                    frame_printData.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Delete Berhasil");
                    new MainMenu();
                } else{
                    JOptionPane.showMessageDialog(null, "Delete Gagal");
                }
                break;
            case "EXIT": 
                System.exit(0);
                break;
        }
        System.out.println(command);
    }
}
