/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Controller;
import Model.DataUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author HansNotFound
 */
public class JFrame_InputData extends JFrame implements ActionListener{
    JFrame frame_InputData;
    JButton InputDataButton, browseFoto, browseTandaTangan, ExitButton;
    JLabel  Nama,NIK,TempatLahir, Tanggallahir, JenisKelamin, GolonganDarah, alamat,
            RT_RW, Kel_Desa, Kecamatan, Agama, StatusPerkawinan, Pekerjaan, 
            Kewarganegaraan, Foto, TandaTangan, BerlakuHingga, KotaPembuatKTP, 
            TanggalPembuatKTP, GambarITHB;
    JTextField textfieldNama,textfieldNIK,textfieldTempatLahir,textfieldAlamat,textfieldRTRW,
            textfieldKelDesa,textfieldKecamatan,textfieldWNA,textfieldBerlaku,textfieldKotaPembuat;
    JDateChooser tanggalLahir, tanggalBuatKTP;
    JRadioButton male,female, darahA,darahB,darahO,darahAB, RBWNI,RBWNA;
    ButtonGroup jenisKelamin,golonganDarah,WargaNegara;
    JComboBox CBAgama,CBStatus;
    String[] stringAgama = {"Kristen", "Katolik", "Islam", "Budha", "Hindu","Atheis"};
    String[] stringStatus = {"Belum Menikah", "Menikah", "Janda/Duda"};
    JCheckBox chKaryawan, chPNS, chWiraswasta, chAkademisi, chPengangguran;
    String pekerjaan = "";
    String WNA = "";
    JFileChooser FCFoto, FCTandaTangan;
    File fileFoto, fileTandaTangan;
    String pathFoto, pathTT;
    ImageIcon image;
    Controller controller = new Controller();
    
