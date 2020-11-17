/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author HansNotFound
 */
public class DataUser {

    private String Nama;
    private String NIK;
    private String TempatLahir;
    private String Tanggallahir;
    private String JenisKelamin;
    private String GolonganDarah;
    private String alamat;
    private String Agama;
    private String StatusPerkawinan;
    private String Pekerjaan;
    private String Kewarganegaraan;
    private String Foto;
    private String TandaTangan;
    private String TempatPembuatKTP;
    private String TanggalPembuatKTP;
    private String BerlakuHingga;
    private String RTRW;
    private String Kecamatan;
    private String KelDesa;
    
    public DataUser(){
        
    }

    public DataUser(String Nama, String NIK, String TempatLahir, String Tanggallahir, String JenisKelamin, String GolonganDarah, String alamat, String Agama, String StatusPerkawinan, String Pekerjaan, String Kewarganegaraan, String Foto, String TandaTangan, String TempatPembuatKTP, String TanggalPembuatKTP, String BerlakuHingga, String RTRW, String Kecamatan, String KelDesa) {
        this.Nama = Nama;
        this.NIK = NIK;
        this.TempatLahir = TempatLahir;
        this.Tanggallahir = Tanggallahir;
        this.JenisKelamin = JenisKelamin;
        this.GolonganDarah = GolonganDarah;
        this.alamat = alamat;
        this.Agama = Agama;
        this.StatusPerkawinan = StatusPerkawinan;
        this.Pekerjaan = Pekerjaan;
        this.Kewarganegaraan = Kewarganegaraan;
        this.Foto = Foto;
        this.TandaTangan = TandaTangan;
        this.TempatPembuatKTP = TempatPembuatKTP;
        this.TanggalPembuatKTP = TanggalPembuatKTP;
        this.BerlakuHingga = BerlakuHingga;
        this.RTRW = RTRW;
        this.Kecamatan = Kecamatan;
        this.KelDesa = KelDesa;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    public String getTanggallahir() {
        return Tanggallahir;
    }

    public void setTanggallahir(String Tanggallahir) {
        this.Tanggallahir = Tanggallahir;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getGolonganDarah() {
        return GolonganDarah;
    }

    public void setGolonganDarah(String GolonganDarah) {
        this.GolonganDarah = GolonganDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public String getStatusPerkawinan() {
        return StatusPerkawinan;
    }

    public void setStatusPerkawinan(String StatusPerkawinan) {
        this.StatusPerkawinan = StatusPerkawinan;
    }

    public String getPekerjaan() {
        return Pekerjaan;
    }

    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public String getKewarganegaraan() {
        return Kewarganegaraan;
    }

    public void setKewarganegaraan(String Kewarganegaraan) {
        this.Kewarganegaraan = Kewarganegaraan;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getTandaTangan() {
        return TandaTangan;
    }

    public void setTandaTangan(String TandaTangan) {
        this.TandaTangan = TandaTangan;
    }

    public String getTempatPembuatKTP() {
        return TempatPembuatKTP;
    }

    public void setTempatPembuatKTP(String TempatPembuatKTP) {
        this.TempatPembuatKTP = TempatPembuatKTP;
    }

    public String getTanggalPembuatKTP() {
        return TanggalPembuatKTP;
    }

    public void setTanggalPembuatKTP(String TanggalPembuatKTP) {
        this.TanggalPembuatKTP = TanggalPembuatKTP;
    }

    public String getBerlakuHingga() {
        return BerlakuHingga;
    }

    public void setBerlakuHingga(String BerlakuHingga) {
        this.BerlakuHingga = BerlakuHingga;
    }

    public String getRTRW() {
        return RTRW;
    }

    public void setRTRW(String RTRW) {
        this.RTRW = RTRW;
    }

    public String getKecamatan() {
        return Kecamatan;
    }

    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    public String getKelDesa() {
        return KelDesa;
    }

    public void setKelDesa(String KelDesa) {
        this.KelDesa = KelDesa;
    }

    
}