    public JFrame_InputData(){
        frame_InputData = new JFrame("Form Input Data");
        frame_InputData.setSize(1000,600);
        frame_InputData.setLocationRelativeTo(null);
        frame_InputData.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        String pathGambarITHB = "src/model/GambarITHB.png";
        
        //Nama
        Nama = new JLabel();
        Nama.setText("Nama ");
        Nama.setBounds(10,0,150,50);
        
        textfieldNama = new JTextField();
        textfieldNama.setBounds(160,15, 500, 20);
        
        //NIK
        NIK = new JLabel();
        NIK.setText("NIK ");
        NIK.setBounds(10,25,150,50);
        
        textfieldNIK = new JTextField();
        textfieldNIK.setBounds(160,40, 500, 20);
        
        //TempatLahir
        TempatLahir = new JLabel();
        TempatLahir.setText("TempatLahir ");
        TempatLahir.setBounds(10,50,150,50);
        
        textfieldTempatLahir = new JTextField();
        textfieldTempatLahir.setBounds(160,65, 500, 20);
        
        //Tanggallahir
        Tanggallahir = new JLabel();
        Tanggallahir.setText("Tanggallahir ");
        Tanggallahir.setBounds(10,75,150,50);
        
        tanggalLahir = new JDateChooser();
        tanggalLahir.setBounds(160, 90, 100, 20);
        
        //Gender
        JenisKelamin = new JLabel();
        JenisKelamin.setText("JenisKelamin ");
        JenisKelamin.setBounds(10,100,150,50);
        
        male = new JRadioButton("Laki - Laki");
        male.setBounds(160, 115, 100, 20);
        female = new JRadioButton("Perempuan");
        female.setBounds(300,115,100,20);
	jenisKelamin = new ButtonGroup();
        jenisKelamin.add(male);
        jenisKelamin.add(female);
        
        //GolDar
        GolonganDarah = new JLabel();
        GolonganDarah.setText("GolonganDarah ");
        GolonganDarah.setBounds(10,125,150,50);
        
        darahA = new JRadioButton(" A ");
        darahA.setBounds(160, 140, 50, 20);
        darahB = new JRadioButton(" B ");
        darahB.setBounds(210, 140, 50, 20);
        darahO = new JRadioButton(" O ");
        darahO.setBounds(260, 140, 50, 20);
        darahAB = new JRadioButton(" AB ");
        darahAB.setBounds(310, 140, 50, 20);
        golonganDarah = new ButtonGroup();
        golonganDarah.add(darahA);
        golonganDarah.add(darahB);
        golonganDarah.add(darahO);
        golonganDarah.add(darahAB);
        
        //Alamat
        alamat = new JLabel();
        alamat.setText("Alamat ");
        alamat.setBounds(10,150,150,50);
        
        textfieldAlamat = new JTextField();
        textfieldAlamat.setBounds(160, 165, 500, 20);
        
        //RTRW
        RT_RW = new JLabel();
        RT_RW.setText("RT_RW ");
        RT_RW.setBounds(10,175,150,50);
        
        textfieldRTRW = new JTextField();
        textfieldRTRW.setBounds(160, 190, 100, 20);
        
        //KelurahanDesa
        Kel_Desa = new JLabel();
        Kel_Desa.setText("Kel_Desa ");
        Kel_Desa.setBounds(10,200,150,50);
        
        textfieldKelDesa = new JTextField();
        textfieldKelDesa.setBounds(160, 215, 100, 20);
        
        //Kecamatan
        Kecamatan = new JLabel();
        Kecamatan.setText("Kecamatan ");
        Kecamatan.setBounds(10,225,150,50);
        
        textfieldKecamatan = new JTextField();
        textfieldKecamatan.setBounds(160, 240, 100, 20);
        
        //Agama
        Agama = new JLabel();
        Agama.setText("Agama ");
        Agama.setBounds(10,250,150,50);
        
        CBAgama = new JComboBox(stringAgama);
        CBAgama.setBounds(160, 265, 100, 20);
        
        //Status
        StatusPerkawinan = new JLabel();
        StatusPerkawinan.setText("StatusPerkawinan ");
        StatusPerkawinan.setBounds(10,275,150,50);
        
        CBStatus = new JComboBox(stringStatus);
        CBStatus.setBounds(160, 290, 100, 20);
        
        //Gawean
        Pekerjaan = new JLabel();
        Pekerjaan.setText("Pekerjaan ");
        Pekerjaan.setBounds(10,300,150,50);
        
        chKaryawan = new JCheckBox("Karyawan"); 
        chKaryawan.setBounds(160, 315, 100, 20);
        chPNS = new JCheckBox("PNS"); 
        chPNS.setBounds(260, 315, 100, 20);
        chWiraswasta = new JCheckBox("Wiraswasta"); 
        chWiraswasta.setBounds(360, 315, 100, 20);
        chAkademisi = new JCheckBox("Akademisi");
        chAkademisi.setBounds(460, 315, 100, 20);
        chPengangguran = new JCheckBox("Pengangguran");
        chPengangguran.setBounds(560, 315, 150, 20);
        
        chPengangguran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chPengangguran.isSelected()){
                    pekerjaan = "Pengangguran";
                    chKaryawan.setEnabled(false);
                    chKaryawan.setSelected(false);
                    chPNS.setEnabled(false);
                    chPNS.setSelected(false);
                    chWiraswasta.setEnabled(false);
                    chWiraswasta.setSelected(false);
                    chAkademisi.setEnabled(false);
                    chAkademisi.setSelected(false);
                }else{
                    pekerjaan = "";
                    chKaryawan.setEnabled(true);
                    chPNS.setEnabled(true);
                    chWiraswasta.setEnabled(true);
                    chAkademisi.setEnabled(true);
                }
            }
        });
        
        //Kewarganegaraan
        Kewarganegaraan = new JLabel();
        Kewarganegaraan.setText("Kewarganegaraan ");
        Kewarganegaraan.setBounds(10,325,150,50);
        
        RBWNI = new JRadioButton("WNI");
        RBWNI.setBounds(160, 340, 75, 20);
        RBWNA = new JRadioButton("WNA");
        RBWNA.setBounds(235, 340, 75, 20);
        WargaNegara = new ButtonGroup();
        WargaNegara.add(RBWNI);
        WargaNegara.add(RBWNA);
        
        textfieldWNA = new JTextField();
        textfieldWNA.setBounds(320, 340, 100, 20);
        textfieldWNA.setEnabled(false);
        
        RBWNA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(RBWNA.isSelected()){
                    textfieldWNA.setEnabled(true);
                }
            }
        });
        RBWNI.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(RBWNI.isSelected()){
                    textfieldWNA.setEnabled(false);
                }
            }
        });
        
        //Foto
        Foto = new JLabel();
        Foto.setText("Foto ");
        Foto.setBounds(10,350,150,50);
        
        browseFoto = new JButton("Browse File Foto");
        browseFoto.setBounds(160,365,250,20);
        browseFoto.addActionListener(this);
        
        //TT
        TandaTangan = new JLabel();
        TandaTangan.setText("TandaTangan ");
        TandaTangan.setBounds(10,375,150,50);
        
        browseTandaTangan = new JButton("Browse File Tanda Tangan");
        browseTandaTangan.setBounds(160,390,250,20);
        browseTandaTangan.addActionListener(this);
        
        //MasaAktif
        BerlakuHingga = new JLabel();
        BerlakuHingga.setText("BerlakuHingga ");
        BerlakuHingga.setBounds(10,400,150,50);
        
        textfieldBerlaku = new JTextField();
        textfieldBerlaku.setBounds(160, 415, 150, 20);
        
        //KotaPembuatKTP
        KotaPembuatKTP = new JLabel();
        KotaPembuatKTP.setText("KotaPembuatKTP ");
        KotaPembuatKTP.setBounds(10,425,150,50);
        
        textfieldKotaPembuat = new JTextField();
        textfieldKotaPembuat.setBounds(160, 440, 150, 20);
                
        //TanggalKTP
        TanggalPembuatKTP = new JLabel();
        TanggalPembuatKTP.setText("TanggalPembuatKTP ");
        TanggalPembuatKTP.setBounds(10,450,150,50);
        
        tanggalBuatKTP = new JDateChooser();
        tanggalBuatKTP.setBounds(160, 465, 100, 20);
        
        GambarITHB = new JLabel();
        GambarITHB.setIcon(new ImageIcon(pathGambarITHB));
        GambarITHB.setBounds(700, 30, 250, 130);
        
        InputDataButton = new JButton("Submit");
        InputDataButton.setBounds(790,510,80,30);
        InputDataButton.addActionListener(this);
        /*InputDataButton.setEnabled(true);
        InputDataButton.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                if(){
                    InputDataButton.setEnabled(true);
                }
            }
        });*/
        
        ExitButton = new JButton("EXIT");
        ExitButton.setBounds(890,510,80,30);
        ExitButton.addActionListener(this);
        
        frame_InputData.add(GambarITHB);
        frame_InputData.add(ExitButton);
        frame_InputData.add(InputDataButton);
        
        //add TextField
        frame_InputData.add(textfieldNama);
        frame_InputData.add(textfieldNIK);
        frame_InputData.add(textfieldTempatLahir);
        frame_InputData.add(textfieldAlamat);
        frame_InputData.add(textfieldRTRW);
        frame_InputData.add(textfieldKelDesa);
        frame_InputData.add(textfieldKecamatan);
        frame_InputData.add(textfieldWNA);
        frame_InputData.add(textfieldBerlaku);
        frame_InputData.add(textfieldKotaPembuat);
                
        //add RadioButton
        frame_InputData.add(male);
        frame_InputData.add(female);
        frame_InputData.add(darahA);
        frame_InputData.add(darahB);
        frame_InputData.add(darahO);
        frame_InputData.add(darahAB);
        frame_InputData.add(RBWNI);
        frame_InputData.add(RBWNA);
        frame_InputData.add(browseTandaTangan);
        frame_InputData.add(browseFoto);
        
        //add ComboBox
        frame_InputData.add(CBAgama);
        frame_InputData.add(CBStatus);
        
        //add CheckBox
        frame_InputData.add(chKaryawan);
        frame_InputData.add(chPNS);
        frame_InputData.add(chWiraswasta);
        frame_InputData.add(chAkademisi);
        frame_InputData.add(chPengangguran);
        
        //add DateChooser
        frame_InputData.add(tanggalLahir);
        frame_InputData.add(tanggalBuatKTP);
        
        //add Label
        frame_InputData.add(NIK);
        frame_InputData.add(TempatLahir);
        frame_InputData.add(Nama);
        frame_InputData.add(Tanggallahir);
        frame_InputData.add(JenisKelamin);
        frame_InputData.add(GolonganDarah);
        frame_InputData.add(alamat);
        frame_InputData.add(RT_RW);
        frame_InputData.add(Kel_Desa);
        frame_InputData.add(Kecamatan);
        frame_InputData.add(TanggalPembuatKTP);
        frame_InputData.add(KotaPembuatKTP);
        frame_InputData.add(BerlakuHingga);
        frame_InputData.add(TandaTangan);
        frame_InputData.add(Foto);
        frame_InputData.add(Kewarganegaraan);
        frame_InputData.add(Pekerjaan);
        frame_InputData.add(StatusPerkawinan);
        frame_InputData.add(Agama);
        
        frame_InputData.setLayout(null);
        frame_InputData.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command) {
            case "Submit":
                if(textfieldNama.getText().equals("")&& textfieldNIK.getText().equals("")&& 
                        textfieldTempatLahir.getText().equals("")&&textfieldAlamat.getText().equals("")&&
                        textfieldRTRW.getText().equals("")&&textfieldKelDesa.getText().equals("")&&
                        textfieldKecamatan.getText().equals("")&&textfieldBerlaku.getText().equals("")&&
                        textfieldKotaPembuat.getText().equals("")&&(!darahA.isSelected()||!darahB.isSelected()||!darahO.isSelected()||!darahAB.isSelected())){
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                } else {
                    DataUser du = new DataUser();
                    //Nama set
                    du.setNama(textfieldNama.getText());
                    //NIK set
                    du.setNIK(textfieldNIK.getText());
                    //Tempat lahir set
                    du.setTempatLahir(textfieldTempatLahir.getText());
                    //Tanggal lahir set
                    SimpleDateFormat tanggal = new SimpleDateFormat("dd-MM-YYYY");
                    String tanggallahir = tanggal.format(tanggalLahir.getDate());
                    du.setTanggallahir(tanggallahir);
                    //gender set
                    if(male.isSelected()){
                        du.setJenisKelamin("Laki Laki");
                    } else if(female.isSelected()){
                        du.setJenisKelamin("Perempuan");
                    }
                    //goldar set
                    if(darahA.isSelected()){
                        du.setGolonganDarah("A");
                    } else if(darahB.isSelected()){
                        du.setGolonganDarah("B");
                    } else if(darahO.isSelected()){
                        du.setGolonganDarah("O");
                    } else if(darahAB.isSelected()){
                        du.setGolonganDarah("AB");
                    }
                    //alamat set
                    du.setAlamat(textfieldAlamat.getText());
                    du.setRTRW(textfieldRTRW.getText());
                    du.setKecamatan(textfieldKecamatan.getText());
                    du.setKelDesa(textfieldKelDesa.getText());
                    //agama set
                    du.setAgama(CBAgama.getItemAt(CBAgama.getSelectedIndex()).toString());
                    //Perkawinan set
                    du.setStatusPerkawinan(CBStatus.getItemAt(CBStatus.getSelectedIndex()).toString());
                    //Kewarganegaraan set
                    if(RBWNI.isSelected()){
                        du.setKewarganegaraan("WNI");
                    } else if(RBWNA.isSelected()){
                        du.setKewarganegaraan("WNA("+ textfieldWNA.getText()+")");
                    }
                    //pekerjaan set
                    if(chKaryawan.isSelected()){
                        pekerjaan += "Karyawan ";
                    }
                    if(chPNS.isSelected()){
                        pekerjaan += "PNS ";
                    }
                    if(chWiraswasta.isSelected()){
                        pekerjaan += "Wiraswasta ";
                    }
                    if(chAkademisi.isSelected()){
                        pekerjaan += "Akademisi ";
                    }
                    du.setPekerjaan(pekerjaan);
                    du.setFoto(pathFoto);
                    du.setTandaTangan(pathTT);
                    du.setTempatPembuatKTP(textfieldKotaPembuat.getText());
                    String tanggalKTP = tanggal.format(tanggalBuatKTP.getDate());
                    du.setTanggalPembuatKTP(tanggalKTP);
                    du.setBerlakuHingga("SEUMUR HIDUP");
                    boolean input = Controller.insertNewUser(du);
                    if(input){
                        JOptionPane.showMessageDialog(null, "Input Berhasil!");
                        frame_InputData.setVisible(false);
                        new JFrame_PrintHasilData(textfieldNIK.getText());
                    } else {
                        JOptionPane.showMessageDialog(null, "Input Gagal!");
                    }
                }
                break;
            case "Browse File Foto":
                FCFoto = new JFileChooser();
                FCFoto.showOpenDialog(null);
                fileFoto = FCFoto.getSelectedFile();
                pathFoto = fileFoto.getPath();
                break;
            case "Browse File Tanda Tangan":
                FCTandaTangan = new JFileChooser();
                FCTandaTangan.showOpenDialog(null);
                fileTandaTangan = FCTandaTangan.getSelectedFile();
                pathTT = fileTandaTangan.getPath();
                break;
            case "EXIT": 
                System.exit(0);
                break;
        }
        System.out.println(command);
    }
}
